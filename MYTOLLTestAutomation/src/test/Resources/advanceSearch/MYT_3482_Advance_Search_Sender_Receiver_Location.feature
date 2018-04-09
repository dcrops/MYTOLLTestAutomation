Feature: MYT-3482 Advance Search Using Sender (Company / Name), Receiver (Company / Name) & Sender Location

  Background: 
    Given User is on the Advance Search Page
#    And User Searches Using Shipment Created date - Date From
#   	|DateFrom|
#   	|01-11-2017|
   	
    @tag1
    Scenario: User perfroms advance search using Sender (Company/Name) feild
    When User inputs search criteria in the Sender feild
   	 |Sender|
   	 |Automation|
   	And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|01-11-2017|
   	And User Searches Using Shipment Created date - Date To
   	|DateTo|
   	|01-03-2018|
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Adds Multiple Tags in Sender feild
     |SenderTag1                    |SenderTag2  |SenderTag3                   |
     |BRIDGESTONE AUST LTD (TYRES)  |AVN PVT LTD |DULUX AUSTRALIA - WELSHPOOL  |
     Then Sender Tag is Visible in search feild
     |SenderTag1                    |SenderTag2  |SenderTag3                   |
     |BRIDGESTONE AUST LTD (TYRES)  |AVN PVT LTD |DULUX AUSTRALIA - WELSHPOOL  |
     
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Deletes Tags in Sender feild and Verify if the Tags are Deleted
     |SenderTag1                    |SenderTag2  |SenderTag3                   |
     |BRIDGESTONE AUST LTD (TYRES)  |AVN PVT LTD |DULUX AUSTRALIA - WELSHPOOL  |
    And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|15-02-2018|
     And User Exlcudes search Tags in Sender feild
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|



    @tag2
    Scenario: User perfroms advance search using Receiver (Company/Name) feild
    When User inputs search criteria in the Receiver feild
   	 |Receiver|
   	 |abccompany|
   	And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|01-11-2017|
   	And User Searches Using Shipment Created date - Date To
   	|DateTo|
   	|01-03-2018|
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Adds Multiple Tags in Receiver feild
     |ReceiverTag1 |ReceiverTag2  |ReceiverTag3|
     |NZ Address   |ATOM SUPPLIES |3D INSPIRATIONS  |
     Then Receiver Tag is Visible in search feild
     |ReceiverTag1 |ReceiverTag2  |ReceiverTag3|
     |NZ Address   |ATOM SUPPLIES |3D INSPIRATIONS  |
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Deletes Tags in Receiver feild and Verify if the Tags are Deleted
     |ReceiverTag1 |ReceiverTag2  |ReceiverTag3|
     |NZ Address   |ATOM SUPPLIES |3D INSPIRATIONS  |
     And User Searches Using Shipment Created date - Date From
   	 |DateFrom|
   	 |10-01-2018|
   	 And User Searches Using Shipment Created date - Date To
   	 |DateTo|
   	 |15-01-2018|
     And User Exlcudes search Tags in Receiver feild
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|

   

  @tag3
  Scenario: User perfroms advance search using Sender Location feild
  When User inputs search criteria in the Sender Location feilds
     |Suburb    | State| Postcode| Country   |
     |Melbourne | VIC  | 3000    | AU|
    And User Searches Using Shipment Created date - Date From
   	|DateFrom|
   	|01-02-2018|
   	And User Searches Using Shipment Created date - Date To
   	|DateTo|
   	|01-03-2018|
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|

     And User Adds Multiple Tags in Sender Surburb Location feilds
     |Suburb1    | Suburb2          | Suburb3|
     |WELSHPOOL  | Burleigh Waters  | Belmore |
     Then Sender Surburb Location Tag is Visible in search feild
     |Suburb1    | Suburb2          | Suburb3|
     |WELSHPOOL  | Burleigh Waters  | Belmore |
     And User Adds Multiple Tags in Sender State Location feilds
     |State1   | State2| State3|
     |WA       | QLD   | NSW   |
     Then Sender State Location Tag is Visible in search feild
     |State1   | State2| State3|
     |WA       | QLD   | NSW   |
     And User Adds Multiple Tags in Sender Postcode Location feilds
     |Postcode1   | Postcode2| Postcode3|
     |6106        | 4220     | 2192     |
     Then Sender Postcode Location Tag is Visible in search feild
     |Postcode1   | Postcode2| Postcode3|
     |6106        | 4220     | 2192     |
     Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags| 
     And User Deletes Tags in Sender Surburb Location and Verify if the Tags are Deleted
	 |Suburb1    | Suburb2          | Suburb3|
     |WELSHPOOL  | Burleigh Waters  | Belmore |
     And User Deletes Tags in Sender State Location and Verify if the Tags are Deleted
     |State1   | State2| State3|
     |WA       | QLD   | NSW   |
     And User Deletes Tags in Sender Postcode Location and Verify if the Tags are Deleted
     |Postcode1   | Postcode2| Postcode3|
     |6106        | 4220     | 2192     |
     Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags| 
     And User Exlcudes search Tags in Sender Location Feild
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|


 
     
# The below code works but the test data isnt enough in the system to test countires

#     And User Adds Multiple Tags in Sender Country Location feilds
#     |Country1   | Country2      | Country3  |
#     |New Zealand| Hong Kong     | Japan     |
#     Then Sender Country Location Tag is Visible in search feild
#     |Country1   | Country2      | Country3  |
#     |New Zealand| Hong Kong     | Japan     |
#   	 Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags| 
#
#     And User Deletes Tags in Sender Country Location and Verify if the Tags are Deleted
#  	 |Country1   | Country2      | Country3  |
#     |New Zealand| Hong Kong     | Japan     |
#     Then User Clicks Search and results are displayed
##    |Verify Search Results are reflected according to tags|

     