Feature: MYT-3719 Rate Enquiry - Contextual Help

  Background: 
    Given User is Registered in MyToll and is on Rate Enquiry Page

  @tag1
  Scenario: User has access to Contextual Help on the Rate Equiry Page
    When User Click Tool tip on Toll Carrier (BU)
    Then Contexual Help is Visible to the User
    |Message|
    |You can perform a rate enquiry against the accounts that you have Standard or Full Financial access to.|
    And User Click Tool tip on Service
    Then Contexual Help is Visible to the User
    |Message|
    |Not all Services are available for online rating. Please contact your local Toll office if the Service you are after is not available.|
	And User Click Tool tip on Account Number
    Then Contexual Help is Visible to the User
    |Message|
    |Displays a list accounts approved for your login. Your local Toll office can assist retrieving an account number if required.|
    And User Click Tool tip on Orgin surburb & postcode
    Then Contexual Help is Visible to the User
    |Message|
    |Start typing the Suburb or Postcode you are dispatching from and select it from the drop down entries.|
    And User Click Tool tip on Destination suburb & postcode
    Then Contexual Help is Visible to the User
    |Message|
    |Start typing the Suburb or Postcode you are dispatching to and select it from the drop down entries.|
    And User Click Tool tip on Enter item description
    Then Contexual Help is Visible to the User
    |Message|
    |Type the description of your items here. You can also use this field to select templates you have created for item entry. Just click the Save template box below once you have filled in your line details and it will be ready for you to use later.|
    