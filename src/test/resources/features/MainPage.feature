Feature: Validate Home Page

Background:
  Given User access to page "https://toolsqa.com/"

  @CP0001
  Scenario: Validate title
    When User enter to page should see the title "Selenium Online Trainings"
#    Then User get the url page and validate is the same to "https://toolsqa.com/"