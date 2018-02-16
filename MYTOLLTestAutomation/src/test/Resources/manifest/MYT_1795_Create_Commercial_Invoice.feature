Feature: MYT-1795 Manifest : Create Commercial Invoice for International Order

  Background: 
    Given User is Registered in MyToll and is on Shipment Page

    @tag1
  	Scenario: User Creates Commercial Invoice for PrioAU and Saves Commercial Invoice
    When User Completes Module 1 in the Create Shipment Page
      |TollCarrier            |Service                         |
      |Toll Priority (Aus)    |Global - Express Parcels        |
     
      
    