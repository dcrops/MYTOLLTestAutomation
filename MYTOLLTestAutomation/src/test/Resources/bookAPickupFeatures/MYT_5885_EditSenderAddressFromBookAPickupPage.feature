Feature: MYT-5885 User needs to Edit Sender Address from 'Book a pickup' page

Background:
		Given User is Registered in MyToll and is on Book a pickup page

  Scenario: User Edit Sender Address in Toll Tasmania from 'Book a pickup' page
    
    When User selects Toll Carrier as TollTasmania and select Account Number
      | TollCarrier   | AccountNumber |
      | Toll Tasmania |        100428 |
    And User slects a existing Sender address from the Sender field
      | locationIndex |
      |             1 |
    Then User be able to EDIT the Sender address using Edit button
    And User Press Edit button
    And User Edit the address entering new sender details
      | CompanyName    | Name         | PhoneNumber | AddressLine1         | AddressLine2  |
      | Toll Group Inc | John William |  0412367897 | 352, Wellington Road | Mulgrave, VIC |
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


  Scenario: User Edit Sender Address in TollNQX|Toll Express from 'Book a pickup' page
 
    When User selects Toll Carrier as TollNQX|Toll Express and select Account Number
      | TollCarrier | AccountNumber |        
      | Toll NQX    | Toll Express  | 614060 |
    And User slects a existing Sender address from the Sender field
      | locationIndex |
      |             1 |
    Then User be able to EDIT the Sender address using Edit button
    And User Press Edit button
    And User Edit the address entering new sender details
      | CompanyName | Name           | PhoneNumber | AddressLine1       | AddressLine2   |
      | AceessHQ    | George William | 04987654321 | 60, Collins Street | Melbourne, VIC |
    And User Delete the email address
    When User Press Save
    Then Message displays as Address unable to save
      | Message                    |
      | Unable to save the address |
    When user enter email address
      | Email                |
      | george@tollgroup.com |
    And User can see a text as edit their full address via the My profile section
    When User Press Save
    Then Message displays as Address able to saved
      | Message                       |
      | The address saved sucessfully |
    Then User able to see modified address in MY Contacts in My Profile


  Scenario: User Edit Sender Address in Toll Priority (AUS) from 'Book a pickup' page
    
    When User selects Toll Carrier as Toll Priority (AUS) and select Account Number
      | TollCarrier         | AccountNumber |
      | Toll Priority (Aus) |        401509 |
    And User slects a existing Sender address from the Sender field
      | locationIndex |
      |             1 |
    Then User be able to EDIT the Sender address using Edit button
    And User Press Edit button
    And User Edit the address entering new sender details
      | CompanyName | Name           | PhoneNumber | AddressLine1       | AddressLine2   |
      | AceessHQ    | George William | 04987654321 | 60, Collins Street | Melbourne, VIC |
    And User Delete the email address
    When User Press Save
    Then Message displays as Address unable to save
      | Message                    |
      | Unable to save the address |
    When user enter email address
      | Email                |
      | Groge1@tollgroup.com |
    And User can see a text as edit their full address via the My profile section
    When User Press Save
    Then Message displays as Address able to saved
      | Message                       |
      | The address saved sucessfully |
    And User navigates to MY Contacts in My Profile
    Then User able to see modified address in MY Contacts in My Profile

 
 
  Scenario: User Edit Sender Address in Toll Priority (NZ) from 'Book a pickup' page
   
    When User selects Toll Carrier as Toll Priority (NZ) and select Account Number
      | TollCarrier        | AccountNumber |
      | Toll Priority (NZ) |        566788 |
    And User slects a existing Sender address from the Sender field
      | locationIndex |
      |             1 |
    Then User be able to EDIT the Sender address using Edit button
    And User Press Edit button
    And User Edit the address entering new sender details
      | CompanyName | Name           | PhoneNumber | AddressLine1          | AddressLine2   |
      | MainFreight | Philip William | 04987654321 | 1 Wellington Street, Hampstead, Ashburton | 7700 |
    And User Delete the email address
    When User Press Save
    Then Message displays as Address unable to save
      | Message                    |
      | Unable to save the address |
    When user enter email address
      | Email                |
      | philip@tollgroup.com |
    And User can see a text as edit their full address via the My profile section
    When User Press Save
    Then Message displays as Address able to saved
      | Message                       |
      | The address saved sucessfully |
    Then User able to see modified address in MY Contacts in My Profile



  Scenario: User Edit Sender Address in Toll IPEC from 'Book a pickup' page
    
    When User selects Toll Carrier as Toll Priority (NZ) and select Account Number
      | TollCarrier | AccountNumber |
      | Toll IPEC   |       2230899 |
    And User slects a existing Sender address from the Sender field
      | locationIndex |
      |             1 |
    Then User be able to EDIT the Sender address using Edit button
    And User Press Edit button
    And User Edit the address entering new sender details
      | CompanyName | Name         | PhoneNumber | AddressLine1        | AddressLine2   |
      | DHL Express | Carl William | 04987654321 | 203 Ingles St, Port | Melbourne, VIC |
    And User Delete the email address
    When User Press Save
    Then Message displays as Address unable to save
      | Message                    |
      | Unable to save the address |
    When user enter email address
      | Email              |
      | carl@tollgroup.com |
    And User can see a text as edit their full address via the My profile section
    When User Press Save
    Then Message displays as Address able to saved
      | Message                       |
      | The address saved sucessfully |
    Then User able to see modified address in MY Contacts in My Profile
