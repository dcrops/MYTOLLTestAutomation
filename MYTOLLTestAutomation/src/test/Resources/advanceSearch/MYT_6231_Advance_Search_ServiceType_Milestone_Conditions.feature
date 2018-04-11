Feature: MYT-6231 Advance Search Using Service Type, Milestone and with Condition (AND/OR)

  Background: 
    Given User is on the Advance Search Page
 
    
    @tag1
    Scenario: User perfroms advance search using Service Type feild
     When User inputs search criteria in the Toll Carrier feild
   	 |TollCarrier|
   	 |Intermodal & Specialised|
     And User Searches Using Shipment Created date - Date From
   	 |DateFrom|
   	 |01-03-2018|
   	 And User Searches Using Shipment Created date - Date To
   	 |DateTo|
   	 |15-03-2018|
   	 When User inputs search criteria in the Service Type feild
   	 |ServiceType|
   	 |Intermodal & Specialised_General|
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Adds Multiple Tags in Service Type feild
     |ServiceType1  				         | ServiceType2   				   |ServiceType3   				     |
     |Intermodal & Specialised_Refrigeration |Intermodal & Specialised_Express |Intermodal & Specialised_Premium |
     Then Service Type Tag is Visible in search feild
     |ServiceType1  				         | ServiceType2   				   |ServiceType3   				     |
     |Intermodal & Specialised_Refrigeration |Intermodal & Specialised_Express |Intermodal & Specialised_Premium |
     
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Deletes Tags in Service Type feild and Verify if the Tags are Deleted
	 |ServiceType1  				         | ServiceType2   				   |ServiceType3   				     |
     |Intermodal & Specialised_Refrigeration |Intermodal & Specialised_Express |Intermodal & Specialised_Premium |
     And User Exlcudes search Tags in Service Type feild
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|
    


  
    @tag2
    Scenario: User perfroms advance search using Milestone feild
     When User inputs search criteria in the Milestone feild
   	 |Milestone|
   	 |Shipment created|
   	 And User Searches Using Shipment Created date - Date From
   	 |DateFrom|
   	 |01-03-2018|
   	 And User Searches Using Shipment Created date - Date To
   	 |DateTo|
   	 |05-03-2018|
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Adds Multiple Tags in Milestone feild
     |Milestone1  |Milestone2   |Milestone3   	  |
     |Delivered   |In transit   |Out for delivery |
     Then Milestone Tag is Visible in search feild
     |Milestone1  |Milestone2   |Milestone3   	  |
     |Delivered   |In transit   |Out for delivery |
     
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Deletes Tags in Milestone feild and Verify if the Tags are Deleted
	 |Milestone1  |Milestone2   |Milestone3   	  |
     |Delivered   |In transit  |Out for delivery |
     And User Exlcudes search Tags in Milestone feild
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|
    
       
        
   	@tag3
    Scenario: User Perfroms advance with Multi Tagging accross all feilds
    When User Adds Multiple Tags in Sender feild
     |SenderTag1 |SenderTag2   |
     |Test1168   |DULUX AUSTRALIA - WELSHPOOL |
    And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|01-10-2017|
   	And User Searches Using Shipment Created date - Date To
   	|DateTo|
   	|01-03-2018|
    And User Adds Multiple Tags in Receiver feild
     |ReceiverTag1 |ReceiverTag2           |
     | Sender      |KOJONUP CO-OP LTD      |
    And User Adds Multiple Tags in Sender Surburb Location feilds
     |Suburb1   | Suburb2   |
     |Melbourne | Welshpool |
     And User Adds Multiple Tags in Receiver Surburb Location feilds
     |Suburb1           | Suburb2  |
     |Aspendale Gardens | Kojonup  |
      And User Adds Multiple Tags in Sender State Location feilds
     |State1   |  State2   |
     |VIC      | WA        |
     And User Adds Multiple Tags in Receiver State Location feilds
     |State1  | State2  |
     |VIC     | WA      |
     And User Adds Multiple Tags in Sender Postcode Location feilds
     |Postcode1   | Postcode2| 
     |3000        | 6106     |
      And User Adds Multiple Tags in Receiver Postcode Location feilds
     |Postcode1   | Postcode2| 
     |3195        | 6395     |
     And User Adds Multiple Tags in Toll Carrier feild
     |TollCarrier1            |TollCarrier2    |
     |Toll Priority(AU & NZ)     |Intermodal & Specialised    |
     And User Adds Multiple Tags in Service Type feild
     |ServiceType1  				         | ServiceType2   				   |
     |Toll Priority(AU & NZ)_Parcels - Off Peak |Intermodal & Specialised_General |
     And User Adds Multiple Tags in Milestone feild
     |Milestone1  |Milestone2         |
     |Out for delivery  |Shipment created   |
  	 Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|