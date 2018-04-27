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
      | PreprintFrom | PreprintTo   | preprintFromContactName | preprintToContactName |
      | AccessHQ     | Dialog Group | Cath                    | Johnson               |
    And User be able to edit preprint detatil as below
      | PreprintFrom  | PreprintTo | preprintFromContactName | preprintToContactName |
      | Australia Post | AccessHQ    | Anna                    | Anne                  |
    When User ADD TO CART a Product
    Then User be able to see product added to the cart and the number of items in the cart increment by 1
      | Product                       | NoOfItems | NoOfQty | TotalItems |
      | Same Day Consignment (LO6626) |         1 ITEMS |      25 |          1 |
    Then User be able to see product added to the cart and the number of items in the cart increment by 1
      | Product                        | NoOfItems | NoOfQty | TotalItems |
      | Overnight Consignment (LO5133) |         2 |      25 |          2 |
    When User edit product details inside the cart
      | PreprintFrom | PreprintFromContactName | PreprintTo  | PreprintToContactName | Message |
      | AccessHQ      | Anna                    | Dialog Group | Anne                  | Success |
    When User PROOCEED TO ORDER
    Then User navigates to Enter your stationery delivery details page
      | Page Heading    | Page Description                             |
      | Profile Details | Enter your stationery delivery details below |
    When User enter Review Order details as below
      | AccountNumber | ContactName | ContactNumber | DeliverAddress | DeliveryContactName | NotifybyEmail              | CustomerReference | DeliveryInstructions      |
      | 200BHY        | George      |     412345678 | AccessHQ       | William             | NNAutomationuser@gmail.com | Ref123456         | Test DeliveryInstructions |
    #Then User can see following PrePrint TO details
      #| Full contact name | Phone number | Company Name | Street Address | Suburb | State | Postcode | Country |
    #When User clicks on Add to cart without selecting products
    #Then User be able to see a message as below
      #| Msg |
      #|     |
    #When User clicks on Add to Cart after selecting products
    #Then User be able to see product added to the cart and the number of orders in the cart increment by 1
    #Then User can see "Checkout" "Edit" "Remove" options
    #When User clicks on "Checkout"
    #When User enteres following details
      #| Toll Carrier | Account Number | Contact Name | Contact Number | Company Name | Address/Location | Full Contact Name | Phone Number | Customer Reference | Delivery Instructions |
    #When User clicks on Notify by Email check box
    #And User enters email addresss
    #When User Clicks on Save to address book check box
    #When User clicks on Submit
    #Then User be able to see Review Page that lists all the details of the order including the Cost
    #Then User must see following message
      #| MSG                                                                                                                                                      |
      #| For the purposes of this order, the Total excludes GST. The applicable amount of GST in relation to this order will be included in the final tax invoice |
    #Then User can see an email will be generated and sent to the email address specified
    #When User clicks the EDIT button
    #Then User returns to the Order Stationery screen and all the previous entered information will be retained
      #| Full contact name | Phone number | Company Name | Street Address | Suburb | State | Postcode | Country |
    #When User clicks on Submit my Order
    #Then User can see the Order Number
    #Then User has ability to print a summary of the entire Order
    #Then User can see the process that will be kicked off
    #Then User must be able to create another Order from this page
    #Then User must be able to go to the Dashboard from this page
