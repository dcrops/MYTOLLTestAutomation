Feature: MYT_2698 Select Financials

  Background: 
       Given User is Registered in MyToll 

  @tag1
  Scenario: User wants to expand the Charges section of an invoice to view and access my connotes for the invoice in TDF
  Then User can see folowing fields are populated in Basic Charges
      | Rate Type | Service | Mode | Origin | Destination | Commodity | Full Load | Min Amount (in dollars) | Max Amount (in dollars) | UOM  | Qty | Rate/UOM | Total | Break Total Charge |
      | T         | G       | ROAD | ADELAI | KARRAT      |         0 | false     |                    0.00 |                    0.00 | FLAT |   1 | 32.5/$   | 32.50 |              32.50 |
      When User expands Freight Charges
    Then User can see folowing fields are populated in Freight Charges
      | Rate Type | Service | Mode | Origin | Destination | Commodity | Full Load | Min Amount (in dollars) | Max Amount (in dollars) | UOM  | Qty | Rate/UOM | Total | Break Total Charge |
      | T         | G       | ROAD | ADELAI | KARRAT      |         0 | false     |                    0.00 |                    0.00 |  KILO |   87 |	1.4683/$  | 	127.74 |              127.74 |
       When User expands Fuel Surcharges
    Then User can see folowing fields are populated in Fuel Surcharges
      | Rate Type | Service | Mode | Origin | Destination | Commodity | Full Load | Min Amount (in dollars) | Max Amount (in dollars) | UOM  | Qty | Rate/UOM | Total | Break Total Charge |
      | T         | G       | ROAD | ADELAI | KARRAT      |         0 | false     |                    0.00 |                    0.00 | KILO |   87 |	1.4683/$  | 	127.74 |              127.74 |
       