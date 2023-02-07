package com.Pages.amazonAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


public class PrimeCheckBox {
    WebDriver driver;

    By primeCheckBox = By.xpath("//i[@aria-label='Prime eligible']/ancestor::label/child::input");

    By elementLocator = (By.xpath("(//div[@aria-label='Deals grid']//div[contains(@class,'DealGridItem-module')])[1]"));

    By deliveryDateLocator = By.xpath("//div[@id='mir-layout-DELIVERY_BLOCK-slot-PRIMARY_DELIVERY_MESSAGE_LARGE']/child::span");


    public PrimeCheckBox(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement primeCheckBox(){
        return driver.findElement(primeCheckBox);
    }


    public WebElement getFirstItem() {
        return driver.findElement(elementLocator);
    }


    public WebElement deliveryDateOfFirstItem(){

        if(driver.getWindowHandles().size()>1) {
            Set<String> handles=driver.getWindowHandles();
            Iterator<String> it=handles.iterator();
            String parentWindowId = it.next();
            String childWindow =it.next();
            driver.switchTo().window(childWindow);
        }

        return driver.findElement(deliveryDateLocator);
    }

}
