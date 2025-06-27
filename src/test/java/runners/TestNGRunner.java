package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/DataTableCase/DataTable.feature",glue = "stepdefinitions.DataTableCase")
public class TestNGRunner extends AbstractTestNGCucumberTests
{
}
