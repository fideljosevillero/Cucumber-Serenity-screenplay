# ctl + alt + l
Feature: Create new user account

  Scenario: create successfully user account
    Given user is into website
    When user insert your information <name>
    And user insert to location
      | user | password | email |
    Then the user to see your profile
      | name  | lastname | email |
      | fidel | villero  | apto  |
