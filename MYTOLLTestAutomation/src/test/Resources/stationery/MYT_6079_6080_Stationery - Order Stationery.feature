Feature: MYT_6079 Stationery - Order Stationery

  Background: 
    Given MyToll Toll Priority AU User logged in and has a Toll Priority AU Standard / Full Financial account and Stationery function is enabled

  Scenario: User has the ability to order Toll Priority Stationery online
    When User clicks on the mega menu
    Then User must be able to see an option to select Order Stationery
    And User selects Order Stationery
    Then User able to select Consignment Notes products and select one of those
      | Product           |
      | Consignment Notes |
    When User can increase or Decrease the Qty of a product by 5
      | NoOfQtyIncrease | NoOfQtyDecrease |
      |              30 |              25 |
    When User be able to enter preprint detatil as below
      | PreprintFrom | PreprintTo     | preprintFromContactName | preprintToContactName |
      | AccessHQ     | Australia Post | Cath                    | George                |
    And User be able to edit preprint detatil as below
      | PreprintFrom   | PreprintTo | preprintFromContactName | preprintToContactName |
      | Australia Post | AccessHQ   | Anna                    | Anne                  |
    When User ADD TO CART a Product
      | Product                       |
      | Same Day Consignment (LO6626) |
    Then User be able to see product added to the cart and the number of items in the cart increment by 1
      | Product                       | NoOfItems | NoOfQty | TotalItems     | PreprintLabel |
      | Same Day Consignment (LO6626) | 1 ITEMS   | Qty: 25 | Total Items: 1 | Preprint      |
    When User clicks Edit preprint icon in the cart
    When User edits preprint details inside the cart
      | NoOfQtyIncrease | NoOfQtyDecrease | PreprintFrom | PreprintFromContactName | PreprintTo     | PreprintToContactName | Message                                                  |
      |              30 |              25 | AccessHQ     | Anna                    | Australia Post | Anne                  | Stationary type has been successfully added to your cart |
    When User ADD TO CART a Product
      | Product                        |
      | Overnight Consignment (LO5133) |
    Then User be able to see second product added to the cart and the number of items in the cart increment by 1
      | Product                        | NoOfItems | NoOfQty | TotalItems     |
      | Overnight Consignment (LO5133) | 2 ITEMS   | Qty: 25 | Total Items: 2 |
    When User removes second product from the cart
    Then User be able to see cart has been updated as below
      | Product                       | NoOfItems | NoOfQty | TotalItems     | PreprintLabel |
      | Same Day Consignment (LO6626) | 1 ITEMS   | Qty: 25 | Total Items: 1 | Preprint      |
    When User ADD TO CART a Product
      | Product                        |
      | Overnight Consignment (LO5133) |
    Then User be able to see second product added to the cart again
      | Product                        | NoOfItems | NoOfQty | TotalItems     |
      | Overnight Consignment (LO5133) | 2 ITEMS   | Qty: 25 | Total Items: 2 |
    When User PROOCEED TO ORDER
    Then User navigates to Enter your stationery delivery details page
      | PageHeading     | PageDescription                               | TollCarrier         |
      | Profile Details | Enter your stationery delivery details below. | Toll Priority (Aus) |
    When User enter Review Order details as below
      | AccountNumber            | ContactName | ContactNumber | DeliverAddress | DeliveryContactName | NotifybyEmail              | CustomerReference | DeliveryInstructions      |
      | 0007CDS CITY OF NEDLANDS | Joe         |     412345678 | Dialog Group   | Andrew              | NNAutomationuser@gmail.com | Ref123456         | Test DeliveryInstructions |
    When User clicks Review Order
    Then User be able to see Overview details in the Review Page as below
      | TollCarrier | AccountNumber | Contact name | Contact number |
      | PRIO        | 0007CDS CITY OF NEDLANDS       | Joe          | 61-412345678   |
    Then User be able to see Delivery details in the Review page as below
      | Contact name | Phone number | Company name | Address                                  | Customer reference | Delivery instructions     |
      | Andrew       | 61-412345678 | Dialog Group | 60, Collins Street MELBOURNE VIC 3000 AU | Ref123456          | Test DeliveryInstructions |
    Then User be able to see first Line item details as below
      | ProductName                   | Quantity | UnitPrice          | Total       | PreprintFrom                                 |
      | Same Day Consignment (LO6626) | Qty 25   | Unit price : $0.00 | Total $0.00 | 60, Collins Street CDE MELBOURNE VIC 3000 AU |
    Then User be able to see second Line item details as below
      | ProductName                    | Quantity | UnitPrice          | Total       |
      | Overnight Consignment (LO5133) | Qty 25   | Unit price : $0.00 | Total $0.00 |
    Then User must see following message
      | GSTMSG                                                                                                                                                                               |
      | * For the purpose of this order, the Total excludes GST . The applicable amount of GST in relation to this order will be included in the final tax invoice Note : All $ units in AUD |
    Then User be able to charges in Review page as below
      | TotalSurcharges            | TotalCharges            |
      | TOTAL SURCHARGES AUD $0.00 | Total Charges AUD $0.00 |
    When User clicks the Edit Delivery Details button
    When User enter Review Order details as below
      | AccountNumber         | ContactName | ContactNumber | DeliverAddress | DeliveryContactName | NotifybyEmail               | CustomerReference | DeliveryInstructions          |
      | 200B1F NHP ELECTRICAL | Nadiki      |     498765432 | Toll Group     | Henry               | sitautomationuser@yahoo.com | 98765Ref          | New Test DeliveryInstructions |
    When User clicks Review Order
    Then User be able to see Overview details in the Review Page as below
      | TollCarrier | AccountNumber | Contact name | Contact number |
      | PRIO        | 200B1F NHP ELECTRICAL        | Nadiki       | 61-498765432   |
    Then User be able to see Delivery details in the Review page as below
      | Contact name | Phone number | Company name | Address                                                 | Customer reference | Delivery instructions         |
      | Henry        | 61-498765432 | Toll Group   | Wellington road 352, Mulgrave road Mulgrave VIC 3052 AU | 98765Ref           | New Test DeliveryInstructions |
    Then User be able to see first Line item details as below
      | ProductName                   | Quantity | UnitPrice          | Total       | PreprintFrom                                 |
      | Same Day Consignment (LO6626) | Qty 25   | Unit price : $0.00 | Total $0.00 | 60, Collins Street CDE MELBOURNE VIC 3000 AU |
    Then User be able to see second Line item details as below
      | ProductName                    | Quantity | UnitPrice          | Total       |
      | Overnight Consignment (LO5133) | Qty 25   | Unit price : $0.00 | Total $0.00 |
    Then User must see following message
      | GSTMSG                                                                                                                                                                               |
      | * For the purpose of this order, the Total excludes GST . The applicable amount of GST in relation to this order will be included in the final tax invoice Note : All $ units in AUD |
    Then User be able to charges in Review page as below
      | TotalSurcharges            | TotalCharges            |
      | TOTAL SURCHARGES AUD $0.00 | Total Charges AUD $0.00 |
    When User clicks the EDIT button
    When User ADD TO CART a Product
      | Product                       |
      | Off Peak Consignment (LO5134) |
    Then User be able to see third product added to the cart and the number of items in the cart increment by 1
      | Product                       | NoOfItems | NoOfQty | TotalItems     |
      | Off Peak Consignment (LO5134) | 3 ITEMS   | Qty: 25 | Total Items: 3 |
    When User PROOCEED TO ORDER
    When User enter Review Order details as below
      | AccountNumber                | ContactName | ContactNumber | DeliverAddress | DeliveryContactName | NotifybyEmail               | CustomerReference | DeliveryInstructions                  |
      | 200BHY NATIONAL PRIORITY FOC | Matthew     |     481234563 | Dialog Group   | Andrea              | sitautomationuser@yahoo.com | Ref876543         | Third times Test DeliveryInstructions |
    When User clicks Review Order
    Then User be able to see Overview details in the Review Page as below
      | TollCarrier | AccountNumber | Contact name | Contact number |
      | PRIO        | 200BHY        | Matthew      | 61-481234563   |
    Then User be able to see Delivery details in the Review page as below
      | Contact name | Phone number | Company name | Address                                  | Customer reference | Delivery instructions                 |
      | Andrea       | 61-412345678 | Dialog Group | 60, Collins Street MELBOURNE VIC 3000 AU | Ref876543          | Third times Test DeliveryInstructions |
    Then User be able to see first Line item details as below
      | ProductName                   | Quantity | UnitPrice          | Total       | PreprintFrom                                 |
      | Same Day Consignment (LO6626) | Qty 25   | Unit price : $0.00 | Total $0.00 | 60, Collins Street CDE MELBOURNE VIC 3000 AU |
    Then User be able to see second Line item details as below
      | ProductName                    | Quantity | UnitPrice          | Total       |
      | Overnight Consignment (LO5133) | Qty 25   | Unit price : $0.00 | Total $0.00 |
    Then User be able to see third Line item details as below
      | ProductName                   | Quantity | UnitPrice          | Total       |
      | Off Peak Consignment (LO5134) | Qty 25   | Unit price : $0.00 | Total $0.00 |
    Then User must see following message
      | GSTMSG                                                                                                                                                                               |
      | * For the purpose of this order, the Total excludes GST . The applicable amount of GST in relation to this order will be included in the final tax invoice Note : All $ units in AUD |
    Then User be able to charges in Review page as below
      | TotalSurcharges            | TotalCharges            |
      | TOTAL SURCHARGES AUD $0.00 | Total Charges AUD $0.00 |
    When User Confirm Order
    Then User be able to see Order number and Order created Date
    Then User be able to create a new order
    Then User be able to go back to Dashboard
    And User have ability to Print the order details after confirming the order
    Then User can go to MY ORDERS
    When User Clicks on Myorders to see created ordered
    Then User navigated to MYorders screen and can open the created order
      | ScreenHeading |
      | MY ORDERS     |
    Then User be able to see Overview details in the Order Summary Page as below
      | TollCarrier | AccountNumber                | Contact name | Contact number |
      | PRIO        | 200BHY NATIONAL PRIORITY FOC | Matthew      | 61-481234563   |
    Then User be able to see Delivery details in the Order Summary Page as below
      | Contact name | Phone number | Company name | Address                                  | Customer reference | Delivery instructions                 |
      | John      | 61-412345678 | Dialog Group | 60, Collins Street MELBOURNE VIC 3000 | Ref876543          | Third times Test DeliveryInstructions |
    Then User be able to see first Line item details as below
      | ProductName                   | Quantity | UnitPrice          | Total       | PreprintFrom                                 |
      | Same Day Consignment (LO6626) | Qty 25   | Unit price : $0.00 | Total $0.00 | 60, Collins Street CDE MELBOURNE VIC 3000 AU |
    Then User be able to see second Line item details as below
      | ProductName                    | Quantity | UnitPrice          | Total       |
      | Overnight Consignment (LO5133) | Qty 25   | Unit price : $0.00 | Total $0.00 |
    Then User be able to see third Line item details as below
      | ProductName                   | Quantity | UnitPrice          | Total       |
      | Off Peak Consignment (LO5134) | Qty 25   | Unit price : $0.00 | Total $0.00 |
    Then User must see following message in the Order Summary Page as below
      | GSTMSG                                                                                                                                                                               |
      | * For the purpose of this order, the Total excludes GST . The applicable amount of GST in relation to this order will be included in the final tax invoice Note : All $ units in AUD |
    Then User be able to charges in the Order Summary Page as below
      | TotalSurcharges            | TotalCharges            |
      | TOTAL SURCHARGES AUD $0.00 | Total Charges AUD $0.00 |
    And User have ability to Print the order details in the Order Summary Page as below
