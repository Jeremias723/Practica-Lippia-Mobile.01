package com.crowdar.examples.services;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockyHomeConstants;
import org.testng.Assert;

public class ClockyHomeService{

    public static void verifyUserName() {
        MobileActionManager.click(ClockyHomeConstants.MENU_BUTTON_XPATH);
        Assert.assertTrue(MobileActionManager.isVisible(ClockyHomeConstants.USERNAME_SPAN_XPATH));
    }

    public static void enterToTimeTracker() {
        MobileActionManager.click(ClockyHomeConstants.TIME_TRACKER_BUTTON_ID);
    }

    public static void verifyTimeEntry(String project) {
        Assert.assertEquals(MobileActionManager.getText(ClockyHomeConstants.TIME_ENTRY_PROJECT_TEXT_ID),project);
    }

    public static void enterToConfigurations() {
        MobileActionManager.click(ClockyHomeConstants.MENU_BUTTON_XPATH);
        MobileActionManager.click(ClockyHomeConstants.CONFIGURATION_BUTTON_ID);
    }

    public static void enableDarkMode() {
        Assert.assertEquals(MobileActionManager.getAttribute(ClockyHomeConstants.DARK_MODE_CHECK_ID,"checked"),"false");
        MobileActionManager.click(ClockyHomeConstants.DARK_MODE_CHECK_ID);
    }

    public static void verifyTheme() {
        Assert.assertEquals(MobileActionManager.getAttribute(ClockyHomeConstants.DARK_MODE_CHECK_ID,"checked"),"true");
    }
}
