# Project Requirements

### System Overview
The GeoSyncra system will consist of three main components:
- **Frontend (Angular)**: To handle the user interface and interaction.
- **Backend (Spring Boot with Java)**: To manage business logic, user authentication, and data handling.
- **Database (MySQL)**: To store user data, images, locations, and other associated content.

The system will utilize both RESTful APIs and GraphQL for data retrieval and API communication, and the server will be hosted using GoDaddy.

1. **Functional Requirements**

1.1. **User Authentication**
  - Main Object: An HTML form with fields for:
  - Email + text input
  - Password + password input
  - Submit button
  - User-Friendly Feature: Placeholder text in each field to guide users (e.g., "Enter your email").

### User Requirements:
  - Users must enter their email and password.
  - If credentials are correct, users proceed to the home page.
  - If incorrect, a pop-up will inform users of the error.
  - Responsiveness: The page should work on all devices (smartphones, tablets, desktops).
  - Browser Compatibility: Should function properly on Chrome, Firefox, Safari, and Edge.

1.2. Location and Media Upload
  - Main Object: A form for uploading media (images/videos) and location details (latitude/longitude).
  F- ile input for image/video.
  - Text input for location (latitude/longitude).
  - Submit button.
  - User-Friendly Feature: Predefined input hints for the latitude/longitude fields.
    
### User Requirements:
  - Users can upload an image or video and input location coordinates.
  - Data is saved in the system and associated with the user's profile.

1.3. Map Integration
  - Main Object: Google Maps display embedded in the UI.
  - User-Friendly Feature: Users can interact with the map to view or add locations.
  - User Requirements:
  - Users can see saved locations.
  - They can click on a location to get directions.

1.4. Navigation Sharing
  - Main Object: Shareable link generation for navigation to specific locations.
  - User-Friendly Feature: A "Share" button next to each saved location.

### User Requirements:
  - Users can share links via email or social media.

1.5. Profile Management
  - Main Object: A page to update profile information.
  - Fields for name, email, and password.
  - Save button.
    
### User Requirements:
  - Users can update their profile information and save changes.
  - Updated data is reflected in the system.
    
1.6. Comments and Annotations
  - Main Object: Text input box for adding comments to locations or media.
  - User Requirements:
  - Users can leave comments on their own or other users’ submissions.
  - Comments are stored and can be viewed later.

1.7. API Testing
  - Main Object: Testing APIs (REST and GraphQL) for communication between frontend and backend.
### User Requirements:
  - Regular testing for functionality and performance.
  - Bugs and issues should be identified and resolved before deployment.

### Performance Optimization
   - Include system performance specifications, such the speed at which images are uploaded, websites must load, and APIs must respond. 
      Create acceptable latency criteria for specific activities (such user login and map rendering).

### Scalability Requirements:
   - Explain how the system should grow to handle more users, information, and media submissions. Managing massive volumes of images, user 
    interactions, and location data are all included in this.

### Accessibility:
   - Determine the conditions that must be met for the system to be usable by people with disabilities. This could involve following online 
    accessibility guidelines, keyboard navigation, and screen reader compatibility (WCAG).

### Error Handling and Notifications
   - When actions do not work as intended, such as when uploading photographs or making login attempts, provide clear error messages .


# Signatures
Gokulnaath Govindaraj

Prabesh Bhattarai

Jenessa Sparks

Anna Crafton
