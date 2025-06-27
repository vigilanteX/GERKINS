package stepdefinitions.DataTableCase;

import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataTableStep
{
    @Given("User is on signup page")
    public void user_is_on_signup_page(io.cucumber.datatable.DataTable dataTable) {
         List<Map<String,String>>  mp=dataTable.asMaps();
         for (Map<String,String> user:mp)
         {
             System.out.print(user.get("name"));
             System.out.print(user.get("age")+"\n");
         }

    }
}
