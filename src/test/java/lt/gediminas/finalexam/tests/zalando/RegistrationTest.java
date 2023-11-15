package lt.gediminas.finalexam.tests.zalando;

import lt.gediminas.finalexam.pages.zalando.RegistrationPage;
import lt.gediminas.finalexam.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class RegistrationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        RegistrationPage.openChrome("https://www.zalando.lt/");
    }

    @DataProvider(name = "registrationFields")
    public Object[][] provideDataForRegistration() {
        return new Object[][]{
                {"Gediminas", "Venslovaitis", "venslovaitigediminas@yahoo.lt", "Abece2le1$2s$3Spsswtr3!"},
                {"Gediminas", "Venslovaitis", "venslovaitisgediminas@one.lt", " "},
                {"Gediminas", "Venslovaitis", " @one.lt", " "},
                {"Gediminas", "2[", " @one.lt", " "},
                {" ", " ", " ", " "},

        };
    }

    @Test(dataProvider = "registrationFields")
    public void testDataForRegistration(String name, String lastname, String email, String password) {
        String actualResult;
        String expectedResult = "Mano paskyra";

        RegistrationPage.clickOnRegister();
        RegistrationPage.enterName(name);
        RegistrationPage.enterLastname(lastname);
        RegistrationPage.enterEmail(email);
        RegistrationPage.enterPassword(password);
        RegistrationPage.clickOnFinalRegistrationButton();

        actualResult = RegistrationPage.isRegistrationSuccessful();
        Assert.assertEquals(expectedResult, actualResult);
    }
}