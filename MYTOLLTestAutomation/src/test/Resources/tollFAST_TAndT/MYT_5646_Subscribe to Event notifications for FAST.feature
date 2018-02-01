Feature: MYT_5646 Subscribe to Event notifications for FAST

  Background: 
    Given A registered user visits MyToll and logging in

  Scenario: User wants to be able to watch a shipment
    When User views my Profile
    Then User can selects following Notifications to receive for Shipments added to My Watchlist
      | Notification1     | Notification2 | Notification3 | Notification4                               | Notification5                   |
      | Exceptions alerts | Picked up     | In transit    | Out for Delivery/Delivered/Partial Delivery | Awaiting collection / Collected |
