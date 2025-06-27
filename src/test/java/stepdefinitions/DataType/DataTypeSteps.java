package stepdefinitions.DataType;

import io.cucumber.java.en.Given;

import java.util.List;

public class DataTypeSteps
{
    @Given("This is {string} age {int} weight {double} and branch")
    public void this_is_age_weight_and_branch(String string, Integer int1, Double double1, List<String> dataTable) {

        System.out.println("Name: " + string);
        System.out.println("Age: " + int1);
        System.out.println("Weight: " + double1);
        System.out.println("Branches: " + dataTable.size());
    }
}
