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

    private String name;
    private String email;
    private String password;
    private String confirmPassword;

    public UserInformation(List<User> users){
        this.name            = users.get(0).getFirstName();
        this.email           = users.get(0).getEmail();
        this.password        = users.get(0).getPassword();
        this.confirmPassword = users.get(0).getConfirmPassword();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.name).into(RegisterUserAccount.INPUT_USERNAME));
        actor.attemptsTo(Enter.theValue(this.email).into(RegisterUserAccount.INPUT_EMAIL));
        actor.attemptsTo(Enter.theValue(this.password).into(RegisterUserAccount.INPUT_PASSWORD));
        actor.attemptsTo(Enter.theValue(this.confirmPassword).into(RegisterUserAccount.INPUT_CONFIRMPASSWORD));
    }

    public static UserInformation setUserInformation(List<User> users){
        return Tasks.instrumented(UserInformation.class, users);
    }
}
