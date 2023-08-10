

Feature: Open Homepage of Portal
  Scenario: Home page
    Given The home page opens with the link "https://dsportalapp.herokuapp.com/"
    When user clicks get started without registration
    Then user is redirected to home page