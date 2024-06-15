package gov.uk.check.visa.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gov.uk.check.visa.pages.AnAustralianCominToUKForTourism;
import org.testng.Assert;

public class anAustralianCominToUKForTourismStep {

    AnAustralianCominToUKForTourism australia=new AnAustralianCominToUKForTourism();

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @Then("^I click on start button$")
    public void iClickOnStartButton() {
        australia.clickStartNow();
    }


    @Then("^I Select a Nationality \"([^\"]*)\"$")
    public void iSelectANationality(String nationality) {
        australia.selectNationality(nationality);
    }

    @Then("^I Click on continue$")
    public void iClickOnContinue() {
        australia.clickNextStepButton();
    }

    @Then("^I click on reason to visit$")
    public void iClickOnReasonToVisit() {
        australia.selectReasonForVisit();
    }

    @Then("^I see the message \"([^\"]*)\"$")
    public void iSeeTheMessage(String actualmessage){
        Assert.assertEquals(actualmessage,australia.confirmmessage());
    }

    @Then("^I accept cookies$")
    public void iAcceptCookies() {
        australia.acceptCookies();
    }

    @Then("^I Click on continue again$")
    public void iClickOnContinueAgain() throws InterruptedException {
        australia.clickonContinueAgain();
    }
}
