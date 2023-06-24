Feature: Duplicate Lead Verification

Scenario Outline: Run Duplicate Lead
Given click find Leads From LeftMenu
And click EmailTab
And enter Email <enteEmail>
And click FindLeads Button
And click on First Lead Link
And click on DuplicateLeade Button
And click On CreateLead Button
Then verify Leads creation

Examples:
|enteEmail|
|a|