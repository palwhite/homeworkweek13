Feature: homepage Test

  Background:
    Given I am on homepage
    Then I accept Cookies

  Scenario: user should be able to Enter data
    And I enter keywords "Web Application"
    And I enter location "Wembley"
    And I enter distance "7 miles"
    Then I click on More Search Option
    And I enter minimum salary "8800"
    And I enter maximum salary "1000"
    And I enter salary type "Per week"
    And I enter job type "Contract"
    And I click on fine job button
    Then I go on next page get result "Contract Web Application jobs in Wembley"

  Scenario Outline: verify multiple job search
    And I enter keywords "<keywords>"
    And I enter location "<location>"
    And I enter distance "<distance>"
    Then I click on More Search Option
    And I enter minimum salary "<minimum salary>"
    And I enter maximum salary "<maximum salary>"
    And I enter salary type "<salary type>"
    And I enter job type "<job type>"
    And I click on fine job button
    Then I go on next page get result "<result>"

    Examples:
      | keywords               | location                    | distance  | minimum salary | maximum salary | salary type | job type       | result                                         |  |
      | Tester                 | Harrow                      | 5 miles   | 30000          | 500000         | Per annum   | Permanent      | Permanent Tester jobs in Harrow                |  |
      | web designer developer | London Colney Hertfordshire | 10 miles  | 35000          | 500000         | Per month   | Permanent      | Permanent Web Designer Developer jobs          |  |
      | Application Developer  | Wembley                     | 7 miles   | 8800           | 1000           | Per week    | Contract       | Contract Application Developer jobs in Wembley |  |
      | Tester                 | Kingsbury                   | 100 miles | 30000          | 500000         | Per annum   | Part Time      | Part Time Tester jobs in Kingsbury             |  |
      | Tester                 | Hatfield                    | 750 miles | 250            | 300            | Per day     | Temporary      | Temporary Tester jobs in Hatfield              |  |
      | Dev ops                | Watford                     | 5 miles   | 60000          | 800000         | Per annum   | Apprenticeship | Apprenticeship Devops jobs in Watford          |  |
      | Data Analyst           | Leicester                   | 7 miles   | 15             | 20             | Per hour    | Part Time      | Part Time Data Analyst jobs in Leicester       |  |

  