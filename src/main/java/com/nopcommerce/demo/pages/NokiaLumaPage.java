package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NokiaLumaPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumaText;
    public String verifyNokiaLuma1020Text() {
        return getTextFromElement(nokiaLumaText);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement nokiaLumaPriceText;
    public String verifyNokiaLuma1020PriceText() {
        return getTextFromElement(nokiaLumaPriceText);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement quantityOption;
    public void quantitySpaceOption() {
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "2"); // Type in the new text
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCartOption;
    public void clickOnAddToCartOption() {
        clickOnElement(addToCartOption);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']/div/p")
    WebElement productAddedToShoppingCartText;
    public String verifyTheProductHasBeenAddedToYourShoppingCartText() {
        return getTextFromElement(productAddedToShoppingCartText);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement clickOnGreenBarXButtonOption;
    public void clickOnXOnGreenBarOption() {
        clickOnElement(clickOnGreenBarXButtonOption);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement shoppingCartButtonOption;
    public void mouseHoverOverShoppingCartOption() {
        mouseHoverToElementAndClick(shoppingCartButtonOption);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartOption;
    public void clickOnGoToCartOption() {
        clickOnElement(goToCartOption);
    }
}