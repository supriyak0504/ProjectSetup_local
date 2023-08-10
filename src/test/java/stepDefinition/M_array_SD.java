package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.M_array_obj;

public class M_array_SD {

    M_array_obj arr = new M_array_obj();

    @When("User Clicks on {string} button on array Data Structure")
    public void user_clicks_on_button_on_array_data_structure(String string) throws InterruptedException {
        Thread.sleep(1000);
        arr.GestartedArr();
    }

    @When("User clicks on Arrays in Python")
    public void user_clicks_on_arrays_in_python() throws InterruptedException {
        Thread.sleep(1000);
    arr.ArrayinPythLink();
    }

    @Then("User clicks on Practice Questions")
    public void user_clicks_on_practice_questions() throws InterruptedException {
        Thread.sleep(1000);
    arr.pracQuesLink();
    }

    @Then("User clicks on Search the array")
    public void user_clicks_on_search_the_array() throws InterruptedException {
        Thread.sleep(1000);
    arr.SearcharrLink();
    }

    @Then("the text editor opens and clears the text editor")
    public void the_text_editor_opens_and_clears_the_text_editor() throws InterruptedException {
        Thread.sleep(1000);
    arr.ClearTxtEditor();
    }

    @Then("user gives python code")
    public void user_gives_python_code() throws InterruptedException {
Thread.sleep(1000);
arr.InputPythonCode();
    }

}
