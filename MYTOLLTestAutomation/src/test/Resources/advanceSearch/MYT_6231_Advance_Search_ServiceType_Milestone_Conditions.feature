Feature: MYT-6231 Advance Search Using Service Type, Milestone and with Condition (AND/OR)

  Background: 
    Given User is on the Advance Search Page
    
    
    @tag1
    Scenario: User perfroms advance search using Service Type feild
    When User inputs search criteria in the Service Type feild
   	 |ServiceType|
   	 |General|
    Then Search results are displayed
    |Verify Search Results|
    And User Create/Adds Tags in Service Type feild
    |ServiceTypeTag|
    |TagName  |
    Then Service Type Tag is Visible in search feild
    |ServiceTypeTag|
    |TagName  |
    And User Deletes Tags in Service Type feild
    |ServiceTypeTag|
    |TagName  |
    Then Service Type tag is is not availble in search feild as its been deleted
    |ServiceTypeTag|
    |TagName  |
    And User perfroms search with Multiple Tags
    |ServiceTypeTag1 |ServiceTypeTag2 |ServiceTypeTag3|
    |TagName    |TagName    |TagName   |
    Then Search results are reflexted according to tags
     |Verify Search Results|
    And User Exlcudes search Tags in Service Type and performs a search
   	Then Search results are displayed without tags
    |Verify Search Results|
    
    
    @tag2
    Scenario: User perfroms advance search using Milestone feild
    When User inputs search criteria in the Milestone feild
   	 |Milestone|
   	 |In Transit|
    Then Search results are displayed
    |Verify Search Results|
    And User Create/Adds Tags in Milestonee feild
    |MilestoneTag|
    |TagName  |
    Then Milestone Tag is Visible in search feild
    |MilestoneTag|
    |TagName  |
    And User Deletes Tags in Milestone feild
    |MilestoneTag|
    |TagName  |
    Then Milestone tag is is not availble in search feild as its been deleted
    |MilestoneTag|
    |TagName  |
    And User perfroms search with Multiple Tags
    |MilestoneTag1 |MilestoneTag2 |MilestoneTag3|
    |TagName    |TagName    |TagName   |
    Then Search results are reflexted according to tags
     |Verify Search Results|
    And User Exlcudes search Tags in Milestone and performs a search
   	Then Search results are displayed without tags
    |Verify Search Results|
    
    
    
   	@tag3
    Scenario: User Perfroms advance 
    When ?????
    |Scenario to be completed when application is available|
    