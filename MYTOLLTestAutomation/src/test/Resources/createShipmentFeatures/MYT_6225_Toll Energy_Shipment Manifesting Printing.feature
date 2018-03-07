Feature: MYT_6225 Toll Energy Shipment, Manifesting and Printing

  Background: 
    Given User is Registered in MyToll and is on Shipment page

  #@tag1
  #Scenario: User wants to be able to create and print Shipments, Manifests and Labels with one line item in Toll Energy and Marine
  #When user selects Toll Carrier as below to create shipment
  #| TollCarrier            |
  #| Toll Energy and Marine |
  #Then User be able to see following Services
  #| Service1  | Service2   | Service11 | Service7 | Service12 | Service13 | Service8   | Service10 | Service9 | Service3     | Service4    | Service5   | Service6   |
  #| Dedicated | DG Courier | Hotshot   | Courier  | Overnight | Same Day  | DG Freight | General   | Express  | DG Overnight | DG Same Day | DG Express | DG Premium |
  #When User continue enters shipment overview details as below to create a shipment
  #| Service    | AccountNumber | Mode | Whopays | Sender | Receiver | DGContactName | DGContactNumber | SenderEmail                 | ReceiverEmail               | ShipmentRef1 | ShipmentRef2 | DropOffDepot        | CollectionDepot         |
  #| DG Express | G28668        |    1 |       1 |      1 |        1 | John          |      0142356789 | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |        12345 |       234567 | TOLL ENERGY BALLERA | TOLL ENERGY BARRY BEACH |
  #When User enters following input data for the line item
  #| Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | Weight | SenderReference | ReceiverReference |
  #| Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |               50 |    900 | Ref123          | Ref456            |
  #When User selects Dangerous Goods
  #| DgGoods |
  #|       1 |
  #And User enters following dangerous goods details
  #| UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      |
  #|     2025 | II           |            20 |             10 | Test Package Description | Test Technical Name |
  #Then User be able to see following fields are autopopulated.
  #| Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
  #|       6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
  #When User clicks on 'ADD' to add dangerous goods details
  #When User enters additional information for shipment as below
  #| PurchaseOrder | SpecialInstructions       |
  #| Abcd1234      | Test Special Instructions |
  #And User enters chep pallet information as below
  #| ChepCustomerOwn | ChepExchange | ChepTransfer | ChepDocketNo |
  #|            1111 |         1112 |         1113 |         1114 |
  #And User enters Loscam pallet information as below
  #| LoscamCustomerOwn | LoscamExchange | LoscamTransfer | LoscamDocketNo |
  #|              2111 |           2112 |           2113 |           2114 |
  #And User enters Other pallet information as below
  #| OtherCustomerOwn |
  #|             3111 |
  #And User enters Chep other pallet information as below
  #| ChepOtherExchange | ChepOtherTransfer | ChepOtherDocketNo |
  #|              4112 |              4113 |              4114 |
  #And User enters Loscam other information as below
  #| LoscamOtherExchange | LoscamOtherTransfer | LoscamOtherDocketNo |
  #|                1112 |                1113 |                1114 |
  #Then User clicks on 'Create Shipment' and User navigates to Shipment Review page and see Overview details as below.
  #| TollCarrier            | AccountNumber | ShipmentRef1 | ShipmentRef2 | Service    | Mode | DropOffDepot        | CollectionDepot         | Whopays |
  #| Toll Energy and Marine | G28668        |        12345 |       234567 | DG Express | ROAD | TOLL ENERGY BALLERA | TOLL ENERGY BARRY BEACH | Sender  |
  #Then User can see additional information as below in Shipment Review page
  #| PurchaseOrders | SpecialInstructions       | PalletInfo |
  #| Abcd1234       | Test Special Instructions | Yes        |
  #Then User can see pallet information as below in Shipment Review page
  #| ChepCustomerOwn | ChepExchange | ChepTransfer | ChepDocketNo | LoscamCustomerOwn | LoscamExchange | LoscamTransfer | LoscamDocketNo | OtherCustomerOwn | ChepOtherExchange | ChepOtherTransfer | ChepOtherDocketNo | LoscamOtherExchange | LoscamOtherTransfer | LoscamOtherDocketNo |
  #|            1111 |         1112 |         1113 |         1114 |              2111 |           2112 |           2113 |           2114 |             3111 |              4112 |              4113 |              4114 |                1112 |                1113 |                1114 |
  #Then User be able to see line item headings as below
  #| LineItemName1Heading | ItemTemplateName     | NumberOfItems | ItemDescriptionHeading | ItemsHeading | BillingTypeHeading | DimensionsHeading | TotalVolumeHeading | WeightHeading | Reference1Heading | Reference2Heading | ShipmentContainDangerousGoodsHeading |
  #| Line Item 1          | Automation Template1 |            10 | Item description       | Items        | Billing type       | Dimensions        | Total volume (m3)  | Weight (kg)   | Reference1        | Reference2        | Shipment contain dangerous goods     |
  #Then User can see Line Item1 details as below
  #| Item description     | Billing Type    | NumberOfItems | Items | Length | Width | Height | TotalCubicVolume | TotalWeight | Reference1 | Reference2 | ShipmentContainDangerousGoods |
  #| Automation Template1 | General Freight |            10 |    10 |    100 |   100 |    100 | 10 m3            |         900 | Ref123     | Ref456     | Yes                           |
  #Then User can see dangerous good details in shipment review page as below
  #| DangerousGoodsDetailsHeading | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      | Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
  #| DANGEROUS GOODS DETAILS      |     2025 | II           |            20 |             10 | Test Package Description | Test Technical Name |       6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
  #When User clicks on 'Add To Manifest Manually'
  #| ManifestName |
  #| Automation   |
  #Then User can add shipment to Manifest successfully.
  #When User clicks on Print
  #Then User can print manifest successfully.
  @tag1
  Scenario: User wants to be able to create and print Shipments, Manifests and Labels with two line items in Toll Energy and Marine
    #When user selects Toll Carrier as below to create shipment
      #| TollCarrier            |
      #| Toll Energy and Marine |
    #Then User be able to see following Services
      #| Service1  | Service2   | Service11 | Service7 | Service12 | Service13 | Service8   | Service10 | Service9 | Service3     | Service4    | Service5   | Service6   |
      #| Dedicated | DG Courier | Hotshot   | Courier  | Overnight | Same Day  | DG Freight | General   | Express  | DG Overnight | DG Same Day | DG Express | DG Premium |
    #When User continue enters shipment overview details as below to create a shipment
      #| Service    | AccountNumber | Mode | Whopays | Sender | Receiver | DGContactName | DGContactNumber | SenderEmail                 | ReceiverEmail               | ShipmentRef1 | ShipmentRef2 | DropOffDepot        | CollectionDepot         |
      #| DG Express | G28668        |    1 |       1 |      1 |        1 | John          |      0142356789 | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |        12345 |       234567 | TOLL ENERGY BALLERA | TOLL ENERGY BARRY BEACH |
    #When User enters following input data for the line item
      #| Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | Weight | SenderReference | ReceiverReference |
      #| Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |               50 |    900 | Ref123          | Ref456            |
    #When User selects Dangerous Goods
      #| DgGoods |
      #|       1 |
    #And User enters following dangerous goods details
      #| UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      |
      #|     2025 | II           |            20 |             10 | Test Package Description | Test Technical Name |
    #Then User be able to see following fields are autopopulated.
      #| Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
      #|       6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
    #When User clicks on 'ADD' to add dangerous goods details
    #When User clicks on ADD NEW LINES to add an another item and User enters following input data for the line item
      #| Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference |
      #| Automation Template2 | General Freight |          20 | Misc      |    200 |   200 |    200 |              150 |         900 | Ref567          | Ref987            |
    #When User selects Dangerous Goods
      #| DgGoods |
      #|       2 |
    #When User enters additional information for shipment as below
      #| PurchaseOrder | SpecialInstructions       |
      #| Abcd1234      | Test Special Instructions |
    #And User enters chep pallet information as below
      #| ChepCustomerOwn | ChepExchange | ChepTransfer | ChepDocketNo |
      #|            1111 |         1112 |         1113 |         1114 |
    #And User enters Loscam pallet information as below
      #| LoscamCustomerOwn | LoscamExchange | LoscamTransfer | LoscamDocketNo |
      #|              2111 |           2112 |           2113 |           2114 |
    #And User enters Other pallet information as below
      #| OtherCustomerOwn |
      #|             3111 |
    #And User enters Chep other pallet information as below
      #| ChepOtherExchange | ChepOtherTransfer | ChepOtherDocketNo |
      #|              4112 |              4113 |              4114 |
    #And User enters Loscam other information as below
      #| LoscamOtherExchange | LoscamOtherTransfer | LoscamOtherDocketNo |
      #|                1112 |                1113 |                1114 |
    #Then User clicks on 'Create Shipment' and User navigates to Shipment Review page and see Overview details as below.
      #| TollCarrier            | AccountNumber | ShipmentRef1 | ShipmentRef2 | Service    | Mode | DropOffDepot        | CollectionDepot         | Whopays |
      #| Toll Energy and Marine | G28668        |        12345 |       234567 | DG Express | ROAD | TOLL ENERGY BALLERA | TOLL ENERGY BARRY BEACH | Sender  |
    #Then User can see additional information as below in Shipment Review page
      #| PurchaseOrders | SpecialInstructions       | PalletInfo |
      #| Abcd1234       | Test Special Instructions | Yes        |
    #Then User can see pallet information as below in Shipment Review page
      #| ChepCustomerOwn | ChepExchange | ChepTransfer | ChepDocketNo | LoscamCustomerOwn | LoscamExchange | LoscamTransfer | LoscamDocketNo | OtherCustomerOwn | ChepOtherExchange | ChepOtherTransfer | ChepOtherDocketNo | LoscamOtherExchange | LoscamOtherTransfer | LoscamOtherDocketNo |
      #|            1111 |         1112 |         1113 |         1114 |              2111 |           2112 |           2113 |           2114 |             3111 |              4112 |              4113 |              4114 |                1112 |                1113 |                1114 |
    #Then User be able to see line item headings as below
      #| LineItemName1Heading | ItemTemplateName     | NumberOfItems | ItemDescriptionHeading | ItemsHeading | BillingTypeHeading | DimensionsHeading | TotalVolumeHeading | WeightHeading | Reference1Heading | Reference2Heading | ShipmentContainDangerousGoodsHeading |
      #| Line Item 1          | Automation Template1 |            10 | Item description       | Items        | Billing type       | Dimensions        | Total volume (m3)  | Weight (kg)   | Reference1        | Reference2        | Shipment contain dangerous goods     |
    #Then User can see Line Item1 details as below
      #| Item description     | Billing Type    | NumberOfItems | Items | Length | Width | Height | TotalCubicVolume | TotalWeight | Reference1 | Reference2 | ShipmentContainDangerousGoods |
      #| Automation Template1 | General Freight |            10 |    10 |    100 |   100 |    100 | 10 m3            |         900 | Ref123     | Ref456     | Yes                           |
    #Then User can see dangerous good details in shipment review page as below
      #| DangerousGoodsDetailsHeading | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      | Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
      #| DANGEROUS GOODS DETAILS      |     2025 | II           |            20 |             10 | Test Package Description | Test Technical Name |       6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
     #Then User be able to see second line item headings as below
      #| LineItemName2Heading | ItemTemplateName     | NumberOfItems | ItemDescriptionHeading | ItemsHeading | BillingTypeHeading | DimensionsHeading | TotalVolumeHeading | WeightHeading | Reference1Heading | Reference2Heading | ShipmentContainDangerousGoodsHeading |
      #| Line Item 2         | Automation Template2 |            20 | Item description       | Items        | Billing type       | Dimensions        | Total volume (m3)  | Weight (kg)   | Reference1        | Reference2        | Shipment contain dangerous goods     |
     #Then User can see second Line Item details as below
      #| Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference | ShipmentContainDangerousGoods |
      #| Automation Template2 | General Freight |          20 | Misc      |    200 |   200 |    200 |              150 |         900 | Ref567          | Ref987            | No                            |
    #When User clicks on 'Add To Manifest Manually'
      #| ManifestName |
      #| Automation   |
    #Then User can add shipment to Manifest successfully.
    #When User clicks on Print
    #Then User can print manifest successfully.
    

    
    
    
