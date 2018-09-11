@MYT6225
Feature: MYT_6225 Toll Energy Shipment, Manifesting and Printing

  Background:
    Given User is Registered in MyToll and is on Shipment page

  @tag1
  Scenario: User wants to be able to create and print Shipments, Manifests and Labels with one line item in Toll Energy and Marine
    When User selects Toll Carrier and select Service
      | TollCarrier            | Service |
      | Toll Energy and Marine | General |
    Then User verifies who pays as "Third party"