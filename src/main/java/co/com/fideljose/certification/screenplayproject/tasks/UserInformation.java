package co.com.fideljose.certification.screenplayproject.tasks;

import co.com.fideljose.certification.screenplayproject.models.User;
import co.com.fideljose.certification.screenplayproject.userinterfaces.RegisterUserAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class UserInformation implements Task {

    private List<User> users;

    public UserInformation(List<User> users){
        this.users = users;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.users.get(0).getUsername()).into(RegisterUserAccount.INPUT_USERNAME));
        actor.attemptsTo(Enter.theValue(this.users.get(0).getEmail()).into(RegisterUserAccount.INPUT_EMAIL));
        actor.attemptsTo(Enter.theValue(this.users.get(0).getPassword()).into(RegisterUserAccount.INPUT_PASSWORD));
        actor.attemptsTo(Enter.theValue(this.users.get(0).getConfirmPassword()).into(RegisterUserAccount.INPUT_CONFIRMPASSWORD));
        actor.attemptsTo(Enter.theValue(this.users.get(0).getFirstName()).into(RegisterUserAccount.INPUT_FIRSTNAME));
        actor.attemptsTo(Enter.theValue(this.users.get(0).getLastName()).into(RegisterUserAccount.INPUT_LASTNAME));
        actor.attemptsTo(Enter.theValue(this.users.get(0).getPhoneNumber()).into(RegisterUserAccount.INPUT_PHONE));

//        actor.attemptsTo(Enter.theValue(this.users.get(0).getCountry()).into(RegisterUserAccount.INPUT_COUNTRY));
        actor.attemptsTo(Enter.theValue(this.users.get(0).getCity()).into(RegisterUserAccount.INPUT_CITY));
        actor.attemptsTo(Enter.theValue(this.users.get(0).getAddress()).into(RegisterUserAccount.INPUT_ADDRESS));
        actor.attemptsTo(Enter.theValue(this.users.get(0).getRegion()).into(RegisterUserAccount.INPUT_STATE));
        actor.attemptsTo(Enter.theValue(this.users.get(0).getPostalCode()).into(RegisterUserAccount.INPUT_CODEPOSTAL));
    }

    public static UserInformation setUserInformation(List<User> users){
        return Tasks.instrumented(UserInformation.class, users);
    }
}
