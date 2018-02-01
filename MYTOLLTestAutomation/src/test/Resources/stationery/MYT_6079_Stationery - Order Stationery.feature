Feature: MYT_6079 Stationery - Order Stationery

Background: 
Given MyToll Toll Priority AU User logged in and have a Toll Priority AU Standard / Full Financial account and Stationery function is enabled


Scenario: User has the ability to order Toll Priority Stationery online
When User clicks on the mega menu
Then User must be able to see an option to select Order Stationery
 And User selects Order Stationery
 Then User must be able to view the Products in the Order Stationery page
When User increases the values of product
Then User can see following PrePrint FROM details
|Full contact name|Phone number|Company Name|Street Address|Suburb|State|Postcode|Country|
Then User can see following PrePrint TO details
|Full contact name|Phone number|Company Name|Street Address|Suburb|State|Postcode|Country|
