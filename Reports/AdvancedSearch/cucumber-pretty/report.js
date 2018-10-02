$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/advancedsearch/MYT_3482_Advance_Search_LoadSavedSearch.feature");
formatter.feature({
  "line": 1,
  "name": "MYT-3482 Advance Search : Load Saved Search",
  "description": "",
  "id": "myt-3482-advance-search-:-load-saved-search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 241101,
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
  "name": "User is on the Advance Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Searches Using Shipment Created date - Date From",
  "rows": [
    {
      "cells": [
        "DateFrom"
      ],
      "line": 6
    },
    {
      "cells": [
        "07-05-2018"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Searches Using Shipment Created date - Date To",
  "rows": [
    {
      "cells": [
        "DateTo"
      ],
      "line": 9
    },
    {
      "cells": [
        "25-05-2018"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "advancedSearchCommonStepsDefinitions.User_is_Registered_in_MyToll_and_is_on_AdvanceSearch_page()"
});
formatter.result({
  "duration": 32926710201,
  "status": "passed"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserSearchesUsingShipmentCreatedDate_DateRange(DataTable)"
});
formatter.result({
  "duration": 1882920700,
  "status": "passed"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserSearchesUsingShipmentCreatedDate_DateTo(DataTable)"
});
formatter.result({
  "duration": 1791047000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User views all his searched shipment results from Advance Search - TGX",
  "description": "",
  "id": "myt-3482-advance-search-:-load-saved-search;user-views-all-his-searched-shipment-results-from-advance-search---tgx",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User inputs search criteria in the Toll Carrier feild",
  "rows": [
    {
      "cells": [
        "TollCarrier"
      ],
      "line": 15
    },
    {
      "cells": [
        "Toll Priority(AU \u0026 NZ)"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User Clicks Search and results are displayed",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#     |Verify Search Results are reflected according to tags|"
    }
  ],
  "line": 20,
  "name": "Search Results are displayed according to Track and Trace",
  "rows": [
    {
      "cells": [
        "TollShipmentNo",
        "References",
        "Milestone",
        "SenderLocation",
        "DeliveryLocation",
        "EstimatedDelivery",
        "Items"
      ],
      "line": 21
    },
    {
      "cells": [
        "Toll shipment no.",
        "References",
        "Milestone",
        "Sender location",
        "Receiver location",
        "Estimated/Actual delivery",
        "Items"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Save Search Option is visible",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Selects Save Search Option",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User Verifies if Saved Search is Availble in the Dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Clicks Search and results are displayed",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#     |Verify Search Results are reflected according to tags|"
    }
  ],
  "line": 29,
  "name": "User Deletes Saved Search from the Dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User Cancels Delete Saved Search",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User Deletes Saved Search from the Dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User Confirms Delete Saved Search",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User Verifies Saved Search Does not Exist on DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User Closes the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserInputsSearchCriteriaforTollCarrier(DataTable)"
});
formatter.result({
  "duration": 2544588400,
  "status": "passed"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserCliksSearchAndVerifiesResults()"
});
formatter.result({
  "duration": 4331313799,
  "status": "passed"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.SearchResultsAreDisplayedAccordingToTrackandTrace(DataTable)"
});
formatter.result({
  "duration": 4016826000,
  "status": "passed"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.SaveSearchOptionIsVisible()"
});
formatter.result({
  "duration": 581301000,
  "status": "passed"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserSelectsSaveSearchOption()"
});
formatter.result({
  "duration": 3045865400,
  "status": "passed"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserVerifiesIfSavedSearchIsAvailbleInTheDropdown()"
});
formatter.result({
  "duration": 2150781200,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ci class\u003d\"ico-hamburger-menu\"\u003e\u003c/i\u003e is not clickable at point (166, 15). Other element would receive the click: \u003cdiv class\u003d\"tollSaveSearchPopup\" style\u003d\"\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 46 milliseconds\nBuild info: version: \u0027unknown\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027PC12257\u0027, ip: \u002710.22.138.238\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91), userDataDir\u003dC:\\Users\\3445\\AppData\\Local\\Temp\\scoped_dir15464_13243}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d69.0.3497.100, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 6b591f05d842ed77a5e6f68f8032d0ea\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat global.PageBase.click(PageBase.java:340)\r\n\tat mytollhomepage.MyTollHomePageActions.ClickMenu(MyTollHomePageActions.java:470)\r\n\tat steps.advancedsearch.advanceSearchStepDefinitions.UserVerifiesIfSavedSearchIsAvailbleInTheDropdown(advanceSearchStepDefinitions.java:993)\r\n\tat ✽.Then User Verifies if Saved Search is Availble in the Dropdown(src/test/Resources/advancedsearch/MYT_3482_Advance_Search_LoadSavedSearch.feature:25)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserCliksSearchAndVerifiesResults()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserDeletesSavedSearchfromtheDropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserCancelsDeleteSavedSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserDeletesSavedSearchfromtheDropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserConfirmsDeleteSavedSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "advanceSearchStepDefinitions.UserVerifiesSavedSearchDoesNotExistOnDropDown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashboardCommonStepsDefinitions.UserClosestheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 949627901,
  "status": "passed"
});
formatter.before({
  "duration": 211800,
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
  "name": "User is on the Advance Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Searches Using Shipment Created date - Date From",
  "rows": [
    {
      "cells": [
        "DateFrom"
      ],
      "line": 6
    },
    {
      "cells": [
        "07-05-2018"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Searches Using Shipment Created date - Date To",
  "rows": [
    {
      "cells": [
        "DateTo"
      ],
      "line": 9
    },
    {
      "cells": [
        "25-05-2018"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "advancedSearchCommonStepsDefinitions.User_is_Registered_in_MyToll_and_is_on_AdvanceSearch_page()"
});
