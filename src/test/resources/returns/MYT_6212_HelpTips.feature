Feature: MYT-6212 My Help & Tips for Return

  Background: 
    Given User is able to Help & Tips 

  @tag1
  Scenario: User is able to Help & Tips on Create Return Page
    When User Click on MyToll Dashboard and Click Help & Tips
    Then User will navigated to My Help & Tips Page
    And User Clicks Returns Menu
    Then Detailed Help Content would be displayed
    