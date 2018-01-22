Feature: CreateShipment

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  Scenario: CreateShipment Review & Book A Pickup TollTasmania carrier when Service as Express
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

  Scenario: CreateShipment Review & Book A Pickup TollTasmania carrier when Service as DGFreight
    When User selects Toll Carrier as TollTasmania and select Account Number
      | TollCarrier   | AccountNumber |
      | Toll Tasmania |        100428 |
    And User select Service as Express
      | Service   |
      | DGFreight |
    When User enter following input data to Add Item
      | ItemDescription      | NoOfItems | PalletSpace | Length | Width | Height | Weight |
      | Automation Template1 |        10 |           6 |    100 |   100 |    100 |    900 |
