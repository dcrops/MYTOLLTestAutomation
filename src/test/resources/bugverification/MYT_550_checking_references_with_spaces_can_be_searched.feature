Feature: MYT-550 Checking_references_with_spaces_can_be_searched
	Background: 
    Given User is Registered in MyToll and is on Dashboard
    
    @tag1
	Scenario: User checks if the references with spaces can be searched in the Track and Trace
	
	When user searches for following reference number
	|Enter shipment number or references|
	|8501508967 ccc|
	
	Then user is able to see the following shipment number
	|Enter shipment number or references|
	|8501508967 ccc|
	
	When user searches for following reference number
	|Enter shipment number or references|
	|Aaa bbb|
	
	Then user is able to see the following shipment number
	|Enter shipment number or references|
	|Aaa bbb|
