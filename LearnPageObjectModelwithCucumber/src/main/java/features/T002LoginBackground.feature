Feature: Login functionality fo LeafTab Applicaiton

Background:
Given Open the chrome browser
And Load the url

@Smoke
Scenario: Login for positive credentials- "Backgroud" verification
And Enter the username as Demosalesmanager
And Enter the possword as crmsfa
When Click on Login button
Then HomePage should be displayed

@Regression
Scenario: Login for invalid credentials - "Backgroud" verification
And Enter the username as Demosalesmanager
And Enter the possword as crmsf
When Click on Login button
Then HomePage should be displayed
But ErrorMessage should be displayed