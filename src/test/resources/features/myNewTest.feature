Feature: As a user I want to be able to add product to wish list

  Scenario: Adding a product to the Wish list
    Given I have the Esprit application open on my homepage
    When I add any product to my Wish list
    Then I can see the badge is incrementic on the wish list item in the navigation bar


    When I taping the heart icon on the same product
    Then I can see the badge is decrementation on the wish list item in navigation bar

    When I tap a heary icon on a title in my wish list
    Then I can see that this removes the product from my wish list


