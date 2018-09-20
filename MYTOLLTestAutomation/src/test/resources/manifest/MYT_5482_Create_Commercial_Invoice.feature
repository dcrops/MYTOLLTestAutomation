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
    
    
    @tag2
  	Scenario: User Creates Commercial Invoice for PrioNZ and Saves Commercial Invoice
  			When User selects Toll Carrier and select Service
      | TollCarrier          | Service                  |
      | Toll Priority (NZ)   | Global - Express Parcels |
    Then User enters shipment overview details as below Draft Shipment - Specific Sender Receiver - Prio
      | AccountNumber | Whopays| Sender            | Receiver |
      |        100181 |       1| TEM Perth Address | NZ Address |
    And User Retrives Sender and Reciver Locations and Detials
    When User enters following input data for the line item for Draft Shipment - Prio
      | Item description     | No of Items | Length | Width | Height |  Weight    | SenderReference | ReceiverReference |
      | Automation Template1 |          10 |    10  |   10  |    10  |          90| Ref123          | Ref456            |
    And User selects Dangerous Goods
      | DgGoods |
      |       2 |
    Then User Enters Export Declarations
    |TypeOfExport |DeclaredValue |DeclaredValueCurrency  |WhoPaysDutiesTaxes |CommodityCode|
    |Permanent    |5000          |New Zealand dollar     |Sender             | NZ123       |
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