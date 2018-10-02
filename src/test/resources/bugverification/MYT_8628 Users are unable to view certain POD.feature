Feature: MYT-8628: Users are unable to view certain PODs

  Background: 
    Given User is Registered SitAutomationUser2 in MyToll and is on the homepage

Scenario: Users wants to view certain PODs

When user searcher following shipment number in the search shipment
|ShipmentNumberRefererence|
|2857290153|
Then user is able to see the following shipment
|TollShipmentNo|
|2857290153|

When user clicks on the shipment
|TollShipmentNo|
|2857290153|
Then the shipment opens up with Shipment Documents tab
#verify using the text on the screen

When user clicks on Shipment Documents
Then Proof of Delivery tab is displayed
#verify text "VIEW" and "DOWNLOAD"

When user clicks on the POD document
Then POD documentation window is displayed
#verify using text "PRINT" and "DOWNLOAD PDF" options

When User clicks on DOWNLOAD PDF
Then the file downlaods
#download pdf is clickable