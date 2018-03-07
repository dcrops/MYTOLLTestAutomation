Feature: CreateShipment

  Background: 
    Given User is Registered in MyToll and is on Shipment page

  Scenario: CreateShipment Review & Book A Pickup TollTasmania carrier when Service as Express
      Then User can see additional information of Toll Mining Services as below in Shipment Review page
      | PurchaseOrders | SpecialInstructions       | 
      | Abcd1234       | Test Special Instructions | 
     
     Then User be able to see second line item headings as below
      | LineItemName1Heading | ItemTemplateName     | NumberOfItems | ItemDescriptionHeading | ItemsHeading | BillingTypeHeading | DimensionsHeading | TotalVolumeHeading | WeightHeading | Reference1Heading | Reference2Heading | ShipmentContainDangerousGoodsHeading |
      | Line Item 1          | Automation Template1 |            10 | Item description       | Items        | Billing type       | Dimensions        | Total volume (m3)  | Weight (kg)   | Reference1        | Reference2        | Shipment contain dangerous goods     |
    When User enters shipment overview details as below to create a shipment
      | AccountNumber | Whopays | Mode | QuoteNumber | Sender | Receiver | SenderEmail                 | ReceiverEmail               | ShipmentRef1 | ShipmentRef2 | DropOffDepot            | CollectionDepot |
      |        614060 |       1 |    1 |      123456 |      1 |        1 | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |        12345 |       234567 | ACACIA RIDGE INTERMODAL | ACT TOLLFAST    |
    When User enters following input data for the line item
      | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | Weight | SenderReference | ReceiverReference |
      | Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |               50 |         900 | Ref123          | Ref456            |
    When User selects Dangerous Goods
      | DgGoods |
      |       2 |
    When User enters additional information as below
      | PurchaseOrder | SpecialInstructions       | TotalExtraAmount |PurchaeOrder|
      | Abcd1234      | Test Special Instructions |             5000 |Abcd1234|
    When User clicks on 'Create Shipment'
