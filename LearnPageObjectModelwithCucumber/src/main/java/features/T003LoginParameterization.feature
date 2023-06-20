Feature: Login functionality fo LeafTab Applicaiton

Scenario: Login for positive credentials - Parameterization -verification
And Enter the username as 'Demosalesmanager'
And Enter the possword as 'crmsfa'
When Click on Login button
Then HomePage should be displayed

Scenario: Login for invalid credentials  - Parameterization -verification
And Enter the username as 'Demosalesmanager'
And Enter the possword as 'crmsf'
When Click on Login button
Then HomePage should be displayed
But ErrorMessage should be displayed