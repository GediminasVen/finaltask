package lt.gediminas.finalexam.pages.zalando;

import lt.gediminas.finalexam.pages.Common;
import lt.gediminas.finalexam.pages.Locator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }
    public static void clickOnRegister(){
        Common.clickOnElement(Locator.Zalando.Registration.ClickOnRegistration);
        Common.clickOnElement(Locator.Zalando.Registration.ClickOnRegistrationWhenVisible);
    }
}
