# ctl + alt + l
Feature: Create new user account

  Scenario: create successfully user account
    Given user is into website
    When user insert your information
      | username | email                 | password | confirmPassword | firstName | lastName | phoneNumber | country  | city   | address | region    | postalCode |
      | fidel    | fideljose17@gmail.com | 1234567  | 1234567         | Fidel     | Villero  | 3000000000  | Colombia | Itaguí | Home    | Antioquia | 055413     |
    And user insert to location
    Then the user to see your profile