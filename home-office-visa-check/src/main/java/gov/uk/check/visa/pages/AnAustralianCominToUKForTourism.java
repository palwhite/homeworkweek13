package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnAustralianCominToUKForTourism extends Utility {

    private static final Logger log = LogManager.getLogger(AnAustralianCominToUKForTourism.class);
    public AnAustralianCominToUKForTourism() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div/button[contains(text(),'Accept ')]")
    WebElement cookies;

    @CacheLookup
    @FindBy(xpath = "//section/a")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//main/div/div[1]/div/div/h2")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueagainbutton;

    public void acceptCookies(){
        log.info("Accepting Cookies");
        clickOnElement(cookies);
    }

    public void clickStartNow(){
        log.info("Click on strat button");
        clickOnElement(startNowButton);
    }

    public void selectNationality(String nationality){
        log.info("Select Nationality");
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }

    public void selectReasonForVisit(){
        log.info("Selecting the reason to visit");
        clickOnElement(reasonForVisitList);
    }

    public String confirmmessage(){
        return getTextFromElement(resultMessage);

    }

    public void clickNextStepButton(){
        log.info("Click on Continue");
        clickOnElement(nextStepButton);
    }

    public void clickonContinueAgain(){
        log.info("Click on continue again");
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", continueagainbutton);
        clickOnElement(continueagainbutton);
    }
}
