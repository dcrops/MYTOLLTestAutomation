Feature: MYT-3482 Advance Search : Load Saved Search

  Background: 
    Given User is on the Advance Search Page
    And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|07-05-2018|
   	And User Searches Using Shipment Created date - Date To
   	|DateTo|
   	|25-05-2018|
   	
    @tag1
    Scenario: User views all his searched shipment results from Advance Search - TGX
    When User inputs search criteria in the Toll Carrier feild
   	 |TollCarrier|
     |Toll Priority(AU & NZ) |
    Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     Then Search Results are displayed according to Track and Trace
     |TollShipmentNo   |References |	Milestone |	SenderLocation| 	DeliveryLocation |	EstimatedDelivery	|Items|
     |Toll shipment no.|References| Milestone |Sender location| Receiver location|	Estimated/Actual delivery|Items|
     And Save Search Option is visible
     Then User Selects Save Search Option
     Then User Verifies if Saved Search is Availble in the Dropdown
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|
	
	 Then User Deletes Saved Search from the Dropdown
     Then User Cancels Delete Saved Search
	 Then User Deletes Saved Search from the Dropdown
     Then User Confirms Delete Saved Search
     And User Verifies Saved Search Does not Exist on DropDown
     Then User Closes the Browser
     
     
    @tag2
    Scenario: User views all his searched shipment results from Advance Search - TDF
    When User inputs search criteria in the Toll Carrier feild
   	 |TollCarrier|
     |Intermodal & Specialised |
    Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     Then Search Results are displayed according to Track and Trace
     |TollShipmentNo   |References |	Milestone |	SenderLocation| 	DeliveryLocation |	EstimatedDelivery	|Items|
     |Toll shipment no.|References| Milestone |Sender location| Receiver location|	Estimated/Actual delivery|Items|
     And Save Search Option is visible
     Then User Selects Save Search Option
     Then User Verifies if Saved Search is Availble in the Dropdown
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|
	
	 Then User Deletes Saved Search from the Dropdown
     Then User Cancels Delete Saved Search
	 Then User Deletes Saved Search from the Dropdown
     Then User Confirms Delete Saved Search
     And User Verifies Saved Search Does not Exist on DropDown
     Then User Closes the Browser



#  	  @tag7
#  	  Scenario: User Profile is set to save 15 Saved Jobs - TDX/TDF
#  	  When User profile has 15 Saved Search
#  	  |15 Random Saved Searches|
#  	  |15 Random Saved Searches|
#  	  And User wants to Create/Save an Advance Search with Toll Carrier as Filter
#      | TollCarrier|
#      | Toll IPEC |
#      Then User is prompted with an error message
#      |Message|
#      |Max Saved Searched Cannot Exceed 15|