package co.com.fideljose.certification.screenplayproject.stepdefinitions;

import co.com.fideljose.certification.screenplayproject.models.People;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class CreateAccountStepDefinitions {

    @Given("^user is into website$")
    public void userIsIntoWebsite() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^user insert your information (.*)$")
    public void userInsertYourInformation(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

//    @When("^user insert to location$")
//    public void userInsertToLocation() {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new PendingException();
//    }
    @When("^user insert to location$")
    public void userInsertToLocation(List<String> arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        //throw new PendingException();
        System.out.println("--- " + arg1.get(0));
    }

    @Then("^the user to see your profile$")
    public void theUserToSeeYourProfile(List<People> arg1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("Name: " + arg1.get(0).getName());
        System.out.println("Lastname: " + arg1.get(0).getLastname());
        System.out.println("Email: " + arg1.get(0).getEmail());

    }



}