Feature: verifying the Adactin functionalities with Different number of rooms

  Scenario: verifying adactin hotel booking functionalities with  number of rooms
    Given User has an adactin account
    When User should enter
      | userName  | passWord |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
    And User should click the login button
    And User should select
      | location  | hotels         | roomType | numberOfRooms | adultsPerRoom | childrensPerRoom |
      | Melbourne | Hotel Sunshine | Standard |             1 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Standard |             2 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Standard |             3 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Standard |             4 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Standard |             5 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Standard |             6 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Standard |             7 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Standard |             8 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Standard |             9 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Standard |            10 |             1 |                0 |
    And User should click the search button
    And user should click the checkbox
    And User should click continue
    And User should enter values
      | firstName | lastName | billingAddress | creditCardNumber | creditCardType | expireMonth | expireYear | cvvNumber |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
    And User should click book now
    Then User should print the order id
