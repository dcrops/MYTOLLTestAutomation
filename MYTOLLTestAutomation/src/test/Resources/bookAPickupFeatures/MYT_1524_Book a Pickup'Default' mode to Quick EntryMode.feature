Feature: MYT_1524 Book a Pickup: 'Default' mode to ' Quick Entry ' mode

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  @tag1
  Scenario: User wants to switch from 'Default' view to 'Quick Entry Mode' view in Toll Intermodal Specialised.
    When User selects Toll Carrier and Account Number
      | TollCarrier | AccountNumber |
      | Intermodal & Specialised  |        371065 |
    And User selects a existing Sender address from the Sender field
      | Sender   |
      | AccessHQ |
    And User selects switch from 'Default' mode to ' Quick Entry ' mode
    Then User verify that Toll Carrier Account Number Sender Address Name and Phone Number have not been changed
      | TollCarrier | AccountNumber | Sender   |
      | Intermodal&Specialised |        371065 | AccessHQ |
    And User can see By default, Quick entry mode will display 5 Line items
    Then User able to see Line item number autopopulated
    When User select the Service as below
      | Service    |
      | Dangerous Goods Express |
    When User enter following input data
      | Destination | Destination Item         | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | PalletSpaces |
      | MELBOURNE   | 3000, MELBOURNE, VIC, AU | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 |            6 |
    And User can see Charge to Account default to "Sender" and ability to select "Receiver" and "Third party"
    When User selects Contains food or food packaging as NO
    When User select Dangerous Goods as Yes
    And User enter following dangerous goods details
      | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      |
      |     2025 | II          |            20 |             10 | Test Package Description | Test Technical Name |
    Then User able to see following fields are autopopulated.
      | Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
      |         6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
    When User Clicks on 'Add' to add Dangerous Goods
    When User Clicks on 'Add' to Quick Entry Mode Line item
    When User clicks on ADD NEW LINES
    When User select the Service as below
      | Service       |
      | Refrigeration |
    And User enter following input data
      | Destination    |Destination Item    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | PalletSpaces |
      | MELBOURNE |3000, MELBOURNE, VIC, AU| Automation Template2 |        10 | Misc      |    100 |   100 |    100 |         900 |            6 |
    And User can see Charge to Account default to "Sender" and ability to select "Receiver" and "Third party"
    And User selects Contains food or food packaging as NO
    And User selects Dangerous Goods as NO
    When User clicks on 'Save template'
    Then Message displays as Line item Template is saved
      | Message                    |
      | Template saved successfuly |
     Then User Closes the Browser 
      
  @tag2
  Scenario: User wants to switch from 'Default' view to 'Quick Entry Mode' view in Toll Tasmania.
    When User selects Toll Carrier and Account Number
      | TollCarrier | AccountNumber |
      | Toll Tasmania  |       100428 |
    And User selects a existing Sender address from the Sender field
      | Sender   |
      | AccessHQ |
    And User selects switch from 'Default' mode to ' Quick Entry ' mode
    Then User verify that Toll Carrier Account Number Sender Address Name and Phone Number have not been changed
      | TollCarrier | AccountNumber | Sender   |
      | TollTasmania  |  100428 | AccessHQ |
    And User can see By default, Quick entry mode will display 5 Line items
    Then User able to see Line item number autopopulated
    When User select the Service as below
      | Service    |
      | DG Freight |
    When User enter following input data
      | Destination | Destination Item         | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | PalletSpaces |
      | MELBOURNE   | 3000, MELBOURNE, VIC, AU | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 |            6 |
    And User can see Charge to Account default to "Sender" and ability to select "Receiver" and "Third party"
    When User select Dangerous Goods as Yes
    And User enter following dangerous goods details
      | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      |
      |     2025 | II          |            20 |             10 | Test Package Description | Test Technical Name |
    Then User able to see following fields are autopopulated.
      | Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
      |         6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
    When User Clicks on 'Add' to add Dangerous Goods
    When User Clicks on 'Add' to Quick Entry Mode Line item
    When User clicks on ADD NEW LINES
    When User select the Service as below
      | Service       |
      |Express|
    And User enter following input data
      | Destination    |Destination Item    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | PalletSpaces |
      | MELBOURNE |3000, MELBOURNE, VIC, AU| Automation Template2 |        10 | Misc      |    100 |   100 |    100 |         900 |            6 |
    And User can see Charge to Account default to "Sender" and ability to select "Receiver" and "Third party"
    And User selects Dangerous Goods as NO
    When User clicks on 'Save template'
    Then Message displays as Line item Template is saved
      | Message                    |
      | Template saved successfuly |
	Then User Closes the Browser