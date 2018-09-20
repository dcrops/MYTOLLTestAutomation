Feature: MYT_5947 TCL T&T Public search, response and view

  Background: 
    Given Non registered user visits MyToll without logging in

  Scenario: Non registered user wants to be able to quickly track TCL shipment without logging in
    When User launches the MYToll
    Then User must not see the advanced Search option
    Then User must not see the advanced Search option
    When User complete a Track and Trace search using a TCL Reference Number
      | ReferenceNumber | SearchResultsMSG                          |
      |          987654 | 4 shipments matched 987654 in our systems |
    When User complete a Track and Trace search using a TCL Shipment Number
      | ShipmentReference | SearchResultsMSG                                 |
      |     6972180021221 | 1 shipment matches 6972180021221 in our systemss |
    Then User will see a matching record with following details
      | TollShipmentNo | References          | Milestone | SenderLocation | ReceiverLocation | EstimatedActualDelivery | Items |
      |  6972180021221 | 987654987654more... | Delivered | AspleyQLD      | ParkesNSW        | 23 Oct 2017             |     2 |
    When User clicks on returned TCL result and can see shipment details
      | ScreenHeading               | ShipmentNo    | DeliveryDate | SenderDetails | ReceiverDetails | BusinessUnit | Reference | ServiceType | NumberOfItems | Total weight (kg) |
      | Shipment has been delivered | 6972180021221 | 23 Oct 2017  | AspleyQLD AU  | ParkesNSW AU    | TollIPEC     |    987654 | Road        |             2 |                12 |
     Then User clicks on returned TCL result and can see shipment details
      | ScreenHeading               | ShipmentNo    | DeliveryDate | SenderDetails | ReceiverDetails | BusinessUnit | Reference | ServiceType | NumberOfItems | Total weight (kg) |
      | Shipment has been delivered | 6972180021221 | 23 Oct 2017  | AspleyQLD AU  | ParkesNSW AU    | TollIPEC     |    987654 | Road        |             2 |                12 |
      And User clicks on returned TCL result and can see Freight details
      | DescriptionItemTrackingNumber1            | DescriptionItemTrackingNumber2    | DeliveryDate | SenderDetails | ReceiverDetails | BusinessUnit | Reference | ServiceType | NumberOfItems | Total weight (kg) |
      |6428706972180021221001 | 6428706972180021221001 | 23 Oct 2017  | AspleyQLD AU  | ParkesNSW AU    | TollIPEC     |    987654 | Road        |             2 |                12 |
    Then User
    When User clicks on a TCL shipment
    Then User will see events stops that have occurred
    When User clicks on Share
    Then User can see a prompt to provide a 'From' and 'To' email address details to Share the shipment
    When User clicks on Watch
    Then User can see a prompt to provide an email address to which Notifications will be sent
