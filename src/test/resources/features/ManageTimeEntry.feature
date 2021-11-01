Feature: As a user i want to manipulate the time entry screen

@Regression @AddTimeEntry
Scenario Outline: The user add a new time entry on a project
  Given the user is already login in the app with his <email> and <password>
  And the user enter to the time tracker section
  When the user click on add time entry
  And select a 'day' with the value <day>
  And select a 'start hour' with the value <start>
  And select a 'end hour' with the value <end>
  When the user save the changes
  And insert a description: <description> for the time entry
  And select the project
  And select a tag for the time entry
  When the user save the time entry
  Then the app shows the project name created: <project>
Examples:
| email                  | password  | day              | start | end | description        | project        |
| practicacrow@gmail.com | 123456789 | 10 November 2021 | 14    | 20  | Working on Crowdar | ClockyPractice |