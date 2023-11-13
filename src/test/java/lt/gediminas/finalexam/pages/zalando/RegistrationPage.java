package lt.gediminas.finalexam.pages.zalando;

import lt.gediminas.finalexam.pages.Common;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    @Test
        public void testRegistrationPositiveData() {
            String expectedResult = "";
            String actualResult = "";

            Assert.assertTrue(
                    actualResult.contains(expectedResult),
                    "\nActual: %s, \nExpected: %s".formatted(
                            actualResult, expectedResult
                    )
            );
        }
}
