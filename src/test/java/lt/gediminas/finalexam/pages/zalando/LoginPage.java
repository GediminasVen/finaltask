package lt.gediminas.finalexam.pages.zalando;

import lt.gediminas.finalexam.pages.Common;
import lt.gediminas.finalexam.pages.Locator;

public class LoginPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnLoginButton() {
        Common.clickOnElement(Locator.Zalando.Login.clickOnLogin);
    }

    public static void enterEmailForLogin(String email) {
        Common.sendKeysToElement(Locator.Zalando.Login.enterEmail, email );
    }

    public static void enterPasswordForLogin(String password) {
        Common.sendKeysToElement(Locator.Zalando.Login.enterPassword, password);
    }

    public static void clickOnLoginButtonWhenDataEntered() {
        Common.clickOnElement(Locator.Zalando.Login.clickOnLoginWithDataEntered);
    }
}
