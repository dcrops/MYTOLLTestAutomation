Feature: E2E Manual Manifest TMS - Manual Manifest -> Shipment -> BAP

  Background: 
    Given User is Registered in MyToll and is on My Dashboard

	@tag1 @Shakeout
    Scenario: User Creates a Manual Manifest from Dashboard and Proceeds to BAP  - TMS
    When User Click My Manifest tab on My Dahsboad and Click Add Manifest Manually
    And User Creates Manual Manifest
    |Toll carrier               |Sender                |	ManifestName        |
    |Toll Mining Services       |TMS Port Adelaide     |	RandomNameOnRunTime | 
    Then User Verify Manifest and Proceed to Shipment
	|Toll carrier               |	ManifestName        |
    |Toll Mining Services       |	RandomNameOnRunTime | 
    And User Selects Service
	| Service |
    | General |
    Then User enters shipment overview details as below - Manual Manifest
      | AccountNumber | Whopays| Mode | Receiver |
      |       790135  |       1| 1    | TMS Roxby Downs |
    And User Retrives Sender and Reciver Locations and Detials
    When User enters following input data for the line item
      | Item description     | Billing Type      | No of Items | Item Type | Length | Width | Height |  Weight      | SenderReference | ReceiverReference |
      | Automation Template1 | General Freight   |          10 | Items     |    100 |   100 |    100 |          900 | Ref123          | Ref456            |
    And User selects Dangerous Goods
      | DgGoods |
      |       2 |
 	 And User enters additional information for shipment as below
 	 | PurchaseOrder | SpecialInstructions       |
  	 | Abcd1234      | Test Special Instructions |
     Then User Clicks Review and Create Shipment
     Then User Clicks Continue Manifest on Shipment Review Page
     And User Submits and Prints Manifest
     Then User Navigates Back to Dashboard
     And User Selects the Shipment for BAP
     |	ManifestName        |
     |	Retreived OnRunTime |
     Then User Verifies Shipment Details on BAP Page
     |Toll carrier                   |Sender                | 	AccountNumber| Service|
     |Intermodal & Specialised       |Retreived on Runtime  |	790135       | General|
     Then User Enters Phone Number
     And User Verifies Line Item on BAP Page
      | Item description     | No of Items | Length | Width | Height |  Weight      |
      | Automation Template1 |          10 |    100 |   100 |    100 |          900 |
     Then User Selects Dispatch Date and Ready Time
     |	ReadyTime       |
     |	10:00           |
     Then User Clicks Review and Book
     Then User Confirms Pick Up and Gets BAP Reference Number
     Then User Closes the Browser
     