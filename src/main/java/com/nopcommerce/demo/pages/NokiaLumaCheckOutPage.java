package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NokiaLumaCheckOutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomePleaseSignInText;

    public String verifyWelcomePleaseSignInText() {
        return getTextFromElement(welcomePleaseSignInText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Register']")
    WebElement clickRegisterTab;
    public void clickOnRegisterTabOption() {
        clickOnElement(clickRegisterTab);
    }


}
