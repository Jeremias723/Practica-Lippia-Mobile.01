package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockyTimeEntryConstants;
import org.testng.Assert;


public class ClockyTimeEntryService {



    public static void clickOnAddTimeEntry(){
        MobileActionManager.click(ClockyTimeEntryConstants.ADD_TIME_BUTTON_LOCATOR);
    }

    public static void selectDay(String day) {
        MobileActionManager.click(ClockyTimeEntryConstants.SELECT_TIME_BUTTON_LOCATOR);
        ClockyTimeEntryConstants.DAY_BUTTON_LOCATOR = "xpath://android.view.View[@content-desc=\""+day+"\"]";
        MobileActionManager.click(ClockyTimeEntryConstants.DAY_BUTTON_LOCATOR);

    }

    public static void selectAStartingHour(String startHour) {
        int selectedHour = Integer.parseInt(startHour);
        int defaultHour;
        for (int i = 0; i < 24; i++) {
            defaultHour = Integer.parseInt(MobileActionManager.getText(ClockyTimeEntryConstants.HOUR_SELECTED_LOCATOR));
            if (defaultHour !=selectedHour){
                MobileActionManager.click(ClockyTimeEntryConstants.HOUR_SELECT_LOCATOR);
            }else{
                break;
            }
        }
    }

    public static void selectEndHour() {
        MobileActionManager.click(ClockyTimeEntryConstants.END_HOUR_BUTTON_LOCATOR);
    }

    public static void saveDate() {
        MobileActionManager.click(ClockyTimeEntryConstants.SAVE_BUTTON_LOCATOR);
    }

    public static void addDescription(String description) {
        MobileActionManager.setInput(ClockyTimeEntryConstants.TIME_DESCRIPTION_INPUT_LOCATOR,description);
    }

    public static void addAProject() {


        MobileActionManager.click(ClockyTimeEntryConstants.TIME_PROJECT_BUTTON_LOCATOR);
        MobileActionManager.click(ClockyTimeEntryConstants.SELECTED_PROJECT_BUTTON_LOCATOR);
    }

    public static void addTag() {
        MobileActionManager.click(ClockyTimeEntryConstants.TAG_BUTTON_LOCATOR);
        MobileActionManager.click(ClockyTimeEntryConstants.AUTOMATION_TAG_BUTTON_LOCATOR);
        MobileActionManager.click(ClockyTimeEntryConstants.GO_BACK_BUTTON_LOCATOR);

    }

    public static void selectBillable() {
        Assert.assertEquals(MobileActionManager.getAttribute(ClockyTimeEntryConstants.BILLABLE_SWITCH_LOCATOR,"checked"),"true");
        MobileActionManager.click(ClockyTimeEntryConstants.BILLABLE_SWITCH_LOCATOR);
        Assert.assertEquals(MobileActionManager.getAttribute(ClockyTimeEntryConstants.BILLABLE_SWITCH_LOCATOR,"checked"),"false");
    }

    public static void saveProject(){
        MobileActionManager.click(ClockyTimeEntryConstants.SAVE_BUTTON_LOCATOR);
    }
}
