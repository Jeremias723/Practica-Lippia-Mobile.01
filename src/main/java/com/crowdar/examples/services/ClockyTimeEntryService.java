package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockyTimeEntryConstants;
import org.testng.Assert;


public class ClockyTimeEntryService {



    public static void clickOnAddTimeEntry(){
        MobileActionManager.click(ClockyTimeEntryConstants.ADD_TIME_BUTTON_ID);
    }

    public static void selectDay(String day) {
        String dayButtonLocator;
        MobileActionManager.click(ClockyTimeEntryConstants.SELECT_TIME_BUTTON_ID);
        dayButtonLocator = "xpath://android.view.View[@content-desc=\""+day+"\"]";
        MobileActionManager.click(dayButtonLocator);

    }

    public static void selectAStartingHour(String startHour) {
        int selectedHour = Integer.parseInt(startHour);
        int defaultHour;
        for (int i = 0; i < 24; i++) {
            defaultHour = Integer.parseInt(MobileActionManager.getText(ClockyTimeEntryConstants.HOUR_SELECTED_XPATH));
            if (defaultHour !=selectedHour){
                MobileActionManager.click(ClockyTimeEntryConstants.HOUR_SELECT_XPATH);
            }else{
                break;
            }
        }
    }

    public static void selectEndHour() {
        MobileActionManager.click(ClockyTimeEntryConstants.END_HOUR_BUTTON_XPATH);
    }

    public static void saveDate() {
        MobileActionManager.click(ClockyTimeEntryConstants.SAVE_BUTTON_ID);
    }

    public static void addDescription(String description) {
        MobileActionManager.setInput(ClockyTimeEntryConstants.TIME_DESCRIPTION_INPUT_ID,description);
    }

    public static void addAProject() {


        MobileActionManager.click(ClockyTimeEntryConstants.TIME_PROJECT_BUTTON_ID);
        MobileActionManager.click(ClockyTimeEntryConstants.SELECTED_PROJECT_BUTTON_XPATH);
    }

    public static void addTag() {
        MobileActionManager.click(ClockyTimeEntryConstants.TAG_BUTTON_ID);
        MobileActionManager.click(ClockyTimeEntryConstants.AUTOMATION_TAG_BUTTON_XPATH);
        MobileActionManager.click(ClockyTimeEntryConstants.GO_BACK_BUTTON_XPATH);

    }

    public static void selectBillable() {
        Assert.assertEquals(MobileActionManager.getAttribute(ClockyTimeEntryConstants.BILLABLE_SWITCH_ID,"checked"),"true");
        MobileActionManager.click(ClockyTimeEntryConstants.BILLABLE_SWITCH_ID);
        Assert.assertEquals(MobileActionManager.getAttribute(ClockyTimeEntryConstants.BILLABLE_SWITCH_ID,"checked"),"false");
    }

    public static void saveProject(){
        MobileActionManager.click(ClockyTimeEntryConstants.SAVE_BUTTON_ID);
    }
}
