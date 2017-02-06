# Requirements Document

## Table of Contents
- [5.1 Introduction](#51-introduction)
- [5.2 Functional Requirements](#52-functional-requirements)
- [5.3 Performance Requirements](#53-performance-requirements)
- [5.4 Environmental Requirements](#54-environmental-requirements)

## 5.1 Introduction
This requirements specification is for MarkIt, a selling and trading application for Web access. Users will be able to sell used items to specific college communities as well as purchase these items from sellers in the application. Each user will have a profile containing basic personal information, payment preferences, a list of items the user is selling, a list of items the user has shown interest in purchasing, and a list of tags the user is interested in purchasing. Users will search for purchasable items by location, with the option of filtering by tags. A list of these items will be shown to the user. When a user finds an item they would like to purchase, they will communicate with the seller in the application using a chat system.  The remainder of this document is structured as follows: section 5.3 contains the functional requirements, section 5.4 contains the performance requirements, and section 5.5 contains the environment requirements.

![UML Diagram](./images/AppViewFlow.png)

## 5.2 Functional Requirements
The database shall be recreated using a more appropriate database model. The database shall be rehosted by a new service. The app should have a functioning profile page that properly pulls data from the database. The app should have a functioning hub page that properly pulls and displays dynamic data.

**5.2.1 General requirements**<br/>
5.2.1.1 The app should have a profile page where ratings, watch lists, and tags can be viewed.<br/>
5.2.1.2 The app shall be rehosted using a new service such as Heroku.<br/>
5.2.1.3 The app shall no longer use Firebase, and shall use a relational database model, such as SQL.<br/>
5.2.1.4 The app should have a hub page that dynamically loads data for the user.

**5.2.2 Profile Requirements**<br/>
5.2.2.1 The user should be able to view another user’s profile.<br/>
5.2.2.2 The user should be able to see what another user is currently selling.<br/>
5.2.2.3 The user should be able to see what another user has sold in the past.<br/>
5.2.2.4 The user shall be able to see another user’s rating.<br/>
5.2.2.5 The user should be able to report another user.

**5.2.3 Profile Requirements**<br/>
5.2.3.1 The user should have a dynamic and tailored hub page that properly pulls user data from the database.

## 5.3 Performance Requirements
5.3.1 The sales postings features shall load a picture, price, and general description of the item within 3 seconds from the time of the request.<br/>
5.3.2 The email address provided shall notify the user if it is valid (i.e., it ends with .edu) within 1 second of typing a character.<br/>
5.3.3 The sign-up page shall reject an email address that does not end with .edu within 3 seconds of typing the email.<br/>
5.3.4 The login page shall allow a user to use the app within 5 seconds of pressing the login button.<br/>
5.3.5 Items in the listing shall be tagged by common keywords or by user's choice.<br/>
5.3.6 The user shall display the main home (“hub”) page of the academic institution of their choosing within 5 seconds of logging in.<br/>
5.3.8 Search results shall load within 5 seconds.<br/>
5.3.9 Refreshing sales postings shall take no more than 3 seconds<br/>
5.3.10 Switching between the main tab bar items shall take no more than 1 second.<br/>
5.3.11 The application shall be capable of supporting at least 20,000 users.<br/>
5.3.12 The application shall require no more than 15% of CPU utilization.<br/>
5.3.13 The database shall be able to handle at least 1,000 read transactions per hour.<br/>

## 5.4 Environmental Requirements
**5.4.1 Development Environment Requirements**<br/>
5.4.1.3 The database storage and retrieval shall require using Heroku and SQL.<br/>

**5.4.2 Execution Environment Requirements**<br/>
5.4.2.1 Hardware Requirements<br/>
The application shall not require any special computing hardware to operate.<br/>

5.4.2.2 Software Requirements<br/>
Modern web browsers such as Google Chrome 53.0 and up, Firefox 50.0 and Safari 9.1.
