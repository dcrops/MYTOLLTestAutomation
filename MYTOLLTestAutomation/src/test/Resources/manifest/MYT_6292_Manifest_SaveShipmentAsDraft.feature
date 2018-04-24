Feature: MYT-6292 Manifest : Save Shipment as a Draft from open Manifests

  Background: 
    Given User is Registered in MyToll and is on My Dashboard

#	@tag1
#    Scenario: User Saves Shipment In Progress from the Manifest Tab as a Draft - TDF
#    When User Click My Manifest tab on My Dahsboad and Click Add Manifest Manually
#    And User Creates Manual Manifest
#    |Toll carrier               |Sender                |	ManifestName        |
#    |Intermodal & Specialised   |TEM Perth Address     |	RandomNameOnRunTime | 
#    Then User Verify Manifest and Proceed to Shipment
#	|Toll carrier               |	ManifestName        |
#    |Intermodal & Specialised   |	RandomNameOnRunTime | 
#    And User Selects Service
#	| Service |
#    | General |
#    Then User enters shipment overview details as below - Manual Manifest
#      | AccountNumber | Whopays| Mode | Receiver |
#      |        614060 |       1| 1    | TEM Brisbane Address |
#    When User enters following input data for the line item
#      | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height |  Weight      | SenderReference | ReceiverReference |
#      | Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |          900 | Ref123          | Ref456            |
#    And User selects Dangerous Goods
#      | DgGoods |
#      |       2 |
#    Then User Clicks Save Draft on Shipment Page
#    Then User Navigates to Draft Shipment Page and Verifies Page Items
#     |Toll carrier   |Sender |	Receiver | Dispatch date | 
#     |Toll carrier   |Sender |	Receiver | Dispatch date | 
#    And User Click Complete Shipment and is Navagiated Back to Create Shipment page
#     |Toll carrier               |Sender            | Receiver             |
#     | Intermodal & Specialised  |TEM Perth Address | TEM Brisbane Address |
#    Then User Verifies if Shipment Details are correct in the Shipment Page
#     | TollCarrier               | Service | AccountNumber | Whopays| Mode | Sender            | Receiver             | Item description     | Billing Type    | No of Items | Length | Width | Height |  Weight      |
#     | Intermodal & Specialised  | General |        614060 |       1| 1    | TEM Perth Address | TEM Brisbane Address | Automation Template1 | General Freight |          10 |    100 |   100 |    100 |          900 |
#	And User Navigates back to Dashboard and Draft Shipment Tab
#	Then User Deletes Draft Shipment
#	 |Toll carrier               |Sender            | Receiver             |
#     | Intermodal & Specialised  |TEM Perth Address | TEM Brisbane Address |
#	Then User Cancels Delete Draft Search
#	Then User Deletes Draft Shipment
#	 |Toll carrier               |Sender            | Receiver             |
#     | Intermodal & Specialised  |TEM Perth Address | TEM Brisbane Address |
#	Then User Confirms Delete Draft Search
#	
	
	@tag2
    Scenario: User Saves Shipment In Progress from the Manifest Tab as a Draft - TGX
    When User Click My Manifest tab on My Dahsboad and Click Add Manifest Manually
    And User Creates Manual Manifest
    |Toll carrier               |Sender                |	ManifestName        |
    |Toll Priority (Aus)        |TEM Perth Address     |	RandomNameOnRunTime | 
    Then User Verify Manifest and Proceed to Shipment
	|Toll carrier               |	ManifestName        |
    |Toll Priority (Aus)        |	RandomNameOnRunTime | 
    And User Selects Service
	| Service |
    | Parcels - Overnight  |
    Then User enters shipment overview details as below Draft Shipment - Manual Manifest - Prio
      | AccountNumber | Whopays| Receiver |
      |        401509 |       1| TEM Brisbane Address |
    When User enters following input data for the line item for Draft Shipment - Prio
      | Item description     | No of Items | Length | Width | Height |  Weight    | SenderReference | ReceiverReference |
      | Automation Template1 |          10 |    10  |   10  |    10  |          90| Ref123          | Ref456            |
    And User selects Dangerous Goods
      | DgGoods |
      |       2 |
    Then User Clicks Save Draft on Shipment Page
    Then User Navigates to Draft Shipment Page and Verifies Page Items
     |Toll carrier   |Sender |	Receiver | Dispatch date | 
     |Toll carrier   |Sender |	Receiver | Dispatch date | 
    And User Click Complete Shipment and is Navagiated Back to Create Shipment page
     |Toll carrier               |Sender            | Receiver             |
     |Toll Priority (Aus)        |TEM Perth Address | TEM Brisbane Address |
    Then User Verifies if Shipment Details are correct in the Shipment Page - Prio
     | TollCarrier               | Service             | AccountNumber | Whopays| Sender            | Receiver             | Item description     | No of Items | Length | Width | Height |  Weight      |
     | Toll Priority (Aus)       | Parcels - Overnight |        401509 |      1 | TEM Perth Address | TEM Brisbane Address | Automation Template1 |          10 |    10  |   10  |    10  |          90  |
	And User Navigates back to Dashboard and Draft Shipment Tab
	Then User Deletes Draft Shipment
	 |Toll carrier               |Sender            | Receiver             |
     |Toll Priority (Aus)        |TEM Perth Address | TEM Brisbane Address |
	Then User Cancels Delete Draft Search
	Then User Deletes Draft Shipment
	 |Toll carrier               |Sender            | Receiver             |
     |Toll Priority (Aus)        |TEM Perth Address | TEM Brisbane Address |
	Then User Confirms Delete Draft Search


#    @tag1
#    Scenario: User Saves Shipment In Progress from the Manifest Tab as a Draft - TDF
#    When User Click My Manifest tab on My Dahsboad
#    And User Selects a TDF Shipment
#    And User has the option to Save the Shipment as a Draft
#    And User selects a shipment to save as a draft
#    |Toll Carrier|
#    |Toll Tasmania|
#    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
#    Then user navigated to My Draft Shipments tab and verifies if the shipment exists
#    |ShipmentNo|
#    |100XXXXXXX|
#    When User selects a Draft Shipment
#    Then User can see all data in the draft shipment transferred to the 'Create Shipment' page
#    
#    @tag2
#    Scenario: User Saves Shipment In Progress from the Manifest Tab as a Draft - TGX
#    When User Click My Manifest tab on My Dahsboad
#    And User Selects a TGX Shipment
#    And User has the option to Save the Shipment as a Draft
#    And User selects a shipment to save as a draft
#    |Toll Carrier|
#    |Toll IPEC|
#    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
#    Then user navigated to My Draft Shipments tab and verifies if the shipment exists
#    |ShipmentNo|
#    |100XXXXXXX|
#    When User selects a Draft Shipment
#    Then User can see all data in the draft shipment transferred to the 'Create Shipment' page
#    
#    
#    @tag3
#    Scenario: User is able to Save Shipment as a Draft throught the Create Shipment Page - TDF
#    When User is on the Create Shipment Page
#    And User Completes Module 1 in the Create Shipment Page
#      |TollCarrier   |Service |Who Pays |AccountNumber |
#      |Toll Tasmania |General |Sender   |100428 |
#    And User Enters Line Items for Shipment in Module 2
#      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
#      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
#    And User Clicks Save Draft Option
#    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
#    And UI prompt is availble with Go Back to 'Create Shipment' page and Clicks it
#    Then User gets navigated back to 'Create Shipment' Page
#    
#    
#    @tag4
#    Scenario: User is able to Save Shipment as a Draft throught the Create Shipment Page - TGX
#    When User is on the Create Shipment Page
#    And User Completes Module 1 in the Create Shipment Page
#      |TollCarrier            |Service                         |Who Pays |AccountNumber |
#      |Toll Priority (Aus)    |Auswide 3kg Satchel - Overnight |Sender   |401509 |
#     And User Enters Line Items for Shipment in Module 2
#      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
#      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
#    And User Clicks Save Draft Option
#    And There is a UI prompt displaying Toll Shipment Number and Shipment Saved Message
#    And UI prompt is availble with Go Back to 'My Dashboard' and Clicks it
#    Then User gets navigated back to 'My Dashboard' 
#    Then User can see pre-filled data available in 'Draft Shipments'
#    Then Draft Shipment MUST be saved under 'Draft Shipments' tab in 'My Dashboard'
#    When User selects a Draft Shipment
#    Then User can see all data in the draft shipment transferred to the 'Create Shipment' page
#    
#    @tag5
#    Scenario: "Recheck User Story when application is available"
#    When Check
#    