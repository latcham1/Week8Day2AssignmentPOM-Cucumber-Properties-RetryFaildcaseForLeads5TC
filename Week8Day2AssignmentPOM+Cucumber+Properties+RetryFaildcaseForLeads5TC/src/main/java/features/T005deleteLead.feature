Feature: Delete Lead Verification

Scenario Outline: Run Delete Lead
Given click find Leads From LeftMenu
And click On PhoneTab
And enter PhoneNumber as <enterPhoneNumber>
And click FindLeads Button
And click on First Lead Link
And click on Delete Button

Examples:
|enterPhoneNumber|
|99|