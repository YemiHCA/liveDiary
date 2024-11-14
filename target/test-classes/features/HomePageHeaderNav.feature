Feature: Header Nav

  Scenario Outline: Verify home page Header Nav links
    Given user navigates to home page Header Nav links
    When user observes the page 
    Then there should be for business link
    And For healthcare professionals link
    And pay my bills link
    And About HCA UK link
    And Careers link