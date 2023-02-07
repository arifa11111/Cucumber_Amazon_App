package com.Pages.amazonAssignment;

import org.openqa.selenium.*;


public class Mobiles {

    WebDriver driver;

    By searchBoxLocator = By.id("twotabsearchtextbox");

    By lastMobileLink = By.xpath("(//div[@data-component-type='s-search-result'][last()]//a)[4]");

    By productLocator = By.cssSelector("#dp-container #ppd");

    By searchResults = By.xpath("//span[@data-component-type='s-search-results']");



    public Mobiles(WebDriver driver){
        this.driver=driver;
    }

    public WebElement searchBox(){
        return driver.findElement(searchBoxLocator);
    }

    public WebElement getLastMobilesDetails(){
        return driver.findElement(lastMobileLink);
    }

    public WebElement productDetails(){
        return driver.findElement(productLocator);
    }

    public WebElement searchItems() {
        return driver.findElement(searchResults);
    }
}
