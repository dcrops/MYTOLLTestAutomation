Feature: Review & Book A Pickup in MyToll

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  Scenario: Review & Book A Pickup TollTasmania carrier when Service as Express
    When User selects Toll Carrier as TollTasmania and select Account Number
      | TollCarrier   | AccountNumber |
      | Toll Tasmania |        100428 |
      And User select Service as Express
      |Service|
      |Express|
      When User enter following input data to Add Item
      | ItemDescription      | NoOfItems | PalletSpace | Length | Width | Height | Weight |
      | Automation Template1 |        10 |           6 |    100 |   100 |    100 |    900 |

      