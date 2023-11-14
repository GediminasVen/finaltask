package lt.gediminas.finalexam.pages.zalando;

import lt.gediminas.finalexam.pages.Common;
import lt.gediminas.finalexam.pages.Locator;
import org.openqa.selenium.Keys;

public class SearchPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }


    public static void enterValueToSearch(String searchValue) {
        Common.sendKeysToElement(Locator.Zalando.Search.enterValue, searchValue);
        Common.clickOnElement(Locator.Zalando.Search.selectValue);

    }

    public static String readSearchValueNike() {
        return Common.getTextFromElement(Locator.Zalando.Search.printedValueNike);
    }

    public static String readSearchValueSweater() {
        return Common.getTextFromElement(Locator.Zalando.Search.printedValueAdidas);
    }

    public static String readSearchValueShoes() {
        return Common.getTextFromElement(Locator.Zalando.Search.printedValueNothing);
    }

}
