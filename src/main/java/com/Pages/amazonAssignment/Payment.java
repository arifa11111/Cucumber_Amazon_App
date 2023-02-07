package com.Pages.amazonAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Payment {

    WebDriver driver;

    By netBankingDropDown = By.cssSelector("select[name$='ppw-bankSelection_dropdown']");

    By addedBankLocator = By.cssSelector("#payment-information #spc_netbanking");

    By paymentSubmitBtn = By.cssSelector("input[name*='SetPaymentPlan'][type*='submit']");



    public Payment(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement netBanking(){
        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(netBankingDropDown));
        return driver.findElement(netBankingDropDown);
    }

    public WebElement paymentSubmitBtn(){
        return driver.findElement(paymentSubmitBtn);
    }


    public WebElement isAddedBankCorrect(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addedBankLocator));
        return driver.findElement(addedBankLocator);
    }
}
