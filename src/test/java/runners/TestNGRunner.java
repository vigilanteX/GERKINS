package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Tags",glue = "stepdefinitions",tags = "@Smoke and @F1")
public class TestNGRunner extends AbstractTestNGCucumberTests
{
}
