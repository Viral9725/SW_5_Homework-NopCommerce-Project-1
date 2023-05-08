package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NokiaLumaCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement nokiaLumaCartText;
    public String verifyNokiaLumaShoppingCartText() {
        return getTextFromElement(nokiaLumaCartText);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement nokiaLumaCartQuantityText;
    public String verifyQuantityText() {
        return getTextFromElement(nokiaLumaCartQuantityText);
    }
    @CacheLookup
    @FindBy(xpath = "//span//strong[contains(text(),'$698.00')]")
    WebElement nokiaLumaCartUpdatedPriceText;
    public String verifyTotalPriceText() {
        return getTextFromElement(nokiaLumaCartUpdatedPriceText);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnBoxIAgreeTerms;
    public void clickOnBoxIAgreeToTermsOfServiceOption() {
        clickOnElement(clickOnBoxIAgreeTerms);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckOut;
       public void clickOnCheckOutOption() {
        clickOnElement(clickOnCheckOut);
    }


}
