package lt.gediminas.finalexam.tests.zalando;

import lt.gediminas.finalexam.pages.zalando.LogoutPage;
import lt.gediminas.finalexam.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LogoutPage.openChrome("https://www.zalando.lt/moterims-home/");
    }

    @DataProvider(name = "loginDataInputValid")
    public Object[][] provideUserAccount() {
        return new Object[][]{
                {"venslovaitigediminas@yahoo.lt", "Abece2le1$2s$3Spsswtr3!"}
        };
    }

    @Test(dataProvider = "loginDataInputValid")
    public void testLoginFunctionality(String email, String password) {
        String expectedResult = "Registruotis dabar";
        String actualResult;

        LogoutPage.clickOnLoginButton();
        LogoutPage.enterEmailForLogin(email);
        LogoutPage.enterPasswordForLogin(password);
        LogoutPage.clickOnLoginButtonWhenDataEntered();
        LogoutPage.hoverOverElement();
        LogoutPage.clickOnLogout();

        actualResult = LogoutPage.checkLogOut();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }
}
