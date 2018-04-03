Feature: MYT-3483 Advance Search : View Search Shipment Results

  Background: 
    Given User is on the Advance Search Page
# 	And User Searches Using Shipment Created date - Date From
#   	|DateFrom|
#   	|01-07-2017|
   	
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

     Then User Downloads the Saved Search and Closes the search Box     
     And User Verifies if Save Search is existing in Module 3 of Advance Search
     Then User loads the Saved Search From Dashboard and Edit the Saved Search
	 |TollCarrier|
     |Toll Priority(AU & NZ) |
     
     
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

     Then User Downloads the Saved Search and Closes the search Box     
     And User Verifies if Save Search is existing in Module 3 of Advance Search
     Then User loads the Saved Search From Dashboard and Edit the Saved Search
	 |TollCarrier|
     |Intermodal & Specialised |
     
     
