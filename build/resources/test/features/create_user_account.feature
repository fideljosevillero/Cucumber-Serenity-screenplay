# ctl + alt + l
Feature: Create new user account

  Background: Loggin
    Given user insite
    When user is logged

  @Fail
  Scenario: create successfully user account
    Given user is into website
    When user insert your information
      | username | email                 | password  | confirmPassword | firstName | lastName | phoneNumber | country  | city   | address | region    | postalCode |
      | fidel    | fideljose17@gmail.com | Fi1234567 | Fi1234567       | Fidel     | Villero  | 3000000000  | Colombia | Itaguí | Home    | Antioquia | 055413     |
    And user insert to location
    Then the user to see your profile

    @FailAccount
  Scenario Outline: Create fail account
    Given user is into website
    When user insert your information
      | username   | email   | password   | confirmPassword   | firstName   | lastName   | phoneNumber   | country   | city   | address   | region   | postalCode   |
      | <username> | <email> | <password> | <confirmPassword> | <firstName> | <lastName> | <phoneNumber> | <country> | <city> | <address> | <region> | <postalCode> |
    Then the user to see your profile <Message>
    Examples:
      | username | email                 | password  | confirmPassword | firstName | lastName | phoneNumber | country  | city   | address | region    | postalCode | Message                 |
      | fidel    | fideljose17@gmail.com | Fi1234567 | Fi1234567       | Fidel     | Villero  | 3000000000  | Colombia | Itaguí | Home    | Antioquia | 055413     | User name already exist |
      | fidel    | fideljose17@gmail.com | Fi1234567 | Fi1234567       | Fidel     | Villero  | 3000000000  | Colombia | Itaguí | Home    | Antioquia | 055413     | user created            |

