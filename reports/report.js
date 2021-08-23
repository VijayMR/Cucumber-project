$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/adactinpage.feature");
formatter.feature({
  "name": "To validate the adactin webpage completely.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate with the correct username and userpassword.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in adactin webpage.",
  "keyword": "Given "
});
formatter.step({
  "name": "To enter the username and password.",
  "keyword": "When "
});
formatter.step({
  "name": "To search the hotel.",
  "keyword": "And "
});
formatter.step({
  "name": "To select the hotel.",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter \"\u003cFirstname\u003e\"and\"\u003clastname\u003e\"and\"\u003cBilling address\u003e\"and\"\u003ccreditcard number\u003e\"and\"\u003ccvv number\u003e\".",
  "keyword": "And "
});
formatter.step({
  "name": "user confirmation whether booked or not with ID generated.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "lastname",
        "Billing address",
        "creditcard number",
        "cvv number"
      ]
    },
    {
      "cells": [
        "ben",
        "stoke",
        "london",
        "1234567891012124",
        "456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate with the correct username and userpassword.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should be in adactin webpage.",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.user_should_be_in_adactin_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter the username and password.",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.to_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To search the hotel.",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.to_search_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select the hotel.",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.to_select_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"ben\"and\"stoke\"and\"london\"and\"1234567891012124\"and\"456\".",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.user_should_enter_and_and_and_and(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user confirmation whether booked or not with ID generated.",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_confirmation_whether_booked_or_not_with_ID_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate with the correct username and userpassword.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in adactin webpage.",
  "keyword": "Given "
});
formatter.step({
  "name": "To enter the username and password.",
  "keyword": "When "
});
formatter.step({
  "name": "To search the hotel.",
  "keyword": "And "
});
formatter.step({
  "name": "To select the hotel.",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter \"\u003cFirstname\u003e\"and\"\u003clastname\u003e\"and\"\u003cBilling address\u003e\"and\"\u003ccreditcard number\u003e\"and\"\u003ccvv number\u003e\".",
  "keyword": "And "
});
formatter.step({
  "name": "user confirmation whether booked or not with ID generated.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "lastname",
        "Billing address",
        "creditcard number",
        "cvv number"
      ]
    },
    {
      "cells": [
        "ben",
        "stoke",
        "london",
        "1234567891012124",
        "456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate with the correct username and userpassword.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should be in adactin webpage.",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.user_should_be_in_adactin_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter the username and password.",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.to_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To search the hotel.",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.to_search_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select the hotel.",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.to_select_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"ben\"and\"stoke\"and\"london\"and\"1234567891012124\"and\"456\".",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.user_should_enter_and_and_and_and(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user confirmation whether booked or not with ID generated.",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_confirmation_whether_booked_or_not_with_ID_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});