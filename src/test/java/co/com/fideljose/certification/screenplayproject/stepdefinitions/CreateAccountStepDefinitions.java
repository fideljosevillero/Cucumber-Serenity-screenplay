package co.com.fideljose.certification.screenplayproject.stepdefinitions;

import co.com.fideljose.certification.screenplayproject.models.People;
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

    @When("^user insert your information (.*)$")
    public void userInsertYourInformation(String  arg1) {    }

    @When("^user insert to location$")
    public void userInsertToLocation(List<People> arg1) {
        System.out.println("Name: " + arg1.get(0).getUsername());
        System.out.println("Lastname: " + arg1.get(0).getLastName());
        System.out.println("Email: " + arg1.get(0).getEmail());
    }

    @Then("^the user to see your profile$")
    public void theUserToSeeYourProfile() {    }



}