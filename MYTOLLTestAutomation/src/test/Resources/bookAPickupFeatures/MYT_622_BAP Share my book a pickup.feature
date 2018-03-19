Feature: MYT_622 BAP: Share my 'book a pickup'

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  @tag1
  Scenario: User wants to Print and/or Share my pick up booking in TDF
    When User selects Toll Carrier and Account Number
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |        371065 |
    And User selects a existing Sender address from the Sender field
      | Sender   |
      | AccessHQ |
    When User enter following input data to Add Item
      | Service | Destination | ItemDescription      | NoOfItems | PalletSpace | destination     |
      | Express | MELALEUCA   | Automation Template1 |        10 |           6 | MELALEUCA, 6079 |
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
      | 11:30     |
    When User enters Special Instructions as below
      | Special Instructions      |
      | Special Instructions Test |
    When User clicks on Review & Book
    Then User navigates to Bookings details Review Page
    When User clicks on Confirm Book
    Then User navigates to Pickup confirmed page
    Then User navigates to Pickup confirmation page and see Print and Share options
    When User selects on share option
    Then User can send email to 5 users with the booking content
      | Message                                                                                                                             | MessagetoSend      | User1                       | User2                       | User3                       | User4                       | User5                      |
      | Enter your email and the email of up to 5 others to share a link to this pickup. They will see public information about this pickup | Test share message | NNAutomationuser1@gmail.com | NNAutomationuser2@gmail.com | SitAutomationuser@yahoo.com | Nadiki.perera@tollgroup.com | Nadiki.perera@accesshq.com |

  @tag1
  Scenario: User wants to Print and/or Share my pick up booking in Intermodal & Specialised
    When User selects Toll Carrier and Account Number
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |        371065 |
    And User selects a existing Sender address from the Sender field
      | Sender   |
      | AccessHQ |
    When User enter following input data to Add Item
      | Service    | Destination | ItemDescription      | NoOfItems | PalletSpace | destination     |
      | DG Express | MELALEUCA   | Automation Template1 |        10 |           6 | MELALEUCA, 6079 |
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
      | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      |
      |     2025 | II           |            20 |             10 | Test Package Description | Test Technical Name |
    Then User able to see following fields autopopulated.
      | Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
      |       6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
    When User clicks on ADD NEW LINES to add more items
    And User enter following input data to Add Item
      | Service | Destination | ItemDescription      | NoOfItems | PalletSpace | destination     |
      | Express | MELALEUCA   | Automation Template2 |        10 |           6 | MELALEUCA, 6079 |
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
      | 11:30     |
    When User clicks on Review & Book
    Then User navigates to Bookings details Review Page
    When User clicks on Confirm Book
    Then User navigates to Pickup confirmed page
    Then User navigates to Pickup confirmation page and see Print and Share options
    When User selects on share option
    Then User can send email to 5 users with the booking content
      | Message                                                                                                                             | MessagetoSend      | User1                       | User2                       | User3                       | User4                       | User5                      |
      | Enter your email and the email of up to 5 others to share a link to this pickup. They will see public information about this pickup | Test share message | NNAutomationuser1@gmail.com | NNAutomationuser2@gmail.com | SitAutomationuser@yahoo.com | Nadiki.perera@tollgroup.com | Nadiki.perera@accesshq.com |

  Scenario: User wants to Print and/or Share my pick up booking in TGX
    When User selects Toll Carrier and Account Number
      | TollCarrier         | AccountNumber |
      | Toll Priority (Aus) | 200BHY        |
    And User selects a existing Sender address from the Sender field
      | Sender      |
      | NZ Post Ltd |
    When User enter following input data to Add Item for Prio Aus
      | Service                    | Destination | DescriptionOfGoods |
      | Global - Express Documents | WELLINGTON  | Test Description   |
    When User selects Item Description for Prio Aus
      | Item Description |
      | Box / Carton     |
    When User enter No of Items
      | NoOfItems |
      |        10 |
    When User enter following details
      | Length | Width | Height | Weight |
      |    100 |   100 |    100 |    900 |
    When User selects Dangerous Goods as below
      | DgGoods |
      |       2 |
    When User selects Dispatch date as Tommorow
    When User selects Ready Time
      | ReadyTime |
      | 11:30     |
    When User enters Special Instructions as below
      | Special Instructions      |
      | Special Instructions Test |
    When User clicks on Review & Book
    Then User navigates to Bookings details Review Page
    When User clicks on Confirm Book
    Then User navigates to Pickup confirmed page
    Then User navigates to Pickup confirmation page and see Print and Share options
    When User selects on share option
    Then User can send email to 5 users with the booking content
      | Message                                                                                                                             | MessagetoSend      | User1                       | User2                       | User3                       | User4                       | User5                      |
      | Enter your email and the email of up to 5 others to share a link to this pickup. They will see public information about this pickup | Test share message | NNAutomationuser1@gmail.com | NNAutomationuser2@gmail.com | SitAutomationuser@yahoo.com | Nadiki.perera@tollgroup.com | Nadiki.perera@accesshq.com |
