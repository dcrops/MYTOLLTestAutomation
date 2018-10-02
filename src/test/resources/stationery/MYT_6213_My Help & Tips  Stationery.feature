
Feature: MYT_6213 My Help & Tips Stationery

  Background: 
    Given MyToll Toll Priority AU User logged in 
    
  Scenario: User wants to be able to view Help information regarding Stationery
    When User clicks on My Help & Tips
		Then User must see Stationery section on the left hand side
		When User clicks on Stationery section
		Then User must be seen the content
