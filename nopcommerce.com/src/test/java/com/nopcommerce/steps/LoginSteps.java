package com.nopcommerce.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {


    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        homePage.clickOnLoginLink();
    }

    @And("^I am login page$")
    public void iAmLoginPage() {

    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedTxt = "Welcome, Please Sign In!";
        String actualTxt=loginPage.getWelcomeText();
        Assert.assertEquals("Validating Welcome text", actualTxt, expectedTxt);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
       loginPage.enterEmailId(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        loginPage.enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {

        loginPage.clickOnLoginButton();
    }

    @Then("^I should login to login page successfully$")
    public void iShouldLoginToPaginPageSuccessfully() {

    }

    @And("^I should see error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String errorMsg)  {
     Assert.assertEquals("error Message", errorMsg, loginPage.getErrorMessage());

    }

    @And("^I click on cookies$")
    public void iClickOnCookies() {

    }

}
