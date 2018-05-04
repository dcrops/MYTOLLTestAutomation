Feature: MYT_6138 Save a shipment as a 'Draft'

  Background: 
Given Non registered user visits MyToll without logging in

  @tag1
  Scenario: User wants to Save a Shipment as a 'Draft'in TDF
    When User must be able to complete a basic track and trace
      | Shipment Reference | SearchResultsMSG                         |
      |               3232 | 4 shipments matched 23232 in our systems |
    When User complete a Track and Trace search using a FAST Shipment Number
      | Shipment Reference | SearchResultsMSG                         |
      |               3232 | 20 shipments matched 3232 in our systems |
 When User complete a Track and Trace search using a FAST Reference Number
      | Shipment Reference | SearchResultsMSG                         |
      |               3232 | 20 shipments matched 3232 in our systems |
      