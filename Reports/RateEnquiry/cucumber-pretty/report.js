$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/rateenquiry/MYT_1692_RateEnquiry_RateWithinAShipment.feature");
formatter.feature({
  "line": 1,
  "name": "MYT-1692 Rate Enquiry - Rate  Within a Shipment",
  "description": "",
  "id": "myt-1692-rate-enquiry---rate--within-a-shipment",
  "keyword": "Feature"
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
  "name": "User is Registered in MyToll and is on Shipment Page - Rate Enquiry",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 7,
  "name": "User Gets a Rate Estimate from within a Shipment - TNQX",
  "description": "",
  "id": "myt-1692-rate-enquiry---rate--within-a-shipment;user-gets-a-rate-estimate-from-within-a-shipment---tnqx",
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
  "name": "User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver",
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
        "614060",
        "1",
        "TNQX Melbourne Address",
        "TNQX Sydney Address"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Selects Mode For Shipment",
  "rows": [
    {
      "cells": [
        "Mode"
      ],
      "line": 15
    },
    {
      "cells": [
        "1"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
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
      "line": 18
    },
    {
      "cells": [
        "Automation Template1",
        "General Freight",
        "10",
        "Item",
        "100",
        "100",
        "100",
        "900",
        "Ref123",
        "Ref456"
      ],
      "line": 19
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 21
    },
    {
      "cells": [
        "2"
      ],
      "line": 22
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User Clicks Price Now Curtain on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Rate is Displayed with no breakdown and with a disclaimer",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#    And User cannot edit any Shipment feild"
    }
  ],
  "line": 26,
  "name": "User closes Rate Enquiry Curtain",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Clicks Save Draft on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User Click Complete Shipment and is Navagiated Back to Create Shipment page",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 29
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "TNQX Melbourne Address",
        "TNQX Sydney Address"
      ],
      "line": 30
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Verifies Shipment Details and Clicks Price Now Curtain",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service"
      ],
      "line": 32
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "General"
      ],
      "line": 33
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User Verifies if the Total Charge Remained the Same",
  "rows": [
    {
      "cells": [
        "Rate"
      ],
      "line": 35
    },
    {
      "cells": [
        "Retreived on RunTime"
      ],
      "line": 36
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User closes Rate Enquiry Curtain",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Navigates back to Dashboard and Draft Shipment Tab",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User Deletes Draft Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 40
    },
    {
      "cells": [
        "Intermodal \u0026 Specialised",
        "TNQX Melbourne Address",
        "TNQX Sydney Address"
      ],
      "line": 41
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "User Confirms Delete Draft Search",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "User Closes the Browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "User is Registered in MyToll and is on Shipment Page - Rate Enquiry",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 46,
  "name": "User Gets a Rate Estimate from within a Shipment - PrioAU",
  "description": "",
  "id": "myt-1692-rate-enquiry---rate--within-a-shipment;user-gets-a-rate-estimate-from-within-a-shipment---prioau",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "User selects Toll Carrier and select Service",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service"
      ],
      "line": 48
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "Parcels - Overnight"
      ],
      "line": 49
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "Whopays",
        "Sender",
        "Receiver"
      ],
      "line": 51
    },
    {
      "cells": [
        "401509",
        "1",
        "TNQX Melbourne Address",
        "TNQX Sydney Address"
      ],
      "line": 52
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "User enters following input data for the line item - Prio",
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
      "line": 54
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "20",
        "Ref123",
        "Ref456"
      ],
      "line": 55
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 57
    },
    {
      "cells": [
        "2"
      ],
      "line": 58
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "User Clicks Price Now Curtain on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "Rate is Displayed with no breakdown and with a disclaimer",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 61,
      "value": "#    And User cannot edit any Shipment feilds"
    }
  ],
  "line": 62,
  "name": "User closes Rate Enquiry Curtain",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "User Clicks Save Draft on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "User Click Complete Shipment and is Navagiated Back to Create Shipment page",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 65
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "TNQX Melbourne Address",
        "TNQX Sydney Address"
      ],
      "line": 66
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "User Verifies Shipment Details and Clicks Price Now Curtain",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service"
      ],
      "line": 68
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "Parcels - Overnight"
      ],
      "line": 69
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "User Verifies if the Total Charge Remained the Same",
  "rows": [
    {
      "cells": [
        "Rate"
      ],
      "line": 71
    },
    {
      "cells": [
        "Retreived on RunTime"
      ],
      "line": 72
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "User closes Rate Enquiry Curtain",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "User Navigates back to Dashboard and Draft Shipment Tab",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "User Deletes Draft Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 76
    },
    {
      "cells": [
        "Toll Priority (Aus)",
        "TNQX Melbourne Address",
        "TNQX Sydney Address"
      ],
      "line": 77
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "User Confirms Delete Draft Search",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "User Closes the Browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "User is Registered in MyToll and is on Shipment Page - Rate Enquiry",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 83,
  "name": "User Gets a Rate Estimate from within a Shipment - PrioNZ",
  "description": "",
  "id": "myt-1692-rate-enquiry---rate--within-a-shipment;user-gets-a-rate-estimate-from-within-a-shipment---prionz",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 82,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 84,
  "name": "User selects Toll Carrier and select Service",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service"
      ],
      "line": 85
    },
    {
      "cells": [
        "Toll Priority (NZ)",
        "Global - Express Parcels"
      ],
      "line": 86
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 87,
  "name": "User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "Whopays",
        "Sender",
        "Receiver"
      ],
      "line": 88
    },
    {
      "cells": [
        "100181",
        "1",
        "NZ Sender",
        "IPEC Footscray"
      ],
      "line": 89
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "User enters following input data for the line item - Prio",
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
      "line": 91
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "20",
        "Ref123",
        "Ref456"
      ],
      "line": 92
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 93,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 94
    },
    {
      "cells": [
        "2"
      ],
      "line": 95
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 96,
  "name": "User Clicks Price Now Curtain on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "Rate is Displayed with no breakdown and with a disclaimer - Prio",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 98,
      "value": "#    And User cannot edit any Shipment feilds"
    }
  ],
  "line": 99,
  "name": "User closes Rate Enquiry Curtain",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "User Clicks Save Draft on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "User Click Complete Shipment and is Navagiated Back to Create Shipment page",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 102
    },
    {
      "cells": [
        "Toll Priority (NZ)",
        "NZ Sender",
        "IPEC Footscray"
      ],
      "line": 103
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "User Verifies Shipment Details and Clicks Price Now Curtain",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service"
      ],
      "line": 105
    },
    {
      "cells": [
        "Toll Priority (NZ)",
        "Global - Express Parcels"
      ],
      "line": 106
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 107,
  "name": "User Verifies if the Total Charge Remained the Same",
  "rows": [
    {
      "cells": [
        "Rate"
      ],
      "line": 108
    },
    {
      "cells": [
        "Retreived on RunTime"
      ],
      "line": 109
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 110,
  "name": "User closes Rate Enquiry Curtain",
  "keyword": "And "
});
formatter.step({
  "line": 111,
  "name": "User Navigates back to Dashboard and Draft Shipment Tab",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "User Deletes Draft Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 113
    },
    {
      "cells": [
        "Toll Priority (NZ)",
        "NZ Sender",
        "IPEC Footscray"
      ],
      "line": 114
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 115,
  "name": "User Confirms Delete Draft Search",
  "keyword": "Then "
});
formatter.step({
  "line": 116,
  "name": "User Closes the Browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "User is Registered in MyToll and is on Shipment Page - Rate Enquiry",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 120,
  "name": "User Gets a Rate Estimate from within a Shipment - IPEC",
  "description": "",
  "id": "myt-1692-rate-enquiry---rate--within-a-shipment;user-gets-a-rate-estimate-from-within-a-shipment---ipec",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 119,
      "name": "@tag4"
    },
    {
      "line": 119,
      "name": "@Shakeout"
    }
  ]
});
formatter.step({
  "line": 121,
  "name": "User selects Toll Carrier and select Service",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service"
      ],
      "line": 122
    },
    {
      "cells": [
        "Toll IPEC",
        "Road Express"
      ],
      "line": 123
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 124,
  "name": "User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "Whopays",
        "Sender",
        "Receiver"
      ],
      "line": 125
    },
    {
      "cells": [
        "2230899",
        "1",
        "IPEC Melbourne",
        "IPEC Footscray"
      ],
      "line": 126
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 127,
  "name": "User enters following input data for the line item - Prio",
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
      "line": 128
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "20",
        "Ref123",
        "Ref456"
      ],
      "line": 129
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 130,
  "name": "User selects Dangerous Goods",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 131
    },
    {
      "cells": [
        "2"
      ],
      "line": 132
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 133,
  "name": "User Clicks Price Now Curtain on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 134,
  "name": "Rate is Displayed with no breakdown and with a disclaimer",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 135,
      "value": "#    And User cannot edit any Shipment feilds"
    }
  ],
  "line": 136,
  "name": "User closes Rate Enquiry Curtain",
  "keyword": "And "
});
formatter.step({
  "line": 137,
  "name": "User Clicks Save Draft on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 138,
  "name": "User Click Complete Shipment and is Navagiated Back to Create Shipment page",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 139
    },
    {
      "cells": [
        "Toll IPEC",
        "IPEC Melbourne",
        "IPEC Footscray"
      ],
      "line": 140
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 141,
  "name": "User Verifies Shipment Details and Clicks Price Now Curtain",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service"
      ],
      "line": 142
    },
    {
      "cells": [
        "Toll IPEC",
        "Road Express"
      ],
      "line": 143
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 144,
  "name": "User Verifies if the Total Charge Remained the Same",
  "rows": [
    {
      "cells": [
        "Rate"
      ],
      "line": 145
    },
    {
      "cells": [
        "Retreived on RunTime"
      ],
      "line": 146
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 147,
  "name": "User closes Rate Enquiry Curtain",
  "keyword": "And "
});
formatter.step({
  "line": 148,
  "name": "User Navigates back to Dashboard and Draft Shipment Tab",
  "keyword": "And "
});
formatter.step({
  "line": 149,
  "name": "User Deletes Draft Shipment",
  "rows": [
    {
      "cells": [
        "Toll carrier",
        "Sender",
        "Receiver"
      ],
      "line": 150
    },
    {
      "cells": [
        "Toll IPEC",
        "IPEC Melbourne",
        "IPEC Footscray"
      ],
      "line": 151
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 152,
  "name": "User Confirms Delete Draft Search",
  "keyword": "Then "
});
formatter.step({
  "line": 153,
  "name": "User Closes the Browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/Resources/rateenquiry/MYT_5499_RateEnquiry_AddressBook.feature");
formatter.feature({
  "line": 1,
  "name": "MYT-5499 Rate Enquiry - Adress Book record retrieval",
  "description": "",
  "id": "myt-5499-rate-enquiry---adress-book-record-retrieval",
  "keyword": "Feature"
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
  "name": "User is Registered in MyToll and is on Rate Enquiry Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 7,
  "name": "User is able to retrive from address book for Orgin Subrub and PostCode under Rate Enquiry - TGX",
  "description": "",
  "id": "myt-5499-rate-enquiry---adress-book-record-retrieval;user-is-able-to-retrive-from-address-book-for-orgin-subrub-and-postcode-under-rate-enquiry---tgx",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User selects Toll Carrier",
  "rows": [
    {
      "cells": [
        "TollCarrier"
      ],
      "line": 9
    },
    {
      "cells": [
        "Toll IPEC"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User select Service",
  "rows": [
    {
      "cells": [
        "Service"
      ],
      "line": 12
    },
    {
      "cells": [
        "Road Express"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User Enters and selects Account",
  "rows": [
    {
      "cells": [
        "Account"
      ],
      "line": 15
    },
    {
      "cells": [
        "2230899"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Click Retrieve from address book checkbox under Orgin",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User is able to select sender address from address book",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User Enters Destination",
  "rows": [
    {
      "cells": [
        "DesSuburb",
        "DesPostCode"
      ],
      "line": 20
    },
    {
      "cells": [
        "FOOTSCRAY",
        "3011"
      ],
      "line": 21
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User Enters Line Items for Rate Enquiry",
  "rows": [
    {
      "cells": [
        "ItemTemplateName",
        "NumberOfItems",
        "Length",
        "Width",
        "Height",
        "Weight"
      ],
      "line": 23
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "10"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Selects Item type",
  "rows": [
    {
      "cells": [
        "BillingType"
      ],
      "line": 26
    },
    {
      "cells": [
        "ALL FREIGHT"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User Clicks Price Now",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User Verifies Price and Continues to Shipment",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User Verifies Details on Shipment Page",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service",
        "Account",
        "Length",
        "Width",
        "Height"
      ],
      "line": 31
    },
    {
      "cells": [
        "Toll IPEC",
        "Road Express",
        "2230899",
        "10",
        "10",
        "10"
      ],
      "line": 32
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User Verifies if Sender is pre selected from addressbook",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "User is Registered in MyToll and is on Rate Enquiry Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 37,
  "name": "User is able to retrive from address book for Desination Subrub and PostCode under Rate Enquiry -TDF",
  "description": "",
  "id": "myt-5499-rate-enquiry---adress-book-record-retrieval;user-is-able-to-retrive-from-address-book-for-desination-subrub-and-postcode-under-rate-enquiry--tdf",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User selects Toll Carrier",
  "rows": [
    {
      "cells": [
        "TollCarrier"
      ],
      "line": 39
    },
    {
      "cells": [
        "Intermodal"
      ],
      "line": 40
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "User select Service",
  "rows": [
    {
      "cells": [
        "Service"
      ],
      "line": 42
    },
    {
      "cells": [
        "General"
      ],
      "line": 43
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User Selects Mode",
  "rows": [
    {
      "cells": [
        "Mode"
      ],
      "line": 45
    },
    {
      "cells": [
        "ROAD"
      ],
      "line": 46
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User Enters and selects Account",
  "rows": [
    {
      "cells": [
        "Account"
      ],
      "line": 48
    },
    {
      "cells": [
        "614060"
      ],
      "line": 49
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User Enters Orgin",
  "rows": [
    {
      "cells": [
        "OriginSuburb",
        "OriginPostCode"
      ],
      "line": 51
    },
    {
      "cells": [
        "MELBOURNE",
        "3000"
      ],
      "line": 52
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "User Click Retrieve from address book checkbox under Destination",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "User is able to select receiver address from address book",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "User Enters Line Items for Rate Enquiry",
  "rows": [
    {
      "cells": [
        "ItemTemplateName",
        "NumberOfItems",
        "Length",
        "Width",
        "Height",
        "Weight"
      ],
      "line": 56
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "10"
      ],
      "line": 57
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "User Selects Item type",
  "rows": [
    {
      "cells": [
        "BillingType"
      ],
      "line": 59
    },
    {
      "cells": [
        "General Freight"
      ],
      "line": 60
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "User Selects Quantity type",
  "rows": [
    {
      "cells": [
        "QtyType"
      ],
      "line": 62
    },
    {
      "cells": [
        "Items"
      ],
      "line": 63
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "User Clicks Price Now",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "User Verifies Price and Continues to Shipment",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "User Verifies Details on Shipment Page",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service",
        "Account",
        "Length",
        "Width",
        "Height"
      ],
      "line": 67
    },
    {
      "cells": [
        "Intermodal",
        "General",
        "614060",
        "10",
        "10",
        "10"
      ],
      "line": 68
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "User Verifies if Receiver is pre selected from addressbook",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/Resources/rateenquiry/MYT_6157_TollEnergyRateEnquiryTest.feature");
formatter.feature({
  "line": 1,
  "name": "MYT-6157  - Rate Enquiry for Toll Energy",
  "description": "",
  "id": "myt-6157----rate-enquiry-for-toll-energy",
  "keyword": "Feature"
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
  "name": "User is Registered in MyToll and is on Rate Enquiry Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 7,
  "name": "User Performs Rate Enquiry for Toll Energy - Service General",
  "description": "",
  "id": "myt-6157----rate-enquiry-for-toll-energy;user-performs-rate-enquiry-for-toll-energy---service-general",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User selects Toll Carrier",
  "rows": [
    {
      "cells": [
        "TollCarrier"
      ],
      "line": 9
    },
    {
      "cells": [
        "Toll Energy and Marine"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User select Service",
  "rows": [
    {
      "cells": [
        "Service"
      ],
      "line": 12
    },
    {
      "cells": [
        "General"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User Enters and selects Account",
  "rows": [
    {
      "cells": [
        "Account"
      ],
      "line": 15
    },
    {
      "cells": [
        "G18508"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Enters Orgin",
  "rows": [
    {
      "cells": [
        "OriginSuburb",
        "OriginPostCode"
      ],
      "line": 18
    },
    {
      "cells": [
        "PERTH",
        "6000"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User Enters Destination",
  "rows": [
    {
      "cells": [
        "DesSuburb",
        "DesPostCode"
      ],
      "line": 21
    },
    {
      "cells": [
        "BRISBANE",
        "4000"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User Enters Line Items for Rate Enquiry",
  "rows": [
    {
      "cells": [
        "ItemTemplateName",
        "NumberOfItems",
        "Length",
        "Width",
        "Height",
        "Weight"
      ],
      "line": 24
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "10"
      ],
      "line": 25
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User Selects Item type",
  "rows": [
    {
      "cells": [
        "BillingType"
      ],
      "line": 27
    },
    {
      "cells": [
        "ALL UNITS - PER KG"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User Selects Quantity type",
  "rows": [
    {
      "cells": [
        "QtyType"
      ],
      "line": 30
    },
    {
      "cells": [
        "Items"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User Clicks Price Now",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User Verifies Price and Continues to Shipment",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User Verifies Details on Shipment Page",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service",
        "Account",
        "Length",
        "Width",
        "Height"
      ],
      "line": 35
    },
    {
      "cells": [
        "Toll Energy and Marine",
        "General",
        "G18508",
        "10",
        "10",
        "10"
      ],
      "line": 36
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User Verifies Details on Shipment Page Line Items",
  "rows": [
    {
      "cells": [
        "ItemTemplateName",
        "NumberOfItems",
        "Length",
        "Width",
        "Height",
        "Weight",
        "BillingType",
        "QtyType"
      ],
      "line": 38
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "10",
        "ALL UNITS - PER KG",
        "Items"
      ],
      "line": 39
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "User is Registered in MyToll and is on Rate Enquiry Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 43,
  "name": "User Gets a Rate Estimate from within a Shipment - Toll Energy",
  "description": "",
  "id": "myt-6157----rate-enquiry-for-toll-energy;user-gets-a-rate-estimate-from-within-a-shipment---toll-energy",
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
  "name": "User Navigates Back to Shipment Page",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User selects Toll Carrier and select Service",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service"
      ],
      "line": 46
    },
    {
      "cells": [
        "Toll Energy and Marine",
        "General"
      ],
      "line": 47
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "Whopays",
        "Sender",
        "Receiver"
      ],
      "line": 49
    },
    {
      "cells": [
        "G18508",
        "1",
        "TEM Perth Address",
        "TEM Brisbane Address"
      ],
      "line": 50
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 51,
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
      "line": 52
    },
    {
      "cells": [
        "Automation Template1",
        "ALL UNITS - PER KG",
        "10",
        "Item",
        "10",
        "10",
        "10",
        "10",
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
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "User Clicks Price Now Curtain on Shipment Page",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "Rate is Displayed with no breakdown and with a disclaimer",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 59,
      "value": "#And User cannot edit any Shipment feilds"
    }
  ],
  "line": 60,
  "name": "User closes Rate Enquiry Curtain",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/Resources/rateenquiry/MYT_6235_TollMiningServiceRateEnquiryTest.feature");
formatter.feature({
  "line": 1,
  "name": "MYT-6235  - Rate Enquiry for Toll Mining Service",
  "description": "",
  "id": "myt-6235----rate-enquiry-for-toll-mining-service",
  "keyword": "Feature"
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
  "name": "User is Registered in MyToll and is on Rate Enquiry Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 7,
  "name": "User Performs Rate Enquiry for Toll Mining Service - Service General",
  "description": "",
  "id": "myt-6235----rate-enquiry-for-toll-mining-service;user-performs-rate-enquiry-for-toll-mining-service---service-general",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User selects Toll Carrier",
  "rows": [
    {
      "cells": [
        "TollCarrier"
      ],
      "line": 9
    },
    {
      "cells": [
        "Toll Mining Services"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User select Service",
  "rows": [
    {
      "cells": [
        "Service"
      ],
      "line": 12
    },
    {
      "cells": [
        "DG Freight"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User Enters and selects Account",
  "rows": [
    {
      "cells": [
        "Account"
      ],
      "line": 15
    },
    {
      "cells": [
        "790135"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Enters Orgin",
  "rows": [
    {
      "cells": [
        "OriginSuburb",
        "OriginPostCode"
      ],
      "line": 18
    },
    {
      "cells": [
        "PORT ADELAIDE",
        "5015"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User Enters Destination",
  "rows": [
    {
      "cells": [
        "DesSuburb",
        "DesPostCode"
      ],
      "line": 21
    },
    {
      "cells": [
        "ROXBY DOWNS",
        "5725"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User Enters Line Items for Rate Enquiry",
  "rows": [
    {
      "cells": [
        "ItemTemplateName",
        "NumberOfItems",
        "Length",
        "Width",
        "Height",
        "Weight"
      ],
      "line": 24
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "10"
      ],
      "line": 25
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User Selects Item type",
  "rows": [
    {
      "cells": [
        "BillingType"
      ],
      "line": 27
    },
    {
      "cells": [
        "ALL UNITS - SODIUM CHLORATE PER TONNE"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User Selects Quantity type",
  "rows": [
    {
      "cells": [
        "QtyType"
      ],
      "line": 30
    },
    {
      "cells": [
        "Items"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User Clicks Price Now",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User Verifies Price and Continues to Shipment",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User Verifies Details on Shipment Page",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "Service",
        "Account",
        "Length",
        "Width",
        "Height"
      ],
      "line": 35
    },
    {
      "cells": [
        "Toll Mining Services",
        "DG Freight",
        "790135",
        "10",
        "10",
        "10"
      ],
      "line": 36
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User Verifies Details on Shipment Page Line Items",
  "rows": [
    {
      "cells": [
        "ItemTemplateName",
        "NumberOfItems",
        "Length",
        "Width",
        "Height",
        "Weight",
        "BillingType",
        "QtyType"
      ],
      "line": 38
    },
    {
      "cells": [
        "Automation Template1",
        "10",
        "10",
        "10",
        "10",
        "10",
        "ALL UNITS - SODIUM CHLORATE PER TONNE",
        "Items"
      ],
      "line": 39
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});