package com.crowdar.examples.steps;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClockyHomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClockyHomeSteps extends PageSteps {

    @Then("the user is redirected to the home page")
    public void theUserIsRedirectedToTheHomePageWithTheCorrectUserName(){
        ClockyHomeService.verifyUserName();
    }

    @And("the user enter to the time tracker section")
    public void theUserEnterToTheTimeTrackerSection() {
        ClockyHomeService.verifyUserName();
        ClockyHomeService.enterToTimeTracker();
    }

    @Then("the app shows the project name created: (.*)")
    public void theUserWillBeAbleToSeeTheirTimeEntry(String project) {
        ClockyHomeService.verifyTimeEntry(project);
    }

    @When("the user enters the configuration section")
    public void theUserEntersTheConfigurationSection() {
        ClockyHomeService.enterToConfigurations();
    }

    @Then("the user activates the dark mode of the application")
    public void theUserActivatesTheDarkModeOfTheApplication() {
        ClockyHomeService.enableDarkMode();
    }

    @Then("the dark mode is displayed")
    public void theDarkModeIsDisplayed() {
        ClockyHomeService.verifyTheme();
    }
}
