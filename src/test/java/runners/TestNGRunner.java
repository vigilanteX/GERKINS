package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/DataTypes/dataTypes.feature",glue = "stepdefinitions.DataType",
plugin = {
        "pretty",
        "json:target/cucumber.json"
})
public class TestNGRunner extends AbstractTestNGCucumberTests
{
}
