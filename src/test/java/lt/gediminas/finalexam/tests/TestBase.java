package lt.gediminas.finalexam.tests;

import lt.gediminas.finalexam.utilities.TestListenerScreenshot;
import lt.gediminas.finalexam.pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListenerScreenshot.class)
public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp();


    @AfterMethod
    public void tearDown() {
        Common.quitDriver();
    }
}