# Design Specification

## Diagram 1
### Use-case Diagram
![image](https://github.com/WSU-cshimizu/ceg4110-group-project-team07/blob/main/assets/design_images/1_login.jpg)
### Flow chart diagram
![image]()
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
###Flow chart Diagram
![image]()

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
   - Although the "Time" element is passive, it can later be enhanced to allow sorting or filtering by time. For now, it's a static display element that may help users contextualize posts.

5. **Responsiveness:**
   - The interface should be designed to work across different screen sizes (mobile, tablet, desktop). The central placement of the navigation elements ensures ease of access on smaller screens.

6. **User Profile:**
   - Even though the user icon is present, it might not be interactive in this version of the design. Future iterations could allow users to access their profile, settings, or personal data.


# Signatures

Gokulnaath Govindaraj
