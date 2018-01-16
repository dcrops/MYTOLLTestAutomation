Feature: MYT-3540 Advance Search : Access Saved Searches tab in My Dashboard

  Background: 
    Given User is on My Dashboard

    @tag1
    Scenario: User views all his Saved Searches from Dashboard
    When User Click Saved Searched tab on My Dahsboad
    Then Saved Search Results are Displayed
     |TollShipmentNo   |	Reference |	Milestone |	Sender | Location| 	DeliveryLocation |	EstimatedDelivery	|Items|
     |Toll shipment no.|	Reference |	Milestone |	Sender | location| 	Delivery location|	Estimated delivery	|Items|
     And Selects a Saved Search
     Then User has the option to Download the Saved Search
     
     |Check user Story when Functionality is availble|
     
    