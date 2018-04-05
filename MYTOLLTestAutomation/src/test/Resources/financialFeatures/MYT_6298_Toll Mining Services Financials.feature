@tag
Feature: MYT_6298 Toll Mining Services Financials

  Background: 
    Given User is Registered in MyToll

  @tag1
  Scenario: User has full financial access and wants to select Account Summary or My Financials
    When User selects below Toll carrier and the account that has full financial access
      | TollCarrier            | AccountNumber                |
      | Toll Energy and Marine | G28405 SANTOS LIMITED (EABU) |
    When User selects Search Type as below
      | SearchType |
      | Invoice    |
    When User enters Invoice number for search
      | Search Invoice number |
      |                 33904 |
    And User clicks on Search
    Then User be able to view Invoice details as below
      | InvoiceDate      | InvoiceNumber | DueDate          | Chargeamount | Paid      | Outstanding |
      | Sun, 24 Dec 2017 |         30275 | Tue, 23 Jan 2018 | $30539.81    | $-1047.53 | $31587.34   |
    When User clicks on an invoice to view invoice details
    Then User be able to view Invoice details in the invoice summary screen
      | TollCarrier            | Date             | InvoiceNumber | DueDate          | Chargeamount | Paid      | Outstanding | AccountNumber | OutstandingHeader | NumberOfResults |
      | Toll Energy and Marine | Sun, 24 Dec 2017 | INVOICE 30275 | Tue, 23 Jan 2018 | $30539.81    | $-1047.53 | $31587.34   | G28405        | OUTSTANDING       |             211 |
    When User expands the Outstanding
    Then User can see one of shipments details as below
      | ShipmentNo | Type        | ChargeAmount | Outstanding |
      | 6270032307 | Consignment | $10405.99    | $0.00       |
    When User clicks on following Consignment
      | Consignment |
      |  6270032307 |
    Then User be able to see "CHARGES" section
    Then User can view "Basic Charges" "Freight Charges" "Fuel Surcharges" "GST"
    Then User can view Charge Type, Description, Charge amount for Freight charges
      | Charge Type     | Description  | Charge amount |
      | Freight Charges | FREIGHT RATE | $9459.99      |
    Then User can view Charge Type, Description, Charge amount for Freight charges
      | Charge Type     | Description  | Charge amount |
      | Freight Charges | FREIGHT RATE | $0.00         |
    Then User can view Charge Type, Description, Charge amount for Freight charges
      | Charge Type     | Description  | Charge amount |
      | Freight Charges | FREIGHT RATE | $0.00         |
    Then User can view Charge Type, Description, Charge amount for GST
      | Charge Type | Description          | Charge amount |
      | GST         | GOODS & SERVICES TAX | $946.00       |
    Then User can view GST and Total Charge
      | GST     | Total Charge |
      | $946.00 | $10405.99    |
    When User expands Basic Charges
    Then User can see folowing fields are populated in Basic Charges
      | Rate Type | Service | Mode | Origin | Destination | Commodity | Full Load | Min Amount (in dollars) | Max Amount (in dollars) | UOM | Qty | Rate/UOM | Total | Break Total Charge |
      | T         | G       | ROAD | ADELAI | ADELAI      |         1 | false     |                    0.00 |                    0.00 |     | 433 | 10/F     | 10.00 |              10.00 |
    When User expands Freight Charges
    Then User can see folowing fields are populated in Freight Charges
      | Rate Type | Service | Mode | Origin | Destination | Commodity | Full Load | Min Amount (in dollars) | Max Amount (in dollars) | UOM  | Qty | Rate/UOM | Total | Break Total Charge |
      | T         | G       | ROAD | ADELAI | ADELAI      |         1 | false     |                    0.00 |                    0.00 | KILO | 433 | .074/$   | 32.04 |              32.04 |

  @tag3
  Scenario: User doesn't have full financial access and not be able to select Financials or Accounts summary
    Given User doesn't have full financial access to at least one account
    Then User must not be able to select Financials or Accounts summary
    And User must not be able to view invoice details for any account
