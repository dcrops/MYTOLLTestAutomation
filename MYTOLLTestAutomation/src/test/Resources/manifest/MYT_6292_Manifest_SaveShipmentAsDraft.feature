Feature: MYT-6292 Manifest : Save Shipment as a Draft from open Manifests

  Background: 
    Given User is logged in and on My Dashboard

    @tag1
    Scenario: User Saves Shipment In Progress from the Manifest Tab as a Draft - TDF
    When User Click My Manifest tab on My Dahsboad
    And User has the option to Save the Shipment as a Draft
    And User selects a shipment to save as a draft
    |Toll Carrier|
    |Toll Tasmania|
    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
    Then user navigated to My Draft Shipments tab and verifies if the shipment exists
    |ShipmentNo|
    |100XXXXXXX|
    
    @tag2
    Scenario: User Saves Shipment In Progress from the Manifest Tab as a Draft - TGX
    When User Click My Manifest tab on My Dahsboad
    And User has the option to Save the Shipment as a Draft
    And User selects a shipment to save as a draft
    |Toll Carrier|
    |Toll IPEC|
    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
    Then user navigated to My Draft Shipments tab and verifies if the shipment exists
    |ShipmentNo|
    |100XXXXXXX|
    
    
    

    