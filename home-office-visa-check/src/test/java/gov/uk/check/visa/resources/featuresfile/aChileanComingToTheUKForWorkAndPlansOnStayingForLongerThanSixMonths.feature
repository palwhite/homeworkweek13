Feature: A Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months

  Background:
    Given I am on homepage
    Then I accept cookies
    Then I click on start button

  Scenario Outline: A Chilean should get moe information about visa
    And I Select a Nationality "<nationality>"
    And I Click on continue
    And I click on reason to visit Work, academic visit or business
    And I Click on continue again
    And I select time duration for visa
    And I Click on continue one more time
    And I select planning to work as health professional
    And I Click on continue last time
    And I verify result "You need a visa to work in health and care"

    Examples:
      | nationality |
      | Chile       |