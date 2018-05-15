@tag
Feature: MYT-3765 Expanding the charges for an invoice

  Background: 
    Given User is Registered in MyToll and user has full financial access

  @tag1
  Scenario: User wants to expand the Charges section of an invoice to view and access my connotes for the invoice in TDF
    When User selects below Toll carrier and the account that has full financial access
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |        137289 MUMME TOOLS PTY LTD |
    When User selects Search Type as below
      | SearchType |
      | Invoice    |
    When User enters Invoice number for search
      | Search Invoice number |
      |               3882309 |
    And User clicks on Search
    Then User be able to view Invoice details as below
      | InvoiceDate      | InvoiceNumber | DueDate          | Chargeamount | Paid  | Outstanding |
      | Sun, 07 Jan 2018 |       3882309 | Tue, 06 Feb 2018 | $663.61      | $663.61 | $0.00     |
    When User clicks on an invoice to view invoice details
    Then User be able to view Invoice details in the invoice summary screen
      | TollCarrier              | Date             | InvoiceNumber   | DueDate          | Chargeamount | Paid  | Outstanding | AccountNumber | OutstandingHeader | NumberOfResults |
      | Intermodal & Specialised | Sun, 07 Jan 2018 | INVOICE 3882309 | Tue, 06 Feb 2018 | $663.61      | $663.61  | $0.00     |        137289 | OUTSTANDING       |              10 |
    When User expands the Outstanding
    Then User can see one of shipments details as below
      | ShipmentNo | Type        | ChargeAmount | Outstanding |
      | 2868873529 | Consignment | $152.93      | $0.00     |
    When User clicks on following Consignment
     |Consignment| 
     |2868873529|
   Then User be able to see "CHARGES" section for following Consignment
     | Consignment |
      |  2868873529 |
    Then User can view "Basic Charges" "Freight Charges" "Fuel Surcharges" "GST"
    Then User can view Charge Type, Description, Charge amount for Basic Charges
      | Charge Type   | Description     | Charge amount |
      | Basic Charges | CONSIGNMENT FEE | $8.00         |
    Then User can view Charge Type, Description, Charge amount for Freight charges
      | Charge Type     | Description  | Charge amount |
      | Freight Charges | FREIGHT RATE | $121.35       |
    Then User can view Charge Type, Description, Charge amount for Fuel Surcharges
      | Charge Type     | Description          | Charge amount |
      | Fuel Surcharges | FUEL SURCHARGE 7.48% | $9.68         |
    Then User can view Charge Type, Description, Charge amount for GST
      | Charge Type | Description          | Charge amount |
      | GST         | GOODS & SERVICES TAX | $13.90        |
    Then User can view GST and Total Charge
      | GST    | Total Charge |
      | $13.90 | $152.93      |
    When User expands Basic Charges
    Then User can see folowing fields are populated in Basic Charges
      | Rate Type | Service | Mode | Origin | Destination | Commodity | Full Load | Min Amount (in dollars) | Max Amount (in dollars) | UOM  | Qty | Rate/UOM | Total | Break Total Charge |
      | T         | G       | ROAD | ADELAI | KARRAT      |         0 | No        |                    0.00 |                    0.00 | FLAT |   1 | 32.5/$   | 32.50 |              32.50 |
      When User expands Freight Charges
    Then User can see folowing fields are populated in Freight Charges
      | Rate Type | Service | Mode | Origin | Destination | Commodity | Full Load | Min Amount (in dollars) | Max Amount (in dollars) | UOM  | Qty | Rate/UOM | Total | Break Total Charge |
      | T         | G       | ROAD | ADELAI | KARRAT      |         0 | No        |                    0.00 |                    0.00 |  KILO |   87 |	1.4683/$  | 	127.74 |              127.74 |
       When User expands Fuel Surcharges
    Then User can see folowing fields are populated in Fuel Surcharges
      | Rate Type | Service | Mode | Origin | Destination | Commodity | Full Load | Min Amount (in dollars) | Max Amount (in dollars) | UOM  | Qty | Rate/UOM | Total | Break Total Charge |
      | T         | G       | ROAD | ADELAI | KARRAT      |         0 | No        |                    0.00 |                    0.00 | KILO |   87 |	1.4683/$  | 	127.74 |              127.74 |
     Then User Closes the Browser  
      

