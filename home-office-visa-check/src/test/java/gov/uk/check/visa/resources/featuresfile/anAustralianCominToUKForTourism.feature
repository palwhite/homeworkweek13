Feature: an Australian Coming To UK For Tourism

  Background:
    Given I am on homepage
    Then I accept cookies
    Then I click on start button

  Scenario: Australian should be able to get info about visa status
    Then I Select a Nationality "Australia"
    Then I Click on continue
    Then I click on reason to visit
    Then I Click on continue again
    Then I see the message "You will not need a visa to come to the UK"


