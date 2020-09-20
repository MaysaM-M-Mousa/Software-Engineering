
Feature: Checkout
  I want to use this template for my feature file

  Scenario: Checkout a banana
    Given The Price of a "banana" is 40
    When I checkout 1 "banana"
    Then The total price should be 40


  Scenario: Two bananas scanned separately
    Given The Price of a "banana" is 40
    When I checkout 1 "banana"
    And I checkout 1 "banana"
    Then The total price should be 80

  Scenario: A banana and An Apple
    Given The Price of a "banana" is 40
    And The Price of a "apple" is 25
    When I checkout 1 "banana"
    And I checkout 1 "apple"
    Then The total price should be 65

