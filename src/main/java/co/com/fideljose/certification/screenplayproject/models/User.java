package co.com.fideljose.certification.screenplayproject.models;

import lombok.Data;

@Data
public class User {
    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String country;
    private String city;
    private String address;
    private String region;
    private String postalCode;
}
