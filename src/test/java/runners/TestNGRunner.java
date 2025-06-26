package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Tags",glue = "stepdefinitions",tags = "@Smoky")
public class TestNGRunner extends AbstractTestNGCucumberTests
{
}
