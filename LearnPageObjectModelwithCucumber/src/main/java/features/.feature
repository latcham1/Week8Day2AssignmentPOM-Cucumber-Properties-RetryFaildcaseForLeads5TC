Feature: Login functionality fo LeafTab Applicaiton

Scenario: Login for positive credentials
Given Open the chrome browser
And Load the url
And Enter the username as Demosalesmanager
And Enter the possword as crmsfa
When Click on Login button
Then HomePage should be displayed