package co.com.fideljose.certification.screenplayproject.stepdefinitions;

import co.com.fideljose.certification.screenplayproject.models.User;
import co.com.fideljose.certification.screenplayproject.tasks.UserInformation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CreateAccountStepDefinitions {

    @Before
    public void configuration(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(chrome)));
        OnStage.theActorCalled("Actor");
    }
    @Managed
    WebDriver chrome;

    @Given("^user is into website$")
    public void userIsIntoWebsite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://advantageonlineshopping.com/#/register"));
    }

    @When("^user insert your information$")
    public void userInsertYourInformation(List<User> users) {
        OnStage.theActorInTheSpotlight().attemptsTo(UserInformation.setUserInformation(users));
    }

    @When("^user insert to location$")
    public void userInsertToLocation() {
    }

    @Then("^the user to see your profile$")
    public void theUserToSeeYourProfile() {    }



}