package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage_obj;

public class HomePage_SD {

        HomePage_obj hp = new HomePage_obj();
        @Given("The home page opens with the link {string}")
        public void the_home_page_opens_with_the_link(String string) {
            System.out.println("String Value" + string);
            System.out.println("HP is" + hp.toString());
            hp.InitHomePage(string);

        }

        @When("user clicks get started without registration")
        public void user_clicks_get_started_without_registration() throws InterruptedException {
            System.out.println("HP is" + hp.toString());
            hp.GetStartedBtn();

        }

        @Then("user is redirected to home page")
        public void user_is_redirected_to_home_page() {
            hp.CheckHomePageDisplay();
        }


}

