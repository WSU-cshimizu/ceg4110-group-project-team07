Feature: About Page

  Scenario: Validate About page content and elements
    Given I am on the About page
    Then I should see the title "GeoSyncra"
    And I should see the "About" section with its content
    And I should see a navigation bar with links to other pages
    And the clock should display the current time
    And I should see a placeholder image
