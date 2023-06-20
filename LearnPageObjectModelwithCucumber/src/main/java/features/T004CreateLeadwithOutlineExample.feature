Feature: Create leads with multiple Data


@Smoke @Regression
Scenario Outline: Create Lead
Given Enter the username as 'Demosalesmanager'
And Enter the possword as 'crmsfa'
When Click on Login button
Then HomePage should be displayed
When Click on the Leads Link
Given Enter the complayName as <complaryName>
And Enter the firstname as <firstName>
And Enter the lastname as <lastName>
When Click on Submit button
Then ViewLeadsPage should be displayed

Examples:
|complaryName |firstName|lastName|
|RaghavHari |latcham1|Appasamy1|
|RaghavHari |latcham2|Appasamy2|
