Feature: MYT_9000_Oops_error_when_creating_shipment_with_decimal_DG

  Background:
    Given User is Registered in MyToll and is on Shipment page

  @tag1
  Scenario: User gets Oops error when creating a shipment with decimal value for DG weight
    Given user selects Toll Carrier as below to create shipment
      | TollCarrier            |
      | Toll Energy and Marine |
    And User continue enters shipment overview details as below to create a shipment
      | Service    | AccountNumber | Mode | Whopays | Sender   | Receiver     | DGContactName | DGContactNumber | SenderEmail                 | ReceiverEmail               | ShipmentRef1 | ShipmentRef2 | DropOffDepot      | CollectionDepot      |
      | DG Freight | G28405        | 1    | 1       | AccessHQ | Dialog Group | John          | 0142356789      | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com | 12345        | 234567       | TOLL ENERGY MILES | TOLL ENERGY BRISBANE |
    And User enters following input data for the line item
      | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | Weight | SenderReference | ReceiverReference |
      | Automation Template1 | General Freight | 10          | Misc      | 100    | 100   | 100    | 50               | 900    | Ref123          | Ref456            |
    And User selects Dangerous Goods
      | DgGoods |
      | 1       |
    And User enters following dangerous goods details
      | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      |
      | 2025     | II           | 12            | 11.22          | Test Package Description | Test Technical Name |
    And User adds entered dangerous goods details
    And User adds "123456789" as purchase order number
    When User Clicks Review and Create Shipment
    Then User does not see AE4599 error message
    And User can see dangerous good details in shipment review page as below
      | UnNumber | Class/Div | PackingGroup | SubRisk | Proper Shipping Name           | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      |
      | 2025     | 6.1       | II           | NA      | MERCURY COMPOUND, SOLID, N.O.S | 12            | 11.22          | Test Package Description | Test Technical Name |