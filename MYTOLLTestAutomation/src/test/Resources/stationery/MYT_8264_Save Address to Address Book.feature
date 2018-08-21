Feature: MYT_8264 Save Address to Address Book

  Background: 
    Given MyToll Toll Priority AU User logged in and has a Toll Priority AU Standard / Full Financial account and Stationery function is enabled

@Before @After
    Scenario: User has the ability to retrieve a new address stored in the address book
    
   When User selects Order Stationery
    Then User able to select Consignment Notes products and select one of those
      | Product           |
      | Consignment Notes |
    Then User ADD TO CART a Product
      | Product                       |
      | Same Day Consignment (LO6626) |
    Then User selects the cart items
    And Clicks on Proceed to Order
    Then the user must be able to see the Profile Details page
    When the user clicks on Address under Delivery Details
    Then the user must be able to see and click the Add Address section
    Then the user is displayed the Add New Address page
    When the user clicks on the Add Manually link on the page
    And Enters the address details for the company
    |Company Name| Name | Email 				| Phone 		| Address Line 1| Address Line 2| Suburb 		| Postcode | 
    |Testcompany1| RT		|		abc@123.com	|	412123345|		 60					| Collins St		| 	Melbourne| 3000	|
    Then User is navigated to the Profile Details page
    Then the new address details are displayed under the Delivery Details section
    |Name | Email 				| Phone 		|Address| Suburb 		|
    |RT|abc@123.com|412123345|60 Collins St|Melbourne  VIC  3000  AU|
    When the user closes the page the user is navigated back to  Order Stationary page
    Then User selects the cart items
    And Clicks on Proceed to Order
    When the user types the new company name in Address under Delivery Details section
    Then the new address details are displayed under the Delivery Details section
    |Name | Email 				| Phone 		|Address| Suburb 		|
    |RT|abc@123.com|61-412123345|60 Collins St|Melbourne  VIC  3000  AU|
    
   
    
    	