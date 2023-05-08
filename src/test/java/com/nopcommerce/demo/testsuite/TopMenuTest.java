package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
//only test methods will be in this class

    HomePage homePage;
    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
    }
    @Test (groups = {"Sanity","Smoke","Regression"})
    public void verifyPageNavigation() {
        String expectedMessage = "Computers\n" +
                "Electronics\n" +
                "Apparel\n" +
                "Digital downloads\n" +
                "Books\n" +
                "Jewelry\n" +
                "Gift Cards";
        String actualText = homePage.findAllTabsInTopMenu();
        Assert.assertEquals(actualText, expectedMessage, "Top menu is not displayed");
    }
}
