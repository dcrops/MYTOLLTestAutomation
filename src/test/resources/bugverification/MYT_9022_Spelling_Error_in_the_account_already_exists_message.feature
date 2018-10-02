Feature: MYT-9022 Spelling_Error_in_the_account_already_exists_message

Background: 
    Given User is Registered in MyToll and is on My Accounts Page

    Scenario: Spelling Error in the account already exists message
	
	When user clicks on Add Account button
	Then Add Account window opens up
		
   When user tries to add an already existing account number
    
    Then an error message shows up
    