Feature: Edit/Update Lead Verification

Scenario Outline: Run Edit Lead
Given click find Leads From LeftMenu
And click On PhoneTab
And enter PhoneNumber as <phonenumber>
And click FindLeads Button
And click on First Lead Link
And click on Edit Button 
And update CompanyName as <updateCompanyName>
And Click on the update button
Then verify Leads update

Examples:
|updateCompanyName|phonenumber|
|RaghavHari|99|