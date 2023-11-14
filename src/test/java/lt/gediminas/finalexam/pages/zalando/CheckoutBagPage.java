package lt.gediminas.finalexam.pages.zalando;

import lt.gediminas.finalexam.pages.Common;
import lt.gediminas.finalexam.pages.Locator;

public class CheckoutBagPage {

    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);

    }

    public static void selectInventory() {
//        Common.clickOnElement(Locator.Zalando.CheckOutBag.selectTypeOfInventory);
        Common.clickOnElement(Locator.Zalando.CheckOutBag.SelectInventory);
    }

    public static void selectSpecificInventory() {
        Common.clickOnElement(Locator.Zalando.CheckOutBag.selectSpecific);
    }

    public static void clickOnAddToCart() {
        Common.clickOnElement(Locator.Zalando.CheckOutBag.addToCart);
    }

    public static void selectSize() {
        Common.clickWithActions(Locator.Zalando.CheckOutBag.selectSize);
    }

    public static String getCheckOutBag() {
        return Common.getTextFromElement(Locator.Zalando.CheckOutBag.getCartInfo);
    }

    public static void clickOnCartItems() {
        Common.clickWithActions(Locator.Zalando.CheckOutBag.checkCart);
    }
}
