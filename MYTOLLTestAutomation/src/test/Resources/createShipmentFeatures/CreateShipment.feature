Feature: MYT_6138 Save a shipment as a 'Draft'

  Background: 
   Given User is Registered in MyToll and is on MyDashboard

  @tag1
  Scenario: User wants to Save a Shipment as a 'Draft'in TDF
   When User navigates to Shipment from MyDashboard
    When User selects 'Dispatch date' in to create a shipment
    Then User MUST have an option to save the Shipment as a Draft
    |ButtonName|
    |SAVE DRAFT|