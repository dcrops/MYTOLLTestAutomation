Feature: MYT-6850: MODE - Add SHIP to mode for Intermodal & Specialised

  Background: 
    Given User is Registered in MyToll and is on Book a Picup Page

Scenario: Test to verify that the ready time is before the close time. 
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
    When User selects Dispatch date as Today
    When User selects Ready Time
      | ReadyTime |
      |18:00|
    When User selects Closing Time
      | ClosingTime |
      |18:00|

    When User clicks on Review & Book
    Then error message is displayed
    
    
    
    
    
    
    