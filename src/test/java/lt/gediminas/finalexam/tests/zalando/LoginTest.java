package lt.gediminas.finalexam.tests.zalando;

import lt.gediminas.finalexam.pages.Common;
import lt.gediminas.finalexam.pages.zalando.LoginPage;
import lt.gediminas.finalexam.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod

    @Override
    public void setUp() {
 LoginPage.openChrome("https://www.zalando.lt/");
    }


    @DataProvider(name = "loginValidInput")
    public Object[][] provideUserAccount() {
        return new Object[][]{
                {"venslovaitisgediminas@yahoo.lt", "Abece2le1$2s$3Spsswtr3!"},
                {"Gediminas@gediminas.gediminas", " "},
                {" @email.com", "abc123!!3qwerty"}
        };
    }
    @Test(dataProvider = "loginValidInput")
    public void testLoginFunctionality(String email, String password) {
        String expectedResult = "";
        String actualResult = "";

        LoginPage.clickOnLoginButton();
        LoginPage.enterEmailForLogin(email);
        LoginPage.enterPasswordForLogin(password);
        LoginPage.clickOnLoginButtonWhenDataEntered();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }



}
