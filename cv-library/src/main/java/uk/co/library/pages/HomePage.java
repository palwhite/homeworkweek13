package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "gdpr-consent-notice")
    WebElement manageFrame;

    @CacheLookup
    @FindBy(xpath = "//button/span/div/span[text()='Accept All']")
    WebElement acceptbutton;

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleelement;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationelement;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "//div/h1[@class='search-header__title']")
    WebElement resultText;

    public void acceptCookies(){
        log.info("User is Accepting Cookies");
        driver.switchTo().frame(manageFrame);
        acceptbutton.click();
        driver.switchTo().defaultContent();
    }

    public void enterJobTitle(String jobTitle){
        log.info("enter job title");
        sendTextToElement(jobTitleelement,jobTitle);
    }

    public void enterLocation(String location){
        log.info("enter location");
        sendTextToElement(locationelement,location);
    }

    public void selectDistance(String distance){
        log.info("enter Distance");
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }

    public void clickOnMoreSearchOptionLink(){
        log.info("Click on more Options");
        moreSearchOptionsLink.click();
    }

    public void enterMinSalary(String minsalary){
        log.info("enter Minimum Salary");
        sendTextToElement(salaryMax,minsalary);
    }

    public void enterMaxSalary(String maxsalary){
        log.info("enter Maximum Salary");
        sendTextToElement(salaryMax,maxsalary);
    }

    public void selectSalaryType(String sType){
        log.info("enter Salary Type");
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }

    public void selectJobType(String jobType){
        log.info("enter Job Type");
        selectByValueFromDropDown(jobTypeDropDown,jobType);
    }

    public void clickOnFindJobsButton(){
        log.info("Click on Find Jobs");
        findJobsBtn.click();
    }

    public String verifyTheResults(){
       log.info("Verifying result");
       return getTextFromElement(resultText);
    }
}
