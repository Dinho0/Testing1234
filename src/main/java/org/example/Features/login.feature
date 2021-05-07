Feature: Login Page
  Scenario: Test Login Page
    Given I'm on the home page
    When I input username and password
    Then  I should be successfully logged in

  Scenario:  Add Item to cart
    Given I'm on the home page
    When I search for the product
    Then I add item to cart

  Scenario:  Remove Item from Cart
    Given I've added item to the cart
    When I search for the product
    Then I remove item from cart

