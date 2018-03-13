Feature: MYT-3483 Advance Search : View Search Shipment Results

  Background: 
    Given User is on the Advance Search Page
 	And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|01-07-2017|
   	
    @tag1
    Scenario: User views all his searched shipment results from Advance Search - TGX
    When User inputs search criteria in the Toll Carrier feild
   	 |TollCarrier|
     | Toll Priority (Aus) |
    Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     Then Search Results are displayed according to Track and Trace
     |TollShipmentNo   |References |	Milestone |	SenderLocation| 	DeliveryLocation |	EstimatedDelivery	|Items|
     |Toll shipment no.|References| Milestone |Sender location| Receiver location|	Estimated/Actual Delivery|Items|
     And Save Search Option is visible
     Then User Selects Save Search Option
     Then User Verifies if Saved Search is Availble in the Dropdown
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|
     
     And User Verifies if Save Search is existing in Module 3 of Advance Search
	 Then User loads the Saved Search to Advance Search
#     And User Downloads the Save Search
#     Then User must have the option to download as PDF and CSV
#     And User clicks edit search
#     Then User is able to Edit the Save Search Name
#     |NewSaveSearchName|
#     |NewSaveSearchName|
#     |Check AC 24|
#     And User Closes  Save Result Section
#     
#     
#    @tag2
#    Scenario: User Performs Advance Search without any Search Criteria
#    When User click search without any criteria
#    Then Search Results are displayed according to Trace and Trace
#     |TollShipmentNo   |	Reference |	Milestone |	Sender | Location| 	DeliveryLocation |	EstimatedDelivery	|Items|
#     |Toll shipment no.|	Reference |	Milestone |	Sender | location| 	Delivery location|	Estimated delivery	|Items|
#     And Save Search Option is Not visible
#     And Downloads option is not visible the Save Search
#     
#     
#    @tag3
#    Scenario: User views all his searched shipment results from Advance Search - TDF
#    When User inputs search criteria in the Toll Carrier feild
#   	 | TollCarrier|
#     | TollNQX|
#     Then Search Results are displayed according to Trace and Trace
#     |TollShipmentNo   |	Reference |	Milestone |	Sender | Location| 	DeliveryLocation |	EstimatedDelivery	|Items|
#     |Toll shipment no.|	Reference |	Milestone |	Sender | location| 	Delivery location|	Estimated delivery	|Items|
#     And Save Search Option is visible
#     Then User Selects Save Search Option
#     |SaveSearchName| Message|
#     |SaveSearchName|Successfull Save Message (TO BE CHANGED)|
#     And User Verifies if Save Search is existing in Module 3 of Advance Search
#     Then User loads the Saved Search to Advance Search
#     |SaveSearchName|
#     |SaveSearchName|
#     And User Downloads the Save Search
#     Then User must have the option to download as PDF and CSV
#     And User clicks edit search
#     Then User is able to Edit the Save Search Name
#     |NewSaveSearchName|
#     |NewSaveSearchName|
#     |Check AC 24|
#     And User Closes  Save Result Section
     