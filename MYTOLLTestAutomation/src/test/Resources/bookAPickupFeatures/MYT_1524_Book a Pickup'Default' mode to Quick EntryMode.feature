Feature: MYT_1524 Book a Pickup: 'Default' mode to ' Quick Entry ' mode

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  @tag1
  Scenario: User wants to switch from 'Default' view to 'Quick mode' view in TollTasmania
    When User selects Toll Carrier as TollTasmania and select Account Number
      | TollCarrier   | AccountNumber |
      | Toll Tasmania |        100428 |
    And User slects a existing Sender address from the Sender field
      | locationIndex |
      |             1 |
    And User selects switch from 'Default' mode to ' Quick Entry ' mode
    Then User verify that Toll Carrier Account Number Sender Address Name and Phone Number have not been changed
    And User can see By default, Quick entry mode will display 5 Line items
    Then User able to see Line item number autopopulated
    When User select the Service as below
      | Service    |
      | DG Freight |
    When User enter following input data
      | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | SenderReference | ReceiverReference | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 | Ref123          | Ref456            |            6 |
    And User can see Charge to Account default to Sender and ability to select Receiver and Third Party
    When User selects Contains food or food packaging as NO
    When User select Dangerous Goods as Yes
    And User enter following dangerous goods details
      | UnNumber | ProperShippingName  | PackingGroup | DGPackageType | DGAggregateQty |
      |     1234 | Test Technical name |            3 |            20 |             10 |
    Then User able to see following fields are autopopulated.
      | Class/Div | SubRisk | PackingGroup |
      |         3 | NA      | II           |
    When User clicks on ADD NEW LINES
    When User select the Service as below
      | Service       |
      | Refrigeration |
    And User enter following input data
      | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | SenderReference | ReceiverReference | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 | Ref123          | Ref456            |            6 |
    And User can see Charge to Account default to Sender and ability to select Receiver and Third Party
    And User selects Contains food or food packaging as NO
    And User selects Dangerous Goods as NO
    And User enter Tempreture details as below
      | Temp [Lo] | Temp [High] |
      |         5 |          10 |
    When User clicks on 'Save template'
    Then Message displays as Line item Template is saved

  @tag2
  Scenario: User wants to switch from 'Default' view to 'Quick mode' view in TollNQX|Toll Express
    When User selects Toll Carrier as TollNQX|Toll Express and select Account Number
      | TollCarrier | AccountNumber |        |
      | TollNQX     | Toll Express  | 614060 |
    And User slects a existing Sender address from the Sender field
      | locationIndex |
      |             1 |
    And User selects switch from 'Default' mode to ' Quick Entry ' mode
    Then User verify that Toll Carrier Account Number Sender Address Name and Phone Number have not been changed
    And User can see By default, Quick entry mode will display 5 Line items
    Then User able to see Line item number autopopulated
    When User select the Service as below
      | Service    |
      | DG Freight |
    When User enter following input data
      | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | SenderReference | ReceiverReference | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 | Ref123          | Ref456            |            6 |
    And User can see Charge to Account default to Sender and ability to select Receiver and Third Party
    When User selects Contains food or food packaging as NO
    When User select Dangerous Goods as Yes
    And User enter following dangerous goods details
      | UnNumber | ProperShippingName  | PackingGroup | DGPackageType | DGAggregateQty |
      |     1234 | Test Technical name |            3 |            20 |             10 |
    Then User able to see following fields are autopopulated.
      | Class/Div | SubRisk | PackingGroup |
      |         3 | NA      | II           |
    When User clicks on ADD NEW LINES
    When User select the Service as below
      | Service       |
      | Refrigeration |
    And User enter following input data
      | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | SenderReference | ReceiverReference | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 | Ref123          | Ref456            |            6 |
    And User can see Charge to Account default to Sender and ability to select Receiver and Third Party
      | ChargetoAccount |
      | Sender          |
      | Receiver        |
      | Third Party     |
    And User selects Contains food or food packaging as NO
    And User selects Dangerous Goods as NO
    And User enter Tempreture details as below
      | Temp [Lo] | Temp [High] |
      |         5 |          10 |
    When User clicks on 'Save template'
    Then Message displays as Line item Template is saved

  @tag3
  Scenario: User wants to navigate across any data elements without using a mouse
    When User selects Toll Carrier as TollTasmania and select Account Number
      | TollCarrier   | AccountNumber |
      | Toll Tasmania |        100428 |
    And User slects a existing Sender address from the Sender field
      | locationIndex |
      |             1 |
    When User press Enter key switch from 'Default' mode to ' Quick Entry ' mode
    Then Quick entry mode option has changed to 'ON' state
    And User presses down arrow key in a drop down section of service and presses Enter key to select Service
      | Service    |
      | DG Freight |
    When User presses the tab key for left to right navigate data elements and enter data
      | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | SenderReference | ReceiverReference | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 | Ref123          | Ref456            |            6 |
    When User presses the shift + tab key for right to left navigate data elements and enter data
     | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | SenderReference | ReceiverReference | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 | Ref123          | Ref456            |            6 |
    When User navigate Dangerous goods and presses Enter key on the Yes radio button
    And User presses Enter key on the Save template check box
  
    
