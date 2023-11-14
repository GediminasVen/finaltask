package lt.gediminas.finalexam.pages.zalando;

import lt.gediminas.finalexam.pages.Common;
import lt.gediminas.finalexam.pages.Locator;
import lt.gediminas.finalexam.utilities.Driver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class LogoutPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }


    public static void clickOnLoginButton() {
        Common.clickOnElement(Locator.Zalando.Logout.clickOnLogin);
    }

    public static void enterEmailForLogin(String email) {
        Common.sendKeysToElement(Locator.Zalando.Logout.enterEmail, email );
    }

    public static void enterPasswordForLogin(String password) {
        Common.sendKeysToElement(Locator.Zalando.Logout.enterPassword, password);
    }

    public static void clickOnLoginButtonWhenDataEntered() {
        Common.clickOnElement(Locator.Zalando.Logout.clickOnLoginWithDataEntered);
    }

    public static void clickOnLogout() {
        Common.doubleClickWithActions(Locator.Zalando.Logout.clickLogout);
    }

    public static String checkLogOut() {
        return Common.getTextFromElement(Locator.Zalando.Logout.checkIfLoggedOut);
    }

    public static void hoverOverElement() {
        Common.hoverOverElement(Locator.Zalando.Logout.clickOnLogin);
    }
}
