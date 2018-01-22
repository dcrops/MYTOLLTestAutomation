Feature: MYT-6292 Manifest : Save Shipment as a Draft from open Manifests

  Background: 
    Given User is logged in and on My Dashboard

    @tag1
    Scenario: User Saves Shipment In Progress from the Manifest Tab as a Draft - TDF
    When User Click My Manifest tab on My Dahsboad
    And User Selects a TDF Shipment
    And User has the option to Save the Shipment as a Draft
    And User selects a shipment to save as a draft
    |Toll Carrier|
    |Toll Tasmania|
    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
    Then user navigated to My Draft Shipments tab and verifies if the shipment exists
    |ShipmentNo|
    |100XXXXXXX|
    When User selects a Draft Shipment
    Then User can see all data in the draft shipment transferred to the 'Create Shipment' page
    
    @tag2
    Scenario: User Saves Shipment In Progress from the Manifest Tab as a Draft - TGX
    When User Click My Manifest tab on My Dahsboad
    And User Selects a TGX Shipment
    And User has the option to Save the Shipment as a Draft
    And User selects a shipment to save as a draft
    |Toll Carrier|
    |Toll IPEC|
    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
    Then user navigated to My Draft Shipments tab and verifies if the shipment exists
    |ShipmentNo|
    |100XXXXXXX|
    When User selects a Draft Shipment
    Then User can see all data in the draft shipment transferred to the 'Create Shipment' page
    
    
    @tag3
    Scenario: User is able to Save Shipment as a Draft throught the Create Shipment Page - TDF
    When User is on the Create Shipment Page
    And User Completes Module 1 in the Create Shipment Page
      |TollCarrier   |Service |Who Pays |AccountNumber |
      |Toll Tasmania |General |Sender   |100428 |
    And User Enters Line Items for Shipment in Module 2
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
    And User Clicks Save Draft Option
    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
    And UI prompt is availble with Go Back to 'Create Shipment' page and Clicks it
    Then User gets navigated back to 'Create Shipment' Page
    
    
    @tag4
    Scenario: User is able to Save Shipment as a Draft throught the Create Shipment Page - TGX
    When User is on the Create Shipment Page
    And User Completes Module 1 in the Create Shipment Page
      |TollCarrier            |Service                         |Who Pays |AccountNumber |
      |Toll Priority (Aus)    |Auswide 3kg Satchel - Overnight |Sender   |401509 |
     And User Enters Line Items for Shipment in Module 2
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
    And User Clicks Save Draft Option
    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
    And UI prompt is availble with Go Back to 'My Dashboard' and Clicks it
    Then User gets navigated back to 'My Dashboard' 
    Then User can see pre-filled data available in 'Draft Shipments'
    Then Draft Shipment MUST be saved under 'Draft Shipments' tab in 'My Dashboard'
    When User selects a Draft Shipment
    Then User can see all data in the draft shipment transferred to the 'Create Shipment' page
    
    @tag5
    Scenario: "Recheck User Story when application is available"
    When Check
    