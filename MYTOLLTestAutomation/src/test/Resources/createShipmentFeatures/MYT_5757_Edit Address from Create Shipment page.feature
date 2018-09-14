Feature: MYT_5757 Edit Address from 'Create Shipment' page

  Background:
    Given User is Registered in MyToll and is on Shipment page

  @tag1
  Scenario: User wants edit the Sender Address when on the 'Create Shipment' page in TDF
    When User enters shipment overview details as below to create a shipment
      | TollCarrier   | AccountNumber | Service    | Mode | Whopays | Sender |
      | Toll Tasmania | 100428        | DG Freight | 1    | 1       | 1      |
    Then User be able to EDIT the Sender address using Edit button
    And User Press Edit button
    And User Edit the address entering new sender details
      | CompanyName    | Name         | PhoneNumber | AddressLine1         | AddressLine2  |
      | Toll Group Inc | John William | 0412367897  | 352, Wellington Road | Mulgrave, VIC |
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

  @tag1
  Scenario: User wants edit the Receiver Address when on the 'Create Shipment' page in TDF
    When User enters shipment overview details as below to create a shipment
      | TollCarrier   | AccountNumber | Service    | Mode | Whopays |
      | Toll Tasmania | 100428        | DG Freight | Rail | Sender  |
    And User selects Receiver location
      | locationIndex |
      | 1             |
    Then User be able to EDIT the Receiver address using Edit button
    And User Press Edit button
    And User Edit the address entering new receiver details
      | CompanyName | Name         | PhoneNumber | AddressLine1       | AddressLine2   |
      | AccessHQ    | John William | 0412361234  | 60, Collins Street | Melbourne, VIC |
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

  @tag1
  Scenario: User wants edit the Sender Address when on the 'Create Shipment' page in TGX
    When User enters shipment overview details as below to create a shipment
      | TollCarrier        | AccountNumber | Service    | Mode | Whopays |
      | Toll Priority (NZ) | 566788        | DG Freight | Rail | Sender  |
    And User slects a existing Sender address from the Sender field
      | locationIndex |
      | 1             |
    Then User be able to EDIT the Sender address using Edit button
    And User Press Edit button
    And User Edit the address entering new sender details
      | CompanyName | Name           | PhoneNumber | AddressLine1                              | AddressLine2 |
      | MainFreight | Philip William | 04987654321 | 1 Wellington Street, Hampstead, Ashburton | 7700         |
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

  @tag1
  Scenario: User wants edit the Receiver Address when on the 'Create Shipment' page in TGX
    When User enters shipment overview details as below to create a shipment
      | TollCarrier         | AccountNumber | Service    | Mode | Whopays |
      | Toll Priority (AUS) | 401509        | DG Freight | Rail | Sender  |
    And User slects a existing Receiver address from the Receiver field
      | locationIndex |
      | 1             |
    Then User be able to EDIT the Receiver address using Edit button
    And User Press Edit button
    And User Edit the address entering new receiver details
      | CompanyName | Name           | PhoneNumber | AddressLine1                              | AddressLine2 |
      | MainFreight | Philip William | 04987654321 | 1 Wellington Street, Hampstead, Ashburton | 7700         |
    And User Delete the email address
    When User Press Save
    Then Message displays as Address unable to save
      | Message                    |
      | Unable to save the address |
    When user enters email address
      | Email                |
      | Groge1@tollgroup.com |
    And User can see a text as edit their full address via the My profile section
    When User Press Save
    Then Message displays as Address able to saved
      | Message                       |
      | The address saved sucessfully |
    And User navigates to MY Contacts in My Profile
    Then User able to see modified address in MY Contacts in My Profile
