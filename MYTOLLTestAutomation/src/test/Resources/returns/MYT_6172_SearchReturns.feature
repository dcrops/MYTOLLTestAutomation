Feature: MYT-6172 Search Return

  Background: 
    Given User is Registered in MyToll and is on My Returns Page

	@tag1
	Scenario: MyReturn Page is visible for Registered User with Toll PrioAU Account
	When User Enters Shipment Number and Searches on My Returns
	Then Search Results are Displayed with the Below Columns
 	 |Toll shipment no.     |RAN     |Status     |Toll carrier     |Sender details     |Receiver details     |Earliest dispatch date     |Ready time |
 	 |Toll shipment no.     |RAN     |Status     |Toll carrier     |Sender details     |Receiver details     |Earliest dispatch date     |Ready time |
 	 And User Verifies if Return Search Results are Displayed as Per Search Criteria
	 |Toll shipment no.     |RAN        |Status     |Toll carrier     		 |Sender details       |Receiver details     |Earliest dispatch date     |Ready time |
 	 |RunTime Retrival      |1234576    |QUEUED     |Toll Priority (Aus)     |RunTime Retrival     |RunTime Retrival     |RunTime Retrival           |12:00 	 |
	



#  @tag1
#  Scenario: MyReturn Page is not visible to Unregistered Users and Does not have a Toll PrioAU Account
#    When User on MyToll Page and Not Logged in
#    And User Clicks Mega Menu
#    Then My Returns Option is not availble
#    And User logs into MyToll (No Priority AU Account)
#    |UserName                |Password|
#    |auto1_bvt@mailinator.com|Toll@123|
#    And User Clicks Mega Menu
#    Then My Returns Option is not availble
#    
#   @tag2
#   Scenario: MyReturn Page is visible for Registered User with Toll PrioAU Account
#   	When User logs into MyToll and on MyDashboard
#   	|UserName                |Password|
#    |auto_bvt@mailinator.com |Toll@123|
#   	And User Clicks Mega Menu and Selects MyReturns
#   	Then MyReturn Page Loads the last 10 Returns
#   	And User is able to Search by Return Reference Number and Click Search
#   	|ReferenceNo|
#   	|1010xxx|
#   	Then Search results are displayed
#   	And User is able to Search by Shipment Number and Click Search
#   	|ShipmentNo|
#   	|1010xxx|
#   	Then Search results are displayed
#   	And User is able to Search by Date Rate and Click Search
#   	|DateFrom|DateTo  |
#   	|10102017|10012017|
#   	Then Search results are displayed
#   	And User is able to Search by Status and Click Search
#   	|Status|
#   	|In Progress|
#   	Then Search results are displayed with a Printed Link to navigate to T&T
#   	
#    
#    
#    
#  #Recheck User story when application is available