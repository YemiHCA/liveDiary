Feature: Book a GP appointment 

  Scenario: Verify Book a GP appointment
    Given user navigates to home page 
    When user click Book an appointment
    And user click Book a GP appointment
    And user select an appointment type
    And user select appointment
    And user select Gender
    And user click continue
    And user select location
    And user select slot
    And user select Book this slot
    And user input their details 
    And user click Book now button
    Then confirm your phone number page is displayed 
    
    