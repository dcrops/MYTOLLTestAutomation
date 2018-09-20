Feature: MYT_6242 Toll Mining Services Book A Pickup

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  @tag1
  Scenario: User wants to be able to book a pickup for two lines items with Dangerous goods using Toll Mining Services
    When User selects Toll Carrier and Account Number
      | TollCarrier          | AccountNumber |
      | Toll Mining Services | E92416        |
    And User selects a existing Sender address from the Sender field
      | Sender   |
      | AccessHQ |
    When User enter following input data to Add Item
      | Service    | Destination | ItemDescription     | NoOfItems | PalletSpace | destination     |
      | DG Freight | MELALEUCA   | Automation Template |        10 |           6 | MELALEUCA, 6079 |
    And User Selects Charge to Account as below
      | ChargeToAccount | AccountNumber |
      |               1 |         12345 |
    When User enter following details
      | Length | Width | Height | Weight |
      |    100 |   100 |    100 |    900 |
    And User selects Contains Food or food packaging
      | FoodPackaging |
      |             2 |
    When User selects Dangerous Goods as below
      | DgGoods |
      |       1 |
    And User enter dangerous goods details as below
      | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      |LookupItem|
      |     2025 | II           |            20 |             10 | Test Package Description | Test Technical Name |1|
    Then User able to see following fields autopopulated.
      | Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
      |       6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
    When User clicks on ADD NEW LINES to add more items
    And User enter following input data to Add Item
      | Service | Destination | ItemDescription     | NoOfItems | PalletSpace | destination     |
      | General | MELALEUCA   | Automation Template |        10 |           6 | MELALEUCA, 6079 |
    And User Selects Charge to Account as below
      | ChargeToAccount | AccountNumber |
      |               1 |         12345 |
    When User enter following details
      | Length | Width | Height | Weight |
      |    100 |   100 |    100 |    900 |
    And User selects Contains Food or food packaging
      | FoodPackaging |
      |             2 |
    When User selects Dangerous Goods as below
      | DgGoods |
      |       2 |
    When User selects Dispatch date as Tommorow
    When User selects Ready Time
      | ReadyTime |
      | 14:45     |
    When User enters Special Instructions as below
      | Special Instructions |
      | Special Ins          |
    Then User clicks on Review & Book and User be able to see pickup details entered in Review Your Pickup screen
      | TollCarrier          | AccountNumber | Company  | Location                                     | Booked by | Phone number | Ready time | Location closing time | Special instructions |
      | Toll Mining Services | E92416        | AccessHQ | 60, Collins Street CDE MELBOURNE VIC 3000 AU | Kate  |    452456876 | 14:45      | 18:00                 | Special Ins          |
    Then User be able to see first item details entered in Review Your Pickup screen
      | ItemDescription     | Destination   | Mode | Service    | ChargeTo | NoOfItems | PalletSpaces | Length | Width | Height | Volume    | TotalWeight | DangerousGoods | FoodItem |
      | Automation Template | MELEUCA, 6079 | Road | DG Freight | Sender   |        10 |            6 |    100 |   100 |    100 | 10.000 m3 | 900 kg      | Yes            | No       |
    Then User be able to see dangerous goods details in Review Your Pickup screen
      | DangerousGoodsDetailsHeading | UnNumber | ClassDivision | PackagingGroup | SubRisk | ProperShippingName             | DGPackagingDescription   | DGPkg | DGQty | TechnicalName       |
      | DANGEROUS GOODS DETAILS      |     2025 |           6.1 | II             | NA      | MERCURY COMPOUND, SOLID, N.O.S | Test Package Description |    20 |    10 | Test Technical Name |
    Then User be able to see second item details entered in Review Your Pickup screen
      | ItemDescription     | Destination   | Service | Mode | ChargeTo | NoOfItems | PalletSpaces | Length | Width | Height | Volume    | TotalWeight | DangerousGoods | FoodItem |
      | Automation Template | MELEUCA, 6079 | General | Rail | Sender   |        10 |            6 |    100 |   100 |    100 | 10.000 m3 | 900 kg      | No             | No       |
    When User presses on Confirm Pickup button
    Then User navigates to "PICKUP CONFIRMED" screen
    Then User can see "Refrence Number" with "TW"
    Then User be able to see a message as an email delivered.
      | Msg                                                          |
      |  Wehavesentyouanemailconfirmingyourpickupbookingto: |
    Then User can see email address for an email deliveredpickup confirmation.
     Then User Closes the Browser

  @tag2
  Scenario: User wants to be able to book a pickup for one line item using Toll Mining Services
    When User selects Toll Carrier and Account Number
      | TollCarrier          | AccountNumber |
      | Toll Mining Services | E92416        |
    And User selects a existing Sender address from the Sender field
      | Sender   |
      | AccessHQ |
    When User enter following input data to Add Item
      | Service | Destination | ItemDescription     | NoOfItems | PalletSpace | destination     |
      | General | MELALEUCA   | Automation Template |        10 |           6 | MELALEUCA, 6079 |
    And User Selects Charge to Account as below
      | ChargeToAccount | AccountNumber |
      |               1 |         12345 |
    When User enter following details
      | Length | Width | Height | Weight |
      |    100 |   100 |    100 |    900 |
    And User selects Contains Food or food packaging
      | FoodPackaging |
      |             2 |
    When User selects Dangerous Goods as below
      | DgGoods |
      |       2 |
    When User selects Dispatch date as Tommorow
    When User selects Ready Time
      | ReadyTime |
      | 14:45     |
    When User enters Special Instructions as below
      | Special Instructions |
      | Special Ins          |
    Then User clicks on Review & Book and User be able to see pickup details entered in Review Your Pickup screen
      | TollCarrier            | AccountNumber | Company  | Location                                     | Booked by | Phone number | Ready time | Location closing time | Special instructions |
      | Toll Energy and Marine | E92416        | AccessHQ | 60, Collins Street CDE MELBOURNE VIC 3000 AU | Kate      |    452456876 | 14:45      | 18:00                 | Special Ins          |
    Then User be able to see first item details entered in Review Your Pickup screen
      | ItemDescription     | Destination   | Mode | Service | ChargeTo | NoOfItems | PalletSpaces | Length | Width | Height | Volume    | TotalWeight | DangerousGoods | FoodItem |
      | Automation Template | MELEUCA, 6079 | Road | General | Sender   |        10 |            6 |    100 |   100 |    100 | 10.000 m3 | 900 kg      | No             | No       |
    When User presses on Confirm Pickup button
    Then User navigates to "PICKUP CONFIRMED" screen
    Then User can see "Refrence Number" with "TW"
    Then User be able to see a message as an email delivered.
      | Msg                                                                             |
      | Wehavesentyouanemailconfirmingyourpickupbookingto: |
    Then User can see email address for an email deliveredpickup confirmation.
    Then User Closes the Browser
