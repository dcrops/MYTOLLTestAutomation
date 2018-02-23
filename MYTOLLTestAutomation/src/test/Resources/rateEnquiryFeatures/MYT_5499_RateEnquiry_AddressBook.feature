Feature: MYT-5499 Rate Enquiry - Adress Book record retrieval

  Background: 
    Given User is Registered in MyToll and is on Rate Enquiry Page

  @tag1
  Scenario: User is able to retrive from address book for Orgin Subrub and PostCode under Rate Enquiry - TGX
     When User selects Toll Carrier
      | TollCarrier|
      | Toll IPEC |
      And User select Service
      |Service|
      |Road Express|
      And User Enters and selects Account
      |Account|
      |2230899|
      Then User Click Retrieve from address book under Orgin
      And User is able to select address from address book
      |Recheck when application is available|
      
      
      
  @tag2
  Scenario: User is able to retrive from address book for Desination Subrub and PostCode under Rate Enquiry -TDF
     When User selects Toll Carrier
      | Toll NQX |
      And User select Service
      |Service|
      |General|
      And User Enters and selects Account
      |Account|
      |614060|
      Then User Click Retrieve from address book under Destination
      And User is able to select address from address book
      |Recheck when application is available|
      
      
      