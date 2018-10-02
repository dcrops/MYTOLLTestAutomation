Feature: MYT-6172 User Searchs for Return from  My Return Page

  Background: 
    Given User is Registered in MyToll and is on Create Return Page

	@tag1 @Shakeout
	Scenario: MyReturn Page is visible for Registered User with Toll PrioAU Account
	When User Verfies Toll Carrier and select Service
  	| TollCarrier          | Service |
  	| Toll Priority (Aus)  | 3rd Party Return - OffPeak |
  	And User enters shipment overview details to Create a Return
    | AccountNumber | Whopays | Sender             | Receiver             |RAN    |
    |        401509 |       2 |  TEM Perth Address | TEM Brisbane Address |123456 |
    And User enters following input data for the line item for Return
    | Item description     | No of Items | Length | Width | Height | Weight      | Reference       |
    | Automation Template1 |          10 |    10  |   10  |    10  |          20 | Ref123          |
  	Then User Clicks Price Now Curtain on Shipment Page
    Then Rate is Displayed with no breakdown and with a disclaimer - Prio
	And User closes Rate Enquiry Curtain
	And User enters Return Reference and Special Instructions as below
	|Reference | Special Instructions|Ready Time| Closing Time|
	|Ref1212   | Special Instructions|   12:00  | 15:00       |
  	Then User Clicks Review and Create Return
  	Then User Verfies Return Shipment Details on Review Screen
    | TollCarrier          | Service                    |AccountNumber |RAN    |Reference | Special Instructions| Whopays |Ready Time| Closing Time|
  	| Toll Priority (Aus)  | 3rd Party Return - OffPeak |      401509  |123456 |Ref1212   | Special Instructions| Receiver|   12:00  | 15:00       |
  	Then User Clicks Confrim Return
    Then User Retreives Return Reference Number and Verifies Confirmation Page
	Then User Navigates to My Return Page
	
	When User Enters Shipment Number and Searches on My Returns
	|RetrunShipmentNumber|
	|RunTime Retrival    |
	Then Search Results are Displayed with the Below Columns
 	 |Toll shipment no.     |RAN     |Status     |Toll carrier     |Sender details     |Receiver details     |Earliest dispatch date     |Ready time |
 	 |Toll shipment no.     |RAN     |Status     |Toll carrier     |Sender details     |Receiver details     |Earliest dispatch date     |Ready time |
 	 And User Verifies if Return Search Results are Displayed as Per Search Criteria
	 |Toll shipment no.     |RAN        |Status     |Toll carrier     		 |Sender details       |Receiver details     |Earliest dispatch date     |Ready time |
 	 |RunTime Retrival      |123456     |QUEUED     |Toll Priority (Aus)     |RunTime Retrival     |RunTime Retrival     |RunTime Retrival           |12:00 	 |
 	 Then User Filters Search Results By Status
     |Status    |
     |QUEUED    |
     Then User Filters Search Results By Date Range
     |DateFrom    						|DateTo |
     |RunTime Retrival One Year Back    |RunTime Retrival Retrun Shipment Date|
	  Then User Downloads the Return Results
 	 
	



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