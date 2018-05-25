Feature: MYT-1692 Rate Enquiry - Rate  Within a Shipment

  Background: 
    Given User is Registered in MyToll and is on Shipment Page - Rate Enquiry

  @tag1 @Shakeout
  Scenario: User Gets a Rate Estimate from within a Shipment - TNQX
    When User selects Toll Carrier and select Service
      | TollCarrier | Service |
      | Intermodal & Specialised  | General |
    Then User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver
      | AccountNumber | Whopays | Sender                 | Receiver            |
      |        614060 |       1 | TNQX Melbourne Address | TNQX Sydney Address |
    And User Selects Mode For Shipment
      | Mode |
      |    1 |
    When User enters following input data for the line item
      | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height |  Weight      | SenderReference | ReceiverReference |
      | Automation Template1 | General Freight |          10 | Item      |    100 |   100 |    100 |          900 | Ref123          | Ref456            |
    When User selects Dangerous Goods
      | DgGoods |
      |       2 |
    Then User Clicks Price Now Curtain on Shipment Page
    Then Rate is Displayed with no breakdown and with a disclaimer
#    And User cannot edit any Shipment feild
	And User closes Rate Enquiry Curtain
 	Then User Clicks Save Draft on Shipment Page
    And User Click Complete Shipment and is Navagiated Back to Create Shipment page
     |Toll carrier               |Sender                 | Receiver            |
     | Intermodal & Specialised  |TNQX Melbourne Address | TNQX Sydney Address |
    Then User Verifies Shipment Details and Clicks Price Now Curtain
    | TollCarrier               | Service |
    | Intermodal & Specialised  | General |
    Then User Verifies if the Total Charge Remained the Same
    | Rate                |
    | Retreived on RunTime|
    And User closes Rate Enquiry Curtain
    And User Navigates back to Dashboard and Draft Shipment Tab
	Then User Deletes Draft Shipment
	 |Toll carrier               |Sender                 | Receiver            |
     | Intermodal & Specialised  |TNQX Melbourne Address | TNQX Sydney Address |
	Then User Confirms Delete Draft Search
	Then User Closes the Browser
      
  @tag2
  Scenario: User Gets a Rate Estimate from within a Shipment - PrioAU
    When User selects Toll Carrier and select Service
      | TollCarrier          | Service |
      | Toll Priority (Aus)  | Parcels - Overnight |
	Then User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver
	  | AccountNumber | Whopays | Sender                 | Receiver            |
	  |       401509  |       1 | TNQX Melbourne Address | TNQX Sydney Address |
    When User enters following input data for the line item - Prio
      | Item description     | No of Items | Length | Width | Height | Weight      | SenderReference | ReceiverReference |
      | Automation Template1 |          10 |    10  |   10  |    10  |          20 | Ref123          | Ref456            |
    When User selects Dangerous Goods
      | DgGoods |
      |       2 |
    Then User Clicks Price Now Curtain on Shipment Page
    Then Rate is Displayed with no breakdown and with a disclaimer
#    And User cannot edit any Shipment feilds
	And User closes Rate Enquiry Curtain
	Then User Clicks Save Draft on Shipment Page
    And User Click Complete Shipment and is Navagiated Back to Create Shipment page
     |Toll carrier               |Sender                 | Receiver            |
     | Toll Priority (Aus)       |TNQX Melbourne Address | TNQX Sydney Address |
    Then User Verifies Shipment Details and Clicks Price Now Curtain
    | TollCarrier               | Service |
    | Toll Priority (Aus)  | Parcels - Overnight |
    Then User Verifies if the Total Charge Remained the Same
    | Rate                |
    | Retreived on RunTime|
    And User closes Rate Enquiry Curtain
    And User Navigates back to Dashboard and Draft Shipment Tab
	Then User Deletes Draft Shipment
	|Toll carrier               |Sender                 | Receiver            |
    | Toll Priority (Aus)       |TNQX Melbourne Address | TNQX Sydney Address |
	Then User Confirms Delete Draft Search
	Then User Closes the Browser
    
 
  @tag3
  Scenario: User Gets a Rate Estimate from within a Shipment - PrioNZ
    When User selects Toll Carrier and select Service
      | TollCarrier         | Service                  |
      | Toll Priority (NZ)  | Global - Express Parcels |
    Then User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver
      | AccountNumber | Whopays | Sender            | Receiver            |
      |        100181 |       1 | NZ Sender         | IPEC Footscray      |
    When User enters following input data for the line item - Prio
      | Item description     | No of Items | Length | Width | Height | Weight      | SenderReference | ReceiverReference |
      | Automation Template1 |          10 |    10  |   10  |    10  |          20 | Ref123          | Ref456            |
    When User selects Dangerous Goods
      | DgGoods |
      |       2 |
    Then User Clicks Price Now Curtain on Shipment Page
    Then Rate is Displayed with no breakdown and with a disclaimer - Prio
#    And User cannot edit any Shipment feilds
	And User closes Rate Enquiry Curtain
	Then User Clicks Save Draft on Shipment Page
    And User Click Complete Shipment and is Navagiated Back to Create Shipment page
     |Toll carrier               |Sender                 | Receiver            |
     | Toll Priority (NZ)        |NZ Sender              | IPEC Footscray      |
    Then User Verifies Shipment Details and Clicks Price Now Curtain
    | TollCarrier               | Service |
    | Toll Priority (NZ)  | Global - Express Parcels |
    Then User Verifies if the Total Charge Remained the Same
    | Rate                |
    | Retreived on RunTime|
    And User closes Rate Enquiry Curtain
    And User Navigates back to Dashboard and Draft Shipment Tab
	Then User Deletes Draft Shipment
	|Toll carrier               |Sender                 | Receiver            |
    | Toll Priority (NZ)        |NZ Sender              | IPEC Footscray      |
  Then User Confirms Delete Draft Search
  Then User Closes the Browser
    
    
 @tag4 @Shakeout
  Scenario: User Gets a Rate Estimate from within a Shipment - IPEC
    When User selects Toll Carrier and select Service
      | TollCarrier         | Service        |
      | Toll IPEC           | Road Express   |
    Then User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver
      | AccountNumber | Whopays | Sender            | Receiver            |
      |       2230899 |       1 | IPEC Melbourne    | IPEC Footscray      |
    When User enters following input data for the line item - Prio
      | Item description     | No of Items | Length | Width | Height | Weight      | SenderReference | ReceiverReference |
      | Automation Template1 |          10 |    10  |   10  |    10  |          20 | Ref123          | Ref456            |
    When User selects Dangerous Goods
      | DgGoods |
      |       2 |
    Then User Clicks Price Now Curtain on Shipment Page
    Then Rate is Displayed with no breakdown and with a disclaimer
#    And User cannot edit any Shipment feilds
	And User closes Rate Enquiry Curtain
	Then User Clicks Save Draft on Shipment Page
    And User Click Complete Shipment and is Navagiated Back to Create Shipment page
     |Toll carrier    |Sender                 | Receiver            |
     | Toll IPEC      |IPEC Melbourne         | IPEC Footscray      |
    Then User Verifies Shipment Details and Clicks Price Now Curtain
    | TollCarrier         | Service |
    | Toll IPEC           | Road Express   | 
    Then User Verifies if the Total Charge Remained the Same
    | Rate                |
    | Retreived on RunTime|
	And User closes Rate Enquiry Curtain
    And User Navigates back to Dashboard and Draft Shipment Tab
	Then User Deletes Draft Shipment
	|Toll carrier               |Sender                 | Receiver            |
    | Toll IPEC                 |IPEC Melbourne         | IPEC Footscray      |
	Then User Confirms Delete Draft Search
	Then User Closes the Browser