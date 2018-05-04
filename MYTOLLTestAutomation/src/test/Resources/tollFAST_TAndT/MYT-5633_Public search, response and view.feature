Feature: MYT_5633 Public search, response and view

  Background: 
    Given Non registered user visits MyToll without logging in

  Scenario: Non registered user wants to be able to quickly track FAST shipment without logging in
    Then User must not see the advanced Search option
    When User complete a Track and Trace search using a FAST Shipment Number
      | Shipment Reference | SearchResultsMSG                         |
      |               3232 | 20 shipments matched 3232 in our systems |
    When User complete a Track and Trace search using a FAST Reference Number
      | Shipment Reference | SearchResultsMSG                         |
      |               3232 | 20 shipments matched 3232 in our systems |
    Then User will see a list of all matching records
    When User clicks one of the returned FAST results
    Then User can see shipment details
    When User clicks on a FAST shipment
    Then User will see events stops that have occurred
    When User clicks on Share
    Then User can see a prompt to provide a 'From' and 'To' email address details to Share the shipment
    When User clicks on Watch
    Then User can see a prompt to provide an email address to which Notifications will be sent
