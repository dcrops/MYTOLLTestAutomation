Feature: MYT-3482 Advance Search : Load Saved Search

  Background: 
    Given User is on the Advance Search Page

    @tag1
    Scenario: User has the ability to Save and to Load a Saved Search from Advance Search - TGX
   	  When User wants to Create/Save an Advance Search with Toll Carrier as Filter
      | TollCarrier|
      | Toll IPEC |
      Then Search Results are displayed according to Trace and Trace
      |TollShipmentNo   |	Reference |	Milestone |	Sender | Location| 	DeliveryLocation |	EstimatedDelivery	|Items|
      |Toll shipment no.|	Reference |	Milestone |	Sender | location| 	Delivery location|	Estimated delivery	|Items|
      And Save Search Option is visible
      Then User Selects Save Search Option
      |SaveSearchName| Message|
      |SaveSearchName|Successfull Save Message (TO BE CHANGED)|
      
     @tag2
  	 Scenario: User wants to Load a Saved Search from Advance Search - TGX
      When User has an option to Load a Saved Search
      Then Only Once Save Search can be Retreived at any given time
      |SaveSearchName|
      |SaveSearchName|
     
     @tag3
  	 Scenario: User wants to Delete a Saved Search from Advance Search - TGX
  	  When User has atleast on Saved search in my profile
  	  |SaveSearchName|
      |SaveSearchName|
  	  And User has the option to Delete a Saved Search
  	  Then User Selects Delete a Saved Search
  	  |Message|
  	  |Delete Message?|
  	  And User has the option to either Cancel or Confrim Deletion
  	  And User selects Cancel option
  	  Then Saved Search is not deleted
  	  |SaveSearchName Exists|
      |SaveSearchName|
      Then User Selects Delete a Saved Search
  	  |Message|
  	  |Delete Message?|
  	  And User selects Confirm option
  	  |SaveSearchName Does Not Exists|
      |SaveSearchName|
      
      @tag4
    Scenario: User has the ability to Save and to Load a Saved Search from Advance Search - TDF
   	  When User wants to Create/Save an Advance Search with Toll Carrier as Filter
      | TollCarrier|
      | Toll IPEC |
      Then Search Results are displayed according to Trace and Trace
      |TollShipmentNo   |	Reference |	Milestone |	Sender | Location| 	DeliveryLocation |	EstimatedDelivery	|Items|
      |Toll shipment no.|	Reference |	Milestone |	Sender | location| 	Delivery location|	Estimated delivery	|Items|
      And Save Search Option is visible
      Then User Selects Save Search Option
      |SaveSearchName| Message|
      |SaveSearchName|Successfull Save Message (TO BE CHANGED)|
      
     @tag5
  	 Scenario: User wants to Load a Saved Search from Advance Search - TDF
      When User has an option to Load a Saved Search
      Then Only Once Save Search can be Retreived at any given time
      |SaveSearchName|
      |SaveSearchName|
     
     @tag6
  	 Scenario: User wants to Delete a Saved Search from Advance Search - TDF
  	  When User has atleast on Saved search in my profile
  	  |SaveSearchName|
      |SaveSearchName|
  	  And User has the option to Delete a Saved Search
  	  Then User Selects Delete a Saved Search
  	  |Message|
  	  |Delete Message?|
  	  And User has the option to either Cancel or Confrim Deletion
  	  And User selects Cancel option
  	  Then Saved Search is not deleted
  	  |SaveSearchName Exists|
      |SaveSearchName|
      Then User Selects Delete a Saved Search
  	  |Message|
  	  |Delete Message?|
  	  And User selects Confirm option
  	  |SaveSearchName Does Not Exists|
      |SaveSearchName|
  	  
  	  @tag7
  	  Scenario: User Profile is set to save 15 Saved Jobs - TDX/TDF
  	  When User profile has 15 Saved Search
  	  |15 Random Saved Searches|
  	  |15 Random Saved Searches|
  	  And User wants to Create/Save an Advance Search with Toll Carrier as Filter
      | TollCarrier|
      | Toll IPEC |
      Then User is prompted with an error message
      |Message|
      |Max Saved Searched Cannot Exceed 15|