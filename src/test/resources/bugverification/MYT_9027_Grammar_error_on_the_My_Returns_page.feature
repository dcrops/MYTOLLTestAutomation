Feature: MYT-6126 Rate Enguiry Disclaimer Check for Toll Priority and IPEC
	Background: 
    Given User is Registered in MyToll and is on My Returns Page
    
    @tag1
	Scenario: User searches for an RAN or Shipment that doesn't exists and checks the dicplayed message
	When User Enters Shipment Number and Searches Not Existing on My Returns
      | Enter RAN or Shipment Number|
      | a12312 |
      
    Then User Can See The no returns Message
      |Disclaimer|
      |You don't have any returns for this search|
   