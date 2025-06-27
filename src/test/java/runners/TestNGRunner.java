package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Hooks/hook.feature",glue = "stepdefinitions.Hooks")
public class TestNGRunner extends AbstractTestNGCucumberTests
{
}
