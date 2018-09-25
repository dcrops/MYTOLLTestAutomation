Feature: MYT-8447 Checking that error messages are not displayed 
	Background: 
    Given User has logged in and is on the Home page
    
    @tag1
	Scenario: User wants to make sure that error messages are not displayed after hitting the tab button
	
	When User clicks on Hamburger menu
	
	Then user can see and click on the My contact menu option
	
	When user clicks on add contact link
	
	Then add contact modal box is displayed
	
	When user selects a country
	
	
	And user enters a valid address
	
	
	And clicks on continue button
	
	
	Then Add contact form is displayed
	
	
	When user enters the address and leaves company name empty
	
	
	And user clicks on add contact button
	
	
	Then error messages are displayed
	
	
	When user enters the company name
	
	
	And clicks inside the name field
	
	
	Then error message is not displayed 
	
	