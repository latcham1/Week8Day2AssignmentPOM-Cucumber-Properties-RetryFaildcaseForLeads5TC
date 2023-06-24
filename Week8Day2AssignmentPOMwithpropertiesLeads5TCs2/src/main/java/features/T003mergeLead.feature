Feature: Merge Lead Verification

Scenario Outline: Run Merge Lead
Given Click mergeLeads From LeftMenu
And click FirstLead Lookup Image
And enter FName To Select FirstLead <enterFNameToSelectFirstLead>
And click FindLeads Button
And select firstLead From Result
And switch to Merge Window
And click SecondLead Lookup Image
And enter FName To Select SecondLead<enterFNameToSelectSecondLead>
And click FindLeads Button
And select firstLead From Result
And switch to Merge Window
And click On Merge Button
And accept Alert
Then verify Merge Lead

Examples:
|enterFNameToSelectFirstLead|enterFNameToSelectSecondLead|
|a|b|