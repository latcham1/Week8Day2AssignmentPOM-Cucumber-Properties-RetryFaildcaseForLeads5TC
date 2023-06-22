Feature: Salese Force Individual functionality validation

Scenario: New Individual Creation
And clickAppLauncher
And SelectViewAll
And Scroll to Party Consent
And select individual link
And select New Individual from Recently Viewed DropdownMenu
And type LastName
And click SaveButton
Then verify New Individual Creation