Feature: MYT_6080 My Orders - List Orders that I have submitted previously

  Background: 
    Given MyToll Toll Priority AU User logged in and has a Toll Priority AU Standard / Full Financial account and Stationery function is enabled

#Once bugs MYT-9478 and 9479 are closed, update this test to include creating a new order and verifying the details with the created order
  Scenario: User wants to see a list of previous Stationery orders user has submitted
    When User clicks on the mega menu
    And User clicks My Orders 
		Then User must see My Orders page
		And user must be able to view the orders on My Orders page
		When User clicks on an Order that appears in the list
		Then User will be able to view the details of the Order 
		Then User must be able to print