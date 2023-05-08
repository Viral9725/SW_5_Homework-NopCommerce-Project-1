package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellphonePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement cellPhoneText;

    public String getCellPhoneText() {
        return getTextFromElement(cellPhoneText);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listButton;
    public void clickOnTheListButton() {
        clickOnElement(listButton);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaProduct;
    public void clickOnThePhoneOption() {
        clickOnElement(nokiaProduct);
    }
}
