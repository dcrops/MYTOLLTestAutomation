Feature: MYT_3539 Access 'Draft' Shipment from My Dashboard

 Background: 
    Given User is Registered in MyToll and is on Shipment Page - Draft Shipment

  @tag1 @Shakeout
  Scenario: User accesses 'Draft Shipment' from My Dashboard - TDF
    When User selects Toll Carrier and select Service
      | TollCarrier | Service |
      | Intermodal & Specialised  | General |
     Then User enters shipment overview details as below - Specific Sender Receiver
      | AccountNumber | Whopays| Mode | Sender            | Receiver |
      |        614060 |       1| 1    | TEM Perth Address | TEM Brisbane Address |
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



 @tag2
  Scenario: User accesses 'Draft Shipment' from My Dashboard - TGX
    When User selects Toll Carrier and select Service
      | TollCarrier | Service |
      | Toll Priority (Aus)  | Parcels - Overnight |
     Then User enters shipment overview details as below Draft Shipment - Specific Sender Receiver - Prio
      | AccountNumber | Whopays| Sender            | Receiver |
      |        401509 |       1| TEM Perth Address | TEM Brisbane Address |
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

 
#    #Recheck AC023