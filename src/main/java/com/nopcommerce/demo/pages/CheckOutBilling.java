package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutBilling extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstNameOption;

    public void firstNameOption(String firstName) {
        sendTextToElement(firstNameOption, firstName);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastNameOption;

    public void lastNameOption(String lastName) {
        sendTextToElement(lastNameOption, lastName);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement emailField;

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement dropDownOption;

    public void selectUKFromDropdownOption(String country) {
        selectByVisibleTextFromDropDown(dropDownOption, country);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityField;

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement addressField;

    public void enterAddressLine1(String address) {
        sendTextToElement(addressField, address);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement zipcodeField;

    public void enterZipcode(String zipcode) {
        sendTextToElement(zipcodeField, zipcode);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumberField;

    public void enterPhoneNumber(String phoneNumber) {
        sendTextToElement(phoneNumberField, phoneNumber);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continueButton;

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement shippingOption;

    public void clickOnTheShoppingOption() {
        clickOnElement(shippingOption);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement continueButton2;

    public void clickOnSecondContinueButton() {
        clickOnElement(continueButton2);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement paymentOption;

    public void clickOnThePaymentOption() {
        clickOnElement(paymentOption);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement continueButton3;

    public void clickOnThirdContinueButton() {
        clickOnElement(continueButton3);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement cardDropdownOption;

    public void selectMasterCardOptionFromDropdown(String cardType) {
        selectByVisibleTextFromDropDown(cardDropdownOption, cardType);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement nameField;

    public void enterCardHolderName(String name) {
        sendTextToElement(nameField, name);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberField;

    public void enterCardNumber(String cardNumber) {
        sendTextToElement(cardNumberField, cardNumber);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement monthExpiryField;

    public void enterExpiryMonth(String month) {
        sendTextToElement(monthExpiryField, month);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement yearExpiryField;

    public void enterExpiryYear(String year) {
        sendTextToElement(yearExpiryField, year);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement securityCodeField;

    public void enterSecurityCode(String code) {
        sendTextToElement(securityCodeField, code);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement continueButton4;

    public void clickOnFourthContinueButton() {
        clickOnElement(continueButton4);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement paymentMethodText;

    public String getPaymentMethodText() {
        return getTextFromElement(paymentMethodText);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6] +" +
                   "/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement shippingMethodText;

    public String getShippingMethodText() {
        return getTextFromElement(shippingMethodText);
    }

    @CacheLookup
    @FindBy(xpath = "///body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6] +" +
            "/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/ +" +
            "table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]")
    WebElement totalPriceText;

    public String getTotalPriceText() {
        return getTextFromElement(totalPriceText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;

    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;

    public String getThankYouText() {
        return getTextFromElement(thankYouText);
    }

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfulOrderText;

    public String getSuccessfulOrderText() {
        return getTextFromElement(successfulOrderText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement lastContinueButton;

    public void clickOnTheLastContinueButton() {
        clickOnElement(lastContinueButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
}