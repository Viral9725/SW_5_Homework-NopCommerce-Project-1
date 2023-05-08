package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NokiaLumaRegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement clickGenderButton;

    public void clickOnAppropriateGenderButton() {
        clickOnElement(clickGenderButton);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameOption;

    public void firstNameOption(String firstName) {
        sendTextToElement(firstNameOption, firstName);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameOption;

    public void lastNameOption(String lastName) {
        sendTextToElement(lastNameOption, lastName);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOption;

    public void dateOfBirth(String date) {
        selectByVisibleTextFromDropDown(dateOption, date);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOption;

    public void dateOfBirthMonth(String month) {
        selectByVisibleTextFromDropDown(monthOption, month);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOption;

    public void dateOfBirthYear(String year) {
        selectByVisibleTextFromDropDown(yearOption, year);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement emailOption;

    public void enterEmailOption(String email) {
        sendTextToElement(emailOption, email);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement passwordOption;

    public void enterPasswordOption(String password) {
        sendTextToElement(passwordOption, password);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement confirmPasswordOption;

    public void confirmPasswordOption(String password) {
        sendTextToElement(confirmPasswordOption, password);
    }

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickRegisterButton;

    public void clickOnRegisterTabButton() {
        clickOnElement(clickRegisterButton);
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompletedText;

    public String verifyYourRegistrationCompletedText() {
        return getTextFromElement(registrationCompletedText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinueButton;

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinueButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;

    public String verifyShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement clickOnTermsAndServiceBox;

    public void clickOnTermsAndServiceBox() {
        clickOnElement(clickOnTermsAndServiceBox);
    }

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement clickOnCheckOutTab;

    public void clickOnCheckOutTab() {
        clickOnElement(clickOnCheckOutTab);
    }


}
