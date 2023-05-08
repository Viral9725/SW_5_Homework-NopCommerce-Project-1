package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCarText;
    public String getTextFromShoppingCartHeading() {
        return getTextFromElement(shoppingCarText);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityOption;
    public void quantitySpaceOption() {
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "2"); // Type in the new text
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement shoppingCartOption;
    public void updateShoppingCart() {
        clickOnElement(shoppingCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement priceFinalOption;
      public String getTextFromFinalPrice() {
        return getTextFromElement(priceFinalOption);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateCartOption;
    public void clickOnUpdateCartOption() {
        clickOnElement(updateCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsOption;

    public void clickOnTermsOfServiceOption() {
        clickOnElement(termsOption);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOutOption;
    public void clickCheckOutOption() {
        clickOnElement(checkOutOption);
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCarWelcomeText;
    public String getTextWelcomePleaseSignInOption() {
        return getTextFromElement(shoppingCarWelcomeText);
    }
}