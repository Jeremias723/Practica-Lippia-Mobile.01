package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClockyLoginService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClockyLoginSteps extends PageSteps {

    @Given("that the application loads correctly")
    public void thatTheApplicationLoadsCorrectly() {
        ClockyLoginService.checkLoad();
    }


    @When("the user enter his (.*) and (.*)")
    public void theUserEnterHisEmailAndPassword(String email,String password) {
        ClockyLoginService.insertData(email,password);
    }

    @And("do click on 'Log in' button")
    public void doClickOnLogInButton() {
        ClockyLoginService.clickLogInButton();
    }

    @Given("the user is already login in the app with his (.*) and (.*)")
    public void theUserIsAlreadyLoginInTheAppWithHisEmailAndPassword(String email,String password) {
        ClockyLoginService.insertData(email,password);
        ClockyLoginService.clickLogInButton();
    }
}
