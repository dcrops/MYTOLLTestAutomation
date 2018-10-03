package steps.templates;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import global.PageBase;
import mytollhomepage.MyTollHomePageActions;
import org.testng.Assert;

public class TemplateStepDefinitions {
    @Given("^User adds a new template in My Templates$")
    public void userAddsANewTemplateInMyTemplates() throws Throwable {
        MyTollHomePageActions.clickMyTemplates();
        MyTollHomePageActions.clickAddTemplateButton();
    }

    @When("^User enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" into dimensions$")
    public void userEntersDimensions(String items, String length, String width, String height) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MyTollHomePageActions.enterDimensions(items, length, width, height);
    }

    @Then("^the volume calculated should be \"([^\"]*)\"$")
    public void theVolumeCalculatedShouldBe(String volume) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(MyTollHomePageActions.getVolume(), volume);
    }
}
