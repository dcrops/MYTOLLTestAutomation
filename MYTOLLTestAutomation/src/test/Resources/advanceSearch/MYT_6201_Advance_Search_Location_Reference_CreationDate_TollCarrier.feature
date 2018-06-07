Feature: MYT-6201 Advance Search Using Receiver Location, Reference Number, Shipment Creation Date & Toll Carrier

  Background: 
    Given User is on the Advance Search Page

    @tag1 
    Scenario: User perfroms advance search using Receiver Location feild
    When User inputs search criteria in the Receiver Location feilds
     |Suburb    | State| Postcode| Country   |
     |Melbourne | VIC  | 3000    | AU        |  
     And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|01-11-2017|
   	And User Searches Using Shipment Created date - Date To
   	|DateTo|
   	|01-03-2018|  
	 Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|
     And User Adds Multiple Tags in Receiver Surburb Location feilds
     |Suburb1     | Suburb2    | Suburb3       |
     |WELSHPOOL  | Brendale  | Auburn   |
     Then Receiver Surburb Location Tag is Visible in search feild
     |Suburb1     | Suburb2    | Suburb3       |
     |WELSHPOOL  | Brendale  | Auburn   |
     And User Adds Multiple Tags in Receiver State Location feilds
     |State1   | State2| State3|
     |WA       | QLD   | NSW   |
     Then Receiver State Location Tag is Visible in search feild
     |State1   | State2| State3|
     |WA       | QLD   | NSW   |
     And User Adds Multiple Tags in Receiver Postcode Location feilds
     |Postcode1   | Postcode2| Postcode3|
     |6106        | 4500     | 2144    |
     Then Receiver Postcode Location Tag is Visible in search feild
     |Postcode1   | Postcode2| Postcode3|
     |6106        | 4500     | 2144    |
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags| 
     And User Deletes Tags in Receiver Surburb Location and Verify if the Tags are Deleted
     |Suburb1     | Suburb2    | Suburb3       |
     |WELSHPOOL  | Brendale  | Auburn   |
     And User Deletes Tags in Receiver State Location and Verify if the Tags are Deleted
     |State1   | State2| State3|
     |WA       | QLD   | NSW   |
     And User Deletes Tags in Receiver Postcode Location and Verify if the Tags are Deleted
     |Postcode1   | Postcode2| Postcode3|
     |6106        | 4500     | 2144    |
     Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags| 
	 And User Searches Using Shipment Created date - Date To
   	 |DateTo|
   	 |10-11-2017|
     And User Exlcudes search Tags in Receiver Location Feild
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|
	 Then User Closes the Browser
	 


#=============================================================================================
## The below code works but the test data isnt enough in the system to test countires
#     And User Adds Multiple Tags in Receiver Country Location feilds
#     |Country1   | Country2      | Country3  |
#     |New Zealand| Hong Kong     | Japan     |
#     Then Receiver Country Location Tag is Visible in search feild
#     |Country1   | Country2      | Country3  |
#     |New Zealand| Hong Kong     | Japan     |
#   	 Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags| 
#
#     And User Deletes Tags in Receiver Country Location and Verify if the Tags are Deleted
#  	 |Country1   | Country2      | Country3  |
#     |New Zealand| Hong Kong     | Japan     |
#     Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags|
#============================================================================================= 
 
    @tag2 
    Scenario: User perfroms advance search using Reference Number feild
    When User inputs search criteria in the Reference Number feild
   	 |RefNo|
   	 |4040064497|
   	And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|01-05-2018|
   	And User Searches Using Shipment Created date - Date To
   	|DateTo|
   	|31-05-2018| 
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|
     And User Adds Multiple Tags in Reference Number feild
     |RefNo1       | RefNo2         |RefNo3       |
     |4040087410   |6346780071      |MYTA105011   |
     Then Reference Number Tag is Visible in search feild
     |RefNo1       | RefNo2         |RefNo3      |
     |4040087410   |6346780071      |MYTA105011   |
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|
     And User Deletes Tags in Reference Number feild and Verify if the Tags are Deleted
     |RefNo1       | RefNo2         |RefNo3      |
     |4040087410   |6346780071      |MYTA105011   |
	 Then User Clicks Search and results are displayed
	Then User Closes the Browser
    
 
# Too many search results for the below. Needs to be done manually    
#...................................................................////

#    @tag3
#    Scenario: User perfroms advance search using Shipment Creation date feild
#    When User Searches Using Shipment Created date - Date Period
#   	 |DatePeriod|
#   	 |Last month|
#   	Then User Clicks Search and results are displayed
##     |Verify Search Results are reflected according to tags|
#   	And User Searches Using Shipment Created date - Date Period
#   	 |DatePeriod|
#   	 |Last week|
#   	Then User Clicks Search and results are displayed
##     |Verify Search Results are reflected according to tags|
#   	And User Searches Using Shipment Created date - Date Period
#   	 |DatePeriod|
#   	 |Last 3 months|
#   	Then User Clicks Search and results are displayed
##     |Verify Search Results are reflected according to tags|
#   	And User Searches Using Shipment Created date - Date From
#   	|DateFrom|
#   	|01-01-2018|
#   	And User Searches Using Shipment Created date - Date To
#   	|DateTo|
#   	|15-02-2018|
#   	Then User Clicks Search and results are displayed
##   |Verify Search Results are reflected according to tags|

#...................................................................////


   
    @tag4 
    Scenario: User perfroms advance search using Toll Carrier feild
    
     When User inputs search criteria in the Toll Carrier feild
   	 |TollCarrier|
   	 |Intermodal & Specialised|
   	 And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|01-03-2018|
   	And User Searches Using Shipment Created date - Date To
   	|DateTo|
   	|15-03-2018|
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Adds Multiple Tags in Toll Carrier feild
     |TollCarrier1  | TollCarrier2    |TollCarrier3   |
     |Toll IPEC     |Toll Tasmania    |Toll Priority(AU & NZ) |
     Then Toll Carrier Tag is Visible in search feild
     |TollCarrier1  | TollCarrier2    |TollCarrier3   |
     |Toll IPEC     |Toll Tasmania    |Toll Priority(AU & NZ) |
     
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Deletes Tags in Toll Carrier feild and Verify if the Tags are Deleted
	 |TollCarrier1  | TollCarrier2    |TollCarrier3   |
     |Toll IPEC     |Toll Tasmania    |Toll Priority(AU & NZ) |
      And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|01-03-2018|
   	And User Searches Using Shipment Created date - Date To
   	|DateTo|
   	|01-04-2018|
     And User Exlcudes search Tags in Toll Carrier feild
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|
    Then User Closes the Browser
    