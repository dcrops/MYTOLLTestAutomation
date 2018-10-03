Feature: MYT-8815: Total cubic volume is incorrect for values resulting in volumes smaller than 0.001

  Background:
    Given User is Registered in MyToll and is on Dashboard
    And User clicks on Hamburger menu

  @MYT_8815
  Scenario: Minimum volume should be 0.001
    Given User adds a new template in My Templates
    When User enters "1", "8", "9" and "10" into dimensions
    Then the volume calculated should be "0.001"