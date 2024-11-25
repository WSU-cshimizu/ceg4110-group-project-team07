# Requirements Specification

## User Story 1
As a user, I want to share my thoughts about the place so that others can also take a look at this place.

**Requirement 1.1:** The system shall allow users to write and submit text-based thoughts or reviews about a specific location.
  - Requirement 1.1.1: The text input form should provide basic formatting options (e.g., bold, italics).
  - Requirement 1.1.2: Users should be able to delete their reviews.

**Requirement 1.2:** The system shall display user-submitted thoughts/reviews on the location's page.
  - Requirment 1.2.1: The review should be visible to other users on the location's details page.
  - Requirement 1.2.2: Each review should display the username and timestamp of submission. 

## User Story 2
As a user, I want to have a navigation option to navigate to the location which is posted on the website and also a share option to share the location of this particular location.

**Requirement 2.1:** The system shall provide a button that uses the Google Maps API to direct the user to the location.
  - Requirement 2.1.1: The button should open Google Maps with the coordinates of the location preloaded.
  - Requirement 2.1.2: The navigation link should work across all devices (mobile, desktop).

**Requirement 2.2:** The system shall provide a "Share" button for each location that generates a unique shareable link.
  - Requirement 2.2.1: The link should be copyable and shareable via social media and email.
  - Requirement 2.2.2: The shared link should direct users to the exact location's details page on GeoSyncra.

## User Story 3
As a user, I want to upload the picture of difficult-to-find places wherever I go and can share with my friends so that it will be easier for them to find.

**Requirement 3.1:** The system shall allow users to upload images along with location details (latitude and longitude).
  - Requirement 3.1.1: The system should support standard image file types (e.g., JPEG, PNG).
  - Requirement 3.1.2: Images should be stored in the database and associated with the user’s profile.

**Requirement 3.2:** The system shall allow users to share uploaded images with a unique URL.
  - Requirement 3.2.1: Each uploaded image will have a shareable link to its associated page.
  - Requirement 3.2.2: Users should be able to share the link through email and social media.

## User Story 4
As a user, I want to upload the picture of a location and view directions to the landmark using Google Maps so that I can reach the destination efficiently.

**Requirement 4.1:** The system shall allow users to upload images of a location along with its coordinates.
  - Requirement 4.1.1: The system should accept both image and coordinate input when uploading a location.
  - Requirement 4.1.2: The uploaded image should be linked to the Google Maps directions for the location.

**Requirement 4.2:** The system shall provide a directions option that uses Google Maps to show directions from the user’s current location.
  - Requirement 4.2.1: Directions should open in Google Maps with the coordinates of the location preloaded.
  - Requirement 4.2.2: The directions option should function across mobile and desktop devices.

## User Story 5
As a user, I want to also post comments to the picture of places that I have uploaded which will give more information about the place.

**Requirement 5.1:** The system shall allow users to post comments on their uploaded images.
  - Requirement 5.1.1: Users should be able to write text comments up to 500 characters.
  - Requirement 5.1.2: Users can delete their own comments
  - 
**Requirement 5.2:**
The system shall display all comments related to an image on the image’s page.
  - Requirement 5.2.1: Comments should be shown below the image in chronological order.
  - Requirement 5.2.2: Comments should include the commenter’s username and a timestamp.

## User Story 6
As a user, I want to create and manage my profile and also see my uploaded images.

**Requirement 6.1:**
The system shall allow users to create and update their profiles.
  - Requirement 6.1.1: Users can update their profile information such as name, email, and password.
  - Requirement 6.1.2: Changes to profile information should be immediately reflected in the system.

**Requirement 6.2:**
The system shall provide a section in the user’s profile where they can view their uploaded images.
  - Requirement 6.2.1: Each user should be able to see all of their uploaded images on their profile page.
  - Requirement 6.2.2: Users can delete images from their profile.

## User Story 7
As a user, I want to see notifications about new posts, so that I can stay up-to-date on the platform.

**Requirement 7.1:** The system shall display notifications for new posts to users.
  - Requirement 7.1.1: Notifications should be shown on the homepage and in a dedicated notifications tab.
  - Requirement 7.1.2: Notifications should include details about the new post (user, location).

**Requirement 7.2:**
The system shall allow users to manage their notification preferences.
  - Requirement 7.2.1: Users should be able to toggle notifications on or off for different categories (e.g., new posts, comments).
  - Requirement 7.2.2: Preferences should be stored and applied system-wide.

## User Story 8
As a user, I want to have an account, so that I can securely log in, manage my preferences, and access personalized features and services.

**Requirement 8.1:** The system shall provide a secure login mechanism.
  - Requirement 8.1.1: The login form should require email and password inputs.
  - Requirement 8.1.2: Passwords should be securely hashed and stored in the database.

**Requirement 8.2:** The system shall allow users to manage their account preferences.
  - Requirement 8.2.1: Users should be able to update personal details like email and password.
  - Requirement 8.2.2: Users should be able to delete their accounts and associated data.

## User Story 9
As a user, I want to upload pictures so I can share information about a location.

**Requirement 9.1:** The system shall allow users to upload images associated with a specific location.
  - Requirement 9.1.1: Users should provide an image and relevant location details (coordinates).
  - Requirement 9.1.2: The uploaded image should be stored in the system and linked to the location.

**Requirement 9.2:** The system shall allow users to share uploaded images via a unique link.
  - Requirement 9.2.1: A unique link should be generated for each uploaded image.
  - Requirement 9.2.2: The link should direct others to the image on the platform.

## Developer Story 1
As a Backend developer, I want to develop a working REST API endpoint to execute CRUD operations which is essential when we upload the information from the website and post it in the feed page of the website.

**Requirement 10.1:** The system shall provide a REST API that supports creating, reading, updating, and deleting (CRUD) data for the feed page.
  - Requirement 10.1.1: The API should allow users to create new posts with images, text, and locations.
  - Requirement 10.1.2: The API should return appropriate status codes
    
**Requirement 10.2:** The system shall ensure that the API enables updating and deleting of user-specific posts.
  - Requirement 10.2.1: Users should be able to update their existing posts using the PUT method.
  - Requirement 10.2.2: Users should be able to delete their posts using the DELETE method, and the system should return a confirmation upon successful deletion.

## Developer Story 2
As a Backend Developer, I want to integrate the Google Maps API to enable location navigation functionality on the website. This involves setting up the API, creating endpoints to serve location data, and making sure that the frontend can interact with the map continuously. By implementing this, users will be able to navigate to the specific location.

**Requirement 11.1:** The system shall integrate the Google Maps API for displaying locations on the map.
  - Requirement 11.1.1: The API should serve location data (latitude and longitude) for each post.
  - Requirement 11.1.2: The API should ensure that the frontend can fetch the data and display it on the map seamlessly.

**Requirement 12.2:** The system shall provide navigation functionality using the Google Maps API.
  - Requirement 12.2.1: Users should be able to click on a location and open Google Maps with navigation options.
  - Requirement 12.2.2: The API should generate a navigation link that can be shared with others.

## Developer Story 3
As an API integrator, I want to use GraphQL to enable flexible data querying, so that the frontend only requests the data it requires, which improves productivity.

**Requirement 13.1:** The system shall support GraphQL for data queries.
  - Requirement 13.1.1: The GraphQL API should allow users to query specific data fields related to posts, locations, and user profiles.
  - Requirement 13.1.2: The API should handle filtering and pagination based on user queries.

**Requirement 14.2:** The system shall allow data modification through GraphQL mutations.
  - Requirement 14.2.1: The API should support mutations for adding, updating, and deleting posts and user data.
  - Requirement 14.2.2: The GraphQL API should validate and authorize each mutation to ensure secure data operations.

## Developer Story 4
As a developer, I want to create an easy-to-use registration system to make a smooth user experience.

**Requirement 15.1:** The system shall provide a user-friendly registration form.
  - Requirement 15.1.1: The registration form should include fields for email, password, and confirm password.
  - Requirement 15.1.2: The form should validate user input (e.g., password matching, valid email format) before submission.

**Requirement 16.2:** The system shall ensure secure handling of user data during registration.
  - Requirement 16.2.1: User passwords should be hashed and securely stored in the database.
  - Requirement 16.2.2: The system should send a confirmation email after successful registration.

## Developer Story 5
As a Database developer, I want to be able to send and receive information from the front end.

**Requirement 17.1:** The system shall ensure efficient data transmission between the frontend and the database.
  - Requirement 17.1.1: The database should store user data, posts, images, and locations.
  - Requirement 17.1.2: The database should retrieve data requested by the frontend via REST or GraphQL APIs.

**Requirement 18.2:** The system shall enable consistent data retrieval and updates.
  - Requirement 18.2.1: The database should allow users to update their posts and profiles.
  - Requirement 18.2.2: Changes made to the database should be reflected immediately on the frontend.

## Tester Story 1 
As a Tester, I want to verify that the design requirements are met through automated testing. This includes checking that the buttons and text fields work properly so that information can be provided when uploading details. Additionally, I want to ensure that API integration functions efficiently for validating the location navigation feature.

**Requirement 19.1:** The system shall provide automated testing coverage for all user input fields, including buttons and text fields.
  - Requirement 11.1.1: Automated tests should ensure that buttons perform the expected actions (e.g., submission, navigation).
  - Requirement 11.1.2: Text fields should accept, validate, and store user input correctly.

**Requirement 19.2:** The system shall provide automated tests for the API integration that supports location navigation.
  -  Requirement 11.2.1: Tests should validate that the API returns correct location data and preloads it into the Google Maps API.
  -  Requirement 11.2.2: Tests should verify that navigation functionality works across different devices.
    
# Signatures

Gokulnaath Govindaraj

Prabesh Bhattarai

Jenessa Sparks
