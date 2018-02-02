Feature: MYT-6143 Create Return Page

  Background: 
    Given User is Registered in MyToll and Create Return Page

  @tag1
  Scenario: User Creates a Return for Toll Priority AU
    When User Completes Module 1 in the Create Return Page
      |TollCarrier            |Service                         |Who Pays |AccountNumber |
      |Toll Priority (Aus)    |Auswide 3kg Satchel - Overnight |Sender   |401509 |
     And User Enters Line Items for Returns in Module 2
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Return |        10     |    10  |   10  |   10   |   10   |
     And User enters Pick Up Details
     Then Rate Curtain is appears and the User Clicks it
     And Rate is Displayed with no breakdown and with a disclaimer
     Then User Click Review Button
     And User Verifies Return Review Page
     Then User Clicks Submit Return Button
     When User is on the Return Acknolegment Screen
     Then User is able to Print a Summary Page
     And User is able to Create another Return from this Page
     
     
    @tag2
  	Scenario: User Creates a Return for Toll Priority AU with Extra Line Item
    When User Completes Module 1 in the Create Return Page
      |TollCarrier            |Service                         |Who Pays |AccountNumber |
      |Toll Priority (Aus)    |Auswide 3kg Satchel - Overnight |Sender   |401509 |
     And User Enters Line Items for Returns in Module 2
      | ItemTemplateName     | NumberOfItems | Length | Width | Height | Weight |
      | Automation Return |        10     |    10  |   10  |   10   |   10   |
     When User clicks on ADD NEW LINES
     When User select the Service as below
      | Service       |
      | Refrigeration |
     And User enter following input data
      | Destination    | ItemDescription      | NoOfItems | Item Type | Length | Width | Height | TotalWeight | SenderReference | ReceiverReference | PalletSpaces |
      | MELBOURNE,3000 | Automation Template1 |        10 | Misc      |    100 |   100 |    100 |         900 | Ref123          | Ref456            |            6 |
     And User enters Pick Up Details
     Then Rate Curtain is appears and the User Clicks it
     And Rate is Displayed with no breakdown and with a disclaimer
     Then User Click Review Button
     And User Verifies Return Review Page
     Then User Clicks Submit Return Button
     When User is on the Return Acknolegment Screen
     Then User is able to Print a Summary Page
     And User is able to Navigate back to My Dashboard
     
     
     #Recheck User story when application is available
     
          