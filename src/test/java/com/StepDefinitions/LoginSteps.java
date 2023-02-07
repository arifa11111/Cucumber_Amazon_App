package com.StepDefinitions;

import com.Pages.amazonAssignment.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Properties;


public class LoginSteps {

    WebDriver driver=Base.getDriver();
    Login signIn = new Login(driver);

    Properties prop=new Base().init_properties();

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        signIn.userAccount().click();
    }

    @When("user enter {string} and click on continue button")
    public void enterUsernameAndClickOnContinueButton(String username) {
        signIn.emailInputBox().sendKeys(username);
        signIn.continueBtn().click();
    }

    @And("user enter {string} and click on submit button")
    public void enterPasswordAndClickOnSubmitButton(String password) {
        signIn.passwordInputBox().sendKeys(password);
        signIn.submitBtn().click();
    }

    @Then("user enters Home page")
    public void userEntersHomePage() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("SIGNIN_HOME_PAGE"));
    }
}
