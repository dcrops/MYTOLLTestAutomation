Feature: MYT-6850: MODE - Add SHIP to mode for Intermodal & Specialised

  Background: 
    Given User is Registered in MyToll and is on the Create A Shipment page

Scenario: SHIP mode is available for Refrigeration, Dangerous Goods, Express, General, DG FCL, FCL, DG Refrigerated, DG Express, Premium

When user enters the following
|service 1|service 2|service 3|service 4|service 5|service 6|service 7|service 8|service 10|
|Refrigeration|Dangerous Goods|Express|General|DG FCL|FCL|DG Refrigerated|Dangerous Goods Express|Premium|


Then verify the result