package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths extends Utility {

    private static final Logger log = LogManager.getLogger(AnAustralianCominToUKForTourism.class);
    public aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement reasonForVisitList;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement selectJobtypeList;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continuebutton;

    @CacheLookup
    @FindBy(xpath = "//main/div/div[1]/div/div/h2")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(id = "response-4")
    WebElement reason;

    public void selectReasonForVisit(){
        log.info("Selecting the reason to visit");
        clickOnElement(reasonForVisitList);
    }

    public void ReasonForVisit(){
        log.info("Selecting the reason to visit Join partner or family for a long stay");
        clickOnElement(reason);
    }

    public void selectLengthOfStay(){
        log.info("Selecting staying for more than 6 months");
        clickOnElement(moreThanSixMonths);
    }

    public void clickNextStepButton(){
        log.info("Click on Continue");
        clickOnElement(nextStepButton);
    }

    public void selectJobType(){
        log.info("Selecting Hralth and care professional");
        clickOnElement(selectJobtypeList);
    }

    public void clickcontinueButton(){
        log.info("Click on Continue");
        clickOnElement(continuebutton);
    }

    public String resultverify(){
        return getTextFromElement(resultMessage);
    }
}
