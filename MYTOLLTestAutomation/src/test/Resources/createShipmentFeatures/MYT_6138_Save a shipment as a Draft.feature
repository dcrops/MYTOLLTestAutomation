Feature: MYT_6138 Save a shipment as a 'Draft'

  Background: 
    Given User is Registered in MyToll and is on create shipment page

  @tag1
  Scenario: User wants to Save a Shipment as a 'Draft'in TDF
    When User selects 'Dispatch date' in to create a shipment
    Then User MUST have an option to save the Shipment as a Draft
    When User enters following fields
      | Toll Carrier                | Service | Account number |
      | Toll Intermodal Specialised | Express |           1234 |
    When User selects the Save Draft option
    Then User be able to see UI prompt displaying the Shipment has been Saved as a Draft
      | Msg      |
      | Eg1..... |
    Then User MUST have an option in the UI prompt to Go back to the 'Create Shipment' page
    Then User MUST have an option in the UI prompt to be re-directed to 'My Dashboard'
    Then User can see pre-filled data available in 'Draft Shipments'
    Then Draft Shipment MUST be saved under 'Draft Shipments' tab in 'My Dashboard'
    When User selects a Draft Shipment
    Then User can see all data in the draft shipment transferred to the 'Create Shipment' page
    When User changes either of the fields
      | Toll Carrier  | Service | Account number |
      | Toll Tasmania | Express |           1234 |
    Then User can see all other fields cleared
      | Toll Carrier  | Service | Account number |
      | Toll Tasmania | Null    | Null           |
    When User wants to Navigate to another page clicking on Menu
    Then User MUST have a prompt indicating that any Unsaved data entered will be Lost
      | Msg      |
      | Eg2..... |
    Then User can see "Confirm" and "Cancel" in the prompt
    When User clicks Cancel
    And User selects the Service as below to complete the shipment as below
      | Service    |
      | DG Freight |
    When User enter following input data to complete the shipment as below
      | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | SenderReference | ReceiverReference | PalletSpaces | ChargeToAccount |
      | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 | Ref123          | Ref456            |            6 | Sender          |
    And User can see Charge to Account default to Sender and ability to select Receiver and Third Party
    When User selects Contains food or food packaging as NO
    When User selects Dangerous Goods as Yes
    And User enters following dangerous goods details
      | UnNumber | ProperShippingName  | PackingGroup | DGPackageType | DGAggregateQty |
      |     1234 | Test Technical name |            3 |            20 |             10 |
    Then User able to see following fields are autopopulated.
      | Class/Div | SubRisk | PackingGroup |
      |         3 | NA      | II           |
    When User Clicks on 'Review & Create Shipment'
    Then User can see Draft Shipment is converted to a Shipment
    Then User be able to view the Draft is removed from My Draft Shipments in My Dashboard
    When User continue Shipment to Mainifest
    When User clicks on 'Add New Shipment' from an 'In Progress' Manifest
    Then User MUST have an option to SAVE the Shipment as a Draft Shipment


  @tag1
  Scenario: User wants to Save a Shipment as a 'Draft'in TGX
    When User selects 'Dispatch date' in to create a shipment
    Then User MUST have an option to save the Shipment as a Draft
    When User enters following fields
      | Toll Carrier        | Service                       | Account number |
      | Toll Priority (AUS) | ServiceGlobalExpressDocuments |           1234 |
    When User selects the Save Draft option
    Then User be able to see UI prompt displaying the Shipment has been Saved as a Draft
      | Msg      |
      | Eg1..... |
    Then User MUST have an option in the UI prompt to Go back to the 'Create Shipment' page
    Then User MUST have an option in the UI prompt to be re-directed to 'My Dashboard'
    Then User can see pre-filled data available in 'Draft Shipments'
    Then Draft Shipment MUST be saved under 'Draft Shipments' tab in 'My Dashboard'
    When User selects a Draft Shipment
    Then User can see all data in the draft shipment transferred to the 'Create Shipment' page
    When User changes either of the fields
      | Toll Carrier       | Service                       | Account number |
      | Toll Priority (NZ) | ServiceGlobalExpressDocuments |           1234 |
    Then User can see all other fields cleared
      | Toll Carrier       | Service | Account number |
      | Toll Priority (NZ) | Null    | Null           |
    When User wants to Navigate to another page clicking on Menu
    Then User MUST have a prompt indicating that any Unsaved data entered will be Lost
      | Msg      |
      | Eg2..... |
    Then User can see "Confirm" and "Cancel" in the prompt
    When User clicks Cancel
    And User selects the Service as below to complete the shipment as below
      | Service               |
      | ServiceParcelsOffPeak |
    When User enters following input data to complete the shipment as below
      | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | SenderReference | ReceiverReference | PalletSpaces | ChargeToAccount |
      | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 | Ref123          | Ref456            |            6 | Sender          |
    When User selects Contains food or food packaging as NO
    When User selects Dangerous Goods as No
    When User Clicks on 'Review & Create Shipment'
    Then User can see Draft Shipment is converted to a Shipment
    Then User be able to view the Draft is removed from My Draft Shipments in My Dashboard
    When User continue Shipment to Mainifest
    When User clicks on 'Add New Shipment' from an 'In Progress' Manifest
    Then User MUST have an option to SAVE the Shipment as a Draft Shipment
