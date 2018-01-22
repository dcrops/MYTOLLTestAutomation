Feature: MYT_622 BAP: Share my 'book a pickup'

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  @tag1
  Scenario: User wants to Print and/or Share my pick up booking in TDF
    When User Creates a Book A Pickup entering following details
      | TollCarrier   | AccountNumber | locationIndex | Service    | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | ChargeToAccount | SenderReference | ReceiverReference | PalletSpaces |
      | Toll Tasmania |        100428 |             1 | DG Freight | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 |               1 | Ref123          | Ref456            |            6 |
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
      | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | ChargeToAccount | SenderReference | ReceiverReference | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 |               1 | Ref123          | Ref456            |            6 |
    And User selects Dangerous Goods as NO
    And User enter Tempreture details as below
      | Temp [Lo] | Temp [High] |
      |         5 |          10 |
    When User clicks on 'Review & BookAPickup'
    Then User navigates to Review Pickup screen
    When User clicks on Confirm Pickup
    Then User navigates to Pickup confirmation page and see Print and Share options
    When User selects on share option
    Then User can send email to 5 users with the booking content
      | User1                       | User2                       | User3                   | User4                       | User5                      |
      | NNAutomationuser1@gmail.com | NNAutomationuser2@gmail.com | auto_bvt@mailinator.com | Nadiki.perera@tollgroup.com | Nadiki.perera@accesshq.com |

 
  @tag1
  Scenario: User wants to Print and/or Share my pick up booking in IPEC
    When User Creates a Book A Pickup entering following details
      | TollCarrier | AccountNumber | locationIndex | Service              | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | ChargeToAccount | SenderReference | ReceiverReference | PalletSpaces |
      | Toll IPEC   |        100428 |             1 | Service Road Express | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 |               1 | Ref123          | Ref456            |            6 |
    When User selects Contains food or food packaging as NO
    When User select Dangerous Goods as No
    When User clicks on ADD NEW LINES
    When User select the Service as below
      | Service |
      | Fashion |
    And User enter following input data
      | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | ChargeToAccount | SenderReference | ReceiverReference | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 |               1 | Ref123          | Ref456            |            6 |
    And User selects Dangerous Goods as NO
    When User clicks on 'Review & BookAPickup'
    Then User navigates to Review Pickup screen
    When User clicks on Confirm Pickup
    Then User navigates to Pickup confirmation page and see Print and Share options
    When User selects on share option
    Then User can send email to 5 users with the booking content
      | User1                       | User2                       | User3                   | User4                       | User5                      |
      | NNAutomationuser1@gmail.com | NNAutomationuser2@gmail.com | auto_bvt@mailinator.com | Nadiki.perera@tollgroup.com | Nadiki.perera@accesshq.com |
