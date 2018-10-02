Feature: MYT-6850: MODE - Add SHIP to mode for Intermodal & Specialised

  Background: 
    Given User is Registered in MyToll and is on ABOUT ME page

Scenario: Primary address needs to be changed and it needs to be verified that it has been changed and then revert the changes

When user changes the address and clicks SAVE
|Address|
|13 Hewat Dr, HIGHTON, VIC, 3216, AU|

Then SUCCESS msg pops up
#Your profile has been successfully updated.

When user closes the msg and goes to book a pickup
And enters the pickup details

Then the updated address is available under the Sender section

When user goes back to ABOUT ME page and edits the address and saves it
|Address|
|60 Collins St, MELBOURNE|
Then another success msg pops up
