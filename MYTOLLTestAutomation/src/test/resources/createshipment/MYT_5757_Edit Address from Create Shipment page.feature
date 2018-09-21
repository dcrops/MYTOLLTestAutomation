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
    And User Edit the address entering new address details
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
    And User Edit the address entering new address details
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
      | TollCarrier        | AccountNumber | Service                    | Whopays | Sender | Receiver | SenderEmail                 | ReceiverEmail               |
      | Toll Priority (NZ) | 100181        | Global - Express Documents | 1       | 1      | 7        | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |
    Given User add Address for the sender in TGX
      | CompanyName | AddressLine1                   | AddressLine2 | Suburb    | Postcode | Email                       | PhoneNumber | Phone Country | Country     |
      | MainFreight | 2 Wellington Street, Hampstead | 7700         | HAMPSTEAD | 7700     | NNAutomationUser1@gmail.com | 33237128    | +64           | New Zealand |
    When User Press Edit Sender button
    Then User be able to EDIT the address using Edit button
      | Heading      |
      | Edit Address |
    And User Edit the address entering new address details
      | CompanyName      | Name           | PhoneNumber | AddressLine1                   | AddressLine2 | Email              |
      | MainFreightTemp2 | Philip William | 33237128    | 1 Wellington Street, Hampstead | 7700         | john@tollgroup.com |
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
      | CompanyName      | Name           | Email              | CountryCode | PhoneNumber | AddressLine1                   |
      | MainFreightTemp2 | Philip William | john@tollgroup.com | 64-         | 33237128    | 1 Wellington Street, Hampstead |

  @tag1
  Scenario: User wants edit the Receiver Address when on the 'Create Shipment' page in TGX
    When User enters shipment overview details as below to create a shipment
      | TollCarrier         | AccountNumber | Service                    | Whopays | Sender      | Receiver       | SenderEmail                 | ReceiverEmail               |
      | Toll Priority (Aus) | 0007CDS       | Global - Express Documents | 1       | MainFreight | Toll Group Inc | NNAutomationUser1@gmail.com | NNAutomationUser2@gmail.com |
    Given User add Address for the receiver in TGX
      | CompanyName      | AddressLine1         | AddressLine2  | Suburb   | Postcode | Email                       | PhoneNumber | Phone Country | Country   |
      | TemporaryCompany | 352, Wellington Road | Mulgrave, VIC | MULGRAVE | 3170     | NNAutomationUser1@gmail.com | 412367897   | +61           | Australia |
    When User Press Edit Receiver button
    Then User be able to EDIT the address using Edit button
      | Heading      |
      | Edit Address |
    And User Edit the address entering new address details
      | CompanyName       | Name           | PhoneNumber | AddressLine1         | AddressLine2 | Email              |
      | TemporaryCompany2 | Philip William | 412367897   | 352, Wellington Road | 3170         | john@tollgroup.com |
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
      | CompanyName       | Name           | Email              | CountryCode | PhoneNumber | AddressLine1         |
      | TemporaryCompany2 | Philip William | john@tollgroup.com | 61-         | 412367897   | 352, Wellington Road |

