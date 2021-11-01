Feature: As a potential client i want to interact with the clockify application

  @Clockify @LogIn
  Scenario Outline: The user log in in the application
    Given that the application loads correctly
    When the user enter his <email> and <password>
    And do click on 'Log in' button
    Then the user is redirected to the home page

    Examples:

      | email                  | password  |
      | practicacrow@gmail.com | 123456789 |


  @Clockify @AddTimeEntry
  Scenario Outline: Add a new time entry on a project
    Given the user is already login in the app with his <email> and <password>
    And the user enter to the time tracker section
    When the user do click on add time entry
    And select a day <day>
    And select a start hour <start>
    And select a end hour <end>
    When the user save the changes
    And insert a description : <description> for the time entry
    And select the project
    And select a tag for the time entry
    When the user save the time entry
    Then the user will be able to see their time entry with their project name: <project>


    Examples:
      | email                  | password  | day              | start | end | description        | project        |
      | practicacrow@gmail.com | 123456789 | 10 November 2021 | 14    | 20  | Working on Crowdar | ClockyPractice |

  @Clockify @EnableDarkMode
  Scenario Outline: Enable dark mode in the app
    Given the user is already login in the app with his <email> and <password>
    When the user enters the configuration section
    Then the user activates the dark mode of the application


    Examples:
      | email                  | password  |
      | practicacrow@gmail.com | 123456789 |