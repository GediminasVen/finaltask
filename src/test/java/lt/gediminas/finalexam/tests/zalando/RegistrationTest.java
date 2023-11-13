package lt.gediminas.finalexam.tests.zalando;

import lt.gediminas.finalexam.pages.zalando.RegistrationPage;
import lt.gediminas.finalexam.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        RegistrationPage.openChrome("https://www.zalando.lt/");
    }
    @Test
    public void testClickOnRegistration() {
        RegistrationPage.clickOnRegister();
    }

}
