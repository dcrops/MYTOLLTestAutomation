Feature: MYT_6225 Toll Energy Shipment, Manifesting and Printing

  Background: 
    Given User is Registered in MyToll and is on Shipment page

  @tag1
  Scenario: User wants to be able to create and print Shipments, Manifests and Labels with one line item in Toll Energy and Marine
    When user selects Toll Carrier as below to create shipment
      | TollCarrier            |
      | Toll Energy and Marine |
    When User continue enters shipment overview details as below to create shipment
      | Service    | AccountNumber | Mode | Whopays | Sender   | Receiver     |
      | DG Express | G28668        |    1 |       1 | AccessHQ | NZ Post |
   
    Then User Closes the Browser

