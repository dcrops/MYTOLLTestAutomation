Feature: MYT_6138 Save a shipment as a 'Draft'

  Background: 
   Given User is Registered in MyToll and is on MyDashboard

  @tag1
  Scenario: User wants to Save a Shipment as a 'Draft'in TDF
  When User expands the Payment Adjustments section
    |PaymentAdjustments|
    | PAYMENT ADJUSTMENTS|