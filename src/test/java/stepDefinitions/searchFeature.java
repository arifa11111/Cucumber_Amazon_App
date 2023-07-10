package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchFeature {
    @Given("I have a search field on Amazon Page")
    public void iHaveASearchFieldOnAmazonPage() {
    }

    @When("I search for a product with name {string} and price {int}")
    public void iSearchForAProductWithNameAndPrice(String arg0, int arg1) {
    }

    @Then("Product with name {string} should be displayed")
    public void productWithNameShouldBeDisplayed(String arg0) {
    }

    @Then("Order id is {int} and username is {string}")
    public void orderIdIsAndUsernameIs(int arg0, String arg1) {
    }
}
