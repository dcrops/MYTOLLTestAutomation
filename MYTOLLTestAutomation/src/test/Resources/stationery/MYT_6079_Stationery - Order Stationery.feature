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
    Then User be able to see product added to the cart and the number of items in the cart increment by 1
      | Product                       | NoOfItems | NoOfQty | TotalItems     | PreprintLabel |
      | Same Day Consignment (LO6626) | 1 ITEMS   | Qty: 25 | Total Items: 1 | Preprint      |
    When User clicks Edit preprint icon in the cart
    When User edits preprint details inside the cart
      | NoOfQtyIncrease | NoOfQtyDecrease | PreprintFrom | PreprintFromContactName | PreprintTo     | PreprintToContactName | Message                                                  |
      |              30 |              25 | AccessHQ     | Anna                    | Australia Post | Anne                  | Stationary type has been successfully added to your cart |
    When User ADD TO CART a second product
    Then User be able to see second product added to the cart and the number of items in the cart increment by 1
      | Product                        | NoOfItems | NoOfQty | TotalItems     |
      | Overnight Consignment (LO5133) | 2 ITEMS   | Qty: 25 | Total Items: 2 |
    When User removes second product from the cart
    Then User be able to see cart has been updated as below
      | Product                       | NoOfItems | NoOfQty | TotalItems     | PreprintLabel |
      | Same Day Consignment (LO6626) | 1 ITEMS   | Qty: 25 | Total Items: 1 | Preprint      |
    When User ADD TO CART a second product
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
      | PRIO        | 0007CDS       | Joe          | 61-412345678   |
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
      | GSTMSG                                                                                                                                                        |
      | * For the purpose of this order, the Total excludes GST . The applicable amount of GST in relation to this order will be included in the final tax invoice Note : All $ units in AUD |
    Then User be able to charges in Review page as below
      | TotalSurcharges | TotalCharges |
      | TOTAL SURCHARGES AUD $0.00       |Total Charges AUD $0.00    |
   When User clicks the Edit Delivery Details button
    When User enter Review Order details as below
      | AccountNumber            | ContactName | ContactNumber | DeliverAddress | DeliveryContactName | NotifybyEmail              | CustomerReference | DeliveryInstructions      |
      | 200B1F NHP ELECTRICAL | Nadiki        |     498765432 | Toll Group   | Henry             | sitautomationuser@yahoo.com| 98765Ref        | New Test DeliveryInstructions |
       When User clicks Review Order
    Then User be able to see Overview details in the Review Page as below
      | TollCarrier | AccountNumber | Contact name | Contact number |
      | PRIO        | 200B1F       | Nadiki          | 61-498765432   |
    Then User be able to see Delivery details in the Review page as below
      | Contact name | Phone number | Company name | Address                                  | Customer reference | Delivery instructions     |
      | Henry       | 61-498765432 | Toll Group | 60, Collins Street MELBOURNE VIC 3000 AU | 98765Ref           | New Test DeliveryInstructions |
    Then User be able to see first Line item details as below
      | ProductName                   | Quantity | UnitPrice          | Total       | PreprintFrom                                 |
      | Same Day Consignment (LO6626) | Qty 25   | Unit price : $0.00 | Total $0.00 | 60, Collins Street CDE MELBOURNE VIC 3000 AU |
    Then User be able to see second Line item details as below
      | ProductName                    | Quantity | UnitPrice          | Total       |
      | Overnight Consignment (LO5133) | Qty 25   | Unit price : $0.00 | Total $0.00 |              
    Then User must see following message
      | GSTMSG                                                                                                                                                        |
      | * For the purpose of this order, the Total excludes GST . The applicable amount of GST in relation to this order will be included in the final tax invoice Note : All $ units in AUD |
    Then User be able to charges in Review page as below
      | TotalSurcharges | TotalCharges |
      | TOTAL SURCHARGES AUD $0.00       |Total Charges AUD $0.00    |   
       
    #Then User can see an email will be generated and sent to the email address specified
    
    #Then User returns to the Order Stationery screen and all the previous entered information will be retained
      #| Full contact name | Phone number | Company Name | Street Address | Suburb | State | Postcode | Country |
    #When User clicks on Submit my Order
    #Then User can see the Order Number
    #Then User has ability to print a summary of the entire Order
    #Then User can see the process that will be kicked off
    #Then User must be able to create another Order from this page
    #Then User must be able to go to the Dashboard from this page
    # When User Clicks on Confirm Order
    
