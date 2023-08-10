package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.tree_obj;

public class tree_SD {

    tree_obj trobj = new tree_obj();
    @Given("User is on the SignedIn Home Page for tree")
    public void user_is_on_the_signed_in_home_page_for_tree() throws InterruptedException {
        Thread.sleep(2000);
        trobj.LandingPage();
    }
    @When("User Clicks on {string} button on tree Data Structure")
    public void userClicksOnButtonOnTreeDataStructure(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        trobj.TreeGetStarted();
    }
    @Then("The Tree page appears")
    public void the_Tree_page_appears() throws InterruptedException {
        Thread.sleep(2000);
        trobj.TreeLandpageChk();
    }

    @When("User clicks on Overview of Trees")
    public void userClicksOnOverviewOfTrees() throws InterruptedException {
        Thread.sleep(2000);
        trobj.OverTreeLink();
    }

    @Then("The Overview of Trees page opens")
    public void theOverviewOfTreesPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.OverTreeLinkChk();
    }

    @And("User clicks on Try here button")
    public void userClicksOnTryHereButton() throws InterruptedException{
        Thread.sleep(2000);
        trobj.TryHereButton();
    }

    @Then("the text editor opens and user gives python code")
    public void theTextEditorOpensAndUserGivesPythonCode() throws InterruptedException {
        Thread.sleep(2000);
        trobj.EditorBoxInput();

    }

    @And("User clicks on Run Button")
    public void userClicksOnRunButton() throws InterruptedException {
        Thread.sleep(1000);
        trobj.RunBtnclick();

    }

    @Then("The output is displayed")
    public void theOutputIsDisplayed() throws Exception {
        Thread.sleep(2000);
        trobj.OutputChkMsg();
        //     System.out.println("The Page after run displayed");
    }
}
