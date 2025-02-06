package DefAndImpl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreefeStepDef {

    TreeStepImpl treeStepImpl=new TreeStepImpl();


    @Given("^open treefe app through (.*?) with (.*?) and (.*?)$")
    public void  setupConfigrationForTreefeApp() {
        // Write code here that turns the phrase above into concrete actions
        treeStepImpl.setupConfigrationForTreefeApp();
    }

    @When("open treefe app and click + icon")
    public void open_treefe_app_and_click_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("quit the app driver")
    public void quit_the_app_driver() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
