Feature: Booking appointment.

@valid
Scenario Outline: Appointment booking with vaild credentials.
Given User is on homepage.
When User click on make appointment.
And Login with <username> and <password>.
Then User Filled information<facilty>and<HealthProgram>and<Date>.
And got Booking confiramation message.

Examples:
|username||password          ||facilty                     ||HealthProgram||Date|
|John Doe||ThisIsNotAPassword||Seoul CURA Healthcare Center||None|         |10|

@Invalid
Scenario Outline: Signin with invaild credentials
Given User is on homepage.
When User click on make appointment.
And Login with  <username> and <password>.
Then User will get Error message.
Examples:
|username||password|
|sushant ||password|





