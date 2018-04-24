Feature: MYT-5392 Enter the address for my pick up - Extended Features

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  Scenario: User Add Suburb and Postcode for Sender Address in Toll Tasmania from 'Book a pickup' page
    When User selects Toll Carrier and Account Number
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |        371065 |
    When User selects NO I am located at the pick up location option
    And User be able to add Suburb with string max 40 and Postcode with 4 Strings for Sender Address
      | CompanyName | AddressLine1       | AddressLine2 | Suburb                                   | SuburbItem               | Postcode | State |
      | AccessHQ    | 60, Collins Street | CDE          | H012345678901234567890123456789012345678 | 3000, MELBOURNE, VIC, AU |     7001 | VIC   |
    And User be able to add Suburb and Postcode for Sender Address
      | CompanyName | AddressLine1       | AddressLine2 | Suburb    | SuburbItem               | Postcode | State |
      | AccessHQ    | 60, Collins Street | CDE          | Melbourne | 3000, MELBOURNE, VIC, AU |     1024 | VIC   |
    Then User able to see modified address in MY Contacts in My Profile
      | CompanyName | Name         | Email                       | CountryCode | PhoneNumber | AddressLine1       |
      | AccessHQ    | John William | NNAutomationuser1@gmail.com | 61-         |  0452456876 | 60, Collins Street |

  Scenario: User Add Suburb,Postcode,Contact Email, and Description of goods for Sender Address in Toll IPEC from 'Book a pickup' page
		 When User selects Toll Carrier and Account Number
      | TollCarrier        | AccountNumber |
      | Toll Priority (NZ) |        100181 |
    When User selects NO I am located at the pick up location option
     And User add Address for the sender in TGX
      | CompanyName | Name         | PhoneNumber | AddressLine1  | AddressLine2   |
      | DHL Express | Carl William | 04987654321 | Mulgrave, 102 | Four Post Lane |
    And User be able to add Suburb with string max 40 and Postcode with 4 Strings for Sender Address
      | CompanyName | Country     | AddressLine1        | AddressLine2 | Suburb                                    | Postcode |
      | NZ Post Ltd | NEW ZEALAND | 445 Mount Eden Road | Mount Eden   | AM012345678901234567890123456789012345678 |          |
    And User be able to add Suburb and Postcode for Sender Address
      | CompanyName | Country     | AddressLine1        | AddressLine2 | Suburb   | Postcode |
      | NZ Post Ltd | NEW ZEALAND | 445 Mount Eden Road | Mount Eden   | Auckland |     1024 |
    And User be able to add ContactEmail with string max 50 and characters a1@. for Sender Address
      | CompanyName | Country     | AddressLine1        | AddressLine2 | Suburb   | Postcode | Email                                               |
      | NZ Post Ltd | NEW ZEALAND | 445 Mount Eden Road | Mount Eden   | Auckland |     1024 | M0123456789012345678901234567890123456789@gmail.com |
    And User add Address for the sender in TGX
      | CompanyName | Country     | AddressLine1        | AddressLine2 | Suburb   | Postcode | Email                       | PhoneNumber | Phone Country |
      | NZ Post Ltd | NEW ZEALAND | 445 Mount Eden Road | Mount Eden   | Auckland |     1024 | NNAutomationuser1@gmail.com |   800300400 | New Zealand   |
    Then User able to see modified address in MY Contacts in My Profile
      | CompanyName | Name         | Email                       | CountryCode | PhoneNumber | AddressLine1 |
      | NZ Post Ltd | John William | NNAutomationuser1@gmail.com | 64-         |   800300400 | 445 Mount Eden Road  |
