Feature: MYT-6157  - Rate Enquiry for Toll Energy

  Background: 
    Given User is Registered in MyToll and is on Rate Enquiry Page
       
  @tag1
  Scenario: User is able to retrive from address book for Orgin Subrub and PostCode under Rate Enquiry - TGX
     When User selects Toll Carrier
      | TollCarrier|
      | Toll IPEC |
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
      |Brisbane |4000		|
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
   

#  @tag1
#  Scenario: User Performs Rate Enquiry for Toll Energy - Service General
#    When User selects Toll Carrier
#      | TollCarrier|
#      | Toll Energy |
#      And User select Service
#      |Service|
#      |General|
#      And User Enters and selects Account
#      |Account|
#      |2230899|
#      Then User Enters Orgin and Destination
#      |OriginSuburb|OriginPostCode|DesSuburb|DesPostCode|
#      |MELBOURNE   |3000		  |FOOTSCRAY|3011		|
#      And User Enters Line Items for Rate Enquiry
#      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
#      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
#      And User Selects Item type
#      |BillingType|
#      |ALL FREIGHT|
#      When User Clicks Price Now
#      Then User Verifies Price and Continues to Shipment
#      Then User Verifies Details on Shipment Page
#      | TollCarrier    |Service     |Account| Length | Width | Height |
#      | Toll Energy    |General     |2230899| 10     |   10  |   10   |
#      
#      
#  @tag2
#  Scenario: User Gets a Rate Estimate from within a Shipment - Toll Energy
#    When User Completes Module 1 in the Create Shipment Page
#      |TollCarrier   |Service |Who Pays |AccountNumber |
#      |Toll Energy   |General |Sender   |100428 |
#     And User Enters Line Items for Shipment in Module 2
#      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
#      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
#     Then User Gets a prompt to get a Rate and the User Clicks it
#     And Rate is Displayed with no breakdown and with a disclaimer
#     And Transit time is not displayed
#     And User cannot edit any Shipment feilds
#     And User closes Rate Enquiry Prompt
#     And User Saves the Shipment
#     Then Rate is Stored for future reference in dashboard