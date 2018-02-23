Feature: MYT_6226 Toll Energy Book A Pickup

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  @tag1
  Scenario: User wants to be able to book a pickup for two lines items with Dangerous goods using Toll Energy
     When User selects Toll Carrier and Account Number
      | TollCarrier   | AccountNumber |
      | Toll Energy |       |
    And User selects a existing Sender address from the Sender field
      | Sender   |
      | AccessHQ |
    When User selects the Service as below
      | Service    |
      | DG Freight |
    When User enters following input data
      | Destination    | ItemDescription      | ChargeToAccount | NoOfItems | Item Type | Length | Width | Height | TotalWeight | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 | Sender          |        10 | Misc      |    100 |   100 |    100 |         900 |            6 |
    When User selects Contains food or food packaging as NO
    When User selects Dangerous Goods as Yes
    And User enters following dangerous goods details
      | UnNumber | ProperShippingName  | PackingGroup | DGPackageType | DGAggregateQty |
      |     1234 | Test Technical name |            3 |            20 |             10 |
    Then User able to see following fields are autopopulated.
      | Class/Div | SubRisk | PackingGroup |
      |         3 | NA      | II           |
    When User clicks on ADD NEW LINES
    When User selects the Service as below
      | Service       |
      | Refrigeration |
    And User enters following input data
      | Destination    | ItemDescription      | ChargeToAccount | NoOfItems | Item Type | Length | Width | Height | TotalWeight | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 | Sender          |        10 | Misc      |    100 |   100 |    100 |         900 |            6 |
    When User clicks on 'Review & Book' button
    Then User be able to see pickup details entered in Review Your Pickup screen
      | TollCarrier | AccountNumber | locationIndex |
      | Toll Energy |               |             1 |
    Then User be able to see item details entered in Review Your Pickup screen
      | ItemDescription      | Destination    | Service    | ChargeTo | NoOfItems | PalletSpaces | Length | Width | Height | TotalWeight | DangerousGoods | FoodItem |
      | Automation Template1 | MELBOURNE,3000 | DG Freight | Sender   |        10 |            6 |    100 |   100 |    100 |         900 | Yes            | No       |
    Then User be able to see dangerous goods details in Review Your Pickup screen
      | UnNumber | ClassDivision | PackagingGroup | SubRisk | ProperShippingName | DGPackagingDescription | DGPkg | DGQty |
      |     1234 |             3 | II             | NA      | METHYLAL           | Test                   |    10 |    15 |
    When User presses on Confirm Pickup button
    Then User navigates to "PICKUP CONFIRMED" screen
    Then User can see "Refrence Number" with "TW"
    Then User be able to see a message as an email delivered.
      | Msg                                                          |
      | We have sent you an email confirming your pickup booking to: |
    Then User can see email address for an email deliveredpickup confirmation.

  @tag1
  Scenario: User wants to be able to book a pickup for one line item using Toll Energy
    When User selects Toll Carrier and Account Number
      | TollCarrier | AccountNumber |
      | Toll Energy |               |
    And User slects an existing Sender address from the Sender field
      | locationIndex |
      |             1 |
    When User selects the Service as below
      | Service |
      | Express |
    And User enters following input data
      | Destination    | ItemDescription      | ChargeToAccount | NoOfItems | Item Type | Length | Width | Height | TotalWeight | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 | Sender          |        10 | Misc      |    100 |   100 |    100 |         900 |            6 |
    When User clicks on 'Review & Book' button
    Then User be able to see pickup details entered in Review Your Pickup screen
      | TollCarrier | AccountNumber | locationIndex |
      | Toll Energy |               |             1 |
    Then User be able to see item details entered in Review Your Pickup screen
      | ItemDescription      | Destination    | Service | ChargeTo | NoOfItems | PalletSpaces | Length | Width | Height | TotalWeight | DangerousGoods | FoodItem |
      | Automation Template1 | MELBOURNE,3000 | Express | Sender   |        10 |            6 |    100 |   100 |    100 |         900 | Yes            | No       |
    When User presses on Confirm Pickup button
    Then User navigates to "PICKUP CONFIRMED" screen
    Then User can see "Refrence Number" with "TW"
    Then User be able to see a message as an email delivered.
      | Msg                                                          |
      | We have sent you an email confirming your pickup booking to: |
    Then User can see email address for an email deliveredpickup confirmation.
