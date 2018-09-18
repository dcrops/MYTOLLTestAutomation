Feature: MYT_5757 Edit Address from 'Create Shipment' page

  Background:
    Given User is Registered in MyToll and is on Shipment page

  @tag1
  Scenario: User wants edit the Sender Address when on the 'Create Shipment' page in TDF
    When User enters shipment overview details as below to create a shipment
      | TollCarrier   | AccountNumber | Service    | Mode | Whopays | Sender | Receiver | SenderEmail                 | ReceiverEmail               |
      | Toll Tasmania | 100428        | DG Freight | 1    | 1       | 1      | 2        | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |
    And User Press Edit Sender button
    Then User be able to EDIT the address using Edit button
      | Heading      |
      | Edit Address |
    And User Edit the address entering new sender details
      | CompanyName    | Name         | PhoneNumber | AddressLine1         | AddressLine2  | Email              |
      | Toll Group Inc | John William | 0412367897  | 352, Wellington Road | Mulgrave, VIC | john@tollgroup.com |
    When User can see a text as edit their full address via the My profile section
      | TextEditFullAddress                         |
      | Please click here to edit your full address |
    When User Press Save
    Then Message displays as Address is saved
      | Message                    |
      | Address saved successfully |
    When User Clicks Save Draft on Shipment Page
    Then User able to see modified address in MY Contacts in My Profile
      | CompanyName    | Name         | Email              | CountryCode | PhoneNumber | AddressLine1         |
      | Toll Group Inc | John William | john@tollgroup.com | 61-         | 412367897   | 352, Wellington Road |

  @tag1
  Scenario: User wants edit the Receiver Address when on the 'Create Shipment' page in TDF
    When User enters shipment overview details as below to create a shipment
      | TollCarrier   | AccountNumber | Service    | Mode | Whopays | Sender | Receiver | SenderEmail                 | ReceiverEmail               |
      | Toll Tasmania | 100428        | DG Freight | 1    | 1       | 2      | 1        | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |
    And User Press Edit Receiver button
    Then User be able to EDIT the address using Edit button
      | Heading      |
      | Edit Address |
    And User Edit the address entering new sender details
      | CompanyName    | Name         | PhoneNumber | AddressLine1         | AddressLine2  | Email              |
      | Toll Group Inc | John William | 0412367897  | 352, Wellington Road | Mulgrave, VIC | john@tollgroup.com |
    When User can see a text as edit their full address via the My profile section
      | TextEditFullAddress                         |
      | Please click here to edit your full address |
    When User Press Save
    Then Message displays as Address is saved
      | Message                    |
      | Address saved successfully |
    When User Clicks Save Draft on Shipment Page
    Then User able to see modified address in MY Contacts in My Profile
      | CompanyName    | Name         | Email              | CountryCode | PhoneNumber | AddressLine1         |
      | Toll Group Inc | John William | john@tollgroup.com | 61-         | 412367897   | 352, Wellington Road |

  @tag1
  Scenario: User wants edit the Sender Address when on the 'Create Shipment' page in TGX
    When User enters shipment overview details as below to create a shipment
      | TollCarrier        | AccountNumber | Service            | Whopays | Sender | Receiver | SenderEmail                 | ReceiverEmail               |
      | Toll Priority (NZ) | 100181        | Parcels - Off Peak | 1       | 1      | 1        | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |
    Given User add Address for the sender in TGX
      | CompanyName | AddressLine1                   | AddressLine2 | Suburb    | Postcode | Email                       | PhoneNumber | Phone Country | Country |
      | MainFreight | 2 Wellington Street, Hampstead | 7700         | Ashburton | 7700     | NNAutomationUser1@gmail.com | 33237128    | 64-           | New Zealand |
    When User Press Edit Sender button
    Then User be able to EDIT the address using Edit button
      | Heading      |
      | Edit Address |
    And User Edit the address entering new sender details
      | CompanyName | Name           | PhoneNumber | AddressLine1                   | AddressLine2 | Email              |
      | MainFreight | Philip William | 33237128    | 1 Wellington Street, Hampstead | 7700         | john@tollgroup.com |
    When User can see a text as edit their full address via the My profile section
      | TextEditFullAddress                         |
      | Please click here to edit your full address |
    And User Delete the email address
    When User Press Save
    Then Message displays as Address is saved
      | Message                    |
      | Address saved successfully |
    When User Clicks Save Draft on Shipment Page
    Then User able to see modified address in MY Contacts in My Profile
      | CompanyName | Name           | Email              | CountryCode | PhoneNumber | AddressLine1                   |
      | MainFreight | Philip William | john@tollgroup.com | 64-         | 33237128    | 1 Wellington Street, Hampstead |


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
    Then Message displays as Address is saved
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
