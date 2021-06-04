package co.com.fideljose.certification.screenplayproject.stepdefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\create_user_account.feature",
glue = "co.com.fideljose.certification.screenplayproject.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class CreateAccountStepDefinitions {

    @When("^User insite to screen$")
    public void user_insite_to_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Then("^The user to see your profile$")
    public void the_user_to_see_your_profile() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
