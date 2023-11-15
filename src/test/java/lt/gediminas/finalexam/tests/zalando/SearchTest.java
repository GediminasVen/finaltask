package lt.gediminas.finalexam.tests.zalando;

import lt.gediminas.finalexam.pages.zalando.SearchPage;
import lt.gediminas.finalexam.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        SearchPage.openChrome("https://www.zalando.lt/");
    }

    @Test
    public void testSearchForNikeProducts() {
        String searchValue = "Nike";
        String actualValue;
        SearchPage.enterValueToSearch(searchValue);
        actualValue = SearchPage.readSearchValueNike();

        Assert.assertTrue(
                actualValue.contains(searchValue),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualValue, searchValue
                )
        );
    }

    @Test
    public void testSearchResultForAdidas() {
        String searchValue = "adidas";
        String actualValue;
        SearchPage.enterValueToSearch(searchValue);
        actualValue = SearchPage.readSearchValueSweater();

        Assert.assertTrue(
                actualValue.contains(searchValue),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualValue, searchValue
                )
        );
    }
    @Test
    public void testSearchResultForCMP() {
        String searchValue = "CMP";
        String actualValue;

        SearchPage.enterValueToSearch(searchValue);
        actualValue = SearchPage.readSearchValueCMP();
        Assert.assertTrue(
                actualValue.contains(searchValue),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualValue, searchValue
                )
        );
    }

}
