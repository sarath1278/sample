Feature: Verifying Adactin hotel details

  Scenario Outline: 
    Given User is on Adactin page
    When User should perform login "<userName>", "<password>"
    And User should Search Hotels "<Location>", "<Hotels>", "<RoomType>", "<NumberofRooms>", "<CheckInDate>", "<CheckOutDate>" , "<Adults Per Room>",and"<Childrens Per Room>"
    And User should Select Hotel
    And User should Book Hotel "<First Name>", "<Last Name>", "<Billing Address>", "<CreditCard Number>","<CreditCard Type>", "<Expiry Month>","<Expiry Year>",and"<CVV Number>"
    Then User should verify success msg

    Examples: 
      | userName   | password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | Adults Per Room | Childrens Per Room | First Name | Last Name | Billing Address     | CreditCard Number | CreditCard Type | Expiry Month | Expiry Year | CVV Number |
      | sarath1278 | 7WA386   | London   | Hotel Sunshine | Deluxe   | 1-One         | 26/07/2022  | 27/07/2022   | 2-Two           | 1-One              | Sarath     | Kumar     | Triplicane, Chennai |  1234567809876543 | Visa            | August       |        2022 |        322 |
      
	