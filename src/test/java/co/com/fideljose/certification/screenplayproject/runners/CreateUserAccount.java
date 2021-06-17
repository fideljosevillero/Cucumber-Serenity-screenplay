package co.com.fideljose.certification.screenplayproject.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//https://advantageonlineshopping.com/#/register
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\create_user_account.feature",
        glue = "co/com/fideljose/certification/screenplayproject/stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "not @Fail") // todos menos e tag @Fail
//        tags = "@FailAccount") // solo 1
//tags = "@FailAccount, @Fail") // varios
public class CreateUserAccount { }
