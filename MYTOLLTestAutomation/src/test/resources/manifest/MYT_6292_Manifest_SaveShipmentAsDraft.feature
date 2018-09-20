Feature: MYT-6292 Manifest : Save Shipment as a Draft from open Manifests

  Background: 
    Given User is Registered in MyToll and is on My Dashboard

	@tag1 @Fail
    Scenario: User Saves Shipment In Progress from the Manifest Tab as a Draft - TDF
    When User Click My Manifest tab on My Dahsboad and Click Add Manifest Manually
    And User Creates Manual Manifest
    |Toll carrier               |Sender                |	ManifestName        |
    |Intermodal & Specialised   |TEM Perth Address     |	RandomNameOnRunTime | 
    Then User Verify Manifest and Proceed to Shipment
	|Toll carrier               |	ManifestName        |
    |Intermodal & Specialised   |	RandomNameOnRunTime | 
    And User Selects Service
	| Service |
    | General |
    Then User enters shipment overview details as below - Manual Manifest
      | AccountNumber | Whopays| Mode | Receiver |
      |        614060 |       1| 1    | TEM Brisbane Address |
    When User enters following input data for the line item
      | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height |  Weight      | SenderReference | ReceiverReference |
      | Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |          900 | Ref123          | Ref456            |
    And User selects Dangerous Goods
      | DgGoods |
      |       2 |
    Then User Clicks Save Draft on Shipment Page
    Then User Navigates to Draft Shipment Page and Verifies Page Items
     |Toll carrier   |Sender |	Receiver | Dispatch date | 
     |Toll carrier   |Sender |	Receiver | Dispatch date | 
    And User Click Complete Shipment and is Navagiated Back to Create Shipment page
     |Toll carrier               |Sender            | Receiver             |
     | Intermodal & Specialised  |TEM Perth Address | TEM Brisbane Address |
    Then User Verifies if Shipment Details are correct in the Shipment Page
     | TollCarrier               | Service | AccountNumber | Whopays| Mode | Sender            | Receiver             | Item description     | Billing Type    | No of Items | Length | Width | Height |  Weight      |
     | Intermodal & Specialised  | General |        614060 |       1| 1    | TEM Perth Address | TEM Brisbane Address | Automation Template1 | General Freight |          10 |    100 |   100 |    100 |          900 |
	And User Navigates back to Dashboard and Draft Shipment Tab
	Then User Deletes Draft Shipment
	 |Toll carrier               |Sender            | Receiver             |
     | Intermodal & Specialised  |TEM Perth Address | TEM Brisbane Address |
	Then User Cancels Delete Draft Search
	Then User Deletes Draft Shipment
	 |Toll carrier               |Sender            | Receiver             |
     | Intermodal & Specialised  |TEM Perth Address | TEM Brisbane Address |
	Then User Confirms Delete Draft Search
	
	
	@tag2 @Fail
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