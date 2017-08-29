Feature: LoginFeature
  This login feature deals with the login functionality of the application.

  Scenario Outline: Login using scenario outline
    Given I navigate to the login page
    And I enter <userName> and <password>
    And I click login button
    Then I should see the userform page

    Examples:
      | userName | password |
      | roma3    | 123456   |
      | roma4    | 123456   |
      | roma5    | 123456   |

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for login
      | userName | password |
      | roma1    | 12345    |
      | roma2    | 12345    |
    And I click login button
    Then I should see the userform page
