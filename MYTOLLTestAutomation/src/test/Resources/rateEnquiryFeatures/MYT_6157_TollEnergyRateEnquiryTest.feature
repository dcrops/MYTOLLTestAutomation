Feature: MYT-6157  - Rate Enquiry for Toll Energy

  Background: 
    Given User is Registered in MyToll and is on Rate Enquiry Page
       
  @tag1
  Scenario: User Performs Rate Enquiry for Toll Energy - Service General
     When User selects Toll Carrier
      | TollCarrier|
      | Toll Energy and Marine |
      And User select Service
      |Service|
      |General|
      And User Enters and selects Account
      |Account|
      |G18508|
     Then User Enters Orgin
      |OriginSuburb|OriginPostCode|
      |PERTH       |6000 		|
     Then User Enters Destination
      |DesSuburb|DesPostCode|
      |BRISBANE |4000		|
      And User Enters Line Items for Rate Enquiry
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
      And User Selects Item type
      |BillingType|
      |ALL UNITS - PER KG|
      And User Selects Quantity type
      |QtyType|
      |Items|
      When User Clicks Price Now
      Then User Verifies Price and Continues to Shipment
      Then User Verifies Details on Shipment Page
      | TollCarrier               |Service     |Account| Length | Width | Height |
      | Toll Energy and Marine    |General     |G18508 | 10     |   10  |   10   |
      Then User Verifies Details on Shipment Page Line Items
       | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |BillingType       |QtyType|
       | Automation Template1 |        10     |    10  |   10  |   10   |   10   |ALL UNITS - PER KG|Items  |
   
   
  @tag2
  Scenario: User Gets a Rate Estimate from within a Shipment - Toll Energy
  	When User Navigates Back to Shipment Page
    When User selects Toll Carrier and select Service
      | TollCarrier             | Service |
      | Toll Energy and Marine  | General |
   Then User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver
      | AccountNumber | Whopays | Sender            | Receiver |
      |        G18508 |       1 | TEM Perth Address | TEM Brisbane Address |
    When User enters following input data for the line item
      | Item description     | Billing Type       | No of Items | Item Type | Length | Width | Height |  Weight      | SenderReference | ReceiverReference |
      | Automation Template1 | ALL UNITS - PER KG |          10 | Item      |    10  |   10  |    10  |          10  | Ref123          | Ref456            |
    When User selects Dangerous Goods
      | DgGoods |
      |       2 |
    Then User Clicks Price Now Curtain on Shipment Page
    Then Rate is Displayed with no breakdown and with a disclaimer
    #And User cannot edit any Shipment feilds
	And User closes Rate Enquiry Curtain