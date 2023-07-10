package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user is  on login pages")
    public void loginPage(){
        System.out.println("user is  on login page");
    }

    @When("user enters {string} and {string}")
    public void enterValues(String usr,String pwd){
        System.out.println("***********"+usr+"........."+pwd);
    }

    @And("clicks on login button")
    public void login(){
        System.out.println("clicked........");
    }

    @Then("user is navigated to home page")
    public void navigate(){
        System.out.println("..............");
    }
}
