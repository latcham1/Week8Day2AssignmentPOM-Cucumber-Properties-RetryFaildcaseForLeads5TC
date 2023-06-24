Feature: Create Lead Verification

Scenario Outline: Run Create Lead
Given click create Lead From LeftMenu
And enter companyname  as <companyName>
And enter First Name as <firstName>
And enter last Name as <lastName>
And click Submit Button
Then verify Leads creation

Examples:
|companyName|firstName|lastName|
|RaghavHari|latcham|appasamy|