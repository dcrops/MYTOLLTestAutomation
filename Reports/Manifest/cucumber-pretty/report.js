$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/manifest/E2E_Manual_Manifest_TEM.feature");
formatter.feature({
  "line": 1,
  "name": "E2E Manual Manifest TEM - Manual Manifest -\u003e Shipment -\u003e BAP",
  "description": "",
  "id": "e2e-manual-manifest-tem---manual-manifest--\u003e-shipment--\u003e-bap",
  "keyword": "Feature"
});
formatter.before({
  "duration": 114400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is Registered in MyToll and is on My Dashboard",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_is_Registered_in_MyToll_and_is_on_My_Dashboard()"
});
formatter.result({
  "duration": 29393267700,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User Creates a Manual Manifest from Dashboard and Proceeds to BAP - TEM",
  "description": "",
  "id": "e2e-manual-manifest-tem---manual-manifest--\u003e-shipment--\u003e-bap;user-creates-a-manual-manifest-from-dashboard-and-proceeds-to-bap---tem",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    },
    {
      "line": 6,
      "name": "@Shakeout"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User Click My Manifest tab on My Dahsboad and Click Add Manifest Manually",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Creates Manual Manifest",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "ManifestName"
      ],
      "line": 10
    },
    {
      "cells": [
        "Toll Energy and Marine",
        "TEM Perth Address",
        "RandomNameOnRunTime"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Verify Manifest and Proceed to Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "ManifestName"
      ],
      "line": 13
    },
    {
      "cells": [
        "Toll Energy and Marine",
        "RandomNameOnRunTime"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Selects Service",
  "rows": [
    {
      "cells": [
        "Service"
      ],
      "line": 16
    },
    {
      "cells": [
        "General"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters shipment overview details as below - Manual Manifest",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "Whopays",
        "Mode",
        "Receiver"
      ],
      "line": 19
    },
    {
      "cells": [
        "G18508",
        "1",
        "1",
        "TEM Brisbane Address"
      ],
      "line": 20
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User Retrives Sender and Reciver Locations and Detials",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters following input data for the line item",
  "rows": [
    {
      "cells": [
        "Item description",
        "Billing Type",
        "No of Items",
        "Item Type",
        "Length",
        "Width",
        "Height",
        "Weight",
        "SenderReference",
        "ReceiverReference"
      ],
      "line": 23
    },
    {
      "cells": [
        "Automation Template1",
        "ALL UNITS - PER KG",
        "10",
        "Items",
        "100",
        "100",
        "100",
        "900",
        "Ref123",
        "Ref456"
      ],
      "line": 24
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 26
    },
    {
      "cells": [
        "2"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User enters additional information for shipment as below",
  "rows": [
    {
      "cells": [
        "PurchaseOrder",
        "SpecialInstructions"
      ],
      "line": 29
    },
    {
      "cells": [
        "Abcd1234",
        "Test Special Instructions"
      ],
      "line": 30
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Clicks Review and Create Shipment",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User Clicks Continue Manifest on Shipment Review Page",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User Submits and Prints Manifest",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User Navigates Back to Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User Selects the Shipment for BAP",
  "rows": [
    {
      "cells": [
        "ManifestName"
      ],
      "line": 36
    },
    {
      "cells": [
        "Retreived OnRunTime"
      ],
      "line": 37
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Verifies Shipment Details on BAP Page",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "AccountNumber",
        "Service"
      ],
      "line": 39
    },
    {
      "cells": [
        "Toll Energy and Marine",
        "Retreived on Runtime",
        "G18508",
        "General"
      ],
      "line": 40
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "User Verifies Line Item on BAP Page",
  "rows": [
    {
      "cells": [
        "Item description",
        "No of Items",
        "Length",
        "Width",
        "Height",
        "Weight"
      ],
      "line": 42
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "100",
        "100",
        "100",
        "900"
      ],
      "line": 43
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User Selects Dispatch Date and Ready Time",
  "rows": [
    {
      "cells": [
        "ReadyTime"
      ],
      "line": 45
    },
    {
      "cells": [
        "10:00"
      ],
      "line": 46
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User Clicks Review and Book",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "User Confirms Pick Up and Gets BAP Reference Number",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "User Closes the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserClickMyManifestTabOnMyDahsboadandClickAddManifestManually()"
});
formatter.result({
  "duration": 7317952700,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserCreatesManualManifest(DataTable)"
});
formatter.result({
  "duration": 12644677700,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifyManifestAndProceedtoShipment(DataTable)"
});
formatter.result({
  "duration": 3754313400,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserSelectsService(DataTable)"
});
formatter.result({
  "duration": 1670234800,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.User_enters_shipment_overview_details_asbelow_to_get_a_Rate_within_a_Shipment_SpecifcSenderReceiver(DataTable)"
});
formatter.result({
  "duration": 33734923300,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserRetrivesSenderandReciverLocationsandDetials()"
});
formatter.result({
  "duration": 671827600,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_enters_following_input_data_for_the_line_item(DataTable)"
});
formatter.result({
  "duration": 11891051400,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_selects_Dangerous_Goods(DataTable)"
});
formatter.result({
  "duration": 1606658300,
  "status": "passed"
});
formatter.match({
  "location": "MYT_6225_TollEnergyShipmentManifestingPrinting_StepDefinition.user_enters_additional_information_for_shipment_as_below(DataTable)"
});
formatter.result({
  "duration": 958711400,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.UserClicksReviewAndCreateShipment()"
});
formatter.result({
  "duration": 657596800,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.UserClicksContinueManifestonShipmentReviewPage()"
});
formatter.result({
  "duration": 8658941600,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.UserSubmitsandPrintsManifest()"
});
formatter.result({
  "duration": 18213916100,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserNavigatesBackToDashboard()"
});
formatter.result({
  "duration": 1784114000,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserSelectsTheShipmentForBAP(DataTable)"
});
formatter.result({
  "duration": 5997401000,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifiesShipmentDetailsonBAPPage(DataTable)"
});
formatter.result({
  "duration": 1645811700,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifiesLineItemOnBAPPage(DataTable)"
});
formatter.result({
  "duration": 120804700,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserSelectsDispatchDateAndReadyTime(DataTable)"
});
formatter.result({
  "duration": 2612564400,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserClicksReviewAndBook()"
});
formatter.result({
  "duration": 617304000,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserConfirmsPickUpAndGetsBAPReferenceNumber()"
});
formatter.result({
  "duration": 3993255700,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClosestheBrowser()"
});
formatter.result({
  "duration": 712194500,
  "status": "passed"
});
formatter.after({
  "duration": 86400,
  "status": "passed"
});
formatter.uri("src/test/Resources/manifest/E2E_Manual_Manifest_TMS.feature");
formatter.feature({
  "line": 1,
  "name": "E2E Manual Manifest TMS - Manual Manifest -\u003e Shipment -\u003e BAP",
  "description": "",
  "id": "e2e-manual-manifest-tms---manual-manifest--\u003e-shipment--\u003e-bap",
  "keyword": "Feature"
});
formatter.before({
  "duration": 45000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is Registered in MyToll and is on My Dashboard",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_is_Registered_in_MyToll_and_is_on_My_Dashboard()"
});
formatter.result({
  "duration": 29549114600,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User Creates a Manual Manifest from Dashboard and Proceeds to BAP  - TMS",
  "description": "",
  "id": "e2e-manual-manifest-tms---manual-manifest--\u003e-shipment--\u003e-bap;user-creates-a-manual-manifest-from-dashboard-and-proceeds-to-bap----tms",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    },
    {
      "line": 6,
      "name": "@Shakeout"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User Click My Manifest tab on My Dahsboad and Click Add Manifest Manually",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Creates Manual Manifest",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "ManifestName"
      ],
      "line": 10
    },
    {
      "cells": [
        "Toll Mining Services",
        "TMS Port Adelaide",
        "RandomNameOnRunTime"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Verify Manifest and Proceed to Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "ManifestName"
      ],
      "line": 13
    },
    {
      "cells": [
        "Toll Mining Services",
        "RandomNameOnRunTime"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Selects Service",
  "rows": [
    {
      "cells": [
        "Service"
      ],
      "line": 16
    },
    {
      "cells": [
        "General"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters shipment overview details as below - Manual Manifest",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "Whopays",
        "Mode",
        "Receiver"
      ],
      "line": 19
    },
    {
      "cells": [
        "790135",
        "1",
        "1",
        "TMS Roxby Downs"
      ],
      "line": 20
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User Retrives Sender and Reciver Locations and Detials",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters following input data for the line item",
  "rows": [
    {
      "cells": [
        "Item description",
        "Billing Type",
        "No of Items",
        "Item Type",
        "Length",
        "Width",
        "Height",
        "Weight",
        "SenderReference",
        "ReceiverReference"
      ],
      "line": 23
    },
    {
      "cells": [
        "Automation Template1",
        "General Freight",
        "10",
        "Items",
        "100",
        "100",
        "100",
        "900",
        "Ref123",
        "Ref456"
      ],
      "line": 24
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 26
    },
    {
      "cells": [
        "2"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User enters additional information for shipment as below",
  "rows": [
    {
      "cells": [
        "PurchaseOrder",
        "SpecialInstructions"
      ],
      "line": 29
    },
    {
      "cells": [
        "Abcd1234",
        "Test Special Instructions"
      ],
      "line": 30
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Clicks Review and Create Shipment",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User Clicks Continue Manifest on Shipment Review Page",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User Submits and Prints Manifest",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User Navigates Back to Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User Selects the Shipment for BAP",
  "rows": [
    {
      "cells": [
        "ManifestName"
      ],
      "line": 36
    },
    {
      "cells": [
        "Retreived OnRunTime"
      ],
      "line": 37
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Verifies Shipment Details on BAP Page",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "AccountNumber",
        "Service"
      ],
      "line": 39
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "Retreived on Runtime",
        "790135",
        "General"
      ],
      "line": 40
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "User Enters Phone Number",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "User Verifies Line Item on BAP Page",
  "rows": [
    {
      "cells": [
        "Item description",
        "No of Items",
        "Length",
        "Width",
        "Height",
        "Weight"
      ],
      "line": 43
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "100",
        "100",
        "100",
        "900"
      ],
      "line": 44
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User Selects Dispatch Date and Ready Time",
  "rows": [
    {
      "cells": [
        "ReadyTime"
      ],
      "line": 46
    },
    {
      "cells": [
        "10:00"
      ],
      "line": 47
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "User Clicks Review and Book",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "User Confirms Pick Up and Gets BAP Reference Number",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "User Closes the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserClickMyManifestTabOnMyDahsboadandClickAddManifestManually()"
});
formatter.result({
  "duration": 7324362500,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserCreatesManualManifest(DataTable)"
});
formatter.result({
  "duration": 10162454200,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifyManifestAndProceedtoShipment(DataTable)"
});
formatter.result({
  "duration": 6243087600,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserSelectsService(DataTable)"
});
formatter.result({
  "duration": 1682484600,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.User_enters_shipment_overview_details_asbelow_to_get_a_Rate_within_a_Shipment_SpecifcSenderReceiver(DataTable)"
});
formatter.result({
  "duration": 33675958800,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserRetrivesSenderandReciverLocationsandDetials()"
});
formatter.result({
  "duration": 671764700,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_enters_following_input_data_for_the_line_item(DataTable)"
});
formatter.result({
  "duration": 11817913000,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_selects_Dangerous_Goods(DataTable)"
});
formatter.result({
  "duration": 1612972100,
  "status": "passed"
});
formatter.match({
  "location": "MYT_6225_TollEnergyShipmentManifestingPrinting_StepDefinition.user_enters_additional_information_for_shipment_as_below(DataTable)"
});
formatter.result({
  "duration": 954022000,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.UserClicksReviewAndCreateShipment()"
});
formatter.result({
  "duration": 633547100,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.UserClicksContinueManifestonShipmentReviewPage()"
});
formatter.result({
  "duration": 5280232300,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.UserSubmitsandPrintsManifest()"
});
formatter.result({
  "duration": 18134311000,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserNavigatesBackToDashboard()"
});
formatter.result({
  "duration": 1683501200,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserSelectsTheShipmentForBAP(DataTable)"
});
formatter.result({
  "duration": 7132284900,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifiesShipmentDetailsonBAPPage(DataTable)"
});
formatter.result({
  "duration": 1605515000,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserEntersPhoneNumber()"
});
formatter.result({
  "duration": 705044400,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifiesLineItemOnBAPPage(DataTable)"
});
formatter.result({
  "duration": 121959100,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserSelectsDispatchDateAndReadyTime(DataTable)"
});
formatter.result({
  "duration": 2584316400,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserClicksReviewAndBook()"
});
formatter.result({
  "duration": 647060200,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserConfirmsPickUpAndGetsBAPReferenceNumber()"
});
formatter.result({
  "duration": 3822820600,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClosestheBrowser()"
});
formatter.result({
  "duration": 689224000,
  "status": "passed"
});
formatter.after({
  "duration": 52700,
  "status": "passed"
});
formatter.uri("src/test/Resources/manifest/MYT_1795_Create_Commercial_Invoice.feature");
formatter.feature({
  "line": 1,
  "name": "MYT-1795 Manifest : Create Commercial Invoice for International Order",
  "description": "",
  "id": "myt-1795-manifest-:-create-commercial-invoice-for-international-order",
  "keyword": "Feature"
});
formatter.before({
  "duration": 93900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is Registered in MyToll and is on Shipment Page - Commercial Invoice",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_is_Registered_in_MyToll_and_is_on_Shipment_page_Commercial_Invoice()"
});
formatter.result({
  "duration": 67811597600,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User Creates Commercial Invoice for PrioAU and Saves Commercial Invoice",
  "description": "",
  "id": "myt-1795-manifest-:-create-commercial-invoice-for-international-order;user-creates-commercial-invoice-for-prioau-and-saves-commercial-invoice",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    },
    {
      "line": 6,
      "name": "@Shakeout"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User selects Toll Carrier and select Service",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service"
      ],
      "line": 9
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "Global - Express Parcels"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters shipment overview details as below Draft Shipment - Specific Sender Receiver - Prio",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "Whopays",
        "Sender",
        "Receiver"
      ],
      "line": 12
    },
    {
      "cells": [
        "401509",
        "1",
        "IPEC Melbourne",
        "NZ Address"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Retrives Sender and Reciver Locations and Detials",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters following input data for the line item for Draft Shipment - Prio",
  "rows": [
    {
      "cells": [
        "Item description",
        "No of Items",
        "Length",
        "Width",
        "Height",
        "Weight",
        "SenderReference",
        "ReceiverReference"
      ],
      "line": 16
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "90",
        "Ref123",
        "Ref456"
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 19
    },
    {
      "cells": [
        "2"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Enters Export Declarations",
  "rows": [
    {
      "cells": [
        "TypeOfExport",
        "DeclaredValue",
        "DeclaredValueCurrency",
        "WhoPaysDutiesTaxes",
        "CommodityCode"
      ],
      "line": 22
    },
    {
      "cells": [
        "Permanent",
        "5000",
        "New Zealand dollar",
        "Sender",
        "ABC123"
      ],
      "line": 23
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User Click Review and Create Shipment",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User Prints Labels and Enables Commercial Invoice",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Creates Commercial Invoice and Verifies Page Details",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Verifies Shipment Details Commercial Invoice Page",
  "rows": [
    {
      "cells": [
        "NumberOfItems",
        "Weight",
        "DeclaredValue",
        "CountryOfExportAU",
        "DestinationNZ",
        "Other Details"
      ],
      "line": 28
    },
    {
      "cells": [
        "10",
        "90",
        "5000",
        "AUSTRALIA",
        "NEW ZEALAND",
        "Retreived on Run Time"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User Enters Commercial Invoice Item Details",
  "rows": [
    {
      "cells": [
        "CommercialInvoiceDes",
        "PartNo",
        "ACHECC",
        "NumberOfItems",
        "Weight",
        "UnitValue",
        "DeclaredValue"
      ],
      "line": 31
    },
    {
      "cells": [
        "CommercialInvoiceDes",
        "11",
        "Test12",
        "10",
        "90",
        "500",
        "5000"
      ],
      "line": 32
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User Enters Commercial Invoice Other Details And Clicks Save",
  "rows": [
    {
      "cells": [
        "TypeOfExport",
        "TermsofTrade"
      ],
      "line": 34
    },
    {
      "cells": [
        "Permanent",
        "2"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User Verifies Shipment Details on Commercial Invoice Review Page",
  "rows": [
    {
      "cells": [
        "CommercialInvoiceDes",
        "PartNo",
        "ACHECC",
        "NumberOfItems",
        "Weight",
        "UnitValue",
        "DeclaredValue"
      ],
      "line": 37
    },
    {
      "cells": [
        "CommercialInvoiceDes",
        "11",
        "Test12",
        "10",
        "90",
        "500",
        "5000"
      ],
      "line": 38
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "User Prints Commercial Invoice",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateShipmentCommonStepsDefinitions.user_selects_Toll_Carrier_and_select_Service(DataTable)"
});
formatter.result({
  "duration": 4496871000,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.User_enters_shipment_overview_details_asbelow_Draft_Shipment_SpecifcSenderReceiverPrio(DataTable)"
});
formatter.result({
  "duration": 36524538100,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserRetrivesSenderandReciverLocationsandDetials()"
});
formatter.result({
  "duration": 677474400,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_enters_following_input_data_for_the_line_item_ForDraftShipment_Prio(DataTable)"
});
formatter.result({
  "duration": 7153855800,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_selects_Dangerous_Goods(DataTable)"
});
formatter.result({
  "duration": 1625539200,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserEntersExportDeclarations(DataTable)"
});
formatter.result({
  "duration": 4485646900,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserClickReviewandCreateShipment()"
});
formatter.result({
  "duration": 3668000300,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserPrintsLabelsandEnablesCommercialInvoice()"
});
formatter.result({
  "duration": 16754184200,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserCreatesCommercialInvoiceandVerifiesPageDetails()"
});
formatter.result({
  "duration": 7844379900,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifiesShipmentDetailsCommercialInvoicePage(DataTable)"
});
formatter.result({
  "duration": 576845700,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserEntersCommercialInvoiceItemDetails(DataTable)"
});
formatter.result({
  "duration": 7841509300,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserEntersCommercialInvoiceOtherItemDetailsAndClicksSave(DataTable)"
});
formatter.result({
  "duration": 2852023200,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifiesShipmentDetailsOnCommercialInvoiceReviewPage(DataTable)"
});
formatter.result({
  "duration": 1846436300,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserPrintsCommercialInvoice()"
});
formatter.result({
  "duration": 1899024400,
  "status": "passed"
});
formatter.after({
  "duration": 731133100,
  "status": "passed"
});
formatter.before({
  "duration": 67400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is Registered in MyToll and is on Shipment Page - Commercial Invoice",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_is_Registered_in_MyToll_and_is_on_Shipment_page_Commercial_Invoice()"
});
formatter.result({
  "duration": 30231145800,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "User Creates Commercial Invoice for PrioNZ and Saves Commercial Invoice",
  "description": "",
  "id": "myt-1795-manifest-:-create-commercial-invoice-for-international-order;user-creates-commercial-invoice-for-prionz-and-saves-commercial-invoice",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "User selects Toll Carrier and select Service",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service"
      ],
      "line": 45
    },
    {
      "cells": [
        "Toll Priority (NZ)",
        "Global - Express Parcels"
      ],
      "line": 46
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "User enters shipment overview details as below Draft Shipment - Specific Sender Receiver - Prio",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "Whopays",
        "Sender",
        "Receiver"
      ],
      "line": 48
    },
    {
      "cells": [
        "100181",
        "1",
        "TEM Perth Address",
        "NZ Address"
      ],
      "line": 49
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "User Retrives Sender and Reciver Locations and Detials",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User enters following input data for the line item for Draft Shipment - Prio",
  "rows": [
    {
      "cells": [
        "Item description",
        "No of Items",
        "Length",
        "Width",
        "Height",
        "Weight",
        "SenderReference",
        "ReceiverReference"
      ],
      "line": 52
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "90",
        "Ref123",
        "Ref456"
      ],
      "line": 53
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 55
    },
    {
      "cells": [
        "2"
      ],
      "line": 56
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "User Enters Export Declarations",
  "rows": [
    {
      "cells": [
        "TypeOfExport",
        "DeclaredValue",
        "DeclaredValueCurrency",
        "WhoPaysDutiesTaxes",
        "CommodityCode"
      ],
      "line": 58
    },
    {
      "cells": [
        "Permanent",
        "5000",
        "New Zealand dollar",
        "Sender",
        "NZ123"
      ],
      "line": 59
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "User Click Review and Create Shipment",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "User Prints Labels and Enables Commercial Invoice",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "User Creates Commercial Invoice and Verifies Page Details",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "User Verifies Shipment Details Commercial Invoice Page",
  "rows": [
    {
      "cells": [
        "NumberOfItems",
        "Weight",
        "DeclaredValue",
        "CountryOfExportAU",
        "DestinationNZ",
        "Other Details"
      ],
      "line": 64
    },
    {
      "cells": [
        "10",
        "90",
        "5000",
        "AUSTRALIA",
        "NEW ZEALAND",
        "Retreived on Run Time"
      ],
      "line": 65
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "User Enters Commercial Invoice Item Details",
  "rows": [
    {
      "cells": [
        "CommercialInvoiceDes",
        "PartNo",
        "ACHECC",
        "NumberOfItems",
        "Weight",
        "UnitValue",
        "DeclaredValue"
      ],
      "line": 67
    },
    {
      "cells": [
        "CommercialInvoiceDes",
        "11",
        "Test12",
        "10",
        "90",
        "500",
        "5000"
      ],
      "line": 68
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "User Enters Commercial Invoice Other Details And Clicks Save",
  "rows": [
    {
      "cells": [
        "TypeOfExport",
        "TermsofTrade"
      ],
      "line": 70
    },
    {
      "cells": [
        "Permanent",
        "2"
      ],
      "line": 71
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "User Verifies Shipment Details on Commercial Invoice Review Page",
  "rows": [
    {
      "cells": [
        "CommercialInvoiceDes",
        "PartNo",
        "ACHECC",
        "NumberOfItems",
        "Weight",
        "UnitValue",
        "DeclaredValue"
      ],
      "line": 73
    },
    {
      "cells": [
        "CommercialInvoiceDes",
        "11",
        "Test12",
        "10",
        "90",
        "500",
        "5000"
      ],
      "line": 74
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "User Prints Commercial Invoice",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateShipmentCommonStepsDefinitions.user_selects_Toll_Carrier_and_select_Service(DataTable)"
});
formatter.result({
  "duration": 3728126400,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.User_enters_shipment_overview_details_asbelow_Draft_Shipment_SpecifcSenderReceiverPrio(DataTable)"
});
formatter.result({
  "duration": 36671017600,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserRetrivesSenderandReciverLocationsandDetials()"
});
formatter.result({
  "duration": 701707800,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_enters_following_input_data_for_the_line_item_ForDraftShipment_Prio(DataTable)"
});
formatter.result({
  "duration": 7313578600,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_selects_Dangerous_Goods(DataTable)"
});
formatter.result({
  "duration": 1605145800,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserEntersExportDeclarations(DataTable)"
});
formatter.result({
  "duration": 4497483700,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserClickReviewandCreateShipment()"
});
formatter.result({
  "duration": 3626556700,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserPrintsLabelsandEnablesCommercialInvoice()"
});
formatter.result({
  "duration": 15740552000,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserCreatesCommercialInvoiceandVerifiesPageDetails()"
});
formatter.result({
  "duration": 3765875300,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifiesShipmentDetailsCommercialInvoicePage(DataTable)"
});
formatter.result({
  "duration": 575653300,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserEntersCommercialInvoiceItemDetails(DataTable)"
});
formatter.result({
  "duration": 7841949000,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserEntersCommercialInvoiceOtherItemDetailsAndClicksSave(DataTable)"
});
formatter.result({
  "duration": 2880639100,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifiesShipmentDetailsOnCommercialInvoiceReviewPage(DataTable)"
});
formatter.result({
  "duration": 1717131400,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserPrintsCommercialInvoice()"
});
formatter.result({
  "duration": 1667729800,
  "status": "passed"
});
formatter.after({
  "duration": 698330200,
  "status": "passed"
});
formatter.uri("src/test/Resources/manifest/MYT_6292_Manifest_SaveShipmentAsDraft.feature");
formatter.feature({
  "line": 1,
  "name": "MYT-6292 Manifest : Save Shipment as a Draft from open Manifests",
  "description": "",
  "id": "myt-6292-manifest-:-save-shipment-as-a-draft-from-open-manifests",
  "keyword": "Feature"
});
formatter.before({
  "duration": 117300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is Registered in MyToll and is on My Dashboard",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_is_Registered_in_MyToll_and_is_on_My_Dashboard()"
});
formatter.result({
  "duration": 35775495700,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User Saves Shipment In Progress from the Manifest Tab as a Draft - TDF",
  "description": "",
  "id": "myt-6292-manifest-:-save-shipment-as-a-draft-from-open-manifests;user-saves-shipment-in-progress-from-the-manifest-tab-as-a-draft---tdf",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    },
    {
      "line": 6,
      "name": "@Fail"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User Click My Manifest tab on My Dahsboad and Click Add Manifest Manually",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Creates Manual Manifest",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "ManifestName"
      ],
      "line": 10
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "TEM Perth Address",
        "RandomNameOnRunTime"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Verify Manifest and Proceed to Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "ManifestName"
      ],
      "line": 13
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "RandomNameOnRunTime"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Selects Service",
  "rows": [
    {
      "cells": [
        "Service"
      ],
      "line": 16
    },
    {
      "cells": [
        "General"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters shipment overview details as below - Manual Manifest",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "Whopays",
        "Mode",
        "Receiver"
      ],
      "line": 19
    },
    {
      "cells": [
        "614060",
        "1",
        "1",
        "TEM Brisbane Address"
      ],
      "line": 20
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User enters following input data for the line item",
  "rows": [
    {
      "cells": [
        "Item description",
        "Billing Type",
        "No of Items",
        "Item Type",
        "Length",
        "Width",
        "Height",
        "Weight",
        "SenderReference",
        "ReceiverReference"
      ],
      "line": 22
    },
    {
      "cells": [
        "Automation Template1",
        "General Freight",
        "10",
        "Misc",
        "100",
        "100",
        "100",
        "900",
        "Ref123",
        "Ref456"
      ],
      "line": 23
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 25
    },
    {
      "cells": [
        "2"
      ],
      "line": 26
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Clicks Save Draft on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User Navigates to Draft Shipment Page and Verifies Page Items",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver",
        "Dispatch date"
      ],
      "line": 29
    },
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver",
        "Dispatch date"
      ],
      "line": 30
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User Click Complete Shipment and is Navagiated Back to Create Shipment page",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 32
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 33
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User Verifies if Shipment Details are correct in the Shipment Page",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service",
        "AccountNumber",
        "Whopays",
        "Mode",
        "Sender",
        "Receiver",
        "Item description",
        "Billing Type",
        "No of Items",
        "Length",
        "Width",
        "Height",
        "Weight"
      ],
      "line": 35
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "General",
        "614060",
        "1",
        "1",
        "TEM Perth Address",
        "TEM Brisbane Address",
        "Automation Template1",
        "General Freight",
        "10",
        "100",
        "100",
        "100",
        "900"
      ],
      "line": 36
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User Navigates back to Dashboard and Draft Shipment Tab",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Deletes Draft Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 39
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 40
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "User Cancels Delete Draft Search",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "User Deletes Draft Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 43
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 44
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "User Confirms Delete Draft Search",
  "keyword": "Then "
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserClickMyManifestTabOnMyDahsboadandClickAddManifestManually()"
});
formatter.result({
  "duration": 7322556500,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserCreatesManualManifest(DataTable)"
});
formatter.result({
  "duration": 10193530000,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifyManifestAndProceedtoShipment(DataTable)"
});
formatter.result({
  "duration": 3911049900,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserSelectsService(DataTable)"
});
formatter.result({
  "duration": 1694620400,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.User_enters_shipment_overview_details_asbelow_to_get_a_Rate_within_a_Shipment_SpecifcSenderReceiver(DataTable)"
});
formatter.result({
  "duration": 33700446100,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_enters_following_input_data_for_the_line_item(DataTable)"
});
formatter.result({
  "duration": 12079629400,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_selects_Dangerous_Goods(DataTable)"
});
formatter.result({
  "duration": 1594046900,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClicksSaveDraftOnShipmentDPage()"
});
formatter.result({
  "duration": 4842304500,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserNavigatesToDraftShipmentPageAndVerifiesPageItems(DataTable)"
});
formatter.result({
  "duration": 5931485500,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClickCompleteShipmentandisNavagiatedBacktoCreateShipmentPage(DataTable)"
});
formatter.result({
  "duration": 62589859600,
  "error_message": "java.lang.AssertionError: element with: By.xpath: \t//*/td[preceding-sibling::td[text()\u003d\u0027Intermodal \u0026 Specialised\u0027]][preceding-sibling::td[text()\u003d\u0027TEM Perth Address\u0027]] [preceding-sibling::td[text()\u003d\u0027TEM Brisbane Address\u0027]] [preceding-sibling::td[text()\u003d\u002726 Sep 2018\u0027]]/a not found\u003cbr\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat global.PageBase.moveToElement(PageBase.java:442)\r\n\tat global.PageBase.click(PageBase.java:330)\r\n\tat steps.dashboard.DashboardCommonStepsDefinitions.UserClickCompleteShipmentandisNavagiatedBacktoCreateShipmentPage(DashboardCommonStepsDefinitions.java:155)\r\n\tat ✽.And User Click Complete Shipment and is Navagiated Back to Create Shipment page(src/test/Resources/manifest/MYT_6292_Manifest_SaveShipmentAsDraft.feature:31)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserVerifiesIfShipmentDetailsareCorrectforModule1(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserNavigatesBacktoDashboardandDraftShipment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserDeletesDraftShipment(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserCancelsDeleteSavedSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserDeletesDraftShipment(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserConfirmsDeleteSavedSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 712522800,
  "status": "passed"
});
formatter.before({
  "duration": 205900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is Registered in MyToll and is on My Dashboard",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_is_Registered_in_MyToll_and_is_on_My_Dashboard()"
});
formatter.result({
  "duration": 28113197800,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "User Saves Shipment In Progress from the Manifest Tab as a Draft - TGX",
  "description": "",
  "id": "myt-6292-manifest-:-save-shipment-as-a-draft-from-open-manifests;user-saves-shipment-in-progress-from-the-manifest-tab-as-a-draft---tgx",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@tag2"
    },
    {
      "line": 48,
      "name": "@Fail"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "User Click My Manifest tab on My Dahsboad and Click Add Manifest Manually",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "User Creates Manual Manifest",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "ManifestName"
      ],
      "line": 52
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "TEM Perth Address",
        "RandomNameOnRunTime"
      ],
      "line": 53
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "User Verify Manifest and Proceed to Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "ManifestName"
      ],
      "line": 55
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "RandomNameOnRunTime"
      ],
      "line": 56
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "User Selects Service",
  "rows": [
    {
      "cells": [
        "Service"
      ],
      "line": 58
    },
    {
      "cells": [
        "Parcels - Overnight"
      ],
      "line": 59
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "User enters shipment overview details as below Draft Shipment - Manual Manifest - Prio",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "Whopays",
        "Receiver"
      ],
      "line": 61
    },
    {
      "cells": [
        "401509",
        "1",
        "TEM Brisbane Address"
      ],
      "line": 62
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "User enters following input data for the line item for Draft Shipment - Prio",
  "rows": [
    {
      "cells": [
        "Item description",
        "No of Items",
        "Length",
        "Width",
        "Height",
        "Weight",
        "SenderReference",
        "ReceiverReference"
      ],
      "line": 64
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "90",
        "Ref123",
        "Ref456"
      ],
      "line": 65
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 67
    },
    {
      "cells": [
        "2"
      ],
      "line": 68
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "User Clicks Save Draft on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "User Navigates to Draft Shipment Page and Verifies Page Items",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver",
        "Dispatch date"
      ],
      "line": 71
    },
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver",
        "Dispatch date"
      ],
      "line": 72
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "User Click Complete Shipment and is Navagiated Back to Create Shipment page",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 74
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 75
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "User Verifies if Shipment Details are correct in the Shipment Page - Prio",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service",
        "AccountNumber",
        "Whopays",
        "Sender",
        "Receiver",
        "Item description",
        "No of Items",
        "Length",
        "Width",
        "Height",
        "Weight"
      ],
      "line": 77
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "Parcels - Overnight",
        "401509",
        "1",
        "TEM Perth Address",
        "TEM Brisbane Address",
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "90"
      ],
      "line": 78
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "User Navigates back to Dashboard and Draft Shipment Tab",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "User Deletes Draft Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 81
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 82
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "User Cancels Delete Draft Search",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "User Deletes Draft Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 85
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 86
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "User Confirms Delete Draft Search",
  "keyword": "Then "
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserClickMyManifestTabOnMyDahsboadandClickAddManifestManually()"
});
formatter.result({
  "duration": 7272483500,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserCreatesManualManifest(DataTable)"
});
formatter.result({
  "duration": 9961347600,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserVerifyManifestAndProceedtoShipment(DataTable)"
});
formatter.result({
  "duration": 4064605100,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.UserSelectsService(DataTable)"
});
formatter.result({
  "duration": 1692710600,
  "status": "passed"
});
formatter.match({
  "location": "ManifestCommonStepsDefinitions.User_enters_shipment_overview_details_asbelow_Draft_Shipment_ManualManifestPrio(DataTable)"
});
formatter.result({
  "duration": 33210350200,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_enters_following_input_data_for_the_line_item_ForDraftShipment_Prio(DataTable)"
});
formatter.result({
  "duration": 7119597500,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_selects_Dangerous_Goods(DataTable)"
});
formatter.result({
  "duration": 1613466500,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClicksSaveDraftOnShipmentDPage()"
});
formatter.result({
  "duration": 4622529800,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserNavigatesToDraftShipmentPageAndVerifiesPageItems(DataTable)"
});
formatter.result({
  "duration": 5926231500,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClickCompleteShipmentandisNavagiatedBacktoCreateShipmentPage(DataTable)"
});
formatter.result({
  "duration": 62597621600,
  "error_message": "java.lang.AssertionError: element with: By.xpath: \t//*/td[preceding-sibling::td[text()\u003d\u0027Toll Priority (Aus)\u0027]][preceding-sibling::td[text()\u003d\u0027TEM Perth Address\u0027]] [preceding-sibling::td[text()\u003d\u0027TEM Brisbane Address\u0027]] [preceding-sibling::td[text()\u003d\u002726 Sep 2018\u0027]]/a not found\u003cbr\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat global.PageBase.moveToElement(PageBase.java:442)\r\n\tat global.PageBase.click(PageBase.java:330)\r\n\tat steps.dashboard.DashboardCommonStepsDefinitions.UserClickCompleteShipmentandisNavagiatedBacktoCreateShipmentPage(DashboardCommonStepsDefinitions.java:155)\r\n\tat ✽.And User Click Complete Shipment and is Navagiated Back to Create Shipment page(src/test/Resources/manifest/MYT_6292_Manifest_SaveShipmentAsDraft.feature:73)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserVerifiesIfShipmentDetailsareCorrectforModule1Prio(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserNavigatesBacktoDashboardandDraftShipment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserDeletesDraftShipment(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserCancelsDeleteSavedSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserDeletesDraftShipment(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserConfirmsDeleteSavedSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 705996600,
  "status": "passed"
});
});