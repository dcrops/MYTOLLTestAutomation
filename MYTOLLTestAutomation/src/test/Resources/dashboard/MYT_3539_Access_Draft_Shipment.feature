Feature: MYT_3539 Access 'Draft' Shipment from My Dashboard

  Background: 
    Given User is Registered in MyToll and is on My Dashboard

  @tag1
  Scenario: User accesses 'Draft Shipment' from My Dashboard - TDF
  When User is on the Create Shipment Page
    And User Completes Module 1 in the Create Shipment Page
      |TollCarrier   |Service |Who Pays |AccountNumber |
      |Toll Tasmania |General |Sender   |100428 |
    And User Enters Line Items for Shipment in Module 2
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
    And User has the option to Save the Shipment as a Draft
    And User selects a shipment to save as a draft
    |Toll Carrier|
    |Toll Tasmania|
    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
    Then user navigated to My Draft Shipments tab and verifies if the shipment exists
    |Toll ShipmentNo | Toll Carrier  | Service| Receiver| DispatchDate|
    |10xxxxx         | Toll Tasmania | General| Receiver| DispatchDate|
    When User Selects option to 'Complete Shipment'
    Then User can see all data in the draft shipment transferred to the 'Create Shipment' page
    And User Naviagets back to My Draft Shipment Tab in My Dashboard
    Then User Selects a Draft Shipment and Click 'Delete'
    And UI prompt is availble with with 'Confirm' and 'Cancel' Options
    Then User clicks 'Cancel' Option
    And Draft shipment still exis on 'Draft Shipment' List
    Then User Selects a Draft Shipment and Click 'Delete'
    And UI prompt is availble with with 'Confirm' and 'Cancel' Options
    And User clicks 'Confirm' Option
    Then Draft shipment is deleted from the 'Draft Shipment' List
    
  
  @tag2
  Scenario: User accesses 'Draft Shipment' from My Dashboard - TGX
  When User is on the Create Shipment Page
    And User Completes Module 1 in the Create Shipment Page
      |TollCarrier              |Service                           |Who Pays |AccountNumber |
      |Toll Priority (Aus)      |Auswide 3kg Satchel - Overnight   |Sender   |401509 |
     And User Enters Line Items for Shipment in Module 2
      | ItemTemplateName     |
      | Automation Template1 |
    And User has the option to Save the Shipment as a Draft
    And User selects a shipment to save as a draft
    |Toll Carrier|
    |Toll Priority (Aus) |
    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
    Then user navigated to My Draft Shipments tab and verifies if the shipment exists
    |Toll ShipmentNo | Toll Carrier         | Service                        | Receiver| DispatchDate|
    |10xxxxx         | Toll Priority (Aus)  | Auswide 3kg Satchel - Overnight| Receiver| DispatchDate|
    When User Selects option to 'Complete Shipment'
    Then User can see all data in the draft shipment transferred to the 'Create Shipment' page
    And User Naviagets back to My Draft Shipment Tab in My Dashboard
    Then User Selects a Draft Shipment and Click 'Delete'
    And UI prompt is availble with with 'Confirm' and 'Cancel' Options
    Then User clicks 'Cancel' Option
    And Draft shipment still exis on 'Draft Shipment' List
    Then User Selects a Draft Shipment and Click 'Delete'
    And UI prompt is availble with with 'Confirm' and 'Cancel' Options
    And User clicks 'Confirm' Option
    Then Draft shipment is deleted from the 'Draft Shipment' List
    
    
    
    #Recheck AC023