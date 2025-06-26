package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{
    @Given("User is on login page")
    public void User_is_on_login_page()
    {
        System.out.println("User lands on login page");
    }
    @When("User enter credentails correctly and submit")
    public void User_enter_credentails_correctly_and_submit()
    {
        System.out.println("User enters credentials and click on login");
    }
    @Then("User should land on dashboard")
    public void User_should_land_on_dashboard()
    {
        System.out.println("User should land on dashboard");
    }
}
