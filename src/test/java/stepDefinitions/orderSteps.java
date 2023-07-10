package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orderSteps {
    @Given("a registered user exists")
    public void aRegisteredUserExists() {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    @Given("user is on Amazon login page")
    public void userIsOnAmazonLoginPage() {
    }

    @When("user enters username")
    public void userEntersUsername() {
    }

    @And("user enters password")
    public void userEntersPassword() {
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
    }

    @Then("user navigates to order page")
    public void userNavigatesToOrderPage() {
    }

    @When("user clicks on Order link")
    public void userClicksOnOrderLink() {
    }

    @Then("user checks the previous order detials")
    public void userChecksThePreviousOrderDetials() {
    }

    @When("user clicks on Open Orders link")
    public void userClicksOnOpenOrdersLink() {
    }

    @Then("user checks the open order details")
    public void userChecksTheOpenOrderDetails() {
    }

    @When("user clicks on Cancelled Orders link")
    public void userClicksOnCancelledOrdersLink() {
    }

    @Then("user checks the cancelled order details")
    public void userChecksTheCancelledOrderDetails() {
    }
}
