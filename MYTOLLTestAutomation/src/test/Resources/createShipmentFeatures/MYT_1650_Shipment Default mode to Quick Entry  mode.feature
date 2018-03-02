Feature: MYT_1650 Shipment: 'Default' mode to ' Quick Entry ' mode

  Background: 
    Given User is Registered in MyToll and is on Shipment page

  @tag1
  Scenario: User wants to switch from 'Default' view to 'Quick mode' view and add one line item in Intermodal & Specialised
    When User enters shipment overview details as below to create a shipment with Dangerous Goods
      | TollCarrier              | AccountNumber | Service    | Mode | QuoteNumber | Whopays | Sender | Receiver | DGContactName | DGContactNumber | SenderEmail                 | ReceiverEmail               | ShipmentRef1 | ShipmentRef2 | DropOffDepot   | CollectionDepot      |
      | Intermodal & Specialised |        371065 | DG Express |    1 |      123456 |       1 |      1 |        1 | John          |      0142356789 | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |        12345 |       234567 | ADELAIDE  TNQX | ADELAIDE S-LINE TNQX |
    And User selects switch from 'Default' mode to ' Quick Entry ' mode in shipment
    Then User able to see Line item number autopopulated
    When User enters following input data for the line item in Quick Entry Mode
      | ItemDescription     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalWeight | SenderReference | ReceiverReference |
      | Automation Template1 | General Freight |          10 | Misc units      |    100 |   100 |    100 |         900 | Ref123          | Ref456            |
    When User selects Dangerous Goods as Yes
      | DgGoods |
      |       1 |
    And User enter following dangerous goods details in shipment
      | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      |
      |     2025 | II           |            20 |             10 | Test Package Description | Test Technical Name |
    Then User able to see following fields are autopopulated.
      | Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
      |       6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
       When User Clicks on 'Add' to add Dangerous Goods
    When User clicks on 'Save template'
    Then Message displays as Line item Template is saved
    When User clicks on 'Create Shipment'
    Then User navigates to Shipment Overview page and see all the data entered.
  #@tag1
  #Scenario: User wants to switch from 'Default' view to 'Quick mode' view and add multiple line items in Intermodal & Specialised
    #When User enters shipment overview details as below to create a shipment
      #| TollCarrier   | AccountNumber | Service    | Mode | Whopays | Sender   | Receiver    | DGContactName | DGContactNumber | SenderEmail                 | ReceiverEmail               | ShipmentRef1 | ShipmentRef2 | DropOffDepot | CollectionDepot |
      #| Intermodal & Specialised |        371065 | DG Express | Rail | Sender  | AccessHQ | Dialog Group| John          |      0142356789 | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |        12345 |       234567 |            1 |               1 |
    #When User selects switch from 'Default' mode to ' Quick Entry ' mode
    #Then User can see By default, Quick entry mode will display 5 Line items
    #Then User able to see Line item number autopopulated
    #When User enters following input data for the line item
      #| Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference |
      #| Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |               50 |         900 | Ref123          | Ref456            |
    #When User selects Dangerous Goods as Yes
    #And User enters following dangerous goods details
      #| UnNumber | ProperShippingName  | PackingGroup | DGPackageType | DGAggregateQty |
      #|     1234 | Test Technical name |            3 |            20 |             10 |
    #Then User able to see following fields are autopopulated.
      #| Class/Div | SubRisk | PackingGroup |
      #|         3 | NA      | II           |
    #When User clicks on More DG
    #When User enters following input data for the line item
      #| Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference |
      #| Automation Template2 | General Freight |          10 | Misc      |    100 |   100 |    100 |               50 |         900 | Ref123          | Ref456            |
    #When User selects Dangerous Goods as Yes
    #And User enters following dangerous goods details
      #| UnNumber | ProperShippingName  | PackingGroup | DGPackageType | DGAggregateQty |
      #|     1234 | Test Technical name |            3 |            20 |             10 |
    #Then User able to see following fields are autopopulated.
      #| Class/Div | SubRisk | PackingGroup |
      #|         3 | NA      | II           |
    #When User clicks on ADD NEW LINES
    #When User enters following input data for the line item
      #| Item description     | Billing Type | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference |
      #| Automation Template1 | Express      |          10 | Misc      |    100 |   100 |    100 |               50 |         900 | Ref123          | Ref456            |
    #When User selects Dangerous Goods as No
    #When User clicks on 'Save template'
    #Then Message displays as Line item Template is saved
    #When User clicks on 'Create Shipment'
    #Then User navigates to Shipment Overview page and see all the data entered.
