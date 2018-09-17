Feature: MYT-5885 User needs to Edit Sender Address from 'Book a pickup' page

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page
    
 @tag1
  Scenario: User Edit Sender Address in Toll Intermodal Specialised from 'Book a pickup' page
    When User selects Toll Carrier and Account Number
      | TollCarrier   | AccountNumber |
      | Intermodal & Specialised |       371065 |
    And User add Address for the sender in TDF
      | CompanyName | AddressLine1       | AddressLine2 | Suburb    | SuburbItem               | Postcode | State |
      | AccessHQ    | 60, Collins Street | CDE          | Melbourne | 3000, MELBOURNE, VIC, AU |     1024 | VIC   |
    And User selects a existing Sender address from the Sender field
      | Sender   |
      | AccessHQ |
    And User Press Edit Sender button
    Then User be able to EDIT the address using Edit button
      | Heading      |
      | Edit Address |
    And User Edit the address entering new sender details
      | CompanyName    | Name         | Email                       | PhoneNumber | AddressLine1         | AddressLine2  |
      | Toll Group Inc2 | John William | NNAutomationuser1@gmail.com |   412367897 | 352, Wellington Road | Mulgrave, VIC |
    And User can see a text as edit their full address via the My profile section
      | TextEditFullAddress                         |
      | Please click here to edit your full address |
    When User Press Save
    Then Message displays as Address able to saved
      | Message                    |
      | Address saved successfully |
    Then User able to see modified address in MY Contacts in My Profile
      | CompanyName    | Name         | Email                       | CountryCode | PhoneNumber | AddressLine1         |
      | Toll Group Inc2 | John William | NNAutomationuser1@gmail.com | 61-         |   412367897 | 352, Wellington Road |
      Then User Closes the Browser 

  @tag2
  Scenario: User Edit Sender Address in Toll Priority (AUS) from 'Book a pickup' page
    When User selects Toll Carrier and Account Number
      | TollCarrier         | AccountNumber |
      | Toll Priority (Aus) | 200BHY        |
    And User add Address for the sender in TGX
      | CompanyName | Country     | AddressLine1        | AddressLine2 | Suburb   | Postcode | Email                       | PhoneNumber | Phone Country |
      | NZ Post Ltd | NEW ZEALAND | 445 Mount Eden Road | Mount Eden   | AUCKLAND |     1024 | NNAutomationuser1@gmail.com |   800300400 | New Zealand   |
    And User selects a existing Sender address from the Sender field
      | Sender      |
      | NZ Post Ltd |
    And User Press Edit Sender button
    Then User be able to EDIT the address using Edit button
      | Heading      |
      | Edit Address |
    And User Edit the address entering new sender details
      | CompanyName        | Name         | Email                       | PhoneNumber | AddressLine1 | AddressLine2  |
      | Genesis Energy Ltd | John William | NNAutomationuser2@gmail.com |   800300400 | 94 Bryce St  | Hamilton 3204 |
    And User can see a text as edit their full address via the My profile section
      | TextEditFullAddress                         |
      | Please click here to edit your full address |
    When User Press Save
    Then Message displays as Address able to saved
      | Message                    |
      | Address saved successfully |
    Then User able to see modified address in MY Contacts in My Profile
      | CompanyName        | Name         | Email                       | CountryCode | PhoneNumber | AddressLine1 |
      | Genesis Energy Ltd | John William | NNAutomationuser2@gmail.com | 64-         |   800300400 | 94 Bryce St  |
	 Then User Closes the Browser 