package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Login_obj;


public class Login_SD {

        Login_obj lp = new Login_obj();

        @Given("User clicks on sign in option")
        public void user_clicks_on_sign_in_option() throws InterruptedException {
            Thread.sleep(2000);
            lp.SigninPage();

        }

        @When("The user enters the username and password")
        public void the_user_enters_the_username_and_password() throws InterruptedException {
            Thread.sleep(2000);
            lp.InputSigninData();

        }

        @Then("The signed in homepage appears")
        public void the_signed_in_homepage_appears() {
            lp.CheckSignin();

        }



}
