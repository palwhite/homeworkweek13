package uk.co.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import uk.co.library.pages.HomePage;

public class HomepageSteps {

    HomePage homePage = new HomePage();

    @And("^I enter keywords \"([^\"]*)\"$")
    public void iEnterKeywords(String keyword)  {
        homePage.enterJobTitle(keyword);
    }

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location) {
        homePage.enterLocation(location);
    }

    @And("^I enter distance \"([^\"]*)\"$")
    public void iEnterDistance(String distance) {
        homePage.selectDistance(distance);
    }

    @Then("^I click on More Search Option$")
    public void iClickOnMoreSearchOption() {
        homePage.clickOnMoreSearchOptionLink();
    }

    @And("^I enter minimum salary \"([^\"]*)\"$")
    public void iEnterMinimumsalary(String minimumsalary) {
        homePage.enterMinSalary(minimumsalary);
    }

    @And("^I enter maximum salary \"([^\"]*)\"$")
    public void iEnterMaximumsalary(String maximumsalary) {
        homePage.enterMaxSalary(maximumsalary);
    }

    @And("^I enter salary type \"([^\"]*)\"$")
    public void iEnterSalarytype(String salarytype) {
        homePage.selectSalaryType(salarytype);
    }

    @And("^I enter job type \"([^\"]*)\"$")
    public void iEnterJobtype(String jobtype) {
        homePage.selectJobType(jobtype);
    }

    @And("^I click on fine job button$")
    public void iClickOnFineJobButton() {
        homePage.clickOnFindJobsButton();
    }

    @Then("^I go on next page get result \"([^\"]*)\"$")
    public void iGoOnNextPageGetResult(String result){
        Assert.assertEquals(result,homePage.verifyTheResults());
    }

    @Then("^I accept Cookies$")
    public void iAcceptCookies() {
        homePage.acceptCookies();
    }
}
