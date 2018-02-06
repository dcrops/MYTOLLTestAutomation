
Feature: MYT_5947 TCL T&T Public search, response and view

Background: 
Given Non registered user visits MyToll without logging in

Scenario: Non registered user wants to be able to quickly track TCL shipment without logging in
When User launches the MYToll
Then User must not see the advanced Search option
When User tries to do Track and Trace
Then User must be able to complete a basic track and trace
When User complete a Track and Trace search using a TCL Shipment Number/Reference Number
Then User will see a list of all matching records
When User clicks one of the returned TCL results
Then User can see shipment details
When User clicks on a TCL shipment
Then User will see events stops that have occurred
When User clicks on Share
Then User can see a prompt to provide a 'From' and 'To' email address details to Share the shipment
When User clicks on Watch
Then User can see a prompt to provide an email address to which Notifications will be sent