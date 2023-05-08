package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NokiaLumaBillingPage extends Utility {
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameOption;
    public void firstNameOption(String firstName) {
        sendTextToElement(firstNameOption, firstName);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameOption;
    public void lastNameOption(String lastName) {
        sendTextToElement(lastNameOption, lastName);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryByDropDownOption;
    public void selectUKFromDropdownOption(String country) {
        selectByVisibleTextFromDropDown(countryByDropDownOption, country);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement provinceOption;
    public void inputProvince(String Province) {
        sendTextToElement(provinceOption, Province);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement provinceFromDropDownOption;
    public void selectOtherProvinceFromDropdownOption(String province) {
        selectByVisibleTextFromDropDown(provinceFromDropDownOption, province);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityOption;
    public void enterCity(String city) {
        sendTextToElement(cityOption, city);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressFirstLineOption;
    public void enterFirstLineOfAddressCity(String address) {
        sendTextToElement(addressFirstLineOption, address);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipPostalCodeeOption;
    public void enterZipPostalCode(String zipcode) {
        sendTextToElement(zipPostalCodeeOption, zipcode);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    public void enterPhoneNumber(String phonenumber) {
        sendTextToElement(zipPostalCodeeOption, phonenumber);
    }
    @CacheLookup
    @FindBy(xpath = "//button[text() = 'Continue']")
    WebElement continueTab;
    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement secondDayAirRadioButtonTab;
    public void clickOnRadioButtonSecondDayAir() {
        clickOnElement(secondDayAirRadioButtonTab);
    }
    @CacheLookup
    @FindBy(xpath = "///div[@id='shipping-method-buttons-container']/button")
    WebElement continueButtonTab;
    public void clickOnContinueButtonTab() {
        clickOnElement(continueButtonTab);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCardRadioButton;
    public void clickOnCreditCardRadioButton() {
        clickOnElement(creditCardRadioButton);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-step-payment-method']/div/button")
    WebElement paymentMethodRadioButton;
    public void clickOnCheckOutStepPaymentMethodRadioButton() {
        clickOnElement(paymentMethodRadioButton);
    }
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectPaymentCardOptionMasterOrVisa;
    public void selectMasterOrVisaCardForPayment(String card) {
        selectByVisibleTextFromDropDown(selectPaymentCardOptionMasterOrVisa, card);
    }
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    public void cardHolderNameAsOnCard(String name) {
        sendTextToElement(cardHolderName, name);
    }
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    public void cardNumberAsOnCard(String number) {
        sendTextToElement(cardNumber, number);
    }
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement monthOption;
    public void enterMonthOption(String month) {
        selectByVisibleTextFromDropDown(monthOption, month);
    }
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement yearOption;
    public void enterYearOption(String year) {
        selectByVisibleTextFromDropDown(yearOption, year);
    }
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCodeOption;
    public void enterCardCodeFromBackOfTheCard(String code) {
        selectByVisibleTextFromDropDown(cardCodeOption, code);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-info-buttons-container']/button")
    WebElement continueCheckOutTab;
    public void clickOnContinueCheckOutTab() {
        clickOnElement(continueCheckOutTab);
    }
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement paymentMethodCreditCardOption;
    public String verifyPaymentMethodByCreditCardText() {
        return getTextFromElement(paymentMethodCreditCardOption);
    }
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']/span[2]")
    WebElement shippingSecondDayAirMethodText;
    public String getShippingSecondDayAirMethodText() {
        return getTextFromElement(shippingSecondDayAirMethodText);
    }
    @CacheLookup
    @FindBy(xpath = "//td[@class='subtotal']/span")
    WebElement totalPriceText;
    public String getTotalPriceText() {
        return getTextFromElement(totalPriceText);
    }
    @CacheLookup
    @FindBy(xpath = "//button[text()='Confirm']")
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
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutButton;
    public void clickOnLogoutTabButton() {
        clickOnElement(logOutButton);
    }
    @CacheLookup
    @FindBy(xpath = "https://demo.nopcommerce.com/")
    WebElement confirmUrlText;
    public String getCurrentUrl() {
        return getCurrentUrl();
    }


}
