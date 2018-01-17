@tag
Feature: MYT-3765 Expanding the charges for an invoice

  Background: 
    Given User is Registered in MyToll

  @tag1
  Scenario: User wants to expand the Charges section of an invoice to view and access my connotes for the invoice in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice to view invoice details
    And User expands a Shipment
    When User expands the Outstanding
    When User be able expands the Charges section
    Then User can view "Basic Charges" "Freight charges" "Fuel Charges"
    Then User can view "GST" "Charge Type" "Description" "Charge amount" "Total" sub sections

  @tag1
  Scenario: User wants to expand the Basic Charges of Charges section of an invoice to view and access my connotes for the invoice in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice to view invoice details
    And User expands a Shipment
    When User expands the Outstanding
    When User be able expands the Charges section
    Then User can view "Basic Charges" "Freight charges" "Fuel Charges" "GST" "Charge Type" "Description" "Charge amount" "Total" sub sections
    Then User expands the Basic Charges section
    Then User can see following details
      | Rate Type | Service | Mode | Origin | Destination | Commodity | FullLoad | MinAmount(in dollars) | MaxAmount(in dollars) | UOM Qty Rate/UOM | Break Total Charge |
      |           |         |      |        |             |           |          |                       |                       |                  |                    |

  @tag1
  Scenario: User wants to expand the Freight Charges of Charges section of an invoice to view and access my connotes for the invoice in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice to view invoice details
    And User expands a Shipment
    When User expands the Outstanding
    When User be able expands the Charges section
    When User expands the Freight Charges section
    Then User can see following details
      | Rate Type | Service | Mode | Origin | Destination | Commodity | FullLoad | MinAmount(in dollars) | MaxAmount(in dollars) | UOM Qty Rate/UOM | Break Total Charge |
      |           |         |      |        |             |           |          |                       |                       |                  |                    |

  @tag1
  Scenario: User wants to expand the Fuel Charges of Charges section of an invoice to view and access my connotes for the invoice in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice to view invoice details
    And User expands a Shipment
    When User expands the Outstanding
    When User be able expands the Charges section
    When User expands the Fuel Charges section
    Then User can see following details
      | Rate Type | Service | Mode | Origin | Destination | Commodity | FullLoad | MinAmount(in dollars) | MaxAmount(in dollars) | UOM Qty Rate/UOM | Break Total Charge |
      |           |         |      |        |             |           |          |                       |                       |                  |                    |
