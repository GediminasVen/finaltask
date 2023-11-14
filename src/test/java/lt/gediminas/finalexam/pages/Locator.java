package lt.gediminas.finalexam.pages;


import org.openqa.selenium.By;

public class Locator {

    public static class Zalando {



        public static class Registration {

            public static By ClickOnRegistration = By.xpath("//*[@id='header-user-account-icon']/a");
            public static By ClickOnRegistrationWhenVisible = By.xpath(
                    "//*[@id='sso']/div/section/div/div[2]/div/button");
            public static By enterName = By.xpath("//*[@id='register.firstname']");
            public static By enterLastname = By.xpath("//*[@id='register.lastname']");
            public static By enterEmail = By.xpath("//*[@id='register.email']");
            public static By enterPassword = By.xpath("//*[@id='register.password']");
            public static By readSuccesfulRegistration = By.xpath(
                    "//*[@id=\"main-content\"]/div/div/div[2]/div/div[1]/div/h1");
            public static By clickOnRegistrationAfterDataProvided = By.xpath(
                    "//*[@id='section-register']/div[2]/form/div[4]/div/div[2]/span/div/span");
            public static By clickOnRegistrationFinal = By.xpath("//*[@id='section-register']/div/form/div[7]");
        }
        public static class Login {

            public static By clickOnLogin = By.xpath("//*[@id='header-user-account-icon']/a");
            public static By enterEmail = By.xpath("//*[@id='login.email']");
            public static By enterPassword = By.xpath("//*[@id='login.secret']");
            public static By clickOnLoginWithDataEntered = By.xpath(
                    "//*[@id='sso']/div/div[2]/main/div/div[2]/div/div/div/form/button/span");
            public static By checkLoginAttempt = By.xpath("//*[@id='main-content']/div/div/div[2]/div/div[1]/div/h1");
        }
        public static class Search {

            public static By enterValue = By.xpath("//*[@id='header-search-input']");
            public static By selectValue = By.xpath("//*[@id='header-search-dropdown']/ul/li[1]/button");
            public static By printedValueNike = By.xpath(
                    "//*[@id='main-c" +
                            "ontent']/div/div[4]/div/div/h1/div[1]/a/span/span");
            public static By printedValueAdidas = By.xpath("//*[@id='main-content']/div/div[4]/div/div/h1/div[1]/a/span/span");
            public static By printedValueNothing = By.xpath("//*[@id='main-content']/div/div[4]/div/div/h1/div/h1");
        }
        public static class CheckOutBag{

            public static By SelectInventory = By.xpath("//span[@class='_ZDS_REF_SCOPE_ _2lVSo9']");
            public static By selectSpecific = By.xpath("//*[@id=\"main-content\"]/div/div[7]/div/div[2]/div[2]/div[2]/div[1]/div/article/div[4]/a/header/div/h3[2]");
            public static By addToCart = By.xpath("//*[@id='main-content']/div[1]/div/div[2]/div[1]/x-wrapper-re-1-7/div[2]/button/span");
            public static By acceptCookies = By.xpath("//*[@id=\"uc-btn-accept-banner\"]");
            public static By selectSize = By.xpath("/html/body/div[6]/div/div[3]/div/form/div/div[1]/div/label/span/div");
            public static By getCartInfo = By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div[1]/h1");
            public static By checkCart = By.xpath("//*[@id=\"header-user-actions-container\"]/div[3]");
//            public static By selectTypeOfInventory = By.xpath(
//                    "//span[@class='_ZDS_REF_SCOPE_ _2lVSo9']");
        }

    }
}
