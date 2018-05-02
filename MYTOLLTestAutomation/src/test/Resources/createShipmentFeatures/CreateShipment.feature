Feature: MYT_6138 Save a shipment as a 'Draft'

  Background: 
   Given User is Registered in MyToll and is on MyDashboard

  @tag1
  Scenario: User wants to Save a Shipment as a 'Draft'in TDF
Then User be able to see Overview details in the Order Summary Page as below
      | TollCarrier | AccountNumber | Contact name | Contact number |
      | PRIO        | 200BHY        | Matthew      | 61-481234563   |
    Then User be able to see Delivery details in the Order Summary Page as below
      | Contact name | Phone number | Company name | Address                                  | Customer reference | Delivery instructions                 |
      | Andrea       | 61-412345678 | Dialog Group | 60, Collins Street MELBOURNE VIC 3000 AU | Ref876543          | Third times Test DeliveryInstructions |