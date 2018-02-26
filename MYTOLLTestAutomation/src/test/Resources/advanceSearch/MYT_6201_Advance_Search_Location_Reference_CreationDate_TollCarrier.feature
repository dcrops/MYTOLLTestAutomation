Feature: MYT-6201 Advance Search Using Receiver Location, Reference Number, Shipment Creation Date & Toll Carrier

  Background: 
    Given User is on the Advance Search Page

#    @tag1
#    Scenario: User perfroms advance search using Receiver Location feild
#    When User inputs search criteria in the Receiver Location feilds
#     |Suburb    | State| Postcode| Country   |
#     |Melbourne | VIC  | 3000    | Australia|
#	 Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags|
#     
#     And User Adds Multiple Tags in Receiver Surburb Location feilds
#     |Suburb1   | Suburb2| Suburb3|
#     |MULGRAVE  | Sydney | NEWTON |
#     Then Receiver Surburb Location Tag is Visible in search feild
#     |Suburb1   | Suburb2| Suburb3|
#     |MULGRAVE  | Sydney | NEWTON |
#     Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags| 
#
#     And User Deletes Tags in Receiver Surburb Location and Verify if the Tags are Deleted
#  	  |Suburb1   | Suburb2| Suburb3|
#     |MULGRAVE  | Sydney | NEWTON |
#     Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags|
#    
#     And User Adds Multiple Tags in Receiver State Location feilds
#     |State1   | State2| State3|
#     |NSW      | ATC   | SA    |
#     Then Receiver State Location Tag is Visible in search feild
#     |State1   | State2| State3|
#     |NSW      | ATC   | SA    |
#   	 Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags| 
#
#     And User Deletes Tags in Receiver State Location and Verify if the Tags are Deleted
#  	 |State1   | State2| State3|
#     |NSW      | ATC   | SA    |
#     Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags|
#     
#     And User Adds Multiple Tags in Receiver Postcode Location feilds
#     |Postcode1   | Postcode2| Postcode3|
#     |3170        | 7000     | 2000     |
#     Then Receiver Postcode Location Tag is Visible in search feild
#     |Postcode1   | Postcode2| Postcode3|
#     |3170        | 7000     | 2000     |
#   	 Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags| 
#
#     And User Deletes Tags in Receiver Postcode Location and Verify if the Tags are Deleted
#  	 |Postcode1   | Postcode2| Postcode3|
#     |3170        | 7000     | 2000     |
#     Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags|
#
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
#
#     And User Exlcudes search Tags in Receiver Location Feild
#	 Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags|
#    
    
    @tag2
    Scenario: User perfroms advance search using Reference Number feild
    When User inputs search criteria in the Reference Number feild
   	 |RefNo|
   	 |Test|
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Adds Multiple Tags in Reference Number feild
     |RefNo1  | RefNo2    |RefNo3   |
     |12342   |13334      |TNQX123  |
     Then Reference Number Tag is Visible in search feild
     |RefNo1  | RefNo2    |RefNo3   |
     |12342   |13334      |TNQX123  |
     
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Deletes Tags in Reference Number feild and Verify if the Tags are Deleted
	 |RefNo1  | RefNo2    |RefNo3   |
     |12342   |13334      |TNQX123  |
	 Then User Clicks Search and results are displayed

#    
#    
#    @tag3
#    Scenario: User perfroms advance search using Shipment Creation date feild
#    When User sets Pre Selected Date Period the below will be visbile for Selection
#   	 |Today| Yesterday| Last 3 Days| Last Week| Last Month| Last 3 Months|
#   	 |Today| Yesterday| Last 3 Days| Last Week| Last Month| Last 3 Months|
#    And User selects Data Range under Shipment creation date
#    |Calendar Select Functionality is Visible|
#    
#   |"RECHECK THIS SCENARIO WHEN THE APPLICATION IS AVAILBLE - AC70-75a"|
#   
#   
#   
#   
#    @tag4
#    Scenario: User perfroms advance search using Toll Carrier feild
#    When User inputs search criteria in the Toll Carrier feild
#   	 |Toll Carrier|
#   	 |Toll IPEC|
#    Then Search results are displayed
#    |Verify Search Results|
#    And User Create/Adds Tags in Toll Carrier feild
#    |TollCarrierTag|
#    |TagName  |
#    Then Toll Carrier Tag is Visible in search feild
#    |TollCarrierTag|
#    |TagName  |
#    And User Deletes Tags in Toll Carrier feild
#    |TollCarrierTag|
#    |TagName  |
#    Then Toll Carrier tag is is not availble in search feild as its been deleted
#    |TollCarrierTag|
#    |TagName  |
#    And User perfroms search with Multiple Tags
#    |TollCarrierTag1 |TollCarrierTag2 |TollCarrierTag3|
#    |TagName    |TagName    |TagName   |
#    Then Search results are reflexted according to tags
#     |Verify Search Results|
#    And User Exlcudes search Tags in Toll Carrier and performs a search
#   	Then Search results are displayed without tags
#    |Verify Search Results|
#   
#   
#    
#    