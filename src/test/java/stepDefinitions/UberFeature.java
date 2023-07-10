package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberFeature {
    @Given("User wants to select a car type {string} from uber application")
    public void userWantsToSelectACarTypeFromUberApplication(String arg0) {
        System.out.println("**********"+arg0+"***********");
    }

    @When("User selects car {string} and pick up point {string} and drop location {string}")
    public void userSelectsCarAndPickUpPointAndDropLocation(String arg0, String arg1, String arg2) {
        System.out.println(arg0+"@@@@@@@@@@@@@@@@@@@@@@@@@@"+arg1+"3333333333333333"+arg2);
    }

    @Then("Driver starts the journey")
    public void driverStartsTheJourney() {
    }

    @And("Driver ends the journey")
    public void driverEndsTheJourney() {
    }

    @Then("User pays {int} USD")
    public void userPaysUSD(int arg0) {
    }

    @Then("User checks the trip details")
    public void userChecksTheTripDetails() {
    }
}
