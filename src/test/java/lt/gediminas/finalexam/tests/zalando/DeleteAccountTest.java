package lt.gediminas.finalexam.tests.zalando;

import lt.gediminas.finalexam.pages.zalando.DeleteAccountPage;
import lt.gediminas.finalexam.pages.zalando.LoginPage;
import lt.gediminas.finalexam.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteAccountTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        DeleteAccountPage.openChrome("https://www.zalando.lt/myaccount/");
    }
    @DataProvider(name = "loginValidInformation")
        public Object[][] provideData() {
            return new Object[][]{
                    {"venslovaitisgediminas@yahoo.lt", "Abece2le1$2s$3Spsswtr3!"}
            };
        }
    @Test(dataProvider = "loginValidInformation")
        public void testAccountDeletion(String email, String password) {
            String expectedResult = "Jūsų paskyra uždaryta.";
            String actualResult = "";

        DeleteAccountPage.enterEmailForLogin(email);
        DeleteAccountPage.enterPasswordForLogin(password);
        DeleteAccountPage.clickOnLoginButton();
        DeleteAccountPage.clickOnDeleteAccount();
        DeleteAccountPage.clickOnDeleteAccountInfo();
        DeleteAccountPage.clickOnConfirmDeletion();
        DeleteAccountPage.enterPasswordToConfirmDeletion(password);
        DeleteAccountPage.clickDeleteAccountFinal();

        actualResult = DeleteAccountPage.getConfirmationDeletedAccount();

        Assert.assertTrue(
                    actualResult.contains(expectedResult),
                    "\nActual: %s, \nExpected: %s".formatted(
                            actualResult, expectedResult
                    )
            );
        }
}
