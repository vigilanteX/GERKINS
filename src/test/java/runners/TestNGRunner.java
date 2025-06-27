package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/ScenarioOutlineCase/login.feature",glue = "stepdefinitions.ScenarioOutlineCase")
public class TestNGRunner extends AbstractTestNGCucumberTests
{
}
