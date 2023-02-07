package com.StepDefinitions;

import com.Pages.amazonAssignment.LeftNavToMainMenu;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LeftNavSteps {

    WebDriver driver = Base.getDriver();

    LeftNavToMainMenu leftNav = new LeftNavToMainMenu(driver);


    @When("user click on left nav")
    public void userClickOnLeftNav() throws InterruptedException {
        leftNav.clickToGetSideNav().click();
        Thread.sleep(1000);
    }

    @Then("nav should be displayed")
    public void navShouldBeDisplayed() {
        Assert.assertTrue(leftNav.leftNav().isDisplayed());
    }

    @When("user click on mobiles")
    public void userClickOnMobiles() {
        WebElement mobileText = leftNav.MobilesTextInLeftNav();
        Assert.assertTrue(mobileText.isDisplayed());
        mobileText.click();
    }

    @Then("back to main menu is displayed")
    public void backToMainMenuIsDispalyed() {
        WebElement mainmenu = leftNav.getMainMenuBtn();
        Assert.assertTrue(mainmenu.isDisplayed());
        mainmenu.click();

    }

    @When("user click on close button")
    public void userClickOnCloseButton() {
        WebElement closeIcon = leftNav.closeBtnInLeftNav();
        Assert.assertTrue(closeIcon.isDisplayed());
        closeIcon.click();
    }

    @Then("main menu should be closed")
    public void userGetBackToMainMenu() {
        Assert.assertTrue(leftNav.leftNav().isDisplayed());
    }
}
