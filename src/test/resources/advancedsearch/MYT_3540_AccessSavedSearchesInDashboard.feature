Feature: MYT-3540 Advance Search : Access Saved Searches tab in My Dashboard

  Background: 
    Given User is on the Advance Search Page

    @tag1 
    Scenario: User views all his Saved Searches from Dashboard - TGX
    When User inputs search criteria in the Toll Carrier feild
   	 |TollCarrier|
     |Toll Priority(AU & NZ) |
    And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|07-05-2018|
   	And User Searches Using Shipment Created date - Date To
   	|DateTo|
   	|25-05-2018|
    Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|
     And Save Search Option is visible
     Then User Selects Save Search Option    
     And User Verifies if Save Search is existing in Module 3 of Advance Search
     Then Search Results are displayed according to Track and Trace in Saved Search Tab
     |TollShipmentNo   |References |	Milestone |	SenderLocation| 	DeliveryLocation |	EstimatedDelivery	|Items|
     |Toll shipment no.|References| Milestone |Sender location| Receiver location|	Estimated/Actual delivery|Items|
   	 And User loads the Saved Search From Dashboard and Click View More
   	 Then User Downloads the Saved Search form Dashboard
   	 Then User Deletes Saved Search from the Dashboard
   	 And User Cancels Delete Saved Search
   	 Then User Deletes Saved Search from the Dashboard
   	 Then User Confirms Delete Saved Search
   	 And User Verifies Saved Search Does not Exist on Dashboard
   	 Then User Closes the Browser
   	 
   	 
    @tag2 
    Scenario: User views all his Saved Searches from Dashboard - TDF
    When User inputs search criteria in the Toll Carrier feild
   	 |TollCarrier|
      |Intermodal & Specialised |
  	And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|07-05-2018|
   	And User Searches Using Shipment Created date - Date To
   	|DateTo|
   	|25-05-2018|
    Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|
     And Save Search Option is visible
     Then User Selects Save Search Option    
     And User Verifies if Save Search is existing in Module 3 of Advance Search
     Then Search Results are displayed according to Track and Trace in Saved Search Tab
     |TollShipmentNo   |References |	Milestone |	SenderLocation| 	DeliveryLocation |	EstimatedDelivery	|Items|
     |Toll shipment no.|References| Milestone |Sender location| Receiver location|	Estimated/Actual delivery|Items|
   	 And User loads the Saved Search From Dashboard and Click View More
   	 Then User Downloads the Saved Search form Dashboard
   	 Then User Deletes Saved Search from the Dashboard
   	 And User Cancels Delete Saved Search
   	 Then User Deletes Saved Search from the Dashboard
   	 Then User Confirms Delete Saved Search
   	 And User Verifies Saved Search Does not Exist on Dashboard
   	 Then User Closes the Browser