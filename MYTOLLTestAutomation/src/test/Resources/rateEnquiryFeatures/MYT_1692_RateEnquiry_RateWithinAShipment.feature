Feature: MYT-1692 Rate Enquiry - Rate  Within a Shipment

  Background: 
    Given User is Registered in MyToll and is on Shipment Page - Rate Enquiry

  @tag1
  Scenario: User Gets a Rate Estimate from within a Shipment - TDF
    When User selects Toll Carrier and select Service
      | TollCarrier | Service |
      | Intermodal  | General |
    When User enters shipment overview details as below to get a Rate within a Shipment
      | AccountNumber | Whopays | Mode | QuoteNumber | Sender | Receiver |
      |        614060 |       1 |    1 |      123456 |      1 |        1 |
    When User enters following input data for the line item
      | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height |  Weight      | SenderReference | ReceiverReference |
      | Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |          900 | Ref123          | Ref456            |
    When User selects Dangerous Goods
      | DgGoods |
      |       2 |
    Then User Clicks Price Now Curtain on Shipment Page
    Then Rate is Displayed with no breakdown and with a disclaimer
    And User cannot edit any Shipment feilds
	And User closes Rate Enquiry Curtain
#   And User Saves the Shipment
#   Then Rate is Stored for future reference in dashboard
      
      
  @tag2
  Scenario: User Gets a Rate Estimate from within a Shipment - TGX
    When User selects Toll Carrier and select Service
      | TollCarrier          | Service |
      | Toll Priority (Aus)  | Parcels - Overnight |
    When User enters shipment overview details as below to get a Rate within a Shipment - Prio
      | AccountNumber | Whopays | Sender | Receiver |
      |        401509 |       1 |      1 |        1 |
    When User enters following input data for the line item - Prio
      | Item description     | No of Items | Item Type | Length | Width | Height | Weight      | SenderReference | ReceiverReference |
      | Automation Template1 |          10 | Misc      |    10  |   10  |    10  |          10 | Ref123          | Ref456            |
    When User selects Dangerous Goods
      | DgGoods |
      |       2 |
    Then User Clicks Price Now Curtain on Shipment Page
    Then Rate is Displayed with no breakdown and with a disclaimer - Prio
    And User cannot edit any Shipment feilds
	And User closes Rate Enquiry Curtain
#   And User Saves the Shipment
#   Then Rate is Stored for future reference in dashboard
    
    
    
#    OLD SCENARIOS  
   
#  @tag2
#  Scenario: User Gets a Rate Estimate from within a Shipment and Changes Line Item - TDF
#    When User Completes Module 1 in the Create Shipment Page
#      |TollCarrier   |Service |Who Pays |AccountNumber |
#      |Toll Tasmania |General |Sender   |100428 |
#     And User Enters Line Items for Shipment in Module 2
#      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
#      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
#     Then User Gets a prompt to get a Rate and the User Clicks it
#     And Rate is Displayed with no breakdown and with a disclaimer
#     And Transit time is not displayed
#     And User cannot edit any Shipment feilds
#     And User closes Rate Enquiry Prompt
#     And User Changes Line Item
#     | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
#     | Automation Template1 |        10     |    10  |   10  |   10   |   20   |
#     Then Rate is not stored against shipment
#     And User Does not Save the Shipment
#     Then Rate is not stored for future reference in dashboard   
#  
#  Test
#  @tag3
#  Scenario: User Gets a Rate Estimate from within a Shipment - TGX
#    When User Completes Module 1 in the Create Shipment Page
#      |TollCarrier            |Service                         |Who Pays |AccountNumber |
#      |Toll Priority (Aus)    |Auswide 3kg Satchel - Overnight |Sender   |401509 |
#     And User Enters Line Items for Shipment in Module 2
#      | ItemTemplateName     |
#      | Automation Template1 |
#     Then User Gets a prompt to get a Rate and the User Clicks it
#     And Rate is Displayed with no breakdown and with a disclaimer
#     And Transit time is not displayed
#     And User cannot edit any Shipment feilds
#     And User closes Rate Enquiry Prompt
#     And User Saves the Shipment
#     Then Rate is Stored for future reference in dashboard