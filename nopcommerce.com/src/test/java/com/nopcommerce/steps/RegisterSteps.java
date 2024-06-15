package com.nopcommerce.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class RegisterSteps {

    LoginPage loginPage;

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I enters following users details$")
    public void iEntersFollowingUsersDetails(DataTable dataTable) throws InterruptedException {

        //without header
      /*  List<List<String>> row = dataTable.asLists(String.class);
        for( List<String> columns:row){
            new LoginPage().register(columns.get(0), columns.get(1), columns.get(2), columns.get(3), columns.get(4));
        }*/

        //with header
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            new LoginPage().register(columns.get("name"), columns.get("surname"), columns.get("email"), columns.get("password"), columns.get("cpassword"));

        }
    }

}