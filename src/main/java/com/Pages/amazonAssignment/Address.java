package com.Pages.amazonAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Address {

    WebDriver driver;


    By addressFormLocator = By.xpath("//div[@class='a-input-text-group a-spacing-medium a-spacing-top-medium']//input");


    By newDeliveryAddressBtn = By.id("add-new-address-popover-link");

    By submitBtn = By.id("address-ui-widgets-form-submit-button");

    By addedAddressDetails = By.cssSelector("div.displayAddressDiv ul li:first-child");


    public Address(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement addNewAddressBtn(){
        return  driver.findElement(newDeliveryAddressBtn);
    }


    public List<WebElement> deliveryAddressForm(){
        return driver.findElements(addressFormLocator);
    }


    public WebElement submitDeliveryAddressForm(){
        return driver.findElement(submitBtn);
    }

    public WebElement addedNameInAddressForm(){
        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addedAddressDetails));
        return driver.findElement(addedAddressDetails);
    }

}
