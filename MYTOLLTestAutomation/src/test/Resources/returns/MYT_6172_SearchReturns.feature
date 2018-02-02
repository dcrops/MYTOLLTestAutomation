Feature: MYT-6172 Create Return Page

  Background: 
    Given User is not Logged in MyToll

  @tag1
  Scenario: MyReturn Page is not visible to Unregistered Users and Does not have a Toll PrioAU Account
    When User on MyToll Page and Not Logged in
    And User Clicks Mega Menu
    Then My Returns Option is not availble
    And User logs into MyToll (No Priority AU Account)
    |UserName                |Password|
    |auto1_bvt@mailinator.com|Toll@123|
    And User Clicks Mega Menu
    Then My Returns Option is not availble
    
   @tag2
   Scenario: MyReturn Page is visible for Registered User with Toll PrioAU Account
   	When User logs into MyToll and on MyDashboard
   	|UserName                |Password|
    |auto_bvt@mailinator.com |Toll@123|
   	And User Clicks Mega Menu and Selects MyReturns
   	Then MyReturn Page Loads the last 10 Returns
   	And User is able to Search by Return Reference Number and Click Search
   	|ReferenceNo|
   	|1010xxx|
   	Then Search results are displayed
   	And User is able to Search by Shipment Number and Click Search
   	|ShipmentNo|
   	|1010xxx|
   	Then Search results are displayed
   	And User is able to Search by Date Rate and Click Search
   	|DateFrom|DateTo  |
   	|10102017|10012017|
   	Then Search results are displayed
   	And User is able to Search by Status and Click Search
   	|Status|
   	|In Progress|
   	Then Search results are displayed with a Printed Link to navigate to T&T
   	
    
    
    
  #Recheck User story when application is available