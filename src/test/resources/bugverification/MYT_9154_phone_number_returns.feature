Feature: MYT-9154 enters a phone number

  Background: 
    Given User is Registered in MyToll and is on Create Return Page

  @tag1
  Scenario: User Creates a Return for Toll Priority AU
  	When User Verfies Toll Carrier and select Service
  	| TollCarrier          | Service |
  	| Toll Priority (Aus)  | 3rd Party Return - OffPeak |
  	And User enters shipment overview details to Create a Return
    | AccountNumber | Whopays | Sender             | Receiver             |RAN    |
    |        401509 |       2 |  Access_HQ | TEM Brisbane Address |123456 |
    And User enters following input data for the line item for Return
    | Item description     | No of Items | Length | Width | Height | Weight      | Reference       |
    | Automation Template1 |          10 |    10  |   10  |    10  |          20 | Ref123          |
    When user click Add My contact details box
    And Enters the following contact details and clicks save
    | Name  | Phone Number   | Email |
    |  Tester | 03254854 | testing@hmaio.com |

#  	Then User Clicks Price Now Curtain on Shipment Page
#    Then Rate is Displayed with no breakdown and with a disclaimer - Prio
#	And User closes Rate Enquiry Curtain
#	And User enters Return Reference and Special Instructions as below
#	|Reference | Special Instructions|Ready Time| Closing Time|
#	|Ref1212   | Special Instructions|   12:00  | 15:00       |
#  	Then User Clicks Review and Create Return
#  	Then User Verfies Return Shipment Details on Review Screen
#    | TollCarrier          | Service                    |AccountNumber |RAN    |Reference | Special Instructions| Whopays |Ready Time| Closing Time|
#  	| Toll Priority (Aus)  | 3rd Party Return - OffPeak |      401509  |123456 |Ref1212   | Special Instructions| Receiver|   12:00  | 15:00       |
#  	Then User Verifies Line Item for Returns
#  	|Line Number | Item description     | No of Items | Length | Width | Height | Weight      | Reference       |
#    |  1         | Automation Template1 |          10 |    10  |   10  |    10  |          20 | Ref123          |
#  	Then User Clicks Confrim Return
#    Then User Retreives Return Reference Number and Verifies Confirmation Page
#
#
