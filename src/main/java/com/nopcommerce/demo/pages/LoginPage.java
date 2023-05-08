package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);

    }
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}
