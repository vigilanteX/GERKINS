package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Tags",glue = "stepdefinitions",tags = "not @Smoke")
public class TestNGRunner extends AbstractTestNGCucumberTests
{
}
