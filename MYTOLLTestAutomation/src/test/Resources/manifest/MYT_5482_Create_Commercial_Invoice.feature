Feature: MYT-5482 Manifest : Create Commercial Invoice for International Order

  Background: 
    Given User is Registered in MyToll and is on Shipment Page - Commercial Invoice
      
    @tag1
  	Scenario: User Creates Commercial Invoice for PrioAU and Saves Commercial Invoice
  			When User selects Toll Carrier and select Service
      | TollCarrier          | Service                  |
      | Toll Priority (Aus)  | Global - Express Parcels |
    Then User enters shipment overview details as below Draft Shipment - Specific Sender Receiver - Prio
      | AccountNumber | Whopays| Sender            | Receiver |
      |        401509 |       1| TEM Perth Address | NZ Address |
    And User Retrives Sender and Reciver Locations and Detials
    When User enters following input data for the line item for Draft Shipment - Prio
      | Item description     | No of Items | Length | Width | Height |  Weight    | SenderReference | ReceiverReference |
      | Automation Template1 |          10 |    10  |   10  |    10  |          90| Ref123          | Ref456            |
    And User selects Dangerous Goods
      | DgGoods |
      |       2 |
    Then User Enters Export Declarations
    |TypeOfExport |DeclaredValue |DeclaredValueCurrency  |WhoPaysDutiesTaxes |CommodityCode|
    |Permanent    |5000          |New Zealand dollar     |Sender             |ABC123       |
    Then User Click Review and Create Shipment
    Then User Prints Labels and Enables Commercial Invoice
    Then User Creates Commercial Invoice and Verifies Page Details
    And User Verifies Shipment Details Commercial Invoice Page
    |NumberOfItems|Weight|DeclaredValue|CountryOfExportAU|DestinationNZ| Other Details        |
    |10           |90    |5000         |AUSTRALIA        |NEW ZEALAND  | Retreived on Run Time|
    Then User Enters Commercial Invoice Item Details
    |CommercialInvoiceDes| PartNo| ACHECC| NumberOfItems| Weight| UnitValue| DeclaredValue|
    |CommercialInvoiceDes| 11    | Test12| 10           | 90    | 500      | 5000         |
    And User Enters Commercial Invoice Other Details And Clicks Save
    | TypeOfExport | TermsofTrade |
    | Permanent    | 2            |
    Then User Verifies Shipment Details on Commercial Invoice Review Page
    |CommercialInvoiceDes| PartNo| ACHECC| NumberOfItems| Weight| UnitValue| DeclaredValue|
    |CommercialInvoiceDes| 11    | Test12| 10           | 90    | 500      | 5000         |
    Then User Prints Commercial Invoice


#    @tag1
#  	Scenario: User Creates Commercial Invoice for PrioAU and Saves Commercial Invoice
#    When User Completes Module 1 in the Create Shipment Page
#      |TollCarrier            |Service                         |Who Pays |AccountNumber |
#      |Toll Priority (Aus)    |Auswide 3kg Satchel - Overnight |Sender   |401509 |
#     And User Enters Line Items for Shipment in Module 2
#      | ItemTemplateName     | NumberOfItems | Weight |
#      | Automation Template1 |       1       | 3      |
#      And User Click Review & Create Shipment
#      And User Clicks Create Commercial Invoice and a window with a form pops up
#      Then User Verfies Shipment details on Commercial Invoice Page
#      And User is able to ADD Line Item
#      |Recheck line item details|
#      And User is able to Delete Line Item
#      |Line item information|
#      And User Completes Commerical invoice and Clicks Save
#      Then the user is able to access the the Saved Invoice from the Dashboard
#      
#      
#    @tag2
#    Scenario: User Creates Commercial Invoice for PrioNZ and Prints Commercial Invoice
#    When User Completes Module 1 in the Create Shipment Page
#      |TollCarrier            |Service                |Who Pays |AccountNumber |
#      |Toll Priority (NZ)     |Parcels - Off Peak     |Sender   |100181        |
#     And User Enters Line Items for Shipment in Module 2
#      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
#      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
#      And User Click Review & Create Shipment
#      And User Clicks Create Commercial Invoice and a window with a form pops up
#      Then User Verfies Shipment details on Commercial Invoice Page
#      And User is able to ADD Line Item
#      |Recheck line item details|
#      And User is able to Delete Line Item
#      |Line item information|
#      And User Completes Commerical invoice and Clicks Print
#      Then Data gets saved and user is Navigated to print pop up and Message is displayed
#      |Message - MYT1796|
#      |Please note that it is compulsory to have a Commercial invoice. If you do not currently have a commercial invoice, you may create one after printing the label using the *Create Commercial Invoice selection|
#      
#      
#    @tag3
#    Scenario: User Creates Commercial Invoice for PrioNZ Global Address and Prints Commercial Invoice
#    When User Completes Module 1 in the Create Shipment Page
#      |TollCarrier            |Service                |Who Pays |AccountNumber |
#      |Toll Priority (NZ)     |Global - Express Parcels     |Sender   |100181        |
#     And User Enters Line Items for Shipment in Module 2
#      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
#      | Automation Template1 |        10     |    10  |   10  |   10   |   10   |
#      And User Click Review & Create Shipment
#      And User Clicks Create Commercial Invoice and a window with a form pops up
#      Then User Verfies Shipment details on Commercial Invoice Page
#      And User is able to ADD Line Item
#      |Recheck line item details|
#      And User is able to Delete Line Item
#      |Line item information|
#      And User Completes Commerical invoice and Clicks Print
#      Then Data gets saved and user is Navigated to print pop up and Message is displayed
#      |Message- MYT1797|
#      |Please remember that this Commercial Invoice must be printed on to your company's letterhead.|
#      
#      
      
    