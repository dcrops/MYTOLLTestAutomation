
Feature: MYT_2734 Access and view the Finance Connote from the Track and Trace screen (IPEC)

Background: User in the Track and Trace screen in Mytoll, and I have have full financial access


Scenario: User wants to access and view the Finance Connote from the Track and Trace screen (IPEC)
When User selects Finance Connote from the Shipping Details screen
And User clicks on Shipment Documents
When User clicks on Finanace Documents
Then User must be able to view the imaged Finance Connote
When User allocates a name (POD)
Then User can see which document they can select to view
When User Allocate a name (Finance Connote)
Then User can see which document they can select to view