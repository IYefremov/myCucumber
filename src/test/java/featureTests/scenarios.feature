#     Verify two scenarious:
#       1) User can use search
#       2) User can open login page

@TestScenarioV1
Feature: annotation

  Scenario: Verify the search functionality is working
  Given I am go to the home page
  When I search goods with name "Blouse"
  Then I am close the browser page

    Scenario: User can reach login page
      Given I am go to the home page
      When I am on the contact_us page
      Then I am close the browser page
