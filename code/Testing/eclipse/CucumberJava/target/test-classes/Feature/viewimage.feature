Feature: View image functionality
  Scenario: Navigate to Random Images page, display an image, and close the gallery
    Given I am on the Index page
    When I click on the "Viewpage" link
    Then I should be redirected to the Random Images page
    When I click on the "View Image" button
    Then the image should be displayed in the image container
    When I close the gallery
    Then the image container should be empty
