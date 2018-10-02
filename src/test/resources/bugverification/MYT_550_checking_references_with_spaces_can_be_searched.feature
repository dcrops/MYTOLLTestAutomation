Feature: MYT-550 Checking_references_with_spaces_can_be_searched
	Background: 
    Given User is Registered in MyToll and is on Dashboard
    
    @tag1
	Scenario: User checks if the references with spaces can be searched in the Track and Trace
	
	When user searches for following reference number
	|Enter shipment number or references|
	|1 h tam|
	
	Then user is able to see the following shipment number
	|Enter shipment number or references|
	|1 h tam|
	
	When user searches for following reference number
	|Enter shipment number or references|
	|Stech 1 bag 2 of 2 forrest 1 2 soil x19|
	
	Then user is able to see the following shipment number
	|Enter shipment number or references|
	|Stech 1 bag 2 of 2 forrest 1 2 soil x19|
	
	When user searches for following reference number
	|Enter shipment number or references|
	|Tracey t 3|
	
	Then user is able to see the following shipment number
	|Enter shipment number or references|
	|Tracey t 3|