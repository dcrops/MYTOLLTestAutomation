Feature: MYT_6138 Save a shipment as a 'Draft'

  Background: 
   Given User is Registered in MyToll and is on MyDashboard

  @tag1
  Scenario: User wants to Save a Shipment as a 'Draft'in TDF
  Then User enters following data to complete the shipment as below
      | Item description     | No of Items | Length | Width | Height | TotalWeight | SenderReference | ReceiverReference | PalletSpaces | ChargeToAccount |
      | Automation Template1 |        10 |    100 |   100 |    100 |         900 | Ref123          | Ref456            |            6 | Sender          |