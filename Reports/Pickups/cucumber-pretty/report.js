$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/bookapickup/MYT-6226_Toll Energy Book A Pickup.feature");
formatter.feature({
  "line": 1,
  "name": "MYT_6226 Toll Energy Book A Pickup",
  "description": "",
  "id": "myt-6226-toll-energy-book-a-pickup",
  "keyword": "Feature"
});
formatter.before({
  "duration": 134800,
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
  "name": "User is Registered in MyToll and is on Book a pickup page",
  "keyword": "Given "
});
formatter.match({
  "location": "BookAPIckupCommonStepsDefinitions.user_is_Registered_in_MyToll_and_is_on_Book_a_pickup_page()"
});
formatter.result({
  "duration": 33540472700,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User wants to be able to book a pickup for two lines items with Dangerous goods using Toll Energy and Marine",
  "description": "",
  "id": "myt-6226-toll-energy-book-a-pickup;user-wants-to-be-able-to-book-a-pickup-for-two-lines-items-with-dangerous-goods-using-toll-energy-and-marine",
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
  "name": "User selects Toll Carrier and Account Number",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "AccountNumber"
      ],
      "line": 9
    },
    {
      "cells": [
        "Toll Energy and Marine",
        "G28668"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User selects a existing Sender address from the Sender field",
  "rows": [
    {
      "cells": [
        "Sender"
      ],
      "line": 12
    },
    {
      "cells": [
        "AccessHQ"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enter following input data to Add Item",
  "rows": [
    {
      "cells": [
        "Service",
        "Destination",
        "ItemDescription",
        "NoOfItems",
        "PalletSpace",
        "destination"
      ],
      "line": 15
    },
    {
      "cells": [
        "DG Express",
        "MELALEUCA",
        "Automation Template",
        "10",
        "6",
        "MELALEUCA, 6079"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User Selects Charge to Account as below",
  "rows": [
    {
      "cells": [
        "ChargeToAccount",
        "AccountNumber"
      ],
      "line": 18
    },
    {
      "cells": [
        "1",
        "12345"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enter following details",
  "rows": [
    {
      "cells": [
        "Length",
        "Width",
        "Height",
        "Weight"
      ],
      "line": 21
    },
    {
      "cells": [
        "100",
        "100",
        "100",
        "900"
      ],
      "line": 22
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User selects Contains Food or food packaging",
  "rows": [
    {
      "cells": [
        "FoodPackaging"
      ],
      "line": 24
    },
    {
      "cells": [
        "2"
      ],
      "line": 25
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User selects Dangerous Goods as below",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 27
    },
    {
      "cells": [
        "1"
      ],
      "line": 28
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User enter dangerous goods details as below",
  "rows": [
    {
      "cells": [
        "UnNumber",
        "PackingGroup",
        "DGPackageType",
        "DGAggregateQty",
        "PackageDescription",
        "Technical Name",
        "LookupItem"
      ],
      "line": 30
    },
    {
      "cells": [
        "2025",
        "II",
        "20",
        "10",
        "Test Package Description",
        "Test Technical Name",
        "1"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User able to see following fields autopopulated.",
  "rows": [
    {
      "cells": [
        "Class/Div",
        "SubRisk",
        "PackingGroup",
        "Proper Shoping Name"
      ],
      "line": 33
    },
    {
      "cells": [
        "6.1",
        "NA",
        "II",
        "MERCURY COMPOUND, SOLID, N.O.S"
      ],
      "line": 34
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User clicks on ADD NEW LINES to add more items",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User enter following input data to Add Item",
  "rows": [
    {
      "cells": [
        "Service",
        "Destination",
        "ItemDescription",
        "NoOfItems",
        "PalletSpace",
        "destination"
      ],
      "line": 37
    },
    {
      "cells": [
        "General",
        "MELALEUCA",
        "Automation Template",
        "10",
        "6",
        "MELALEUCA, 6079"
      ],
      "line": 38
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User Selects Charge to Account as below",
  "rows": [
    {
      "cells": [
        "ChargeToAccount",
        "AccountNumber"
      ],
      "line": 40
    },
    {
      "cells": [
        "1",
        "12345"
      ],
      "line": 41
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User enter following details",
  "rows": [
    {
      "cells": [
        "Length",
        "Width",
        "Height",
        "Weight"
      ],
      "line": 43
    },
    {
      "cells": [
        "100",
        "100",
        "100",
        "900"
      ],
      "line": 44
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User selects Contains Food or food packaging",
  "rows": [
    {
      "cells": [
        "FoodPackaging"
      ],
      "line": 46
    },
    {
      "cells": [
        "2"
      ],
      "line": 47
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User selects Dangerous Goods as below",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 49
    },
    {
      "cells": [
        "2"
      ],
      "line": 50
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "User selects Dispatch date as Tommorow",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "User selects Ready Time",
  "rows": [
    {
      "cells": [
        "ReadyTime"
      ],
      "line": 53
    },
    {
      "cells": [
        "14:45"
      ],
      "line": 54
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "User enters Special Instructions as below",
  "rows": [
    {
      "cells": [
        "Special Instructions"
      ],
      "line": 56
    },
    {
      "cells": [
        "Special Ins"
      ],
      "line": 57
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "User clicks on Review \u0026 Book and User be able to see pickup details entered in Review Your Pickup screen",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "AccountNumber",
        "Company",
        "Location",
        "Booked by",
        "Phone number",
        "Ready time",
        "Location closing time",
        "Special instructions"
      ],
      "line": 59
    },
    {
      "cells": [
        "Toll Energy and Marine",
        "G28668",
        "AccessHQ",
        "60, Collins Street CDE MELBOURNE VIC 3000 AU",
        "Kate",
        "452456876",
        "14:45",
        "18:00",
        "Special Ins"
      ],
      "line": 60
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "User be able to see first item details entered in Review Your Pickup screen",
  "rows": [
    {
      "cells": [
        "ItemDescription",
        "Destination",
        "Mode",
        "Service",
        "ChargeTo",
        "NoOfItems",
        "PalletSpaces",
        "Length",
        "Width",
        "Height",
        "Volume",
        "TotalWeight",
        "DangerousGoods",
        "FoodItem"
      ],
      "line": 62
    },
    {
      "cells": [
        "Automation Template",
        "MELEUCA, 6079",
        "Road",
        "DG Express",
        "Sender",
        "10",
        "6",
        "100",
        "100",
        "100",
        "10.000 m3",
        "900 kg",
        "Yes",
        "No"
      ],
      "line": 63
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "User be able to see dangerous goods details in Review Your Pickup screen",
  "rows": [
    {
      "cells": [
        "DangerousGoodsDetailsHeading",
        "UnNumber",
        "ClassDivision",
        "PackagingGroup",
        "SubRisk",
        "ProperShippingName",
        "DGPackagingDescription",
        "DGPkg",
        "DGQty",
        "TechnicalName"
      ],
      "line": 65
    },
    {
      "cells": [
        "DANGEROUS GOODS DETAILS",
        "2025",
        "6.1",
        "II",
        "NA",
        "MERCURY COMPOUND, SOLID, N.O.S",
        "Test Package Description",
        "20",
        "10",
        "Test Technical Name"
      ],
      "line": 66
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "User be able to see second item details entered in Review Your Pickup screen",
  "rows": [
    {
      "cells": [
        "ItemDescription",
        "Destination",
        "Service",
        "Mode",
        "ChargeTo",
        "NoOfItems",
        "PalletSpaces",
        "Length",
        "Width",
        "Height",
        "Volume",
        "TotalWeight",
        "DangerousGoods",
        "FoodItem"
      ],
      "line": 68
    },
    {
      "cells": [
        "Automation Template",
        "MELEUCA, 6079",
        "General",
        "Rail",
        "Sender",
        "10",
        "6",
        "100",
        "100",
        "100",
        "10.000 m3",
        "900 kg",
        "No",
        "No"
      ],
      "line": 69
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "User presses on Confirm Pickup button",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "User navigates to \"PICKUP CONFIRMED\" screen",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "User can see \"Refrence Number\" with \"TW\"",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "User be able to see a message as an email delivered.",
  "rows": [
    {
      "cells": [
        "Msg"
      ],
      "line": 74
    },
    {
      "cells": [
        "Wehavesentyouanemailconfirmingyourpickupbookingto:"
      ],
      "line": 75
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "User can see email address for an email deliveredpickup confirmation.",
  "keyword": "Then "
});
formatter.step({
  "line": 77,
  "name": "User Closes the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BookAPIckupCommonStepsDefinitions.user_selects_Toll_Carrier_and_Account_Number(DataTable)"
});
formatter.result({
  "duration": 9618823800,
  "status": "passed"
});
formatter.match({
  "location": "BookAPIckupCommonStepsDefinitions.user_selects_a_existing_Sender_address_from_the_Sender_field(DataTable)"
});
formatter.result({
  "duration": 3551117000,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_enter_following_input_data_to_Add_Item(DataTable)"
});
formatter.result({
  "duration": 28232129000,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_Selects_Charge_to_Account_as_below(DataTable)"
});
formatter.result({
  "duration": 1353949300,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_enter_following_details(DataTable)"
});
formatter.result({
  "duration": 5632114300,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_selects_Contains_Food_or_food_packaging(DataTable)"
});
formatter.result({
  "duration": 3452609900,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_selects_Dangerous_Goods_as_below(DataTable)"
});
formatter.result({
  "duration": 4615685900,
  "status": "passed"
});
formatter.match({
  "location": "BookAPIckupCommonStepsDefinitions.user_enter_dangerous_goods_details_as_below(DataTable)"
});
formatter.result({
  "duration": 12563943400,
  "status": "passed"
});
formatter.match({
  "location": "BookAPIckupCommonStepsDefinitions.user_able_to_see_following_fields_autopopulated(DataTable)"
});
formatter.result({
  "duration": 922259000,
  "status": "passed"
});
formatter.match({
  "location": "BookAPIckupCommonStepsDefinitions.user_clicks_on_ADD_NEW_LINES_to_add_more_items()"
});
formatter.result({
  "duration": 78271100,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_enter_following_input_data_to_Add_Item(DataTable)"
});
formatter.result({
  "duration": 28373036400,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_Selects_Charge_to_Account_as_below(DataTable)"
});
formatter.result({
  "duration": 1311627600,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_enter_following_details(DataTable)"
});
formatter.result({
  "duration": 5628135300,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_selects_Contains_Food_or_food_packaging(DataTable)"
});
formatter.result({
  "duration": 3478100200,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_selects_Dangerous_Goods_as_below(DataTable)"
});
formatter.result({
  "duration": 4597952300,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_selects_Dispatch_date_as_Tommorow()"
});
formatter.result({
  "duration": 162381700,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_selects_Ready_Time(DataTable)"
});
formatter.result({
  "duration": 2846882800,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_enters_Special_Instructions_as_below(DataTable)"
});
formatter.result({
  "duration": 1811749500,
  "status": "passed"
});
formatter.match({
  "location": "MYT_6226_6242_TollEnergyTollMiningServicesBookAPickup_StepDefinitions.user_clicks_on_Review_Book_and_User_be_able_to_see_pickup_details_entered_in_Review_Your_Pickup_screen(DataTable)"
});
formatter.result({
  "duration": 8773654500,
  "status": "passed"
});
formatter.match({
  "location": "MYT_6226_6242_TollEnergyTollMiningServicesBookAPickup_StepDefinitions.user_be_able_to_see_first_item_details_entered_in_Review_Your_Pickup_screen(DataTable)"
});
formatter.result({
  "duration": 4911449500,
  "status": "passed"
});
formatter.match({
  "location": "MYT_6226_6242_TollEnergyTollMiningServicesBookAPickup_StepDefinitions.user_be_able_to_see_dangerous_goods_details_in_Review_Your_Pickup_screen(DataTable)"
});
formatter.result({
  "duration": 2278976900,
  "status": "passed"
});
formatter.match({
  "location": "MYT_6226_6242_TollEnergyTollMiningServicesBookAPickup_StepDefinitions.user_be_able_to_see_second_item_details_entered_in_Review_Your_Pickup_screen(DataTable)"
});
formatter.result({
  "duration": 7983171200,
  "status": "passed"
});
formatter.match({
  "location": "MYT_6226_6242_TollEnergyTollMiningServicesBookAPickup_StepDefinitions.user_presses_on_Confirm_Pickup_button()"
});
formatter.result({
  "duration": 65110000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PICKUP CONFIRMED",
      "offset": 19
    }
  ],
  "location": "MYT_6226_6242_TollEnergyTollMiningServicesBookAPickup_StepDefinitions.user_navigates_to_screen(String)"
});
formatter.result({
  "duration": 7443116600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Refrence Number",
      "offset": 14
    },
    {
      "val": "TW",
      "offset": 37
    }
  ],
  "location": "MYT_6226_6242_TollEnergyTollMiningServicesBookAPickup_StepDefinitions.user_can_see_with(String,String)"
});
formatter.result({
  "duration": 50700,
  "status": "passed"
});
formatter.match({
  "location": "MYT_6226_6242_TollEnergyTollMiningServicesBookAPickup_StepDefinitions.user_be_able_to_see_a_message_as_an_email_delivered(DataTable)"
});
formatter.result({
  "duration": 1541061700,
  "status": "passed"
});
formatter.match({
  "location": "MYT_6226_6242_TollEnergyTollMiningServicesBookAPickup_StepDefinitions.user_can_see_email_address_for_an_email_deliveredpickup_confirmation()"
});
formatter.result({
  "duration": 18266100,
  "status": "passed"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClosestheBrowser()"
});
formatter.result({
  "duration": 697038100,
  "status": "passed"
});
formatter.after({
  "duration": 66900,
  "status": "passed"
});
formatter.before({
  "duration": 65500,
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
  "name": "User is Registered in MyToll and is on Book a pickup page",
  "keyword": "Given "
});
formatter.match({
  "location": "BookAPIckupCommonStepsDefinitions.user_is_Registered_in_MyToll_and_is_on_Book_a_pickup_page()"
});
formatter.result({
  "duration": 32572161400,
  "status": "passed"
});
formatter.scenario({
  "line": 80,
  "name": "User wants to be able to book a pickup for one line item using Toll Energy and Marine",
  "description": "",
  "id": "myt-6226-toll-energy-book-a-pickup;user-wants-to-be-able-to-book-a-pickup-for-one-line-item-using-toll-energy-and-marine",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 79,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 81,
  "name": "User selects Toll Carrier and Account Number",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "AccountNumber"
      ],
      "line": 82
    },
    {
      "cells": [
        "Toll Energy and Marine",
        "G28668"
      ],
      "line": 83
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 84,
  "name": "User selects a existing Sender address from the Sender field",
  "rows": [
    {
      "cells": [
        "Sender"
      ],
      "line": 85
    },
    {
      "cells": [
        "AccessHQ"
      ],
      "line": 86
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "User enter following input data to Add Item",
  "rows": [
    {
      "cells": [
        "Service",
        "Destination",
        "ItemDescription",
        "NoOfItems",
        "PalletSpace",
        "destination"
      ],
      "line": 88
    },
    {
      "cells": [
        "General",
        "MELALEUCA",
        "Automation Template",
        "10",
        "6",
        "MELALEUCA, 6079"
      ],
      "line": 89
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 90,
  "name": "User Selects Charge to Account as below",
  "rows": [
    {
      "cells": [
        "ChargeToAccount",
        "AccountNumber"
      ],
      "line": 91
    },
    {
      "cells": [
        "1",
        "12345"
      ],
      "line": 92
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "User enter following details",
  "rows": [
    {
      "cells": [
        "Length",
        "Width",
        "Height",
        "Weight"
      ],
      "line": 94
    },
    {
      "cells": [
        "100",
        "100",
        "100",
        "900"
      ],
      "line": 95
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 96,
  "name": "User selects Contains Food or food packaging",
  "rows": [
    {
      "cells": [
        "FoodPackaging"
      ],
      "line": 97
    },
    {
      "cells": [
        "2"
      ],
      "line": 98
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "User selects Dangerous Goods as below",
  "rows": [
    {
      "cells": [
        "DgGoods"
      ],
      "line": 100
    },
    {
      "cells": [
        "2"
      ],
      "line": 101
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 102,
  "name": "User selects Dispatch date as Tommorow",
  "keyword": "When "
});
formatter.step({
  "line": 103,
  "name": "User selects Ready Time",
  "rows": [
    {
      "cells": [
        "ReadyTime"
      ],
      "line": 104
    },
    {
      "cells": [
        "14:45"
      ],
      "line": 105
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 106,
  "name": "User enters Special Instructions as below",
  "rows": [
    {
      "cells": [
        "Special Instructions"
      ],
      "line": 107
    },
    {
      "cells": [
        "Special Ins"
      ],
      "line": 108
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 109,
  "name": "User clicks on Review \u0026 Book and User be able to see pickup details entered in Review Your Pickup screen",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "AccountNumber",
        "Company",
        "Location",
        "Booked by",
        "Phone number",
        "Ready time",
        "Location closing time",
        "Special instructions"
      ],
      "line": 110
    },
    {
      "cells": [
        "Toll Energy and Marine",
        "G28668",
        "AccessHQ",
        "60, Collins Street CDE MELBOURNE VIC 3000 AU",
        "Kate",
        "452456876",
        "14:45",
        "18:00",
        "Special Ins"
      ],
      "line": 111
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 112,
  "name": "User be able to see first item details entered in Review Your Pickup screen",
  "rows": [
    {
      "cells": [
        "ItemDescription",
        "Destination",
        "Mode",
        "Service",
        "ChargeTo",
        "NoOfItems",
        "PalletSpaces",
        "Length",
        "Width",
        "Height",
        "Volume",
        "TotalWeight",
        "DangerousGoods",
        "FoodItem"
      ],
      "line": 113
    },
    {
      "cells": [
        "Automation Template",
        "MELEUCA, 6079",
        "Road",
        "General",
        "Sender",
        "10",
        "6",
        "100",
        "100",
        "100",
        "10.000 m3",
        "900 kg",
        "No",
        "No"
      ],
      "line": 114
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 115,
  "name": "User presses on Confirm Pickup button",
  "keyword": "When "
});
formatter.step({
  "line": 116,
  "name": "User navigates to \"PICKUP CONFIRMED\" screen",
  "keyword": "Then "
});
formatter.step({
  "line": 117,
  "name": "User can see \"Refrence Number\" with \"TW\"",
  "keyword": "Then "
});
formatter.step({
  "line": 118,
  "name": "User be able to see a message as an email delivered.",
  "rows": [
    {
      "cells": [
        "Msg"
      ],
      "line": 119
    },
    {
      "cells": [
        "Wehavesentyouanemailconfirmingyourpickupbookingto:"
      ],
      "line": 120
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 121,
  "name": "User can see email address for an email deliveredpickup confirmation.",
  "keyword": "Then "
});
formatter.step({
  "line": 122,
  "name": "User Closes the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BookAPIckupCommonStepsDefinitions.user_selects_Toll_Carrier_and_Account_Number(DataTable)"
});
formatter.result({
  "duration": 9471908800,
  "status": "passed"
});
formatter.match({
  "location": "BookAPIckupCommonStepsDefinitions.user_selects_a_existing_Sender_address_from_the_Sender_field(DataTable)"
});
formatter.result({
  "duration": 3550152300,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_enter_following_input_data_to_Add_Item(DataTable)"
});
formatter.result({
  "duration": 28279789700,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_Selects_Charge_to_Account_as_below(DataTable)"
});
formatter.result({
  "duration": 1340626600,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_enter_following_details(DataTable)"
});
formatter.result({
  "duration": 5604957000,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_selects_Contains_Food_or_food_packaging(DataTable)"
});
formatter.result({
  "duration": 3469714600,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_selects_Dangerous_Goods_as_below(DataTable)"
});
formatter.result({
  "duration": 4603575400,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_selects_Dispatch_date_as_Tommorow()"
});
formatter.result({
  "duration": 149454700,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_selects_Ready_Time(DataTable)"
});
formatter.result({
  "duration": 2850054400,
  "status": "passed"
});
formatter.match({
  "location": "BookAPickupStepDefinitions.user_enters_Special_Instructions_as_below(DataTable)"
});
formatter.result({
  "duration": 1814345100,
  "status": "passed"
});
formatter.match({
  "location": "MYT_6226_6242_TollEnergyTollMiningServicesBookAPickup_StepDefinitions.user_clicks_on_Review_Book_and_User_be_able_to_see_pickup_details_entered_in_Review_Your_Pickup_screen(DataTable)"
});
