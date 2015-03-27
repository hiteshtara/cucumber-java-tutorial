Feature: Test fruit color in the market
@fruit
Scenario: Test fruit color in the market
Given I go to market
When I check the fruits
Then these fruits should have these colors
| FruitName | FruitColor |
| Mango | Yellow |
| Apple | Red |