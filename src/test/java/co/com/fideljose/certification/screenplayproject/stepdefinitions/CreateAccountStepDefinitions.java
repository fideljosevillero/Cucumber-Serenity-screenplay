package co.com.fideljose.certification.screenplayproject.stepdefinitions;

import co.com.fideljose.certification.screenplayproject.models.User;
import co.com.fideljose.certification.screenplayproject.tasks.UserInformation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
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

    // Background
    @Given("^user insite$")
    public void userInsite() {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("-> Method userInsite");
    }

    @When("^user is logged$")
    public void userIsLogged() {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("-> Method userIsLogged");
    }

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

     public void theUserToSeeYourProfile() {

     }



}