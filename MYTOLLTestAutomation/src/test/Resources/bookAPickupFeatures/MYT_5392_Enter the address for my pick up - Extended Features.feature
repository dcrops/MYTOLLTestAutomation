Feature: MYT-5392 Enter the address for my pick up - Extended Features

  Background: 
    Given User is Registered in MyToll and is on Book a pickup page

  Scenario: User Add Suburb and Postcode for Sender Address in Toll Tasmania from 'Book a pickup' page
    When User selects Toll Carrier as TollTasmania and select Account Number
      | TollCarrier   | AccountNumber |
      | Toll Tasmania |        100428 |
    When User selects NO I am located at the pick up location option
    Then User clicks Sender address and Click Add Address
    And User Add the address entering sender details
      | CompanyName | Name           | PhoneNumber | AddressLine1       | AddressLine2   |
      | AceessHQ    | George William | 04987654321 | 60, Collins Street | Melbourne, VIC |
    And User be able to add Suburb with string max 40 and Postcode with 4 Strings for Sender Address
      | Suburb                                   | Postcode |
      | H012345678901234567890123456789012345678 |     7001 |
    And User be able to add Suburb and Postcode for Sender Address
      | Suburb         | Postcode |
      | HOBART AIRPORT |     7001 |
    When User Press Save
    Then Message displays as Address able to saved
      | Message                       |
      | The address saved sucessfully |
    Then User able to see new address in MY Contacts in My Profile with Suburb and Post Code
    

  Scenario: User Add Suburb and Postcode for Sender Address in TollNQX|Toll Express from 'Book a pickup' page
    When User selects Toll Carrier as TollNQX|Toll Express and select Account Number
      | TollCarrier | AccountNumber |        
      | Toll NQX    | Toll Express  | 614060 |
    When User selects NO I am located at the pick up location option
    Then User clicks Sender address and Click Add Address
    And User Add the address entering sender details
      | CompanyName | Name           | PhoneNumber | AddressLine1       | AddressLine2   |
      | AceessHQ    | George William | 04987654321 | 60, Collins Street | Melbourne, VIC |
    And User be able to add Suburb with string max 40 and Postcode with 4 Strings for Sender Address
      | Suburb                                   | Postcode |
      | M012345678901234567890123456789012345678 |     3000 |
    And User be able to add Suburb and Postcode for Sender Address
      | Suburb    | Postcode |
      | Melbourne |     3000 |
    When User Press Save
    Then Message displays as Address able to saved
      | Message                       |
      | The address saved sucessfully |
    Then User able to see new address in MY Contacts in My Profile with Suburb and Post Code
    

  Scenario: User Add Suburb,Postcode, Contact Email, and Description of goods  for Sender Address in Toll Priority (AUS) from 'Book a pickup' page
    When User selects Toll Carrier as Toll Priority (AUS) and select Account Number
      | TollCarrier         | AccountNumber |
      | Toll Priority (Aus) |        401509 |
    When User selects NO I am located at the pick up location option
    Then User clicks Sender address and Click Add Address
    And User Add the address entering sender details
      | CompanyName | Name           | PhoneNumber | AddressLine1       | AddressLine2   |
      | AceessHQ    | George William | 04987654321 | 60, Collins Street | Melbourne, VIC |
    And User be able to add Suburb with string max 40 and Postcode with 4 Strings for Sender Address
      | Suburb                                   | Postcode |
      | M012345678901234567890123456789012345678 |     3000 |
    And User be able to add Suburb and Postcode for Sender Address
      | Suburb    | Postcode |
      | Melbourne |     3000 |
    And User be able to add ContactEmail with string max 50 and characters a1@. for Sender Address
      | Email                                               |
      | M0123456789012345678901234567890123456789@gmail.com |
    And User verify Description of goods
    When User Press Save
    Then Message displays as Address able to saved
      | Message                       |
      | The address saved sucessfully |
    Then User able to see new address in MY Contacts in My Profile with Suburb and Post Code
    

  Scenario: User Add Suburb,Postcode, Contact Email, and Description of goods  for Sender Address in Toll Priority (NZ) from 'Book a pickup' page
    When User selects Toll Carrier as Toll Priority (NZ) and select Account Number
      | TollCarrier        | AccountNumber |
      | Toll Priority (NZ) |        566788 |
    When User selects NO I am located at the pick up location option
    Then User clicks Sender address and Click Add Address
    And User Add the address entering sender details
      | CompanyName | Name           | PhoneNumber | AddressLine1         | AddressLine2 |
      | MainFreight | Philip William | 04987654321 | 1 Wellington Street, | Hampstead    |
    And User be able to add Suburb with string max 40 and Postcode with 4 Strings for Sender Address
      | Suburb                                    | Postcode |
      | AM012345678901234567890123456789012345678 |     7700 |
    And User be able to add Suburb and Postcode for Sender Address
      | Suburb    | Postcode |
      | Ashburton |     3000 |
    And User be able to add ContactEmail with string max 50 and characters a1@. for Sender Address
      | Email                                               |
      | M0123456789012345678901234567890123456789@gmail.com |
    And User verify Description of goods
    When User Press Save
    Then Message displays as Address able to saved
      | Message                       |
      | The address saved sucessfully |
    Then User able to see new address in MY Contacts in My Profile with Suburb and Post Code
    

  Scenario: User Add Suburb,Postcode,Contact Email, and Description of goods for Sender Address in Toll IPEC from 'Book a pickup' page
    When User selects Toll Carrier as Toll IPEC and select Account Number
      | TollCarrier | AccountNumber |
      | Toll IPEC   |       2230899 |
    When User selects NO I am located at the pick up location option
    Then User clicks Sender address and Click Add Address
    And User Add the address entering sender details
      | CompanyName | Name         | PhoneNumber | AddressLine1  | AddressLine2   |
      | DHL Express | Carl William | 04987654321 | Mulgrave, 102 | Four Post Lane |
    And User be able to add Suburb with string max 40 and Postcode with 4 Strings for Sender Address
      | Suburb                                    | Postcode |
      | AM012345678901234567890123456789012345678 |     2710 |
    And User be able to add Suburb and Postcode for Sender Address
      | Suburb     | Postcode |
      | DENILIQUIN |     2710 |
    And User be able to add ContactEmail with string max 50 and characters a1@. for Sender Address
      | Email                                               |
      | M0123456789012345678901234567890123456789@gmail.com |
    When User Press Save
    Then Message displays as Address able to saved
      | Message                       |
      | The address saved sucessfully |
    Then User able to see new address in MY Contacts in My Profile with Suburb and Post Code
