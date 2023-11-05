Feature: Login page

  Scenario Outline: Check Login successful with login credentials
    Given i am on login page
    When user enters <username> and <password>
    And click on login button
    Then user redirects to Home page

    Examples: 
      | username | password |
      | Namrata  | pass1    |
      | Amruta   | pass5    |
      | Sanket   | pass123  |
