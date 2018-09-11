Feature: MYT_8826 User unable to print due to zero weight at Print & Close Manifest

  Background:
    Given User is Registered in MyToll and is on Shipment page

  @tag1 @MYT8826
  Scenario: User is unable to print because the weights change to zero at the Print & Close Manifest screen
    When user selects Toll Carrier as below to create shipment
      | TollCarrier            |
      | Toll Energy and Marine |
#    Then User be able to see following Services
#      | Service1  | Service2   | Service11 | Service7 | Service12 | Service13 | Service8   | Service10 | Service9 | Service3     | Service4    | Service5   | Service6   |
#      | Dedicated | DG Courier | Hotshot   | Courier  | Overnight | Same Day  | DG Freight | General   | Express  | DG Overnight | DG Same Day | DG Express | DG Premium |
    When User continue enters shipment overview details as below to create a shipment
      | Service    | AccountNumber | Mode | Whopays | Sender   | Receiver     | DGContactName | DGContactNumber | SenderEmail                 | ReceiverEmail               | ShipmentRef1 | ShipmentRef2 | DropOffDepot        | CollectionDepot         |
      | DG Express | G28668        |    1 |       1 | AccessHQ | Dialog Group | John          |      0142356789 | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |        12345 |       234567 | TOLL ENERGY BALLERA | TOLL ENERGY BARRY BEACH |
    When User enters following input data for the line item
      | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | Weight | SenderReference | ReceiverReference |
      | Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |               50 |    900 | Ref123          | Ref456            |
    When User selects Dangerous Goods
      | DgGoods |
      |       1 |
    And User enters following dangerous goods details
      | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      |
      |     2025 | II           |            20 |             10 | Test Package Description | Test Technical Name |
    When User clicks on 'ADD' to add dangerous goods details
    When User enters additional information for shipment as below
      | PurchaseOrder | SpecialInstructions       |
      | Abcd1234      | Test Special Instructions |
    Then User clicks on 'Create Shipment' and User navigates to Shipment Review page and see Overview details as below.
      | TollCarrier            | AccountNumber | ShipmentRef1 | ShipmentRef2 | Service    | Mode | DropOffDepot        | CollectionDepot         | Whopays |
      | Toll Energy and Marine | G28668        |        12345 |       234567 | DG Express | ROAD | TOLL ENERGY BALLERA | TOLL ENERGY BARRY BEACH | Sender  |
    Then User be able to see line item headings as below
      | LineItemName1Heading | ItemTemplateName     | NumberOfItems | ItemDescriptionHeading | ItemsHeading | BillingTypeHeading | DimensionsHeading | TotalVolumeHeading | WeightHeading | Reference1Heading | Reference2Heading | ShipmentContainDangerousGoodsHeading |
      | Line Item 1          | Automation Template1 |            10 | Item description       | Items        | Billing type       | Dimensions        | Total volume (m3)  | Weight (kg)   | Reference1        | Reference2        | Shipment contain dangerous goods     |
    Then User can see Line Item1 details as below
      | Item description     | Billing Type    | NumberOfItems | Items | Length | Width | Height | TotalCubicVolume | TotalWeight | Reference1 | Reference2 | ShipmentContainDangerousGoods |
      | Automation Template1 | General Freight |            10 |    10 |    100 |   100 |    100 | 10 m3            |         900 | Ref123     | Ref456     | Yes                           |
    When User clicks on 'Add To Manifest Manually'
      | ManifestName |
      | Automation   |
    Then User can add shipment to Manifest successfully.
    Then User can print manifest successfully.
    Then User Closes the Browser