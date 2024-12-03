Feature: Add a comment on the GeoSyncra page

  Scenario: User adds a comment successfully
    Given I am on the comments page
    When I enter "This is a test comment" in the comment box
    And I click the submit button
    Then I should see "This is a test comment" in the comments section
