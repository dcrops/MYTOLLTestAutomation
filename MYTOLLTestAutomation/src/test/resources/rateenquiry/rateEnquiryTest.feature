Feature: Test Rate Enquiry

  Background: 
    Given User is Registered in MyToll and is on Rate Enquiry Page

  Scenario: User Performs Rate Enquiry for Toll IPEC - Service Express
    When User selects Toll Carrier
      | TollCarrier|
      | Toll IPEC |
      And User select Service
      |Service|
      |Road Express|
      And User Enters and selects Account
      |Account|
      |2230899|
      Then User Enters Orgin and Destination
      |OriginSuburb|OriginPostCode|DesSuburb|DesPostCode|
      |MELBOURNE   |3000		  |FOOTSCRAY|3011		|
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
      