Feature: MYT-5885 User needs to Edit Sender Address from 'Book a pickup' page

Background:
		Given User is Registered in MyToll and is on Book a pickup page

  Scenario: User Edit Sender Address in Toll Intermodal Specialised from 'Book a pickup' page
    
    When User selects Toll Carrier as TollTasmania and select Account Number
      | TollCarrier   | AccountNumber |
      | Toll Intermodal Specialised |        371065 |
        And User add Address for the sender
      | CompanyName | Country     | AddressLine1        | AddressLine2 | Suburb   | Postcode | Email                       |
      | NZ Post     | NEW ZEALAND | 445 Mount Eden Road | Mount Eden   | Auckland |     1024 | NNAutomationuser1@gmail.com |
    And User selects a existing Sender address from the Sender field
      | Sender   |
      | AccessHQ |
    And User Press Edit button
    Then User be able to EDIT the Sender address using Edit button
    |Heading|
    |Edit Address|
    And User Edit the address entering new sender details
      | CompanyName    | Name         | PhoneNumber | AddressLine1         | AddressLine2  |
      | Toll Group Inc | John William |  412367897 | 352, Wellington Road | Mulgrave, VIC |
    And User Delete the email address
    When User Press Save
    Then Message displays as Address unable to save
      | Message                    |
      | Unable to save the address |
    When user enter email address
      | Email              |
      | john@tollgroup.com |
    And User can see a text as edit their full address via the My profile section
    When User Press Save
    Then Message displays as Address able to saved
      | Message                       |
      | The address saved sucessfully |
    Then User able to see modified address in MY Contacts in My Profile
