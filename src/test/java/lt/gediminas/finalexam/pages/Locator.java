package lt.gediminas.finalexam.pages;


import org.openqa.selenium.By;

public class Locator {

    public static class Zalando {

        public static class Registration {

            public static By ClickOnRegistration = By.xpath("//*[@id='header-user-account-icon']/a");
            public static By ClickOnRegistrationWhenVisible = By.xpath(
                    "//*[@id='sso']/div/section/div/div[2]/div/button/span");
            public static By enterName = By.xpath("//*[@id='register.firstname']");
            public static By enterLastname = By.xpath("//*[@id='register.lastname']");
            public static By enterEmail = By.xpath("//*[@id='register.email']");
            public static By enterPassword = By.xpath("//*[@id='register.password']");

            public static By readSuccesfulRegistration = By.xpath("/html/body/div[5]/div/div[2]/span/a/span");
            public static By clickOnRegistrationAfterDataProvided = By.xpath("//*[@id='section-register']/div[2]/form/div[4]/div/div[2]/span/div/span");
        }
        public static class Login{

            public static By clickOnLogin = By.xpath("//*[@id='header-user-account-icon']/a");
            public static By enterEmail = By.xpath("//*[@id='login.email']");
            public static By enterPassword = By.xpath("//*[@id='login.secret']");
            public static By clickOnLoginWithDataEntered = By.xpath("//*[@id='sso']/div/div[2]/main/div/div[2]/div/div/div/form/button/span");
        }
    }
}
