Feature: MYT-6167, MYT-5951, MYT-6237, MYT-6222, MYT-5642 - Advance Search Using Toll Carrier TCHEM/TCL/TM/TE/FAST

  Background: 
    Given User is on the Advance Search Page

  
    @tag1
    Scenario: User perfroms advance search using Toll Carrier feild - Toll Mining Service
    When User inputs search criteria in the Toll Carrier feild
   	 |Toll Carrier|
   	 |Toll Mining Service|
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
    
    
    @tag2
    Scenario: User perfroms advance search using Toll Carrier feild - Toll Contract Logistics
    When User inputs search criteria in the Toll Carrier feild
   	 |Toll Carrier|
   	 |Toll Contract Logistics|
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
    
    
    @tag3
    Scenario: User perfroms advance search using Toll Carrier feild - TCHEM
    When User inputs search criteria in the Toll Carrier feild
   	 |Toll Carrier|
   	 |TCHEM|
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
   
   
   @tag4
    Scenario: User perfroms advance search using Toll Carrier feild - Toll FAST
    When User inputs search criteria in the Toll Carrier feild
   	 |Toll Carrier|
   	 |Toll FAST|
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
    
    
    @tag5
    Scenario: User perfroms advance search using Toll Carrier feild - Toll Energy
    When User inputs search criteria in the Toll Carrier feild
   	 |Toll Carrier|
   	 |Toll Energy|
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
    
    