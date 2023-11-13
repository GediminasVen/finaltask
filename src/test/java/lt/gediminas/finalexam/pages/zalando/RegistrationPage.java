package lt.gediminas.finalexam.pages.zalando;

import lt.gediminas.finalexam.pages.Common;
import lt.gediminas.finalexam.pages.Locator;

public class RegistrationPage extends Common{
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }
    public static void clickOnRegister() {
        Common.clickOnElement(Locator.Zalando.Registration.ClickOnRegistration);
        Common.clickOnElement(Locator.Zalando.Registration.ClickOnRegistrationWhenVisible);
    }

    public static void enterName(String name) {
        Common.sendKeysToElement(Locator.Zalando.Registration.enterName, name);
    }

    public static void enterLastname(String lastname) {
        Common.sendKeysToElement(Locator.Zalando.Registration.enterLastname, lastname);
    }

    public static void enterEmail(String email) {
        Common.sendKeysToElement(Locator.Zalando.Registration.enterEmail, email);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locator.Zalando.Registration.enterPassword, password);
    }

    public static String isRegistrationSuccessful() {
        return Common.getTextFromElement(Locator.Zalando.Registration.readSuccesfulRegistration);
    }

    public static void clickOnRegisterCheckProvidedData() {
        Common.clickOnElementWhenAvailableCustomised(Locator.Zalando.Registration.clickOnRegistrationAfterDataProvided, 5);
    }
}
