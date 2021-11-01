package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClockyLoginService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ClockyLoginSteps extends PageSteps {

    @Given("the user is in the login page")
    public void theUserIsInTheLoginPage() {
        ClockyLoginService.checkLoad();
    }


    @When("the user complete with (.*) and (.*)")
    public void theUserEnterHisEmailAndPassword(String email,String password) {
        ClockyLoginService.insertData(email,password);
    }

    @And("the user click in the 'Login' button")
    public void theUserClickInTheLoginButton() {
        ClockyLoginService.clickLogInButton();
    }

    @Given("the user is already login in the app with his (.*) and (.*)")
    public void theUserIsAlreadyLoginInTheAppWithHisEmailAndPassword(String email,String password) {
        ClockyLoginService.insertData(email,password);
        ClockyLoginService.clickLogInButton();
    }
}
