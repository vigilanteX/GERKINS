package stepdefinitions.ScenarioOutlineCase;

import io.cucumber.java.en.*;

public class LoginScenarioOutline
{
    @Given("User is on new login page")
    public void User_is_on_login_new_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User_is_on_login_page");
    }


    @When("User enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user_enters "+string+" "+string2);

    }
    @Then("User should be routed to dashboard")
    public void user_should_be_routed_to_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user_should_be_routed_to_dashboard");

    }
}
