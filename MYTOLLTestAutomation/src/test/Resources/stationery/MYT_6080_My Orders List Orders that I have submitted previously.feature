
Feature: MYT_6080 My Orders - List Orders that I have submitted previously

  Background: 
    Given MyToll Toll Priority AU User logged in and has a Toll Priority AU Standard / Full Financial account and Stationery function is enabled

  Scenario: User wants to see a list of previous Stationery orders user has submitted
    When User clicks on the mega menu
    When User clicks My Orders 
		Then User must see My Orders page
		Then user can sorts the orders
		When User clicks on an Order that appears in the list
		Then User will be able to view the details of the Order 
		Then User must be able to print