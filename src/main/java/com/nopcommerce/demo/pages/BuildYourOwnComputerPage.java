package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerText;

    public String getTextFromBuildYourOwnComputerHeading() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorOption;

    public void selectProcessorOption() {
        selectByVisibleTextFromDropDown(processorOption, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramOption;

    public void selectRamOption() {
        selectByVisibleTextFromDropDown(ramOption, "8GB [+$60.00]");
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hddOption;

    public void selectHddOption() {
        clickOnElement(hddOption);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osOption;

    public void selectOsOption() {
        clickOnElement(osOption);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareOption;

    public void selectSoftWareOption() {
        clickOnElement(softwareOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement priceText;

    public String getTextFromPriceHeading() {
        return getTextFromElement(priceText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addTooCartOption;

    public void addToCartOption() {
        clickOnElement(addTooCartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]")
    WebElement productAddedToText;

    public String getTheProductHasBeenAddedToCart() {
        return getTextFromElement(productAddedToText);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement crossButtonOption;

    //After that close the bar clicking on the cross button.
    public void crossButtonOption() {
        clickOnElement(crossButtonOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartButtonOption;

    public void mouseHoverOverShoppingCartOption() {
        mouseHoverToElement(shoppingCartButtonOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement goToCartOption;

    public void clickOnGoToCartShoppingCartOption() {
        clickOnElement(goToCartOption);
    }
}