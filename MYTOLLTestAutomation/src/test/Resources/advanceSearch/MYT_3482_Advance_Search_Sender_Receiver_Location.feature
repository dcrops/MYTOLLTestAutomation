Feature: MYT-3482 Advance Search Using Sender (Company / Name), Receiver (Company / Name) & Sender Location

  Background: 
    Given User is on the Advance Search Page

    @tag1
    Scenario: User perfroms advance search using Sender (Company/Name) feild
    When User inputs search criteria in the Sender feild
   	 |Sender|
   	 |Test|
#     Then User Clicks Search and results are displayed
#     |Verify Search Results|
     And User Adds new Tags in Sender feild
     |SenderTag1 |SenderTag2 |SenderTag3|
     |Test123    |Auto       |Tag123  |
#    Then Sender Tag is Visible in search feild
#    |SenderTag|
#    |TagName  |
#    And User Deletes Tags in Sender (Company/Name) feild
#    |SenderTag|
#    |TagName  |
#    Then Sender tag is is not availble in search feild as its been deleted
#    |SenderTag|
#    |TagName  |
#    And User perfroms search with Multiple Tags
#    |SenderTag1 |SenderTag2 |SenderTag3|
#    |TagName    |TagName    |TagName   |
#    Then Search results are reflexted according to tags
#     |Verify Search Results|
#    And User Exlcudes search Tags in Sender (Company/Name) and performs a search
#   	Then Search results are displayed without tags
#    |Verify Search Results|
#    
#    
#    @tag2
#    Scenario: User perfroms advance search using Receiver (Company/Name) feild
#    When User inputs search criteria in the Receiver (Company/Name) feild
#   	|Company/Name|
#   	|Company/Name|
#    Then Search results are displayed
#    |Verify Search Results|
#    And User Create/Adds Tags in Receiver (Company/Name) feild
#    |ReceiverTag|
#    |TagName  |
#    Then Receiver Tag is Visible in search feild
#    |ReceiverTag|
#    |TagName  |
#    And User Deletes Tags in Receiver (Company/Name) feild
#    |SenderTag|
#    |TagName  |
#    Then Receiver tag is is not availble in search feild as its been deleted
#    |ReceiverTag|
#    |TagName  |
#    And User perfroms search with Multiple Tags
#    |ReceiverTag1 |ReceiverTag2 |ReceiverTag3|
#    |TagName    |TagName    |TagName   |
#    Then Search results are reflexted according to tags
#     |Verify Search Results|
#    And User Exlcudes search Tags in Receiver (Company/Name) and performs a search
#   	Then Search results are displayed without tags
#    |Verify Search Results|
#    
#    
#    @tag3
#    Scenario: User perfroms advance search using Sender Location feild
#    When User inputs search criteria in the Sender Location feild
#   	 |Location|
#   	 |Location|
#    Then Search results are displayed
#    |Verify Search Results|
#    And User Deletes Tags in Sender Location feild
#    |LocationTag|
#    |TagName  |
#    Then Sender tag is is not availble in search feild as its been deleted
#    |LocationTag|
#    |TagName  |
#    And User perfroms search with Multiple Tags
#    |LocationTag1 |LocationTag2 |LocationTag3|
#    |TagName    |TagName    |TagName   |
#    Then Search results are reflexted according to tags
#    |Verify Search Results|
#    And User Exlcudes search Tags in Sender Location and performs a search
#   	Then Search results are displayed without tags
#    |Verify Search Results|
#    And User Clicks View additional/options data filters
#    Then User verfies additional tag feilds when expanded
#    |Suburb    | State| Postcode| County   |
#    |Melbourne | VIC  | 3000    | Australia|
#    And User Create/Adds Tags in additional tag feild
#   	|SuburbTag | StateTag| PostcodeTag| CountyTag|
#    |Melbourne | VIC     | 3000       | Australia|
#    Then Additional tags are Visible in search feild
#    |SuburbTag | StateTag| PostcodeTag| CountyTag|
#    |Melbourne | VIC     | 3000       | Australia|
#    And User Click search with additional tags
#    Then Search results are reflexted according to tags
#    |Verify Search Results|
#    And User Deletes Tags in additional tag feild
#    |SuburbTag | StateTag| PostcodeTag| CountyTag|
#    |Melbourne | VIC     | 3000       | Australia|
#    Then Additional tag are not availble in search feild as its been deleted
#    |SuburbTag | StateTag| PostcodeTag| CountyTag|
#    |Melbourne | VIC     | 3000       | Australia|
    
    