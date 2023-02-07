package com.StepDefinitions;

import com.Pages.amazonAssignment.SendItemToCart;
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

public class AddToCartTodaysDealItem {

    WebDriver driver=Base.getDriver();

    TodaysDeal todaysDeal;

    SendItemToCart addToCart;

    Properties prop=new Base().init_properties();

    @Given("user is on home page")
    public void userIsOnHomePage() {
        Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("url"));
    }

    @When("user click on today-deals")
    public void userClickOnTodayDeals() {
        todaysDeal = new TodaysDeal(driver);

        WebElement deal = todaysDeal.todaysDealBtn();

        Assert.assertTrue(deal.isDisplayed());

        todaysDeal.todaysDealBtn().click();
    }

    @Then("user is on today deals page")
    public void userIsOnTodayDealsPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("deals"));
    }

    @When("user click on third item")
    public void userClickOnThirdItem() throws IOException, InterruptedException {
        todaysDeal.thirdItemInDeals().click();
        //list of related items shown
        todaysDeal.firstItemInLisOfItems();
    }

    @And("add minimum quantity and add product to cart")
    public void addProductToCart() {
        addToCart = new SendItemToCart(driver);

        WebElement cartBtn = addToCart.addToCartBtn();

        Assert.assertTrue(cartBtn.isDisplayed());

        cartBtn.click();

        addToCart.goToCart().click();
    }

    @Then("minimum quantity should be one")
    public void minimumQuantityShouldBeOne() {
        WebElement qty = addToCart.qtyDropdown();
        Assert.assertEquals(qty.getAttribute("value"), "1");
    }

}
