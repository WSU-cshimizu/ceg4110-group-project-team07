Feature: Upload Image and Data
  As a user
  I want to upload an image with data
  So that I can store the information successfully

  Scenario: Successful upload of image and data
    Given I am on the upload page
    When I fill in the form with valid data
    And I submit the form
    Then I should see a success message