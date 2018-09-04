Feature: MYT_7077 When UN number is deleted, the auto-populated fields should be cleared

  Background: 
    Given User is Registered in MyToll and is on Shipment page

  @tag1
  Scenario: User wants to be able to create and print Shipments, Manifests and Labels with one line item in Toll Mining Services
    When user selects Toll Carrier as below
      | TollCarrier          |
      | Toll Mining Services |
    When User continue enters shipment overview detail as below to create a shipment
      | Service    | AccountNumber | Mode | Whopays | Sender   | Receiver     | DGContactName | DGContactNumber | SenderEmail                 | ReceiverEmail               | ShipmentRef1 | ShipmentRef2 | DropOffDepot     | CollectionDepot   |
      | DG Freight | E92416        |    1 |       1 | AccessHQ | Dialog Group | John          |      0142356789 | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |        12345 |       234567 | ANGLO MINE MOURA | ADELAIDE RAILHEAD |
    When User enters following input data for the line item
      | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | Weight | SenderReference | ReceiverReference |
      | Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |               50 |    900 | Ref123          | Ref456            |
    When User selects Dangerous Goods
      | DgGoods |
      |       1 |
    And User enters following dangerous goods detail
      | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       |
      |     2025 | II           |            20 |             10 | Test Package Description |
    Then User be able to see following field are autopopulated.
      | Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
      |       6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
      
     Then User clears the UnNumber


     
      
      
   Then User Closes the Browser
   