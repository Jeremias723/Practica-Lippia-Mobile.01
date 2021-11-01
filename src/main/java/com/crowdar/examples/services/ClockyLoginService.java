package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockyLoginConstants;
import org.testng.Assert;

public class ClockyLoginService {

    public static void checkLoad(){
        MobileActionManager.waitVisibility(ClockyLoginConstants.EMAIL_INPUT_ID);
        Assert.assertTrue(MobileActionManager.isVisible(ClockyLoginConstants.EMAIL_INPUT_ID),"The element is not visible");

    }

    public static void insertData(String email, String password) {
        MobileActionManager.setInput(ClockyLoginConstants.EMAIL_INPUT_ID,email);
        MobileActionManager.setInput(ClockyLoginConstants.PASS_INPUT_ID,password);
    }

    public static void clickLogInButton() {
        MobileActionManager.click(ClockyLoginConstants.LOGIN_BUTTON_ID);
    }


}
