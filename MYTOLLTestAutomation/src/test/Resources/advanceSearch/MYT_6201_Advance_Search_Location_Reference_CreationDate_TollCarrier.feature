Feature: MYT-6201 Advance Search Using Receiver Location, Reference Number, Shipment Creation Date & Toll Carrier

  Background: 
    Given User is on the Advance Search Page

    @tag1
    Scenario: User perfroms advance search using Receiver Location feild
    When User inputs search criteria in the Receiver Location feild
   	 |Location|
   	 |Location|
    Then Search results are displayed
    |Verify Search Results|
    And User Deletes Tags in Receiver Location feild
    |LocationTag|
    |TagName  |
    Then Receiver tag is is not availble in search feild as its been deleted
    |LocationTag|
    |TagName  |
    And User perfroms search with Multiple Tags
    |LocationTag1 |LocationTag2 |LocationTag3|
    |TagName    |TagName    |TagName   |
    Then Search results are reflexted according to tags
    |Verify Search Results|
    And User Exlcudes search Tags in Receiver Location and performs a search
   	Then Search results are displayed without tags
    |Verify Search Results|
    And User Clicks View additional/options data filters
    Then User verfies additional tag feilds when expanded
    |Suburb    | State| Postcode| County   |
    |Melbourne | VIC  | 3000    | Australia|
    And User Create/Adds Tags in additional tag feild
   	|SuburbTag | StateTag| PostcodeTag| CountyTag|
    |Melbourne | VIC     | 3000       | Australia|
    Then Additional tags are Visible in search feild
    |SuburbTag | StateTag| PostcodeTag| CountyTag|
    |Melbourne | VIC     | 3000       | Australia|
    And User Click search with additional tags
    Then Search results are reflexted according to tags
    |Verify Search Results|
    And User Deletes Tags in additional tag feild
    |SuburbTag | StateTag| PostcodeTag| CountyTag|
    |Melbourne | VIC     | 3000       | Australia|
    Then Additional tag are not availble in search feild as its been deleted
    |SuburbTag | StateTag| PostcodeTag| CountyTag|
    |Melbourne | VIC     | 3000       | Australia|
    
    
    @tag2
    Scenario: User perfroms advance search using Reference Number feild
    When User inputs search criteria in the Reference Number feild
   	 |ReferenceNumber|
   	 |Reference Number|
    Then Search results are displayed
    |Verify Search Results|
    And User Create/Adds Tags in Reference Number feild
    |ReferenceNumberTag|
    |TagName  |
    Then Reference Number Tag is Visible in search feild
    |ReferenceNumberTag|
    |TagName  |
    And User Deletes Tags in Reference Number feild
    |ReferenceNumberTag|
    |TagName  |
    Then Reference Number tag is is not availble in search feild as its been deleted
    |ReferenceNumberTag|
    |TagName  |
    And User perfroms search with Multiple Tags
    |ReferenceNumberTag1 |ReferenceNumberrTag2 |ReferenceNumberTag3|
    |TagName    |TagName    |TagName   |
    Then Search results are reflexted according to tags
     |Verify Search Results|
    And User Exlcudes search Tags in Reference Number and performs a search
   	Then Search results are displayed without tags
    |Verify Search Results|
    
    
    
    
    @tag3
    Scenario: User perfroms advance search using Shipment Creation date feild
    When User sets Pre Selected Date Period the below will be visbile for Selection
   	 |Today| Yesterday| Last 3 Days| Last Week| Last Month| Last 3 Months|
   	 |Today| Yesterday| Last 3 Days| Last Week| Last Month| Last 3 Months|
    And User selects Data Range under Shipment creation date
    |Calendar Select Functionality is Visible|
    
   |"RECHECK THIS SCENARIO WHEN THE APPLICATION IS AVAILBLE - AC70-75a"|
   
   
   
   
    @tag4
    Scenario: User perfroms advance search using Toll Carrier feild
    When User inputs search criteria in the Toll Carrier feild
   	 |Toll Carrier|
   	 |Toll IPEC|
    Then Search results are displayed
    |Verify Search Results|
    And User Create/Adds Tags in Toll Carrier feild
    |TollCarrierTag|
    |TagName  |
    Then Toll Carrier Tag is Visible in search feild
    |TollCarrierTag|
    |TagName  |
    And User Deletes Tags in Toll Carrier feild
    |TollCarrierTag|
    |TagName  |
    Then Toll Carrier tag is is not availble in search feild as its been deleted
    |TollCarrierTag|
    |TagName  |
    And User perfroms search with Multiple Tags
    |TollCarrierTag1 |TollCarrierTag2 |TollCarrierTag3|
    |TagName    |TagName    |TagName   |
    Then Search results are reflexted according to tags
     |Verify Search Results|
    And User Exlcudes search Tags in Toll Carrier and performs a search
   	Then Search results are displayed without tags
    |Verify Search Results|
   
   
    
    