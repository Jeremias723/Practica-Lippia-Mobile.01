package com.crowdar.examples.steps;


import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClockyTimeEntryService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ClockyTimeEntrySteps extends PageSteps {

    @When("the user do click on add time entry")
    public void theUserDoClickOnAddTimeEntry(){
        ClockyTimeEntryService.clickOnAddTimeEntry();
    }

    @And("select a day (.*)")
    public void selectADate(String day) {
        ClockyTimeEntryService.selectDay(day);
    }

    @And("select a start hour")
    public void selectAStartHour() {

    }

    @And("select a start hour (.*)")
    public void selectAStartHourStart(String startHour) {
        ClockyTimeEntryService.selectAStartingHour(startHour);
    }

    @And("select a end hour (.*)")
    public void selectAFinishHourFinish(String endHour) {
        ClockyTimeEntryService.selectEndHour();
        ClockyTimeEntryService.selectAStartingHour(endHour);
    }

    @When("the user save the changes")
    public void theUserSaveTheChanges() {
        ClockyTimeEntryService.saveDate();
    }

    @And("insert a description : (.*) for the time entry")
    public void insertADescriptionDescriptionForTheTimeEntry(String description) {
        ClockyTimeEntryService.addDescription(description);
    }

    @And("select the project")
    public void selectAProjectProject() {
        ClockyTimeEntryService.addAProject();
    }

    @And("select a tag for the time entry")
    public void selectATagForTheTimeEntryTag() {
        ClockyTimeEntryService.addTag();
    }

    @And("select billable check")
    public void selectBillableCheck() {
        ClockyTimeEntryService.selectBillable();
    }

    @When("the user save the time entry")
    public void theUserSaveTheTimeEntry(){
        ClockyTimeEntryService.saveProject();
    }
}
