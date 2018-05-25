@tag
Feature: MYT_2698 Select Financials

  Background: 
    Given User is Registered in MyToll

  @tag1 @Shakeout
  Scenario: User has full financial access and wants to select Account Summary or My Financials
    When User selects Financials or Accounts summary
    Then User be able to see My Invoice details
      | ScreenHeading |
      | MY INVOICES   |
     Then User must see the Accounts Summary screen displaying
      | TollCarrierLabel | AccountNumberLabel |SerachTypeLabel|
      | Toll carrier  |       Account number |Search type|
      Then User Closes the Browser

#  Commented  by Sheyan
#@tag3
#  Scenario: User doesn't have full financial access and not be able to select Financials or Accounts summary
#    When User doesn't have full financial access to at least one account
#    |AccessType|
#    |Standard|
#    Then User must not be able to select Financials or Accounts summary
#    |Message|
#    |Your account is not authorised to access this function. Please update your Account Settings|
#    And User must not be able to view invoice details for any account
