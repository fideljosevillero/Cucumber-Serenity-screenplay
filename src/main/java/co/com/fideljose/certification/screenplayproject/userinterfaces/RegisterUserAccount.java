package co.com.fideljose.certification.screenplayproject.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUserAccount {
    public static final Target INPUT_USERNAME = Target.the("User Name").located(By.name("usernameRegisterPage"));
    public static final Target INPUT_EMAIL = Target.the("Email").located(By.name("emailRegisterPage"));
    public static final Target INPUT_PASSWORD = Target.the("Password").located(By.name("passwordRegisterPage"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("Confirm Password").located(By.name("confirm_passwordRegisterPage"));
    public static final Target INPUT_FIRSTNAME = Target.the("First name").located(By.name("first_nameRegisterPage"));
    public static final Target INPUT_LASTNAME = Target.the("Last name").located(By.name("last_nameRegisterPage"));
    public static final Target INPUT_PHONE = Target.the("Phone").located(By.name("phone_numberRegisterPage"));
    public static final Target INPUT_COUNTRY = Target.the("Country").located(By.name("countryListboxRegisterPage"));
    public static final Target INPUT_CITY = Target.the("City").located(By.name("cityRegisterPage"));
    public static final Target INPUT_ADDRESS = Target.the("Address").located(By.name("addressRegisterPage"));
    public static final Target INPUT_STATE = Target.the("State").located(By.name("state_/_province_/_regionRegisterPage"));
    public static final Target INPUT_CODEPOSTAL = Target.the("Cod. Postal").located(By.name("postal_codeRegisterPage"));
    public static final Target CHECK_AGREE = Target.the("Agree Politics").located(By.name("i_agree"));
    public static final Target CHECK_ALLOWOFFERSPROMOTION = Target.the("Agree Politics").located(By.name("allowOffersPromotion"));
    public static final Target BTN_REGISTER = Target.the("Button Register").located(By.id("register_btnundefined"));
}