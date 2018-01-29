Feature: MYT_6225 Toll Mining Services Shipment, Manifesting and Printing

  Background: 
    Given User is Registered in MyToll and is on create shipment page

  @tag1
  Scenario: User wants to be able to create and print Shipments, Manifests and Labels with one line item in Toll Mining Services
    When user selects Toll Carrier as below
      | TollCarrier          |
      | Toll Mining Services |
    Then User be able to see following Services
      | Service1 | Service2 | Service3   | Service4      | Service5 | Service6   |
      | General  | Express  | DG Freight | Refrigeration | Premium  | DG Premium |
    When User enters shipment overview details as below to create a shipment
      | AccountNumber | Service    | Whopays | locationIndex | DGContactName | DGContactNumber | SenderEmail                 | ReceiverEmail               | ShipmentRef1 | ShipmentRef2 | DropOffDepot | CollectionDepot |
      |        100428 | DG Freight | Sender  |             1 | John          |      0142356789 | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |        12345 |       234567 |            1 |               1 |
    Then User be able to see Mode is default to Road
      | Mode |
      | Road |
    When User enters following input data for the line item
      | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference |
      | Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |               50 |         900 | Ref123          | Ref456            |
    When User selects Dangerous Goods as Yes
    And User enters following dangerous goods details
      | UnNumber | ProperShippingName  | PackingGroup | DGPackageType | DGAggregateQty |
      |     1234 | Test Technical name |            3 |            20 |             10 |
    Then User be able to see following fields are autopopulated.
      | Class/Div | SubRisk | PackingGroup |
      |         3 | NA      | II           |
    When User enters additional information as below
      | PurchaseOrder | SpecialInstructions       |
      | Abcd1234      | Test Special Instructions |
    When User clicks on 'Create Shipment'
    Then User navigates to Shipment Review page and see Overview details as below.
      | TollCarrier          | AccountNumber | ShipmentRef1 | ShipmentRef2 | Service    | Mode |
      | Toll Mining Services |               |        12345 |       234567 | DG Freight | Rail |
    Then User can see additional information as below in Shipment Review page
      | PurchaseOrders | SpecialInstructions       | PalletInfo |
      | Abcd1234       | Test Special Instructions | No         |
    Then User can see Line Item1 details as below
      | Item description     | Billing Type    | Items | Length | Width | Height | TotalCubicVolume | TotalWeight | Reference1 | Reference2 | ShipmentContainDangerousGoods |
      | Automation Template1 | General Freight |    10 |    100 |   100 |    100 |               50 |         900 | Ref123     | Ref456     | No                            |
    When User clicks on 'Add To Manifest Manually'
    Then User can add shipment to Manifest successfully.
    When User clicks on Print
    Then User can print manifest successfully.

  @tag1
  Scenario: User wants to be able to create and print Shipments, Manifests and Labels with two line items in Toll Mining Services
    When User enters shipment overview details as below to create a shipment
      | TollCarrier          | AccountNumber | Service    | Whopays | locationIndex | DGContactName | DGContactNumber | SenderEmail                 | ReceiverEmail               | ShipmentRef1 | ShipmentRef2 | DropOffDepot | CollectionDepot |
      | Toll Mining Services |        100428 | DG Freight | Sender  |             1 | John          |      0142356789 | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |        12345 |       234567 |            1 |               1 |
    When User enters following input data for the line item
      | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference |
      | Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |               50 |         900 | Ref123          | Ref456            |
    When User selects Dangerous Goods as Yes
    And User enters following dangerous goods details
      | UnNumber | ProperShippingName  | PackingGroup | DGPackageType | DGAggregateQty |
      |     1234 | Test Technical name |            3 |            20 |             10 |
    Then User be able to see following fields are autopopulated.
      | Class/Div | SubRisk | PackingGroup |
      |         3 | NA      | II           |
    When User clicks on ADD NEW LINES
    When User enters following input data for the line item
      | Item description     | Billing Type | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference |
      | Automation Template2 | Express      |          20 | Misc      |    200 |   200 |    200 |              150 |         900 | Ref567          | Ref987            |
    When User selects Dangerous Goods as No
    When User clicks on 'Create Shipment'
    Then User navigates to Shipment Review page and see Overview details as below.
      | TollCarrier          | AccountNumber | ShipmentRef1 | ShipmentRef2 | Service    | Mode |
      | Toll Mining Services |               |        12345 |       234567 | DG Freight | Rail |
    Then User can see additional information as below in Shipment Review page
      | PurchaseOrders | SpecialInstructions       | PalletInfo |
      | Abcd1234       | Test Special Instructions | No         |
    Then User can see Line Item1 details as below
      | Item description     | Billing Type    | Items | Length | Width | Height | TotalCubicVolume | TotalWeight | Reference1 | Reference2 | ShipmentContainDangerousGoods |
      | Automation Template1 | General Freight |    10 |    100 |   100 |    100 |               50 |         900 | Ref123     | Ref456     | No                            |
    Then User can see Line Item2 details as below
      | Item description     | Billing Type | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference |
      | Automation Template2 | Express      |          20 | Misc      |    200 |   200 |    200 |              150 |         900 | Ref567          | Ref987            |
    When User clicks on 'Add To Manifest Manually'
    Then User can add shipment to Manifest successfully.
    When User clicks on Print
    Then User can print manifest successfully.
