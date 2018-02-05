
Feature: MYT_5948 TCL T&T Private search, gets a match and view details

Background: 
Given A registered user with an TCL account logging in and visits MyToll

Scenario: A registered user wants to be able track the TCL shipment 

When User completes a Track and Trace search using a TCL Shipment Number/Reference Number
Then User will see a list of all matching records
When User clicks one of the returned results
Then User can see shipment details
When User clicks one of the returned results for which user has a matching Billing Account
Then User can see following shipment details 
When User clicks one of the returned results for which user doesn't have a matching Billing Account
Then User can see following shipment details
When User clicks on a shipment
Then User will see events stops that have occurred
When User clicks on Watch
Then User can see the Shipment will be marked as Watching and appear in My Watchlist
When User clicks on Watching to view a shipment that I have already watched
Then User can see the button will revert to Watch and not appear to My Watchlist
When User clicks on Share
Then User can see a prompt to provide a 'From' and 'To' email address details to Share the shipment
