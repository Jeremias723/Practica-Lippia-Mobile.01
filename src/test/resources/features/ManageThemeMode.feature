Feature: As a user i want to change the theme mode in the app

  @Regression @EnableDarkMode
  Scenario Outline: Enable dark mode in the app
    Given the user is already login in the app with his <email> and <password>
    When the user enters the configuration section
    And the user activates the dark mode of the application
    Then the dark mode is displayed
  Examples:
    | email                  | password  |
    | practicacrow@gmail.com | 123456789 |