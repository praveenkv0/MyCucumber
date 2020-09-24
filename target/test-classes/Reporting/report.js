$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/TypesofRooms.feature");
formatter.feature({
  "name": "verifying the Adactin functionalities with Different types of rooms",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verifying adactin hotel booking functionalities with different types of rooms",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has an adactin account",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cuserName\u003e\" and \"\u003cpassWord\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should select \"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croomType\u003e\",\"\u003cnumberOfRooms\u003e\",\"\u003cadultsPerRoom\u003e\" and \"\u003cchildrensPerRoom\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should click the search button",
  "keyword": "And "
});
formatter.step({
  "name": "user should click the checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "User should click continue",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter the \"\u003cfirstName\u003e\", \"\u003clastName\u003e\", \"\u003cbillingAddress\u003e\", \"\u003ccreditCardNumber\u003e\", \"\u003ccreditCardType\u003e\", \"\u003cexpireMonth\u003e\", \"\u003cexpireYear\u003e\" and \"\u003ccvvNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should click book now",
  "keyword": "And "
});
formatter.step({
  "name": "User should print the order id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord",
        "location",
        "hotels",
        "roomType",
        "numberOfRooms",
        "adultsPerRoom",
        "childrensPerRoom",
        "firstName",
        "lastName",
        "billingAddress",
        "creditCardNumber",
        "creditCardType",
        "expireMonth",
        "expireYear",
        "cvvNumber"
      ]
    },
    {
      "cells": [
        "praveenkv",
        "5K6G51",
        "Melbourne",
        "Hotel Sunshine",
        "Standard",
        "1",
        "1",
        "0",
        "praveen",
        "kv",
        "adadaada",
        "1234567891234567",
        "VISA",
        "2",
        "2022",
        "1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying adactin hotel booking functionalities with different types of rooms",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has an adactin account",
  "keyword": "Given "
});
formatter.match({
  "location": "PageStep.user_has_an_adactin_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"praveenkv\" and \"5K6G51\"",
  "keyword": "When "
});
formatter.match({
  "location": "PageStep.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PageStep.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select \"Melbourne\",\"Hotel Sunshine\",\"Standard\",\"1\",\"1\" and \"0\"",
  "keyword": "And "
});
formatter.match({
  "location": "PageStep.user_should_select_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "PageStep.user_should_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "PageStep.user_should_click_the_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click continue",
  "keyword": "And "
});
formatter.match({
  "location": "PageStep.user_should_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the \"praveen\", \"kv\", \"adadaada\", \"1234567891234567\", \"VISA\", \"2\", \"2022\" and \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "PageStep.user_should_enter_the_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click book now",
  "keyword": "And "
});
formatter.match({
  "location": "PageStep.user_should_click_book_now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should print the order id",
  "keyword": "Then "
});
formatter.match({
  "location": "PageStep.user_should_print_the_order_id()"
});
formatter.result({
  "status": "passed"
});
});