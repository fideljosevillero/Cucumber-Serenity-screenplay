package co.com.fideljose.certification.screenplayproject.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccount {
    public static final Target INPUTUSERNAME = Target.the("User Name").located(By.name("usernameRegisterPage"));
    public static final Target INPUTEMAIL = Target.the("Email").located(By.name("emailRegisterPage"));
    public static final Target INPUTPASSWORD = Target.the("Password").located(By.name("passwordRegisterPage"));
    public static final Target INPUTCONFIRMPASSWORD = Target.the("Confirm Password").located(By.name("confirm_passwordRegisterPage"));
    public static final Target INPUTFIRSTNAME = Target.the("First name").located(By.name("first_nameRegisterPage"));
    public static final Target INPUTLASTNAME = Target.the("Last name").located(By.name("last_nameRegisterPage"));
    public static final Target INPUTPHONE = Target.the("Phone").located(By.name("phone_numberRegisterPage"));
    public static final Target INPUTCOUNTRY = Target.the("Country").located(By.name("countryListboxRegisterPage"));
    public static final Target INPUTCITY = Target.the("City").located(By.name("cityRegisterPage"));
    public static final Target INPUTADDRESS = Target.the("Address").located(By.name("addressRegisterPage"));
    public static final Target INPUTSTATE = Target.the("State").located(By.name("state_/_province_/_regionRegisterPage"));
    public static final Target INPUTCODEPOSTAL = Target.the("Cod. Postal").located(By.name("postal_codeRegisterPage"));
}
