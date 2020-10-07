Feature: Search and place order for Vegitables
@SeleniumTest
Scenario: Search for items and validate results

Given User is on Greencart Landing page
When User search for "Cucumber" Vegitable
Then "Cucumber" results are generated

@SeleniumTest
Scenario: Search for items and move to checkout page

Given User is on Greencart Landing page
When User search for "Brinjal" Vegitable
And  Adding items to cart
And User proceed to checkout page for purchase
Then Verify selected "Brinjal" items are displayed in check out page
