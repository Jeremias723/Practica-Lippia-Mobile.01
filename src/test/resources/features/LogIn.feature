Feature: As a potential client i want to login in clockify application

  @Regression @LogIn
  Scenario Outline: The user login into the application
    Given the user is in the login page
    When the user complete with <email> and <password>
    And the user click in the 'Login' button
    Then the user is redirected to the home page
  Examples:
    | email                  | password  |
    | practicacrow@gmail.com | 123456789 |