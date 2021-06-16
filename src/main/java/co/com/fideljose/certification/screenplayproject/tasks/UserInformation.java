package co.com.fideljose.certification.screenplayproject.tasks;

import co.com.fideljose.certification.screenplayproject.models.User;
import co.com.fideljose.certification.screenplayproject.userinterfaces.RegisterUserAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class UserInformation implements Task {

    private List<User> users;

    public UserInformation(List<User> users){
        this.users = users;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
//        actor.attemptsTo(Enter.theValue(this.users.get(0).getUsername()).into(RegisterUserAccount.INPUT_USERNAME));
//        actor.attemptsTo(Enter.theValue(this.users.get(0).getEmail()).into(RegisterUserAccount.INPUT_EMAIL));
//        actor.attemptsTo(Enter.theValue(this.users.get(0).getPassword()).into(RegisterUserAccount.INPUT_PASSWORD));
//        actor.attemptsTo(Enter.theValue(this.users.get(0).getConfirmPassword()).into(RegisterUserAccount.INPUT_CONFIRMPASSWORD));
//        actor.attemptsTo(Enter.theValue(this.users.get(0).getFirstName()).into(RegisterUserAccount.INPUT_FIRSTNAME));
//        actor.attemptsTo(Enter.theValue(this.users.get(0).getLastName()).into(RegisterUserAccount.INPUT_LASTNAME));
//        actor.attemptsTo(Enter.theValue(this.users.get(0).getPhoneNumber()).into(RegisterUserAccount.INPUT_PHONE));
//
//        actor.attemptsTo(SelectFromOptions.byVisibleText(this.users.get(0).getCountry()).from(RegisterUserAccount.INPUT_COUNTRY));
//        actor.attemptsTo(Enter.theValue(this.users.get(0).getCity()).into(RegisterUserAccount.INPUT_CITY));
//        actor.attemptsTo(Enter.theValue(this.users.get(0).getAddress()).into(RegisterUserAccount.INPUT_ADDRESS));
//        actor.attemptsTo(Enter.theValue(this.users.get(0).getRegion()).into(RegisterUserAccount.INPUT_STATE));
//        actor.attemptsTo(Enter.theValue(this.users.get(0).getPostalCode()).into(RegisterUserAccount.INPUT_CODEPOSTAL));
//        actor.attemptsTo(Click.on(RegisterUserAccount.CHECK_AGREE));
        actor.attemptsTo(Enter.theValue(
                    this.users.get(0).getUsername()).into(RegisterUserAccount.INPUT_USERNAME)
                    , Enter.theValue(this.users.get(0).getEmail()).into(RegisterUserAccount.INPUT_EMAIL)
                    , Enter.theValue(this.users.get(0).getPassword()).into(RegisterUserAccount.INPUT_PASSWORD)
                    , Enter.theValue(this.users.get(0).getConfirmPassword()).into(RegisterUserAccount.INPUT_CONFIRMPASSWORD)
                    , Enter.theValue(this.users.get(0).getFirstName()).into(RegisterUserAccount.INPUT_FIRSTNAME)
                    , Enter.theValue(this.users.get(0).getLastName()).into(RegisterUserAccount.INPUT_LASTNAME)
                    , Enter.theValue(this.users.get(0).getPhoneNumber()).into(RegisterUserAccount.INPUT_PHONE)
                    , SelectFromOptions.byVisibleText(this.users.get(0).getCountry()).from(RegisterUserAccount.INPUT_COUNTRY)
                    , Enter.theValue(this.users.get(0).getCity()).into(RegisterUserAccount.INPUT_CITY)
                    , Enter.theValue(this.users.get(0).getAddress()).into(RegisterUserAccount.INPUT_ADDRESS)
                    , Enter.theValue(this.users.get(0).getRegion()).into(RegisterUserAccount.INPUT_STATE)
                    , Enter.theValue(this.users.get(0).getPostalCode()).into(RegisterUserAccount.INPUT_CODEPOSTAL)
                    , Click.on(RegisterUserAccount.CHECK_AGREE));

        actor.attemptsTo(WaitUntil.the(RegisterUserAccount.BTN_REGISTER,
                WebElementStateMatchers.isEnabled())
                .forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(RegisterUserAccount.BTN_REGISTER));

        actor.attemptsTo(WaitUntil.the(RegisterUserAccount.BTN_REGISTER,
                WebElementStateMatchers.isNotEnabled())
                .forNoMoreThan(100).seconds());
    }

    public static UserInformation setUserInformation(List<User> users){
        return Tasks.instrumented(UserInformation.class, users);
    }
}
