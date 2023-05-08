package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutWelcomePage extends Utility {

    @CacheLookup
            @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeTitle;
    public String getTextFromWelcomeSignInTitle() {
        return getTextFromElement(welcomeTitle);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutAsGuestButton;
    public void clickCheckoutAsGuestButton(){
        clickOnElement(checkOutAsGuestButton);
    }
}
