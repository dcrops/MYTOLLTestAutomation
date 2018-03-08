@tag
Feature: MYT_2699 Select my Carrier and Account

  Background: 
    Given User is Registered in MyToll and user has full financial access

  @tag1
  Scenario: User wants to select my BU and my account
    When User selects below Toll carrier and the account that has full financial access
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |     137289          |
      Then The screen needs to display the name of the Carrier and the Account Number.
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |   137289            |
    When User selects below Toll carrier and the account that has full financial access
      | TollCarrier | AccountNumber |
      | Toll IPEC   |       3N7763 | 
       Then The screen needs to display the name of the Carrier and the Account Number.
      | TollCarrier | AccountNumber |
      | Toll IPEC   |       3N7763 | 
         When User selects below Toll carrier and the account that has full financial access
      | TollCarrier | AccountNumber |
      | Toll Priority (Aus)   |    200BHY | 
       Then The screen needs to display the name of the Carrier and the Account Number.
      | TollCarrier | AccountNumber |
      | Toll Priority (Aus)   |      200BHY | 

