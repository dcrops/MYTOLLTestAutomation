@tag
Feature: MYT_6298 Toll Mining Services Financials

  Background: 
  Given User is Registered in MyToll and user has full financial access

  @tag1
  Scenario: User has full financial access and wants to select Account Summary or My Financials
    When User selects Toll carrier and the account that has full financial access
      | TollCarrier            | AccountNumber  |
      | Toll Mining Services   | 706659         |
    When User selects Search Type as below
      | SearchType |
      | Invoice    |
    When User enters Invoice number for search
      | Search Invoice number |
      |                26306 |
    And User clicks on Search
    Then User be able to view Invoice details as below
      | InvoiceDate      | InvoiceNumber | DueDate          | Chargeamount     | Paid           | Outstanding |
      | Sun, 07 Jan 2018 |         26306 | Sat, 10 Mar 2018 | 	$1037158.60    | 	$1029398.56 | $7760.04    |
    When User clicks on an invoice to view invoice details
    Then User be able to view Invoice details in the invoice summary screen
      | TollCarrier            | Date             | InvoiceNumber  | DueDate          | Chargeamount       | Paid           | Outstanding | AccountNumber | OutstandingHeader | NumberOfResults |
      | Toll Mining Services   | Sun, 07 Jan 2018 | INVOICE 26306  | Sat, 10 Mar 2018 | 	$1037158.60    | 	$1029398.56 | $7760.04    | 706659        | OUTSTANDING       |             101 |
    When User expands the Outstanding
    Then User can see one of shipments details as below
      | ShipmentNo | Type        | ChargeAmount | Outstanding |
      | 6348817126 | Consignment | $13012.54    | $0.00       |
    When User clicks on following Consignment
      | Consignment |
      |  6348817126 |
    Then User be able to see "CHARGES" section for following Consignment
     | Consignment  |
      |  6348817126 |
    Then User can view "Freight Charges" "GST"
     Then User can view Charge Type, Description, Charge amount for Freight charges
      | Charge Type     | Description  | Charge amount          |
      | Freight Charges | UNIT COST    | $11829.58        |
    Then User can view Charge Type, Description, Charge amount for GST
      | Charge Type | Description          | Charge amount |
      | GST         | GOODS & SERVICES TAX | $1182.96     |
    Then User can view GST and Total Charge
      | GST       | Total Charge |
      | $1182.96  | $13012.54    |
   When User expands Freight Charges
    Then User can see folowing fields are populated in Freight Charges
      | Rate Type | Service | Mode | Origin | Destination | Commodity | Full Load | Min Amount (in dollars) | Max Amount (in dollars)    | UOM   | Qty | Rate/UOM  | Total    | Break Total Charge |
      | T         | *       | ROAD | 6167   | 	6721      |        73 | No     |                    0.00    |                    0.00    | TONNE | 82  | 143.65/$  | 11779.30 |       11779.30     |
       Then User Closes the Browser

#  @tag3
#  Scenario: User doesn't have full financial access and not be able to select Financials or Accounts summary
#    Given User doesn't have full financial access to at least one account
#    Then User must not be able to select Financials or Accounts summary
#    And User must not be able to view invoice details for any account
