Feature: MYT-5482 Manifest : Create Commercial Invoice for International Order

  Background: 
    Given User is Registered in MyToll and is on Shipment Page

    @tag1
  	Scenario: User Creates Commercial Invoice for PrioAU and Saves Commercial Invoice
    When User Completes Module 1 in the Create Shipment Page
      |TollCarrier            |Service                         |Who Pays |AccountNumber |
      |Toll Priority (Aus)    |Auswide 3kg Satchel - Overnight |Sender   |401509 |
     And User Enters Line Items for Shipment in Module 2
      | ItemTemplateName     | NumberOfItems | Weight |
      | Automation Template1 |       1       | 3      |
      And User Click Review & Create Shipment
      And User Clicks Create Commercial Invoice and a window with a form pops up
      Then User Verfies Shipment details on Commercial Invoice Page
      And User is able to ADD Line Item
      |Recheck line item details|
      And User is able to Delete Line Item
      |Line item information|
      And User Completes Commerical invoice and Clicks Save
      Then the user is able to access the the Saved Invoice from the Dashboard
      
      
    @tag2
    Scenario: User Creates Commercial Invoice for PrioNZ and Prints Commercial Invoice
    When User Completes Module 1 in the Create Shipment Page
      |TollCarrier            |Service                |Who Pays |AccountNumber |
      |Toll Priority (NZ)     |Parcels - Off Peak     |Sender   |100181        |
     And User Enters Line Items for Shipment in Module 2
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
      And User Click Review & Create Shipment
      And User Clicks Create Commercial Invoice and a window with a form pops up
      Then User Verfies Shipment details on Commercial Invoice Page
      And User is able to ADD Line Item
      |Recheck line item details|
      And User is able to Delete Line Item
      |Line item information|
      And User Completes Commerical invoice and Clicks Print
      Then Data gets saved and user is Navigated to print pop up and Message is displayed
      |Message - MYT1796|
      |Please note that it is compulsory to have a Commercial invoice. If you do not currently have a commercial invoice, you may create one after printing the label using the *Create Commercial Invoice selection|
      
      
    @tag3
    Scenario: User Creates Commercial Invoice for PrioNZ Global Address and Prints Commercial Invoice
    When User Completes Module 1 in the Create Shipment Page
      |TollCarrier            |Service                |Who Pays |AccountNumber |
      |Toll Priority (NZ)     |Global - Express Parcels     |Sender   |100181        |
     And User Enters Line Items for Shipment in Module 2
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
      And User Click Review & Create Shipment
      And User Clicks Create Commercial Invoice and a window with a form pops up
      Then User Verfies Shipment details on Commercial Invoice Page
      And User is able to ADD Line Item
      |Recheck line item details|
      And User is able to Delete Line Item
      |Line item information|
      And User Completes Commerical invoice and Clicks Print
      Then Data gets saved and user is Navigated to print pop up and Message is displayed
      |Message- MYT1797|
      |Please remember that this Commercial Invoice must be printed on to your company's letterhead.|
      
      
      
    