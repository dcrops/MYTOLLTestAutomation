Feature: MYT-6235  - Rate Enquiry for Toll Mining Service

   Background: 
    Given User is Registered in MyToll and is on Rate Enquiry Page
       
  @tag1
  Scenario: User Performs Rate Enquiry for Toll Mining Service - Service General
     When User selects Toll Carrier
      | TollCarrier|
      | Toll Mining Services |
      And User select Service
      |Service|
      |DG Freight|
      And User Enters and selects Account
      |Account|
      |790135|
     Then User Enters Orgin
      |OriginSuburb  |OriginPostCode|
      |PORT ADELAIDE |5015   		|
     Then User Enters Destination
      |DesSuburb   |DesPostCode|
      |ROXBY DOWNS |5725   	|
      And User Enters Line Items for Rate Enquiry
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
      And User Selects Item type
      |BillingType|
      |ALL UNITS - SODIUM CHLORATE PER TONNE|
      And User Selects Quantity type
      |QtyType|
      |Items|
      When User Clicks Price Now
      Then User Verifies Price and Continues to Shipment
      Then User Verifies Details on Shipment Page
      | TollCarrier               |Service     |Account| Length | Width | Height |
      | Toll Mining Services      |DG Freight  |790135 | 10     |   10  |   10   |
   
   
  @tag2
  Scenario: User Gets a Rate Estimate from within a Shipment - Toll Mining Service
  	When User Navigates Back to Shipment Page
    When User selects Toll Carrier and select Service
      | TollCarrier             | Service |
      | Toll Mining Services    | DG Freight |
   Then User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver
      | AccountNumber | Whopays | Sender            | Receiver |
      |        790135 |       1 | TMS Port Adelaide | TMS Roxby Downs |
    When User enters following input data for the line item
      | Item description     | Billing Type                          | No of Items | Item Type | Length | Width | Height |  Weight      | SenderReference | ReceiverReference |
      | Automation Template1 | ALL UNITS - SODIUM CHLORATE PER TONNE |          10 | Item      |    10  |   10  |    10  |          10  | Ref123          | Ref456            |
    When User selects Dangerous Goods
      | DgGoods |
      |       1 |
    Then User Clicks Price Now Curtain on Shipment Page
    Then Rate is Displayed with no breakdown and with a disclaimer
    #And User cannot edit any Shipment feilds
	And User closes Rate Enquiry Curtain