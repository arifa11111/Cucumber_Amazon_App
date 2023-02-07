package com.StepDefinitions;

import com.Pages.amazonAssignment.Address;
import com.Pages.amazonAssignment.Orders;
import com.Pages.amazonAssignment.Payment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.time.Year;
import java.util.List;
import java.util.Properties;

public class CheckoutPageSteps {

    WebDriver driver = Base.getDriver();

    Orders orders = new Orders(driver);

    Address address = new Address(driver);

    Payment payment = new Payment(driver);

    Properties prop = new Base().init_properties();


    @Given("user is on orders page")
    public void userIsOnOrdersPage() {
        orders.goToOrders().click();
        Assert.assertEquals(driver.getCurrentUrl(),prop.getProperty("AMAZON_ORDERS_PAGE"));
    }

    @When("user select previous orders")
    public void userSelectPreviousOrders() {
        WebElement yearDropDown = orders.yearDropDownInOrders();
        Assert.assertTrue(yearDropDown.isDisplayed());
        Select select = new Select(yearDropDown);
        select.selectByVisibleText(String.valueOf(Year.now().getValue()-2));
    }

    @And("Reorder the first product")
    public void reorderTheFirstProduct() {
        Assert.assertTrue(orders.firstOrder().isDisplayed());
        orders.firstOrderLink().click();
        orders.buyNowBtn().click();
    }

    @Then("user navigate to checkout page")
    public void userNavigateToCheckoutPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains(prop.getProperty("CHECKOUT_PAGE")));
    }

    @When("user added new address")
    public void userAddedNewAddress() {
        address.addNewAddressBtn().click();
        List<WebElement> InputformFields = address.deliveryAddressForm();

        for(int i=0;i<InputformFields.size()-1;i++){
            InputformFields.get(i).sendKeys(prop.getProperty("field."+i));
        }

        address.submitDeliveryAddressForm().click();
    }

    @Then("added address should be visible")
    public void addedAddressShouldBeVisible() {
        Assert.assertEquals(address.addedNameInAddressForm().getText(),prop.getProperty("field.0"));
    }

    @When("user added payment method")
    public void userAddedPaymentMethod() throws InterruptedException {
        WebElement netBankingDropdown = payment.netBanking();
        Select select = new Select(netBankingDropdown);
        select.selectByValue(prop.getProperty("HDFC_BANK_VALUE"));
        payment.paymentSubmitBtn().click();
    }

    @Then("added payment method should be visible")
    public void addedPaymentMethodShouldBeVisible() throws InterruptedException {
        String addedBank = payment.isAddedBankCorrect().getText();
        Assert.assertTrue(addedBank.contains(prop.getProperty("bank")));
    }
}
