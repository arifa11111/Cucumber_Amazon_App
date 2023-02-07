package com.StepDefinitions;

import com.Pages.amazonAssignment.PrimeCheckBox;
import com.Pages.amazonAssignment.TodaysDeal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.Properties;

public class PrimeProducts {

    public WebDriver driver = Base.getDriver();

    Properties prop=new Base().init_properties();

    TodaysDeal todaysDeal = new TodaysDeal(driver);

    PrimeCheckBox  prime = new PrimeCheckBox(driver);


    @Given("user is on home page after login")
    public void userIsOnHomePage() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("SIGNIN_HOME_PAGE"));
    }

    @When("user enable prime checkbox")
    public void userEnablePrimeCheckbox() throws InterruptedException {
        todaysDeal.todaysDealBtn().click();
        WebElement primeCheckBox = prime.primeCheckBox();
        Assert.assertTrue(primeCheckBox.isDisplayed());
        primeCheckBox.click();
    }

    @Then("get the first displayed item")
    public void getTheFirstDisplayedItem() throws InterruptedException, IOException {
        Thread.sleep(2000);
        prime.getFirstItem().click();
        todaysDeal.firstItemInLisOfItems();
    }

    @And("display delivery date of item")
    public void displayDeliveryDateOfItem() {
        System.out.println(prime.deliveryDateOfFirstItem().getText());
    }
}
