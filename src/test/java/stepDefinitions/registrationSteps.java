package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class registrationSteps {
    @Given("User is on registration page")
    public void userIsOnRegistrationPage() {
        System.out.println("user in reg page.............");
    }

    @When("User enters following user details")
    public void userEntersFollowingUserDetails(DataTable dataTable) {
       List<List<String>> userList= dataTable.asLists(String.class);
       userList.forEach(System.out::println);
    }

    @Then("user registration should be successful")
    public void userRegistrationShouldBeSuccessful() {
    }

    @When("User enters following user details with columns")
    public void userEntersFollowingUserDetailsWithColumns(DataTable table) {
        List<Map<String,String>> list = table.asMaps(String.class,String.class);
        list.forEach(System.out::println);
        System.out.println(list.get(0));
        System.out.println(list.get(0).get("firstname"));
    }

//    @When("User enters following user details with columns")
//    public void userEntersFollowingUserDetailsWithColumns() {
//    }
}
