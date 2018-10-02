Feature: MYT_6238 TMS Receive Notifications

  Background: 
    Given A registered user visits MyToll and logging in

  Scenario: User wants to be able receive shipment notification for which user has subscribed
    When User views my Profile
    Then User can selects following Notifications to receive for Shipments added to My Watchlist
      | Notification1     | Notification2 | Notification3 | Notification4                               | Notification5                   |
      | Exceptions alerts | Picked up     | In transit    | Out for Delivery/Delivered/Partial Delivery | Awaiting collection / Collected |

