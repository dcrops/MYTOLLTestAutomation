Feature: MYT-5885 User needs to Edit Sender Address from 'Book a pickup' page

Background:
		Given User is Registered in MyToll and is on Book a pickup page

Scenario: User wants to Print and/or Share my pick up booking in TGX
  Then User clicks on 'Create Shipment' and User navigates to Shipment Review page and see Toll Tasmania Overview details as below.
  | TollCarrier   | AccountNumber | ShipmentRef1 | ShipmentRef2 | Service    | Mode | CollectionDepot           | Whopays |
  | Toll Tasmania |        107573 |        12345 |       234567 | Dangerous Goods Express | * | ADELAIDE EQUIPMENT DEHIRE | Sender  |
