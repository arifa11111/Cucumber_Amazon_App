package com.StepDefinitions;

import com.Pages.amazonAssignment.Mobiles;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class MobileSteps {

    WebDriver driver = Base.getDriver();

    Properties prop=new Base().init_properties();

    Mobiles mobile = new Mobiles(driver);

    @When("user search for mobiles")
    public void userSearchForMobiles() {
        mobile.searchBox().sendKeys(prop.getProperty("SEARCH_ITEM"), Keys.ENTER);
    }

    @Then("list of mobiles should shown")
    public void listOfMobilesShouldShown() {
        Assert.assertTrue(mobile.searchItems().isDisplayed());
    }

    @When("user get last mobile")
    public void userGetLastMobile() {
        mobile.getLastMobilesDetails().click();
    }

    @Then("Mobiles details will be shown")
    public void mobilesDetailsWillBeShown() throws InterruptedException {

        if(driver.getWindowHandles().size()>1) {
            Set<String> handles=driver.getWindowHandles();
            Iterator<String> it=handles.iterator();
            String parentWindowId = it.next();
            String childWindow =it.next();
            driver.switchTo().window(childWindow);
        }

        Assert.assertTrue(mobile.productDetails().isDisplayed());
    }

}
