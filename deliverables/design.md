# Design Specification

## Diagram 1
### Use-case Diagram
![image](https://github.com/WSU-cshimizu/ceg4110-group-project-team07/blob/main/assets/design_images/1_login.jpg)
### Flow chart diagram
![image](https://github.com/WSU-cshimizu/ceg4110-group-project-team07/blob/main/assets/design_images/1_flow.jpg)
### Requirement
**Diagram 1 - Login page**
**Design Statement**
**Objective:**  
The objective of this design is to create a simple and user-friendly login/signup interface for a web or mobile application. The design focuses on enabling users to easily log in or create an account by filling in required credentials.

**Key Components:**

1. **Landing Page:**
   - The landing page features two main options:
     - **Login**
     - **Signup**
   - There is an additional "About" section at the bottom of the page.
   - Users can choose between logging into an existing account or signing up for a new account.
   
 1.1. **Login Page:**
    - The login page consists of two input fields:
      - **Username**
      - **Password**
    - There are two additional options below the login form:
      - **Forgot Password:** A link for users to recover their password if forgotten.
      - **New User?:** A prompt with a link to direct new users to the signup page.
 
 1.2 **Signup Page:**
    - The signup page consists of three input fields:
      - **Name:** The user’s full name.
      - **Mail:** The user’s email address.
      - **Password:** A password field for creating a secure account.
    - After filling in these details, the user can click on the "Signup" button.
    - The system will trigger a **Verification from Mail** process where the user will receive a confirmation email to verify their account before logging in.

**User Flow:**
1. Upon accessing the main landing page, the user can choose to either log in or sign up.
2. If the user clicks on **Login**, they are taken to the login page (1.1), where they can enter their credentials and log in.
3. If the user clicks on **Signup**, they are taken to the signup page (1.2), where they can create a new account. After submitting the form, they will be sent an email verification before they can access the application.

**Functionality Considerations:**
- **Security:** Password fields should implement secure password storage techniques such as hashing and salting.
- **Email Verification:** A mechanism to ensure users verify their email to complete registration.
- **Responsive Design:** The interface should be responsive, adapting well to both desktop and mobile devices.

## Diagram 2
### Use-case Diagram
![image](https://github.com/WSU-cshimizu/ceg4110-group-project-team07/blob/main/assets/design_images/2_req.jpg)
### Flow chart Diagram
![image](https://github.com/WSU-cshimizu/ceg4110-group-project-team07/blob/main/assets/design_images/2_flow.jpg)

### Requirement
**Diagram 2 - Main page**
**Design Statement**

**Objective:**
This diagram represents the feed page of an application that displays various random locations to users. The primary interaction points include an upload button, a location search feature, and a passive time display.

### **Key Elements:**

1. **Upload Button:**
   - Located at the top center of the page, the upload button takes the user to a new page where they can upload content. Additional functionality related to this feature will be discussed in the next diagram.

2. **Search by Area:**
   - A search feature that allows users to look up locations by city or area.

3. **Time (Passive Element):**
   - A non-interactive display showing the time. This is currently passive and doesn’t perform any actions.

4. **User Icon:**
   - Located on the right-hand side, the user icon provides access to the user's profile or settings (depending on the functionality to be added later).

5. **Feed Display:**
   - The main content of this page is a feed that displays random locations. Each location is accompanied by its name, location details, and user engagement metrics like likes and comments.


### **User Flow:**

1. **Accessing the Feed:**
   - Users enter the app and are taken directly to this feed page, where random locations are displayed.

2. **Viewing Random Locations:**
   - The feed displays a list of random locations, with each post showing details like the name of the content and the location. Users can scroll down to explore more locations.

3. **Using the Upload Button:**
   - By clicking on the **Upload** button at the top of the page, users are redirected to another page where they can upload their own content. The next diagram will provide further details on the upload process.

4. **Search by Area:**
   - Users can click on the **Search by Area** button to search for posts by city or area. This could involve typing in a location or selecting from a dropdown of cities.

5. **Viewing Time (Passive):**
   - The time element at the top is non-interactive in this design. However, it is visible to provide context, possibly for future sorting or viewing options.

6. **User Profile:**
   - Clicking the **User Icon** on the right could potentially take users to their profile page or settings in future designs.


### **Functionality Considerations:**

1. **Feed Display:**
   - The feed will likely employ dynamic loading to display random locations efficiently. Lazy loading or pagination can be used to ensure smooth performance when scrolling through multiple entries.

2. **Upload Navigation:**
   - Clicking the "Upload" button should trigger a seamless transition to the upload page. On the upload page, users will have the ability to add new content and perhaps tag locations, include descriptions, or other content-related actions.

3. **Search Functionality:**
   - The "Search by Area" function should allow users to filter feed content based on specific locations. This functionality can include an auto-suggest feature to improve usability.

4. **Passive Time Display:**
   - Although the "Time" element is passive, it shows time.

5. **Responsiveness:**
   - The interface should be designed to work across different screen sizes (mobile, tablet, desktop). The central placement of the navigation elements ensures ease of access on smaller screens.

6. **User Profile:**
   - Even though the user icon is present, it might not be interactive in this version of the design. Future iterations could allow users to access their profile, settings, or personal data.


## Diagram 3 
### Use-case Diagram
**Diagram 3 - Upload page**
![image](https://github.com/WSU-cshimizu/ceg4110-group-project-team07/blob/main/assets/design_images/3.jpg)
**Diagram 3.1 - Popup(Step1)**
![image](https://github.com/WSU-cshimizu/ceg4110-group-project-team07/blob/main/assets/design_images/3_1_req.jpg)
**Diagram 3.2 - Form(Step2)**
![image](https://github.com/WSU-cshimizu/ceg4110-group-project-team07/blob/main/assets/design_images/3_2req.jpg)
### Flow chart Diagram
![image](https://github.com/WSU-cshimizu/ceg4110-group-project-team07/blob/main/assets/design_images/3_flow.jpg)
### Requirement
**Design Statement**

**Objective:**
This multi-step design guides users through the process of uploading an image and providing relevant details. The interface consists of two screens, each focused on a specific part of the process: image selection and details submission.

### Screen 1: Picture Upload (Step 1)

**Key Components**:
   1. **Title**: "Picture Upload"
   2. **Image Upload Area**: A central area where users can either select an image from their device or access the camera.
   3. **Buttons**:
       - **Device**: Opens file manager or camera to select the image.
       - **Upload**: Finalizes the image selection and begins the upload process.
   4. **Popup Window**: A modal window to manage image selection and upload confirmation.
   5. **User Interaction**:
       - The user clicks "Device" to browse for an image.
       - After selecting an image, they click "Upload" to confirm their selection.
       - Upon successful upload, the interface transitions to the next screen.

### Screen 2: Details Submission (Step 2)

**Key Components**:
   1. **Image Preview**: A small preview of the uploaded image to remind the user of their selection.
   2. **Input Fields**:
     - **Name**: Text input for the item's name.
     - **Description**: A text area with a 200-word limit for describing the image or item.
     - **Type**: Drop-down or text input to specify the item type.
     - **Location**: A clickable button to fetch the current location using geolocation services.
   3. **Submit Button**: A button to finalize and upload the details along with the image.
   4. **Back Button**: Returns the user to Screen 1 without discarding the uploaded image.
   5. **User Interaction**:
     - The user fills in the required fields (name, description, type) and clicks the "Location" button to fetch their current location.
     - After providing all necessary details, they click the "Upload" button to submit everything.
     - Clicking "Back" returns to the image upload screen without losing the image.

### User Flow:

   1. **Opening the Popup**:
      - Triggered by clicking the "Picture Upload" button on the main page, which opens a modal for image selection.
   
   2. **Previewing the Image**:
      - After selecting an image, a preview is displayed to allow the user to confirm their choice before proceeding.
   
   3. **Uploading the Image**:
      - The "Upload" button initiates the image upload process.
      - Options for canceling or closing the popup to discard the process are also provided.

### Step 2 Flow:

   1. **Form Submission**:
      - The user fills in the required details (name, description, type, and location) after uploading the image and presses "Upload" to submit all information.
      - If the user wants to return to the image upload step, they can click "Back" without losing the image.
   2. **Form Validation**:
      - Ensure that all input fields are completed, and validate the word limit in the description field.
   3. **Location Handling**:
      - Fetch the current location via geolocation services or allow manual input in case of failure.

### Functionality Considerations:
   
   1. **Error Handling**:
      - **Image Upload**: Detect unsupported file formats and display relevant error messages.
      - **Network Failures**: Handle network issues with retry options and display error messages for file size limits or other upload errors.  
   2. **Image Validation**:
      - Check the image file size and format before allowing the user to proceed.   
   3. **UX Enhancements**:
      - Show a progress indicator during the image upload process.
      - Provide basic image editing options (e.g., crop or rotate) before confirming the upload.
   4. **Form Validation**:
      - Ensure all fields (name, type, location) are filled in properly and display warnings for any missing or incorrect data.  
   5. **Location Services**:
      - Handle geolocation permissions and provide a fallback for manual location entry in case location services are unavailable.

## Diagram 4
### Use case diagram
**Diagram - 4 Location details page** 
![image](https://github.com/WSU-cshimizu/ceg4110-group-project-team07/blob/main/assets/design_images/4_req.jpg)

### Flow chart diagram
![image](https://github.com/WSU-cshimizu/ceg4110-group-project-team07/blob/main/assets/design_images/4_flow.jpeg)

## Requirement
**Design Statement**
**Objective:**  
The goal of this design is to provide an interactive user interface that allows users to upload images, comment, like posts, and use Google Maps for navigation to the specified location associated with the post.


**Key Components:**

1. **Image Display:**
   - A large section in the center of the screen is designated for the display of an image, representing a location or event.
   - This will serve as the focal point for each post, where users can view uploaded pictures.

2. **Description Section:**
   - Located below the image, the **Description** area allows the user to add text, providing details about the location or context of the picture.

3. **Action Buttons:**
   - Positioned on the right side of the screen, there are several interactive buttons for different functionalities:
     - **Navigation**: This button opens **Google Maps** and navigates to the location associated with the displayed image, allowing users to find the real-world location.
     - **Upload Pic/Vid**: Enables users to upload pictures. Video upload functionality has been crossed out, indicating it may be unavailable in this version.
     - **Comment**: Allows users to comment on the post, providing feedback or questions.

4. **Like Button:**
   - A heart-shaped **Like** button is positioned in the top right corner, allowing users to show appreciation for the post by liking it.

**User Flow:**
1. Users can view the image and its description in the main display.
2. By selecting the **Navigation** button, users can use **Google Maps** to navigate to the location depicted in the image.
3. The **Upload Pic/Vid** button allows users to upload new images (video functionality is currently disabled).
4. Users can interact with the post by clicking the **Comment** button to leave feedback.
5. The **Like** button enables users to express their appreciation for the post.


**Functionality Considerations:**
- **Google Maps Integration**: The navigation button is integrated with Google Maps, allowing users to get directions to the location displayed in the post.
- **Media Upload**: The upload functionality supports pictures, with video functionality disabled for now.
- **Responsive Design**: The interface should be responsive across devices, including desktop and mobile views.

# Signatures

Gokulnaath Govindaraj
Jenessa Sparks
