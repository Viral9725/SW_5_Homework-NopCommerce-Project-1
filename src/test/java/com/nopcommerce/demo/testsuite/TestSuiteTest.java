package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSuiteTest extends BaseTest {
    HomePage homepage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    ShoppingCart shoppingCart;
    CheckOutWelcomePage checkOutWelcomePage;
    CheckOutBilling checkOutBilling;


    @BeforeMethod
    public void inIt() {
        homepage = new HomePage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        shoppingCart = new ShoppingCart();
        checkOutWelcomePage = new CheckOutWelcomePage();
        checkOutBilling = new CheckOutBilling();

    }
    @Test (groups = {"Sanity","Regression"})
    public void verifyProductArrangeInAlphabeticalOrder() {
        homepage.clickComputerTab();
        computerPage.clickOnDesktopOption();
        desktopPage.selectDropdownOptionZtoA();
//        ArrayList expectedResult =
//        Assert.assertEquals(desktopPage.verifyProductsAreInTheRightOrder(), sortedProductNames);
    }

    @Test (groups = {"Smoke","Regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homepage.clickComputerTab();
        computerPage.clickOnDesktopOption();
        desktopPage.selectDropdownOptionAtoZ();
        Thread.sleep(1000);
        desktopPage.clickAddToCartButton();
        String expectedMessage = "Build your own computer";
        Assert.assertEquals(buildYourOwnComputerPage.getTextFromBuildYourOwnComputerHeading(),
                expectedMessage, "Page os not displayed");
        buildYourOwnComputerPage.selectProcessorOption();
        Thread.sleep(2000);
        buildYourOwnComputerPage.selectRamOption();
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectHddOption();
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectOsOption();
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectSoftWareOption();
        Thread.sleep(2000);
        buildYourOwnComputerPage.getTextFromPriceHeading();
        String expectedMessage1 = "$1,475.00";
        Assert.assertEquals(buildYourOwnComputerPage.getTextFromPriceHeading(),
                expectedMessage1, "$1,475.00");
        buildYourOwnComputerPage.addToCartOption();
        String expectedMessage2 = "The product has been added to your shopping cart";
        Assert.assertEquals(buildYourOwnComputerPage.getTheProductHasBeenAddedToCart(),
                expectedMessage2, "The product has not been added to your shopping cart");
        buildYourOwnComputerPage.crossButtonOption();
        buildYourOwnComputerPage.mouseHoverOverShoppingCartOption();
        buildYourOwnComputerPage.clickOnGoToCartShoppingCartOption();
        shoppingCart.getTextFromShoppingCartHeading();
        String expectedMessage3 = "Shopping cart";
        Assert.assertEquals(shoppingCart.getTextFromShoppingCartHeading(),
                expectedMessage3, "Shopping cart");
        shoppingCart.quantitySpaceOption();
        shoppingCart.updateShoppingCart();
        String expectedMessage4 = "$2,950.00";
        Assert.assertEquals(shoppingCart.getTextFromFinalPrice(),
                expectedMessage4, "Shopping cart");
        shoppingCart.clickOnTermsOfServiceOption();
        shoppingCart.clickCheckOutOption();
        Thread.sleep(2000);
        String expectedMessage5 = "Welcome, Please Sign In!";
        Assert.assertEquals(checkOutWelcomePage.getTextFromWelcomeSignInTitle(),
                expectedMessage5, "Welcome, Please Sign In!");
        checkOutWelcomePage.clickCheckoutAsGuestButton();
        checkOutBilling.firstNameOption("AT");
        checkOutBilling.lastNameOption("TA");
        checkOutBilling.enterEmailId("AT123@Gmail.com");
        checkOutBilling.selectUKFromDropdownOption("United Kingdom");
        checkOutBilling.enterCity("London");
        checkOutBilling.enterAddressLine1("10 Downing Street");
        checkOutBilling.enterZipcode("SW1 1AA");
        checkOutBilling.enterPhoneNumber("07986876564");
        checkOutBilling.clickOnContinueButton();
        checkOutBilling.clickOnTheShoppingOption();
        checkOutBilling.clickOnSecondContinueButton();
        checkOutBilling.clickOnThePaymentOption();
        checkOutBilling.clickOnThirdContinueButton();
        checkOutBilling.selectMasterCardOptionFromDropdown("Master card");
        checkOutBilling.enterCardHolderName("MR TTAA");
        checkOutBilling.enterCardNumber("0759 2136 2156 5987");
        checkOutBilling.enterExpiryMonth("12");
        checkOutBilling.enterExpiryYear("2026");
        checkOutBilling.enterSecurityCode("111");
        checkOutBilling.clickOnFourthContinueButton();
        String expectedMessage6 = "Credit Card";
        Assert.assertEquals(checkOutBilling.getPaymentMethodText(),
                expectedMessage6, "Payment Method incorrect");
        String expectedMessage7 = "Next Day Air";
        Assert.assertEquals(checkOutBilling.getShippingMethodText(),
                expectedMessage7, "Shipping Method incorrect");
        String expectedMessage8 = "$2,950.00";
        Assert.assertEquals(checkOutBilling.getTotalPriceText(),
                expectedMessage8, "Total price incorrect");
        checkOutBilling.clickOnConfirmButton();
        String expectedMessage9 = "Thank you";
        Assert.assertEquals(checkOutBilling.getThankYouText(),
                expectedMessage9, "Text displayed is incorrect");
        String expectedMessage10 = "Your order has been successfully processed!";
        Assert.assertEquals(checkOutBilling.getSuccessfulOrderText(),
                expectedMessage10, "Page displayed is incorrect");
        checkOutBilling.clickOnTheLastContinueButton();
        String expectedMessage11 = "Welcome to our store";
        Assert.assertEquals(checkOutBilling.getWelcomeText(),
                expectedMessage11, "Page displayed is incorrect");
    }
}
