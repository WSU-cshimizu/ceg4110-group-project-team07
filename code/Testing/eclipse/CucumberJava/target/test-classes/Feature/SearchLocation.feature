Feature: Search location on GeoSyncra homepage

  Scenario: Search for a location successfully
    Given I am on the GeoSyncra homepage
    When I enter "texas" in the search bar
    And I click the search button
    Then I should see the results for "texas"