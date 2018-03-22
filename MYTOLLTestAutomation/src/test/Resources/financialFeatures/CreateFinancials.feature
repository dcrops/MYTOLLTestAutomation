Feature: MYT_2698 Select Financials

  Background: 
    Given User is Registered in MyToll

  @tag1
  Scenario: User has full financial access and wants to select Account Summary or My Financials
     Then User must see the Accounts Summary screen displaying
      | TollCarrierLabel | AccountNumberLabel |SerachTypeLabel|
      | Toll carrier  |       Account number |Search type|
      