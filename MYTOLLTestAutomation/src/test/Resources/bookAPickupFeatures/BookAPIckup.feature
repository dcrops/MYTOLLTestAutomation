Feature: Review & Book A Pickup in MyToll

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  Scenario: Review & Book A Pickup in Toll Intermodal Specialised
    When User selects Toll Carrier and Account Number
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |        371065 |

    And User selects a existing Sender address from the Sender field
      | Sender   |
      | AccessHQ |
    When User enter following input data to Add Item
      | Service | Destination | ItemDescription      | NoOfItems | PalletSpace |
      | Express | MELALEUCA   | Automation Template1 |        10 |           6 |  
    And User Selects Charge to Account as below
      | ChargeToAccount | AccountNumber |
      |             1 |         12345 |
      When User enter following details 
      |Length | Width | Height | Weight |
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
