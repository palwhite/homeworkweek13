Feature: Register

  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I enters following users details
      | name   | surname | email            | password | cpassword |
      | nirali | patel   | nirali@gmail.com | 123456   | 123456    |
      | deep   | patel   | deep@gmail.com   | 123456   | 123456    |
      | th     | patel   | th@gmail.com     | 123456   | 123456    |
