Feature: MYT-9043  - User tries to save and edit shipment with minimal info

  Background: 
    Given User is Registered in MyToll and is on MyDashboard

  @tag1
  Scenario: User wants to Save a Shipment with multiple line items as a 'Draft Shipment'in TDF

  When User navigates to Shipment from MyDashboard
#  When User selects 'Dispatch date' in to create a shipment
#  Then User MUST have an option to save the Shipment as a Draft
#  | ButtonName |
#  | SAVE DRAFT |

  When User enters following fields
  | TollCarrier              | Service | AccountNumber |
  | Intermodal & Specialised | Express |        137289 |
  Then User can see all data in the draft shipment transferred to the 'Create Shipment' page
  | TollCarrier              | Service | AccountNumber |
  | Intermodal & Specialised | Express |        137289 |


  When User continue enters shipment overview details as below to create a shipment
  | Service    | AccountNumber | Mode | Whopays | Sender   | Receiver     | DGContactName | DGContactNumber | SenderEmail                 | ReceiverEmail               | ShipmentRef1 | ShipmentRef2 | DropOffDepot   | CollectionDepot      |
  | Dangerous Goods Express |        137289 |    1 |       1 | TestSender7492 | Dialog Group | John          |      0142356789 | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |        12345 |       234567 | ADELAIDE TNQX | ADELAIDE S-LINE TNQX |

  When User enters following input data for the line item
  | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | Weight | SenderReference | ReceiverReference |
  | Automation Template1 | General Freight |          10 | Misc      |    100 |   100 |    100 |               50 |    900 | Ref123          | Ref456            |
  When User selects Dangerous Goods
  | DgGoods |
  |       1 |
  And User enters following dangerous goods details
  | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      |
  |     2025 | II           |            20 |             10 | Test Package Description | Test Technical Name |
  
  Then User be able to see following fields are autopopulated.
  | Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
  |       6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
  
  
  When user clicks save template
  
  Then template is saved
  
  When user updates the remaining data
  | No of Items |  Length  | Width | Height |
  |     50      |    50    |    60 |   70   |
  
  And user clicks on update template
  
  Then template is updated
  
  When user clicks on 'clear' template
  
  Then all the template description fields go empty
  #verify no text exist
  
  When user enters the template name in the Item Description
  | Item description     |
  |Automation Template1|
  
  Then the remaining fields are autopopulated
  When User clicks on delete template
  Then the template is deleted
  
  
  
#  When User clicks on 'ADD' to add dangerous goods details
#  When User Clicks on the Save Draft option
#  Then User MUST have an option in the UI prompt to be re-directed to 'My Dashboard'
#  | ButtonName         |
#  | Go to my dashboard |
#  Then User can see pre-filled data available in 'Draft Shipments'
#  | TollCarrier              | Sender   | Receiver     |
#  | Intermodal & Specialised | AccessHQ | Dialog Group |
#  When User selects a Draft Shipment
#  When User moves to Add NEW LInes
#  When User clicks on ADD NEW LINES to add an another item and User enters following input data for the line item
#  | Item description     | Billing Type    | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference |
#  | Automation Template2 | General Freight |          20 | Misc      |    200 |   200 |    200 | 160 m3           |         900 | Ref567          | Ref987            |
#  When User selects Dangerous Goods
#  | DgGoods |
#  |       2 |
#  When User enters additional information for shipment as below
#  | PurchaseOrder | SpecialInstructions       |
#  | Abcd1234      | Test Special Instructions |
#  And User enters chep pallet information as below
#  | ChepCustomerOwn | ChepExchange | ChepTransfer | ChepDocketNo |
#  |            1111 |         1112 |         1113 |         1114 |
#  And User enters Loscam pallet information as below
#  | LoscamCustomerOwn | LoscamExchange | LoscamTransfer | LoscamDocketNo |
#  |              2111 |           2112 |           2113 |           2114 |
#  And User enters Other pallet information as below
#  | OtherCustomerOwn |
#  |             3111 |
#  And User enters Chep other pallet information as below
#  | ChepOtherExchange | ChepOtherTransfer | ChepOtherDocketNo |
#  |              4112 |              4113 |              4114 |
#  And User enters Loscam other information as below
#  | LoscamOtherExchange | LoscamOtherTransfer | LoscamOtherDocketNo |
#  |                1112 |                1113 |                1114 |
#  
#  
#  When User Clicks on the Save Draft option
#  Then User MUST have an option in the UI prompt to be re-directed to 'My Dashboard'
#  | ButtonName         |
#  | Go to my dashboard |
#  Then User can see pre-filled data available in 'Draft Shipments'
#  | TollCarrier              | Sender   | Receiver     |
#  | Intermodal & Specialised | AccessHQ | Dialog Group |
#  When User selects a Draft Shipment
#  When User moves to Add NEW LInes
#Then User clicks on 'Create Shipment' and User navigates to Shipment Review page and see Overview details as below.
#  | TollCarrier              | AccountNumber | ShipmentRef1 | ShipmentRef2 | Service    | Mode | DropOffDepot  | CollectionDepot      | Whopays |
#  | Intermodal & Specialised |        137289 |        12345 |       234567 | Dangerous Goods Express | ROAD | ADELAIDE TNQX | ADELAIDE S-LINE TNQX | Sender  |
#  Then User can see additional information as below in Shipment Review page
#  | PurchaseOrders | SpecialInstructions       | PalletInfo |
#  | Abcd1234       | Test Special Instructions | Yes        |
#  Then User can see pallet information as below in Shipment Review page
#  | ChepCustomerOwn | ChepExchange | ChepTransfer | ChepDocketNo | LoscamCustomerOwn | LoscamExchange | LoscamTransfer | LoscamDocketNo | OtherCustomerOwn | ChepOtherExchange | ChepOtherTransfer | ChepOtherDocketNo | LoscamOtherExchange | LoscamOtherTransfer | LoscamOtherDocketNo |
#  |            1111 |         1112 |         1113 |         1114 |              2111 |           2112 |           2113 |           2114 |             3111 |              4112 |              4113 |              4114 |                1112 |                1113 |                1114 |
#  Then User be able to see line item headings as below
#  | LineItemName1Heading | ItemTemplateName     | NumberOfItems | ItemDescriptionHeading | ItemsHeading | BillingTypeHeading | DimensionsHeading | TotalVolumeHeading | WeightHeading | Reference1Heading | Reference2Heading | ShipmentContainDangerousGoodsHeading |
#  | Line Item 1          | Automation Template1 |            10 | Item description       | Items        | Billing type       | Dimensions        | Total volume (m3)  | Weight (kg)   | Reference1        | Reference2        | Shipment contain dangerous goods     |
#  Then User can see Line Item1 details as below
#  | Item description     | Billing Type    | NumberOfItems | Items | Length | Width | Height | TotalCubicVolume | TotalWeight | Reference1 | Reference2 | ShipmentContainDangerousGoods |
#  | Automation Template1 | General Freight |            10 |    10 |    100 |   100 |    100 | 10 m3            |         900 | Ref123     | Ref456     | Yes                           |
#  Then User can see dangerous good details in shipment review page as below
#  | DangerousGoodsDetailsHeading | UnNumber | PackingGroup | DGPackageType | DGAggregateQty | PackageDescription       | Technical Name      | Class/Div | SubRisk | PackingGroup | Proper Shoping Name            |
#  | DANGEROUS GOODS DETAILS      |     2025 | II           |            20 |             10 | Test Package Description | Test Technical Name |       6.1 | NA      | II           | MERCURY COMPOUND, SOLID, N.O.S |
#  Then User be able to see second line item headings as below
#  | LineItemName2Heading | ItemTemplateName     | NumberOfItems | ItemDescriptionHeading | ItemsHeading | BillingTypeHeading | DimensionsHeading | TotalVolumeHeading | WeightHeading | Reference1Heading | Reference2Heading | ShipmentContainDangerousGoodsHeading |
#  | Line Item 2          | Automation Template2 |            20 | Item description       | Items        | Billing type       | Dimensions        | Total volume (m3)  | Weight (kg)   | Reference1        | Reference2        | Shipment contain dangerous goods     |
#  Then User can see second Line Item details as below
#  | Item description     | Billing Type    | NumberOfItems | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference | ShipmentContainDangerousGoods |
#  | Automation Template2 | General Freight |            20 | Misc      |    200 |   200 |    200 | 160 m3           |         900 | Ref567          | Ref987            | No                            |
#  Then User be able to view the Draft is removed from My Draft Shipments in My Dashboard
##  When User clicks on 'Add To Manifest Manually'
##  | ManifestName |
##  | Automation   |
##  Then User can add shipment to Manifest successfully.
##  When User clicks on 'Add New Shipment' from an 'In Progress' Manifest
##  Then User MUST have an option to SAVE the Shipment as a Draft Shipment
##  | ButtonName | Message                | TollCarrier              | Service    | AccountNumber |
##  | SAVE DRAFT | Draft Shipment Created | Intermodal & Specialised | Dangerous Goods Express |        137289 |
#   Then User Closes the Browser
