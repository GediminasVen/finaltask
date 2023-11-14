package lt.gediminas.finalexam.tests.zalando;

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


    @DataProvider(name = "loginDataInput")
    public Object[][] provideUserAccount() {
        return new Object[][]{
                {"venslovaitisgediminas@yahoo.lt", "Abece2le1$2s$3Spsswtr3!"},
                {"Gediminas@gediminas.gediminas", " "},
                {" @email.com", "abc123!!3qwerty"}
        };
    }
    @Test(dataProvider = "loginDataInput")
    public void testLoginFunctionality(String email, String password) {
        String expectedResult = "Mano paskyra";
        String actualResult;

        LoginPage.clickOnLoginButton();
        LoginPage.enterEmailForLogin(email);
        LoginPage.enterPasswordForLogin(password);
        LoginPage.clickOnLoginButtonWhenDataEntered();
        actualResult = LoginPage.checkLoginAttempt();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );

    }



}
