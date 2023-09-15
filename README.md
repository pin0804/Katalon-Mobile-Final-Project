# Katalon Mobile Testing Final Project

## Objective
This project serves as the final assignment for the bootcamp's self-directed project. The primary goal is to demonstrate proficiency in mobile testing using Katalon Studio. The application under test is the "Bank APP Demo," which can be found in the APK folder.

## Automated Tasks
The tasks being automated in this project include:

1. Register Success
2. New Login Success
3. Add deposit (without an account)
4. Add an account for new registration
5. Add an account
6. Verify Account
7. TC Import Jira

## Environment
- MAC OS 13.5 (22G74) (Macbook Pro 13-inch, 2020 1,4 GHz Quad-Core Intel Core i5)
- Emulator: Android Studio's Google Pixel 3 API 24 (Android 7.0 Google Play | x86)

## Challenges
There were some challenges encountered during the project:

1. On my emulator, the application consistently terminates when attempting CRUD operations. For example, when trying to add an account, clicking the "Add" button causes the application to terminate. To address this, I added a delay step and pressed the "Back" button twice.
   
   <img width="343" alt="Screenshot 2023-09-15 at 18 33 29" src="https://github.com/pin0804/Katalon-Mobile-Final-Project/assets/87196069/732bc345-fc02-4bda-a230-c5470d489bbf">

3. Occasionally, after clicking "Add Data," the data is not added to the application. This issue has been sporadic and difficult to reproduce consistently.

**These problems have resulted in test flakiness.**

## Usage
To use this project, follow these steps:

1. Clone the repository to your local machine.
2. Import the project into Katalon Studio.
3. Ensure that you have the necessary APK files in the APK folder.
4. Set up your emulator or physical device for testing.
5. Configure your test cases and test suites as needed.
6. Execute the tests using Katalon Studio.

Feel free to adapt and customize the project to your own mobile testing requirements.
