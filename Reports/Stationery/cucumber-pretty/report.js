$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/stationery/MYT_6079_6080_Stationery - Order Stationery.feature");
formatter.feature({
  "line": 1,
  "name": "MYT_6079 Stationery - Order Stationery",
  "description": "",
  "id": "myt-6079-stationery---order-stationery",
  "keyword": "Feature"
});
formatter.before({
  "duration": 228200,
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
  "name": "MyToll Toll Priority AU User logged in and has a Toll Priority AU Standard / Full Financial account and Stationery function is enabled",
  "keyword": "Given "
});
formatter.match({
  "location": "StationeryCommonStepsDefinitions.mytoll_Toll_Priority_AU_User_logged_in_and_has_a_Toll_Priority_AU_Standard_Full_Financial_account_and_Stationery_function_is_enabled()"
});
formatter.result({
  "duration": 32414597100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User has the ability to order Toll Priority Stationery online",
  "description": "",
  "id": "myt-6079-stationery---order-stationery;user-has-the-ability-to-order-toll-priority-stationery-online",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User clicks on the mega menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User must be able to see an option to select Order Stationery",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User selects Order Stationery",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User able to select Consignment Notes products and select one of those",
  "rows": [
    {
      "cells": [
        "Product"
      ],
      "line": 11
    },
    {
      "cells": [
        "Consignment Notes"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User can increase or Decrease the Qty of a product by 5",
  "rows": [
    {
      "cells": [
        "NoOfQtyIncrease",
        "NoOfQtyDecrease"
      ],
      "line": 14
    },
    {
      "cells": [
        "30",
        "25"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User be able to enter preprint detatil as below",
  "rows": [
    {
      "cells": [
        "PreprintFrom",
        "PreprintTo",
        "preprintFromContactName",
        "preprintToContactName"
      ],
      "line": 17
    },
    {
      "cells": [
        "AccessHQ",
        "Australia Post",
        "Cath",
        "George"
      ],
      "line": 18
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User be able to edit preprint detatil as below",
  "rows": [
    {
      "cells": [
        "PreprintFrom",
        "PreprintTo",
        "preprintFromContactName",
        "preprintToContactName"
      ],
      "line": 20
    },
    {
      "cells": [
        "Australia Post",
        "AccessHQ",
        "Anna",
        "Anne"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User ADD TO CART a Product",
  "rows": [
    {
      "cells": [
        "Product"
      ],
      "line": 23
    },
    {
      "cells": [
        "Same Day Consignment (LO6626)"
      ],
      "line": 24
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User be able to see product added to the cart and the number of items in the cart increment by 1",
  "rows": [
    {
      "cells": [
        "Product",
        "NoOfItems",
        "NoOfQty",
        "TotalItems",
        "PreprintLabel"
      ],
      "line": 26
    },
    {
      "cells": [
        "Same Day Consignment (LO6626)",
        "1 ITEMS",
        "Qty: 25",
        "Total Items: 1",
        "Preprint"
      ],
      "line": 27
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User clicks Edit preprint icon in the cart",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User edits preprint details inside the cart",
  "rows": [
    {
      "cells": [
        "NoOfQtyIncrease",
        "NoOfQtyDecrease",
        "PreprintFrom",
        "PreprintFromContactName",
        "PreprintTo",
        "PreprintToContactName",
        "Message"
      ],
      "line": 30
    },
    {
      "cells": [
        "30",
        "25",
        "AccessHQ",
        "Anna",
        "Australia Post",
        "Anne",
        "Stationary type has been successfully added to your cart"
      ],
      "line": 31
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User ADD TO CART a Product",
  "rows": [
    {
      "cells": [
        "Product"
      ],
      "line": 33
    },
    {
      "cells": [
        "Overnight Consignment (LO5133)"
      ],
      "line": 34
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User be able to see second product added to the cart and the number of items in the cart increment by 1",
  "rows": [
    {
      "cells": [
        "Product",
        "NoOfItems",
        "NoOfQty",
        "TotalItems"
      ],
      "line": 36
    },
    {
      "cells": [
        "Overnight Consignment (LO5133)",
        "2 ITEMS",
        "Qty: 25",
        "Total Items: 2"
      ],
      "line": 37
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "User removes second product from the cart",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User be able to see cart has been updated as below",
  "rows": [
    {
      "cells": [
        "Product",
        "NoOfItems",
        "NoOfQty",
        "TotalItems",
        "PreprintLabel"
      ],
      "line": 40
    },
    {
      "cells": [
        "Same Day Consignment (LO6626)",
        "1 ITEMS",
        "Qty: 25",
        "Total Items: 1",
        "Preprint"
      ],
      "line": 41
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "User ADD TO CART a Product",
  "rows": [
    {
      "cells": [
        "Product"
      ],
      "line": 43
    },
    {
      "cells": [
        "Overnight Consignment (LO5133)"
      ],
      "line": 44
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User be able to see second product added to the cart again",
  "rows": [
    {
      "cells": [
        "Product",
        "NoOfItems",
        "NoOfQty",
        "TotalItems"
      ],
      "line": 46
    },
    {
      "cells": [
        "Overnight Consignment (LO5133)",
        "2 ITEMS",
        "Qty: 25",
        "Total Items: 2"
      ],
      "line": 47
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "User PROOCEED TO ORDER",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "User navigates to Enter your stationery delivery details page",
  "rows": [
    {
      "cells": [
        "PageHeading",
        "PageDescription",
        "TollCarrier"
      ],
      "line": 50
    },
    {
      "cells": [
        "Profile Details",
        "Enter your stationery delivery details below.",
        "Toll Priority (Aus)"
      ],
      "line": 51
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "User enter Review Order details as below",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "ContactName",
        "ContactNumber",
        "DeliverAddress",
        "DeliveryContactName",
        "NotifybyEmail",
        "CustomerReference",
        "DeliveryInstructions"
      ],
      "line": 53
    },
    {
      "cells": [
        "0007CDS CITY OF NEDLANDS",
        "Joe",
        "412345678",
        "Dialog Group",
        "Andrew",
        "NNAutomationuser@gmail.com",
        "Ref123456",
        "Test DeliveryInstructions"
      ],
      "line": 54
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "User clicks Review Order",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "User be able to see Overview details in the Review Page as below",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "AccountNumber",
        "Contact name",
        "Contact number"
      ],
      "line": 57
    },
    {
      "cells": [
        "PRIO",
        "0007CDS CITY OF NEDLANDS",
        "Joe",
        "61-412345678"
      ],
      "line": 58
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "User be able to see Delivery details in the Review page as below",
  "rows": [
    {
      "cells": [
        "Contact name",
        "Phone number",
        "Company name",
        "Address",
        "Customer reference",
        "Delivery instructions"
      ],
      "line": 60
    },
    {
      "cells": [
        "Andrew",
        "61-412345678",
        "Dialog Group",
        "60, Collins Street MELBOURNE VIC 3000 AU",
        "Ref123456",
        "Test DeliveryInstructions"
      ],
      "line": 61
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "User be able to see first Line item details as below",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Quantity",
        "UnitPrice",
        "Total",
        "PreprintFrom"
      ],
      "line": 63
    },
    {
      "cells": [
        "Same Day Consignment (LO6626)",
        "Qty 25",
        "Unit price : $0.00",
        "Total $0.00",
        "60, Collins Street CDE MELBOURNE VIC 3000 AU"
      ],
      "line": 64
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "User be able to see second Line item details as below",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Quantity",
        "UnitPrice",
        "Total"
      ],
      "line": 66
    },
    {
      "cells": [
        "Overnight Consignment (LO5133)",
        "Qty 25",
        "Unit price : $0.00",
        "Total $0.00"
      ],
      "line": 67
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "User must see following message",
  "rows": [
    {
      "cells": [
        "GSTMSG"
      ],
      "line": 69
    },
    {
      "cells": [
        "* For the purpose of this order, the Total excludes GST . The applicable amount of GST in relation to this order will be included in the final tax invoice Note : All $ units in AUD"
      ],
      "line": 70
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "User be able to charges in Review page as below",
  "rows": [
    {
      "cells": [
        "TotalSurcharges",
        "TotalCharges"
      ],
      "line": 72
    },
    {
      "cells": [
        "TOTAL SURCHARGES AUD $0.00",
        "Total Charges AUD $0.00"
      ],
      "line": 73
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "User clicks the Edit Delivery Details button",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "User enter Review Order details as below",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "ContactName",
        "ContactNumber",
        "DeliverAddress",
        "DeliveryContactName",
        "NotifybyEmail",
        "CustomerReference",
        "DeliveryInstructions"
      ],
      "line": 76
    },
    {
      "cells": [
        "200B1F NHP ELECTRICAL",
        "Nadiki",
        "498765432",
        "Toll Group",
        "Henry",
        "sitautomationuser@yahoo.com",
        "98765Ref",
        "New Test DeliveryInstructions"
      ],
      "line": 77
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 78,
  "name": "User clicks Review Order",
  "keyword": "When "
});
formatter.step({
  "line": 79,
  "name": "User be able to see Overview details in the Review Page as below",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "AccountNumber",
        "Contact name",
        "Contact number"
      ],
      "line": 80
    },
    {
      "cells": [
        "PRIO",
        "200B1F NHP ELECTRICAL",
        "Nadiki",
        "61-498765432"
      ],
      "line": 81
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "User be able to see Delivery details in the Review page as below",
  "rows": [
    {
      "cells": [
        "Contact name",
        "Phone number",
        "Company name",
        "Address",
        "Customer reference",
        "Delivery instructions"
      ],
      "line": 83
    },
    {
      "cells": [
        "Henry",
        "61-498765432",
        "Toll Group",
        "Wellington road 352, Mulgrave road MULGRAVE VIC 3170 AU",
        "98765Ref",
        "New Test DeliveryInstructions"
      ],
      "line": 84
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "User be able to see first Line item details as below",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Quantity",
        "UnitPrice",
        "Total",
        "PreprintFrom"
      ],
      "line": 86
    },
    {
      "cells": [
        "Same Day Consignment (LO6626)",
        "Qty 25",
        "Unit price : $0.00",
        "Total $0.00",
        "60, Collins Street CDE MELBOURNE VIC 3000 AU"
      ],
      "line": 87
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "User be able to see second Line item details as below",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Quantity",
        "UnitPrice",
        "Total"
      ],
      "line": 89
    },
    {
      "cells": [
        "Overnight Consignment (LO5133)",
        "Qty 25",
        "Unit price : $0.00",
        "Total $0.00"
      ],
      "line": 90
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "User must see following message",
  "rows": [
    {
      "cells": [
        "GSTMSG"
      ],
      "line": 92
    },
    {
      "cells": [
        "* For the purpose of this order, the Total excludes GST . The applicable amount of GST in relation to this order will be included in the final tax invoice Note : All $ units in AUD"
      ],
      "line": 93
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 94,
  "name": "User be able to charges in Review page as below",
  "rows": [
    {
      "cells": [
        "TotalSurcharges",
        "TotalCharges"
      ],
      "line": 95
    },
    {
      "cells": [
        "TOTAL SURCHARGES AUD $0.00",
        "Total Charges AUD $0.00"
      ],
      "line": 96
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "User clicks the EDIT button",
  "keyword": "When "
});
formatter.step({
  "line": 98,
  "name": "User ADD TO CART a Product",
  "rows": [
    {
      "cells": [
        "Product"
      ],
      "line": 99
    },
    {
      "cells": [
        "Off Peak Consignment (LO5134)"
      ],
      "line": 100
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 101,
  "name": "User be able to see third product added to the cart and the number of items in the cart increment by 1",
  "rows": [
    {
      "cells": [
        "Product",
        "NoOfItems",
        "NoOfQty",
        "TotalItems"
      ],
      "line": 102
    },
    {
      "cells": [
        "Off Peak Consignment (LO5134)",
        "3 ITEMS",
        "Qty: 25",
        "Total Items: 3"
      ],
      "line": 103
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 104,
  "name": "User PROOCEED TO ORDER",
  "keyword": "When "
});
formatter.step({
  "line": 105,
  "name": "User enter Review Order details as below",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "ContactName",
        "ContactNumber",
        "DeliverAddress",
        "DeliveryContactName",
        "NotifybyEmail",
        "CustomerReference",
        "DeliveryInstructions"
      ],
      "line": 106
    },
    {
      "cells": [
        "200BHY NATIONAL PRIORITY FOC",
        "Matthew",
        "481234563",
        "Dialog Group",
        "Andrea",
        "sitautomationuser@yahoo.com",
        "Ref876543",
        "Third times Test DeliveryInstructions"
      ],
      "line": 107
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 108,
  "name": "User clicks Review Order",
  "keyword": "When "
});
formatter.step({
  "line": 109,
  "name": "User be able to see Overview details in the Review Page as below",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "AccountNumber",
        "Contact name",
        "Contact number"
      ],
      "line": 110
    },
    {
      "cells": [
        "PRIO",
        "200BHY NATIONAL PRIORITY FOC",
        "Matthew",
        "61-481234563"
      ],
      "line": 111
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 112,
  "name": "User be able to see Delivery details in the Review page as below",
  "rows": [
    {
      "cells": [
        "Contact name",
        "Phone number",
        "Company name",
        "Address",
        "Customer reference",
        "Delivery instructions"
      ],
      "line": 113
    },
    {
      "cells": [
        "Andrea",
        "61-412345678",
        "Dialog Group",
        "60, Collins Street MELBOURNE VIC 3000 AU",
        "Ref876543",
        "Third times Test DeliveryInstructions"
      ],
      "line": 114
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 115,
  "name": "User be able to see first Line item details as below",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Quantity",
        "UnitPrice",
        "Total",
        "PreprintFrom"
      ],
      "line": 116
    },
    {
      "cells": [
        "Same Day Consignment (LO6626)",
        "Qty 25",
        "Unit price : $0.00",
        "Total $0.00",
        "60, Collins Street CDE MELBOURNE VIC 3000 AU"
      ],
      "line": 117
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 118,
  "name": "User be able to see second Line item details as below",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Quantity",
        "UnitPrice",
        "Total"
      ],
      "line": 119
    },
    {
      "cells": [
        "Overnight Consignment (LO5133)",
        "Qty 25",
        "Unit price : $0.00",
        "Total $0.00"
      ],
      "line": 120
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 121,
  "name": "User be able to see third Line item details as below",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Quantity",
        "UnitPrice",
        "Total"
      ],
      "line": 122
    },
    {
      "cells": [
        "Off Peak Consignment (LO5134)",
        "Qty 25",
        "Unit price : $0.00",
        "Total $0.00"
      ],
      "line": 123
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 124,
  "name": "User must see following message",
  "rows": [
    {
      "cells": [
        "GSTMSG"
      ],
      "line": 125
    },
    {
      "cells": [
        "* For the purpose of this order, the Total excludes GST . The applicable amount of GST in relation to this order will be included in the final tax invoice Note : All $ units in AUD"
      ],
      "line": 126
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 127,
  "name": "User be able to charges in Review page as below",
  "rows": [
    {
      "cells": [
        "TotalSurcharges",
        "TotalCharges"
      ],
      "line": 128
    },
    {
      "cells": [
        "TOTAL SURCHARGES AUD $0.00",
        "Total Charges AUD $0.00"
      ],
      "line": 129
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 130,
  "name": "User Confirm Order",
  "keyword": "When "
});
formatter.step({
  "line": 131,
  "name": "User be able to see Order number and Order created Date",
  "keyword": "Then "
});
formatter.step({
  "line": 132,
  "name": "User be able to create a new order",
  "keyword": "Then "
});
formatter.step({
  "line": 133,
  "name": "User be able to go back to Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 134,
  "name": "User have ability to Print the order details after confirming the order",
  "keyword": "And "
});
formatter.step({
  "line": 135,
  "name": "User can go to MY ORDERS",
  "keyword": "Then "
});
formatter.step({
  "line": 136,
  "name": "User Clicks on Myorders to see created ordered",
  "keyword": "When "
});
formatter.step({
  "line": 137,
  "name": "User navigated to MYorders screen and can open the created order",
  "rows": [
    {
      "cells": [
        "ScreenHeading"
      ],
      "line": 138
    },
    {
      "cells": [
        "MY ORDERS"
      ],
      "line": 139
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 140,
  "name": "User be able to see Overview details in the Order Summary Page as below",
  "rows": [
    {
      "cells": [
        "TollCarrier",
        "AccountNumber",
        "Contact name",
        "Contact number"
      ],
      "line": 141
    },
    {
      "cells": [
        "PRIO",
        "200BHY NATIONAL PRIORITY FOC",
        "Matthew",
        "61-481234563"
      ],
      "line": 142
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 143,
  "name": "User be able to see Delivery details in the Order Summary Page as below",
  "rows": [
    {
      "cells": [
        "Contact name",
        "Phone number",
        "Company name",
        "Address",
        "Customer reference",
        "Delivery instructions"
      ],
      "line": 144
    },
    {
      "cells": [
        "Andrea",
        "61-412345678",
        "Dialog Group",
        "60, Collins Street MELBOURNE VIC 3000",
        "Ref876543",
        "Third times Test DeliveryInstructions"
      ],
      "line": 145
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 146,
  "name": "User be able to see first Line item details as below",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Quantity",
        "UnitPrice",
        "Total",
        "PreprintFrom"
      ],
      "line": 147
    },
    {
      "cells": [
        "Same Day Consignment (LO6626)",
        "Qty 25",
        "Unit price : $0.00",
        "Total $0.00",
        "60, Collins Street CDE MELBOURNE VIC 3000 AU"
      ],
      "line": 148
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 149,
  "name": "User be able to see second Line item details as below",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Quantity",
        "UnitPrice",
        "Total"
      ],
      "line": 150
    },
    {
      "cells": [
        "Overnight Consignment (LO5133)",
        "Qty 25",
        "Unit price : $0.00",
        "Total $0.00"
      ],
      "line": 151
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 152,
  "name": "User be able to see third Line item details as below",
  "rows": [
    {
      "cells": [
        "ProductName",
        "Quantity",
        "UnitPrice",
        "Total"
      ],
      "line": 153
    },
    {
      "cells": [
        "Off Peak Consignment (LO5134)",
        "Qty 25",
        "Unit price : $0.00",
        "Total $0.00"
      ],
      "line": 154
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 155,
  "name": "User must see following message in the Order Summary Page as below",
  "rows": [
    {
      "cells": [
        "GSTMSG"
      ],
      "line": 156
    },
    {
      "cells": [
        "* For the purpose of this order, the Total excludes GST . The applicable amount of GST in relation to this order will be included in the final tax invoice Note : All $ units in AUD"
      ],
      "line": 157
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 158,
  "name": "User be able to charges in the Order Summary Page as below",
  "rows": [
    {
      "cells": [
        "TotalSurcharges",
        "TotalCharges"
      ],
      "line": 159
    },
    {
      "cells": [
        "TOTAL SURCHARGES AUD $0.00",
        "Total Charges AUD $0.00"
      ],
      "line": 160
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 161,
  "name": "User have ability to Print the order details in the Order Summary Page as below",
  "keyword": "And "
});
formatter.match({
  "location": "StationeryCommonStepsDefinitions.user_clicks_on_the_mega_menu()"
});
formatter.result({
  "duration": 2150774400,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ci class\u003d\"ico-hamburger-menu\"\u003e\u003c/i\u003e is not clickable at point (166, 15). Other element would receive the click: \u003cdiv id\u003d\"page-loader\" class\u003d\"\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027PC12257\u0027, ip: \u002710.22.138.238\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\3445\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.100, webStorageEnabled: true}\nSession ID: f714f9917114033a997a7ffbde296bc2\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat global.PageBase.click(PageBase.java:340)\r\n\tat mytollhomepage.MyTollHomePageActions.ClickMenu(MyTollHomePageActions.java:472)\r\n\tat steps.stationery.StationeryCommonStepsDefinitions.user_clicks_on_the_mega_menu(StationeryCommonStepsDefinitions.java:31)\r\n\tat ✽.When User clicks on the mega menu(src/test/Resources/stationery/MYT_6079_6080_Stationery - Order Stationery.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_must_be_able_to_see_an_option_to_select_Order_Stationery()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StationeryCommonStepsDefinitions.user_selects_Order_Stationery()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_able_to_select_Consignment_Notes_products_and_select_one_of_those(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 54
    }
  ],
  "location": "MYT_6079_StationeryOrderStationery.user_can_increase_or_Decrease_the_Qty_of_a_product_by(int,DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_enter_preprint_detatil_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_edit_preprint_detatil_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_ADD_TO_CART_a_Product(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 95
    }
  ],
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_product_added_to_the_cart_and_the_number_of_items_in_the_cart_increment_by(int,DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_clicks_Edit_preprint_icon_in_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_edits_preprint_details_inside_the_cart(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_ADD_TO_CART_a_Product(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 102
    }
  ],
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_second_product_added_to_the_cart_and_the_number_of_items_in_the_cart_increment_by(int,DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_removes_second_product_from_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_cart_has_been_updated_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_ADD_TO_CART_a_Product(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_second_product_added_to_the_cart_again(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_PROOCEED_TO_ORDER()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_navigates_to_Enter_your_stationery_delivery_details_page(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_enter_Review_Order_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_clicks_Review_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_Overview_details_in_the_Review_Page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_Delivery_details_in_the_Review_page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_first_Line_item_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_second_Line_item_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_must_see_following_message(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_charges_in_Review_page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_clicks_the_Edit_Delivery_Details_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_enter_Review_Order_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_clicks_Review_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_Overview_details_in_the_Review_Page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_Delivery_details_in_the_Review_page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_first_Line_item_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_second_Line_item_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_must_see_following_message(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_charges_in_Review_page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_clicks_the_EDIT_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_ADD_TO_CART_a_Product(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 101
    }
  ],
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_third_product_added_to_the_cart_and_the_number_of_items_in_the_cart_increment_by(int,DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_PROOCEED_TO_ORDER()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_enter_Review_Order_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_clicks_Review_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_Overview_details_in_the_Review_Page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_Delivery_details_in_the_Review_page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_first_Line_item_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_second_Line_item_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_third_Line_item_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_must_see_following_message(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_charges_in_Review_page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_Confirm_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_Order_number_and_Order_created_Date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_create_a_new_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_go_back_to_Dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_have_ability_to_Print_the_order_details_after_confirming_the_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_can_go_to_MY_ORDERS()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_Clicks_on_Myorders_to_see_created_ordered()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_navigated_to_MYorders_screen_and_can_open_the_created_order(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_Overview_details_in_the_Order_Summary_Page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_Delivery_details_in_the_Order_Summary_Page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_first_Line_item_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_second_Line_item_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_see_third_Line_item_details_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_must_see_following_message_in_the_Order_Summary_Page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_be_able_to_charges_in_the_Order_Summary_Page_as_below(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_have_ability_to_Print_the_order_details_in_the_Order_Summary_Page_as_below()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 701149400,
  "status": "passed"
});
formatter.uri("src/test/Resources/stationery/MYT_6080_My Orders List Orders that I have submitted previously.feature");
formatter.feature({
  "line": 1,
  "name": "MYT_6080 My Orders - List Orders that I have submitted previously",
  "description": "",
  "id": "myt-6080-my-orders---list-orders-that-i-have-submitted-previously",
  "keyword": "Feature"
});
formatter.before({
  "duration": 39000,
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
  "name": "MyToll Toll Priority AU User logged in and has a Toll Priority AU Standard / Full Financial account and Stationery function is enabled",
  "keyword": "Given "
});
formatter.match({
  "location": "StationeryCommonStepsDefinitions.mytoll_Toll_Priority_AU_User_logged_in_and_has_a_Toll_Priority_AU_Standard_Full_Financial_account_and_Stationery_function_is_enabled()"
});
formatter.result({
  "duration": 61598477600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#Once bugs MYT-9478 and 9479 are closed, update this test to include creating a new order and verifying the details with the created order"
    }
  ],
  "line": 7,
  "name": "User wants to see a list of previous Stationery orders user has submitted",
  "description": "",
  "id": "myt-6080-my-orders---list-orders-that-i-have-submitted-previously;user-wants-to-see-a-list-of-previous-stationery-orders-user-has-submitted",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User clicks on the mega menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks My Orders",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User must see My Orders page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user must be able to view the orders on My Orders page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on an Order that appears in the list",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User will be able to view the details of the Order",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User must be able to print",
  "keyword": "Then "
});
formatter.match({
  "location": "StationeryCommonStepsDefinitions.user_clicks_on_the_mega_menu()"
});
formatter.result({
  "duration": 2136116300,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ci class\u003d\"ico-hamburger-menu\"\u003e\u003c/i\u003e is not clickable at point (166, 15). Other element would receive the click: \u003cdiv id\u003d\"page-loader\" class\u003d\"\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027PC12257\u0027, ip: \u002710.22.138.238\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\3445\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.100, webStorageEnabled: true}\nSession ID: 93aeee3dbd7474a087ba788d657b771d\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat global.PageBase.click(PageBase.java:340)\r\n\tat mytollhomepage.MyTollHomePageActions.ClickMenu(MyTollHomePageActions.java:472)\r\n\tat steps.stationery.StationeryCommonStepsDefinitions.user_clicks_on_the_mega_menu(StationeryCommonStepsDefinitions.java:31)\r\n\tat ✽.When User clicks on the mega menu(src/test/Resources/stationery/MYT_6080_My Orders List Orders that I have submitted previously.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_clicks_My_Orders()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_must_see_My_Orders_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_must_be_able_to_view_and_sort_the_orders_on_My_Orders_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_clicks_on_an_Order_that_appears_in_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_will_be_able_to_view_the_details_of_the_Order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MYT_6079_StationeryOrderStationery.user_must_be_able_to_print()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 708471300,
  "status": "passed"
});
});