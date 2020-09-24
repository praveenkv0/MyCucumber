Feature: verifying the Adactin functionalities with Different types of rooms

  Scenario: verifying adactin hotel booking functionalities with different types of rooms
    Given User has an adactin account
    When User should enter
      | userName  | passWord |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
      | praveenkv | 5K6G51   |
     
      
    And User should click the login button
    And User should select
      | location  | hotels         | roomType     | numberOfRooms | adultsPerRoom | childrensPerRoom |
      | Melbourne | Hotel Sunshine | Standard     |             1 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Double       |             1 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Deluxe       |             1 |             1 |                0 |
      | Melbourne | Hotel Sunshine | Super Deluxe |             1 |             1 |                0 |
    And User should click the search button
    And user should click the checkbox
    And User should click continue
    And User should enter values
      | firstName | lastName | billingAddress | creditCardNumber | creditCardType | expireMonth | expireYear | cvvNumber |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
      | praveen   | kv       | adadaada       | 1234567891234567 | VISA           |           2 |       2022 |      1234 |
    And User should click book now
    Then User should print the order id
