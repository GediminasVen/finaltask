package lt.gediminas.finalexam.tests.zalando;

import lt.gediminas.finalexam.pages.zalando.CheckoutBagPage;
import lt.gediminas.finalexam.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutBagTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        CheckoutBagPage.openChrome("https://www.zalando.lt/");
    }

    @Test
    public void testCheckOutBag() {
        String expectedResult = "Krepšelyje";
        String actualResult = "";

        CheckoutBagPage.selectInventory();
        CheckoutBagPage.selectSpecificInventory();
        CheckoutBagPage.clickOnAddToCart();
        CheckoutBagPage.selectSize();
        CheckoutBagPage.clickOnAddToCart();
        CheckoutBagPage.clickOnCartItems();

        actualResult = CheckoutBagPage.getCheckOutBag();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }
}
