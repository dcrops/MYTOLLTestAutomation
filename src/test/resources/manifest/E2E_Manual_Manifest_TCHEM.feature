Feature: E2E Manual Manifest TCHEM - Manual Manifest -> Shipment 

  Background: 
    Given User is Registered in MyToll and is on My Dashboard

	@tag1
    Scenario: User Creates a Manual Manifest from Dashboard and Shipment - TCHEM 
    When User Click My Manifest tab on My Dahsboad and Click Add Manifest Manually
    And User Creates Manual Manifest
    |Toll carrier               |Sender                |	ManifestName        |
    |Toll Chemical Logistics      |TMS Port Adelaide     |	RandomNameOnRunTime | 
    Then User Verify Manifest and Proceed to Shipment
	|Toll carrier               |	ManifestName        |
    |Toll Chemical Logistics    |	RandomNameOnRunTime | 
    And User Selects Service
	| Service |
    | Delivery|
    Then User enters shipment overview details as below - Manual Manifest
      | AccountNumber | Whopays| Mode | Receiver |
      |       444444  |       1| 1    | TMS Roxby Downs |
    And User Retrives Sender and Reciver Locations and Detials
    When User enters following input data for the line item - TCHEM
      | Item description     | Billing Type      | No of Items | Length | Width | Height |  Weight      |
      | Automation Template1 | BOX               |          10 |    100 |   100 |    100 |          900 |
    And User selects Dangerous Goods
      | DgGoods |
      |       2 |
     Then User Clicks Review and Create Shipment
     Then User Clicks Continue Manifest on Shipment Review Page
     And User Submits and Prints Manifest
     Then User Navigates Back to Dashboard
#     
#	// PICK UP Function Not availble yet
#
