package stepdefinitions.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class hooksSteps
{
    @Given("This is given of hook")
    public void this_is_given_of_hook() {
        System.out.println(" in hook given");
    }
    @When("This is when of hook")
    public void this_is_when_of_hook() {
        System.out.println(" in hook when");

    }
    @Then("This is then of hook")
    public void this_is_then_of_hook() {
        System.out.println(" in hook then");

    }
    @Before
    public void beforeScenario()
    {
        System.out.println("before scenarios");
    }
    @BeforeStep
    public void beforeStep()
    {
        System.out.println("before steps");
    }
    @After
    public void afterScenario()
    {
        System.out.println("after scenarios");
    }
    @AfterStep
    public void afterStep()
    {
        System.out.println("after steps");
    }
}
