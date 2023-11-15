package lt.gediminas.finalexam.pages.zalando;

import lt.gediminas.finalexam.pages.Common;
import lt.gediminas.finalexam.pages.Locator;

public class DeleteAccountPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }


    public static void clickOnLoginButton() {
        Common.clickOnElement(Locator.Zalando.DeleteAccount.clickOnLogin);
    }

    public static void enterEmailForLogin(String email) {
        Common.enterTextWithWait(Locator.Zalando.DeleteAccount.provideEmail, email, 9);
    }

    public static void enterPasswordForLogin(String password) {
        Common.enterTextWithWait(Locator.Zalando.DeleteAccount.providePassword, password, 9);
    }

    public static void clickOnDeleteAccount() {
        Common.clickWithActions(Locator.Zalando.DeleteAccount.clickOnDelete);
    }

    public static void clickOnDeleteAccountInfo() {
        Common.clickOnElementWhenAvailableCustomised(Locator.Zalando.DeleteAccount.clickOnDeleteAccountInformation, 4);
    }

    public static void clickOnConfirmDeletion() {
        Common.clickOnElementWhenAvailableCustomised(Locator.Zalando.DeleteAccount.clickConfirmDeletion, 4);
    }

    public static void enterPasswordToConfirmDeletion(String password) {
        Common.enterTextWithWait(Locator.Zalando.DeleteAccount.enterPasswordToConfirmDeletion, password, 3);
    }

    public static void clickDeleteAccountFinal() {
        Common.clickWithActions(Locator.Zalando.DeleteAccount.clickDeleteFinalButton);
    }

    public static String getConfirmationDeletedAccount() {
        return Common.getTextFromElement(Locator.Zalando.DeleteAccount.getTextConfirmation);
    }
}
