Feature: MYT-6126  - Rate Enquiry Disclaimer Content is Incorrect bug verification

  Background:
    Given User is Registered in MyToll and is on Rate Enquiry Page

  @tag1
  Scenario: The rate enquiry disclaimer text is the same as displayed in Toll Online IPEC
    When User selects Toll Carrier
      | TollCarrier |
      | Toll IPEC   |
    And User select Service
      | Service      |
      | Road Express |
    And User Enters and selects Account
      | Account |
      | 3N7763  |
    Then User Enters Orgin
      | OriginSuburb | OriginPostCode |
      | PERTH        | 6000           |
    Then User Enters Destination
      | DesSuburb | DesPostCode |
      | BRISBANE  | 4000        |
    And User Enters Line Items for Rate Enquiry
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 | 10            | 10     | 10    | 10     | 10     |
    And User Selects Item type
      | BillingType  |
      | ALL FREIGHT |
    When User Clicks Price Now
    Then User verifies disclaimer message with text
    """
    The rate displayed is an estimate only. The rate may change if there are any variations to the actual weight, dimensions or location entered above and are based on Mon - Fri business hours. Extra service and other surcharges may apply. For further enquiries please call our Sales Dept on 1300 865 547 (Option 3)
    """

  @tag2
  Scenario: The rate enquiry disclaimer text is the same as displayed in Toll Online Priority AU
    When User selects Toll Carrier
      | TollCarrier         |
      | Toll Priority (Aus) |
    And User select Service
      | Service            |
      | Parcels - Off Peak |
    And User Enters and selects Account
      | Account |
      | 64152   |
    Then User Enters Orgin
      | OriginSuburb | OriginPostCode |
      | PERTH        | 6000           |
    Then User Enters Destination
      | DesSuburb | DesPostCode |
      | BRISBANE  | 4000        |
    And User Enters Line Items for Rate Enquiry
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 | 10            | 10     | 10    | 10     | 10     |
    When User Clicks Price Now
    Then User verifies disclaimer message with text
    """
    This is an estimate only. Results may vary if actual details differ. Transit Times exclude weekends/public holidays. International Non Documents may incur extra 24 hours subject to commodity type and local customs clearance. Delivery outside metro areas may increase time.
    """

  @tag3
  Scenario: The rate enquiry disclaimer text is the same as displayed in Toll Online Priority NZ
    When User selects Toll Carrier
      | TollCarrier        |
      | Toll Priority (NZ) |
    And User select Service
      | Service            |
      | Parcels - Off Peak |
    And User Enters and selects Account
      | Account |
      | 100181  |
    Then User Enters Orgin
      | OriginSuburb | OriginPostCode |
      | AUCKLAND     | 1003           |
    Then User Enters Destination
      | DesSuburb  | DesPostCode |
      | WELLINGTON | 6011        |
    And User Enters Line Items for Rate Enquiry
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Template1 | 10            | 10     | 10    | 10     | 10     |
    When User Clicks Price Now
    Then User verifies disclaimer message with text
    """
    This is an estimate only. Results may vary if actual details differ. Transit Times exclude weekends/public holidays. International Non Documents may incur extra 24 hours subject to commodity type and local customs clearance. Delivery outside metro areas may increase time.
    """