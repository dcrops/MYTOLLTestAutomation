Feature: Review & Book A Pickup in MyToll

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  Scenario: Review & Book A Pickup TollTasmania carrier when Service as Express
    When User selects Toll Carrier as TollTasmania and select Account Number
      | TollCarrier   | AccountNumber |
      | Toll Tasmania |        100428 |
    And User selects Sender
      | SenderIndex |
      |           1 |
    And User select Service as Express
      | Service |
      | Express |
    When User enter following input data to Add Item
      | ItemDescription      | NoOfItems | PalletSpace | Length | Width | Height | Weight |
      | Automation Template1 |        10 |           6 |    100 |   100 |    100 |    900 |
      
    

  Scenario: Review & Book A Pickup TollTasmania carrier when Service as DGFreight
    When User selects Toll Carrier as TollTasmania and select Account Number
      | TollCarrier   | AccountNumber |
      | Toll Tasmania |        100428 |
    And User select Service as Express
      | Service   |
      | DG Freight |
    When User enter following input data to Add Item
      | ItemDescription      | NoOfItems | PalletSpace | Length | Width | Height | Weight |
      | Automation Template1 |        10 |           6 |    100 |   100 |    100 |    900 |
      
     
    Scenario: CreateShipment Review & Book A Pickup TollTasmania carrier when Service as Express
    
    When User selects Toll Carrier and select Service
      | TollCarrier | Service |
      | Intermodal  | Express |
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