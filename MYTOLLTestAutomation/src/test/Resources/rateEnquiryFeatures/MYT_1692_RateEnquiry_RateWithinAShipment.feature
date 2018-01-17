Feature: MYT-1692 Rate Enquiry - Rate  Within a Shipment

  Background: 
    Given User is Registered in MyToll and is on Shipment Page

  @tag1
  Scenario: User Gets a Rate Estimate from within a Shipment - TDF
    When User Completes Module 1 in the Create Shipment Page
      |TollCarrier   |Service |Who Pays |AccountNumber |
      |Toll Tasmania |General |Sender   |100428 |
     And User Enters Line Items for Shipment in Module 2
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
     Then User Gets a prompt to get a Rate and the User Clicks it
     And Rate is Displayed with no breakdown and with a disclaimer
     And Transit time is not displayed
     And User cannot edit any Shipment feilds
     And User closes Rate Enquiry Prompt
     And User Saves the Shipment
     Then Rate is Stored for future reference in dashboard
      
   
  @tag2
  Scenario: User Gets a Rate Estimate from within a Shipment and Changes Line Item - TDF
    When User Completes Module 1 in the Create Shipment Page
      |TollCarrier   |Service |Who Pays |AccountNumber |
      |Toll Tasmania |General |Sender   |100428 |
     And User Enters Line Items for Shipment in Module 2
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
     Then User Gets a prompt to get a Rate and the User Clicks it
     And Rate is Displayed with no breakdown and with a disclaimer
     And Transit time is not displayed
     And User cannot edit any Shipment feilds
     And User closes Rate Enquiry Prompt
     And User Changes Line Item
     | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
     | Automation Template1 |        10     |    10  |   10  |   10   |   20   |
     Then Rate is not stored against shipment
     And User Does not Save the Shipment
     Then Rate is not stored for future reference in dashboard   
  
  
  @tag3
  Scenario: User Gets a Rate Estimate from within a Shipment - TGX
    When User Completes Module 1 in the Create Shipment Page
      |TollCarrier            |Service                         |Who Pays |AccountNumber |
      |Toll Priority (Aus)    |Auswide 3kg Satchel - Overnight |Sender   |401509 |
     And User Enters Line Items for Shipment in Module 2
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
     Then User Gets a prompt to get a Rate and the User Clicks it
     And Rate is Displayed with no breakdown and with a disclaimer
     And Transit time is not displayed
     And User cannot edit any Shipment feilds
     And User closes Rate Enquiry Prompt
     And User Saves the Shipment
     Then Rate is Stored for future reference in dashboard
          