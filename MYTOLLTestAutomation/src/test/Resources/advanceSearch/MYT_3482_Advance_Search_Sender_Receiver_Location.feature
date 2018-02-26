Feature: MYT-3482 Advance Search Using Sender (Company / Name), Receiver (Company / Name) & Sender Location

  Background: 
    Given User is on the Advance Search Page

    @tag1
    Scenario: User perfroms advance search using Sender (Company/Name) feild
    When User inputs search criteria in the Sender feild
   	 |Sender|
   	 |Test|
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Adds Multiple Tags in Sender feild
     |SenderTag1 |SenderTag2 |SenderTag3|
     |Test123    |Auto       |Tag123  |
     Then Sender Tag is Visible in search feild
     |SenderTag1 |SenderTag2 |SenderTag3|
     |Test123    |Auto       |Tag123  |
     
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Deletes Tags in Sender feild and Verify if the Tags are Deleted
	 |SenderTag1 |SenderTag2 |SenderTag3|
     |Test123    |Auto       |Tag123  |
     And User Exlcudes search Tags in Sender feild
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|



    @tag2
    Scenario: User perfroms advance search using Receiver (Company/Name) feild
    When User inputs search criteria in the Receiver feild
   	 |Receiver|
   	 |Test|
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Adds Multiple Tags in Receiver feild
     |ReceiverTag1 |ReceiverTag2 |ReceiverTag3|
     |Test123    |Auto       |Tag123  |
     Then Receiver Tag is Visible in search feild
     |ReceiverTag1 |ReceiverTag2 |ReceiverTag3|
     |Test123    |Auto       |Tag123  |
     
     Then User Clicks Search and results are displayed
#     |Verify Search Results are reflected according to tags|

     And User Deletes Tags in Receiver feild and Verify if the Tags are Deleted
	 |ReceiverTag1 |ReceiverTag2 |ReceiverTag3|
     |Test123    |Auto       |Tag123  |
     And User Exlcudes search Tags in Receiver feild
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|

   

  @tag3
  Scenario: User perfroms advance search using Sender Location feild
  When User inputs search criteria in the Sender Location feilds
     |Suburb    | State| Postcode| Country   |
     |Melbourne | VIC  | 3000    | Australia|
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|
     
     And User Adds Multiple Tags in Sender Surburb Location feilds
     |Suburb1   | Suburb2| Suburb3|
     |MULGRAVE  | Sydney | NEWTON |
     Then Sender Surburb Location Tag is Visible in search feild
     |Suburb1   | Suburb2| Suburb3|
     |MULGRAVE  | Sydney | NEWTON |
     Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags| 

     And User Deletes Tags in Sender Surburb Location and Verify if the Tags are Deleted
  	  |Suburb1   | Suburb2| Suburb3|
     |MULGRAVE  | Sydney | NEWTON |
     Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|
    
     And User Adds Multiple Tags in Sender State Location feilds
     |State1   | State2| State3|
     |NSW      | ATC   | SA    |
     Then Sender State Location Tag is Visible in search feild
     |State1   | State2| State3|
     |NSW      | ATC   | SA    |
   	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags| 

     And User Deletes Tags in Sender State Location and Verify if the Tags are Deleted
  	 |State1   | State2| State3|
     |NSW      | ATC   | SA    |
     Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|
     
     And User Adds Multiple Tags in Sender Postcode Location feilds
     |Postcode1   | Postcode2| Postcode3|
     |3170        | 7000     | 2000     |
     Then Sender Postcode Location Tag is Visible in search feild
     |Postcode1   | Postcode2| Postcode3|
     |3170        | 7000     | 2000     |
   	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags| 

     And User Deletes Tags in Sender Postcode Location and Verify if the Tags are Deleted
  	 |Postcode1   | Postcode2| Postcode3|
     |3170        | 7000     | 2000     |
     Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|

     And User Adds Multiple Tags in Sender Country Location feilds
     |Country1   | Country2      | Country3  |
     |New Zealand| Hong Kong     | Japan     |
     Then Sender Country Location Tag is Visible in search feild
     |Country1   | Country2      | Country3  |
     |New Zealand| Hong Kong     | Japan     |
   	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags| 

     And User Deletes Tags in Sender Country Location and Verify if the Tags are Deleted
  	 |Country1   | Country2      | Country3  |
     |New Zealand| Hong Kong     | Japan     |
     Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|

     And User Exlcudes search Tags in Sender Location Feild
	 Then User Clicks Search and results are displayed
#    |Verify Search Results are reflected according to tags|
     