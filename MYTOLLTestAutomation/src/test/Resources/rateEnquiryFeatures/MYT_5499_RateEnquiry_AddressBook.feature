Feature: MYT-5499 Rate Enquiry - Adress Book record retrieval

  Background: 
    Given User is Registered in MyToll and is on Rate Enquiry Page

  @tag1
  Scenario: User is able to retrive from address book for Orgin Subrub and PostCode under Rate Enquiry - TGX
     When User selects Toll Carrier
      | TollCarrier|
      | Toll IPEC |
      And User select Service
      |Service|
      |Road Express|
      And User Enters and selects Account
      |Account|
      |2230899|
     Then User Click Retrieve from address book checkbox under Orgin
     And User is able to select sender address from address book
     Then User Enters Destination
      |DesSuburb|DesPostCode|
      |FOOTSCRAY|3011		|
      And User Enters Line Items for Rate Enquiry
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
      And User Selects Item type
      |BillingType|
      |ALL FREIGHT|
      When User Clicks Price Now
      Then User Verifies Price and Continues to Shipment
      Then User Verifies Details on Shipment Page
      | TollCarrier  |Service     |Account| Length | Width | Height |
      | Toll IPEC    |Road Express|2230899| 10     |   10  |   10   |
     Then User Verifies if Sender is pre selected from addressbook

     
   @tag2
   Scenario: User is able to retrive from address book for Desination Subrub and PostCode under Rate Enquiry -TDF
	When User selects Toll Carrier
      | TollCarrier|
      | Intermodal |
      And User select Service
      |Service|
      |General|
      And User Enters and selects Account
      |Account|
      |614060|
      Then User Enters Orgin
      |OriginSuburb|OriginPostCode|
      |MELBOURNE   |3000 		|
     Then User Click Retrieve from address book checkbox under Destination
     And User is able to select receiver address from address book
      And User Enters Line Items for Rate Enquiry
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
      And User Selects Item type
      |BillingType|
      |General Freight|
       And User Selects Quantity type
      |QtyType|
      |Items|
      When User Clicks Price Now
      Then User Verifies Price and Continues to Shipment
      Then User Verifies Details on Shipment Page
      | TollCarrier  |Service     |Account| Length | Width | Height |
      | Intermodal   |General     |614060 | 10     |   10  |   10   |
     Then User Verifies if Receiver is pre selected from addressbook

      
      