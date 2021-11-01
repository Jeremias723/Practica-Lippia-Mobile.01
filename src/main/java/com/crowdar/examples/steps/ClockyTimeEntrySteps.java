package com.crowdar.examples.steps;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClockyTimeEntryService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ClockyTimeEntrySteps extends PageSteps {

    @When("the user click on add time entry")
    public void theUserDoClickOnAddTimeEntry(){
        ClockyTimeEntryService.clickOnAddTimeEntry();
    }

    @And("select a '(.*)' with the value (.*)")
    public void selectTime(String timeType,String timeValue) {
        switch (timeType.toLowerCase()){
            case "day" :
                ClockyTimeEntryService.selectDay(timeValue);
                break;
            case "start hour":
                ClockyTimeEntryService.selectAStartingHour(timeValue);
                break;
            case "end hour":
                ClockyTimeEntryService.selectEndHour();
                ClockyTimeEntryService.selectAStartingHour(timeValue);
                break;
            default:
                Assert.fail("Error entering time type");
        }
    }

    @When("the user save the changes")
    public void theUserSaveTheChanges() {
        ClockyTimeEntryService.saveDate();
    }

    @And("insert a description: (.*) for the time entry")
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
