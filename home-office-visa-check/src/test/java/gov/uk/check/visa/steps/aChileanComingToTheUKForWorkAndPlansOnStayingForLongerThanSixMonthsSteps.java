package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import gov.uk.check.visa.pages.aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths;
import org.testng.Assert;

public class aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonthsSteps {
    aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths Chile = new aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths();
    anAustralianCominToUKForTourismStep australia=new anAustralianCominToUKForTourismStep();

    @And("^I select time duration for visa$")
    public void iSelectTimeDurationForVisa() {
        Chile.selectLengthOfStay();
    }

    @And("^I select planning to work as health professional$")
    public void iSelectPlanningToWorkAsHealthProfessional() {
        Chile.selectJobType();
    }

    @And("^I click on reason to visit Work, academic visit or business$")
    public void iClickOnReasonToVisitWorkAcademicVisitOrBusiness() {
        Chile.selectReasonForVisit();
    }

    @And("^I Click on continue one more time$")
    public void iClickOnContinueOneMoreTime() {
        Chile.clickNextStepButton();
    }

    @And("^I Click on continue last time$")
    public void iClickOnContinueLastTime() {
        Chile.clickcontinueButton();
    }

    @And("^I verify result \"([^\"]*)\"$")
    public void iVerifyResult(String actualmessage){
        Assert.assertEquals(actualmessage,Chile.resultverify());
    }

    @And("^I click on reason to visit Join partner or family for a long stay$")
    public void iClickOnReasonToVisitJoinPartnerOrFamilyForALongStay() {
        Chile.ReasonForVisit();
    }
}
