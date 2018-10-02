$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/dashboard/MYT_3539_Access_Draft_Shipment.feature");
formatter.feature({
  "line": 1,
  "name": "MYT_3539 Access \u0027Draft\u0027 Shipment from My Dashboard",
  "description": "",
  "id": "myt-3539-access-\u0027draft\u0027-shipment-from-my-dashboard",
  "keyword": "Feature"
});
formatter.before({
  "duration": 147200,
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
  "name": "User is Registered in MyToll and is on Shipment Page - Draft Shipment",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_is_Registered_in_MyToll_and_is_on_Shipment_page()"
});
formatter.result({
  "duration": 31447370600,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User accesses \u0027Draft Shipment\u0027 from My Dashboard - TDF",
  "description": "",
  "id": "myt-3539-access-\u0027draft\u0027-shipment-from-my-dashboard;user-accesses-\u0027draft-shipment\u0027-from-my-dashboard---tdf",
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
        "Intermodal \u0026 Specialised",
        "General"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters shipment overview details as below - Specific Sender Receiver",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "Whopays",
        "Mode",
        "Sender",
        "Receiver"
      ],
      "line": 12
    },
    {
      "cells": [
        "614060",
        "1",
        "1",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
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
      "line": 15
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
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 18
    },
    {
      "cells": [
        "2"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Clicks Save Draft on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User Navigates to Draft Shipment Page and Verifies Page Items",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver",
        "Dispatch date"
      ],
      "line": 22
    },
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver",
        "Dispatch date"
      ],
      "line": 23
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User Click Complete Shipment and is Navagiated Back to Create Shipment page",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 25
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 26
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
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
      "line": 28
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
      "line": 29
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User Navigates back to Dashboard and Draft Shipment Tab",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Deletes Draft Shipment",
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
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User Cancels Delete Draft Search",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User Deletes Draft Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 36
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 37
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "User Confirms Delete Draft Search",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateShipmentCommonStepsDefinitions.user_selects_Toll_Carrier_and_select_Service(DataTable)"
});
formatter.result({
  "duration": 3908798900,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.User_enters_shipment_overview_details_asbelow_to_get_a_Rate_within_a_Shipment_SpecifcSenderReceiver(DataTable)"
});
formatter.result({
  "duration": 37192124200,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_enters_following_input_data_for_the_line_item(DataTable)"
});
formatter.result({
  "duration": 11967437400,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_selects_Dangerous_Goods(DataTable)"
});
formatter.result({
  "duration": 1596987800,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClicksSaveDraftOnShipmentDPage()"
});
formatter.result({
  "duration": 4958671900,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserNavigatesToDraftShipmentPageAndVerifiesPageItems(DataTable)"
});
formatter.result({
  "duration": 5912174700,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClickCompleteShipmentandisNavagiatedBacktoCreateShipmentPage(DataTable)"
});
formatter.result({
  "duration": 62606948900,
  "error_message": "java.lang.AssertionError: element with: By.xpath: \t//*/td[preceding-sibling::td[text()\u003d\u0027Intermodal \u0026 Specialised\u0027]][preceding-sibling::td[text()\u003d\u0027TEM Perth Address\u0027]] [preceding-sibling::td[text()\u003d\u0027TEM Brisbane Address\u0027]] [preceding-sibling::td[text()\u003d\u002727 Sep 2018\u0027]]/a not found\u003cbr\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat global.PageBase.moveToElement(PageBase.java:442)\r\n\tat global.PageBase.click(PageBase.java:330)\r\n\tat steps.dashboard.DashboardCommonStepsDefinitions.UserClickCompleteShipmentandisNavagiatedBacktoCreateShipmentPage(DashboardCommonStepsDefinitions.java:155)\r\n\tat ✽.And User Click Complete Shipment and is Navagiated Back to Create Shipment page(src/test/Resources/dashboard/MYT_3539_Access_Draft_Shipment.feature:24)\r\n",
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
  "duration": 692838400,
  "status": "passed"
});
formatter.before({
  "duration": 83400,
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
  "name": "User is Registered in MyToll and is on Shipment Page - Draft Shipment",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_is_Registered_in_MyToll_and_is_on_Shipment_page()"
});
formatter.result({
  "duration": 33186036600,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "User accesses \u0027Draft Shipment\u0027 from My Dashboard - TGX",
  "description": "",
  "id": "myt-3539-access-\u0027draft\u0027-shipment-from-my-dashboard;user-accesses-\u0027draft-shipment\u0027-from-my-dashboard---tgx",
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
        "Toll Priority (Aus)",
        "Parcels - Overnight"
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
        "401509",
        "1",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 49
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 50,
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
      "line": 51
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
      "line": 52
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 54
    },
    {
      "cells": [
        "2"
      ],
      "line": 55
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "User Clicks Save Draft on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "User Navigates to Draft Shipment Page and Verifies Page Items",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver",
        "Dispatch date"
      ],
      "line": 58
    },
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver",
        "Dispatch date"
      ],
      "line": 59
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "User Click Complete Shipment and is Navagiated Back to Create Shipment page",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 61
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 62
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 63,
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
      "line": 64
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
      "line": 65
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "User Navigates back to Dashboard and Draft Shipment Tab",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "User Deletes Draft Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 68
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 69
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "User Cancels Delete Draft Search",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "User Deletes Draft Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 72
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 73
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "User Confirms Delete Draft Search",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateShipmentCommonStepsDefinitions.user_selects_Toll_Carrier_and_select_Service(DataTable)"
});
formatter.result({
  "duration": 5016628100,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.User_enters_shipment_overview_details_asbelow_Draft_Shipment_SpecifcSenderReceiverPrio(DataTable)"
});
formatter.result({
  "duration": 36661600800,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.user_enters_following_input_data_for_the_line_item_ForDraftShipment_Prio(DataTable)"
});
formatter.result({
  "duration": 7056955200,
  "status": "passed"
});
formatter.match({
  "location": "CreateShipmentStepsDefinitions.user_selects_Dangerous_Goods(DataTable)"
});
formatter.result({
  "duration": 1605631700,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClicksSaveDraftOnShipmentDPage()"
});
formatter.result({
  "duration": 4757363700,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserNavigatesToDraftShipmentPageAndVerifiesPageItems(DataTable)"
});
formatter.result({
  "duration": 5930533100,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClickCompleteShipmentandisNavagiatedBacktoCreateShipmentPage(DataTable)"
});
formatter.result({
  "duration": 62577233800,
  "error_message": "java.lang.AssertionError: element with: By.xpath: \t//*/td[preceding-sibling::td[text()\u003d\u0027Toll Priority (Aus)\u0027]][preceding-sibling::td[text()\u003d\u0027TEM Perth Address\u0027]] [preceding-sibling::td[text()\u003d\u0027TEM Brisbane Address\u0027]] [preceding-sibling::td[text()\u003d\u002727 Sep 2018\u0027]]/a not found\u003cbr\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat global.PageBase.moveToElement(PageBase.java:442)\r\n\tat global.PageBase.click(PageBase.java:330)\r\n\tat steps.dashboard.DashboardCommonStepsDefinitions.UserClickCompleteShipmentandisNavagiatedBacktoCreateShipmentPage(DashboardCommonStepsDefinitions.java:155)\r\n\tat ✽.And User Click Complete Shipment and is Navagiated Back to Create Shipment page(src/test/Resources/dashboard/MYT_3539_Access_Draft_Shipment.feature:60)\r\n",
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
  "duration": 696846000,
  "status": "passed"
});
});