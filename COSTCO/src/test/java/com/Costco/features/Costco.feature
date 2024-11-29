Feature: search
  Scenario: Validate search behaviour based on TV as a product type
    Given I am on the Costco home page
    When I click on the Menu button
    And I click on the HOT BUYS option
    Then It should display the page with all hot Buys items