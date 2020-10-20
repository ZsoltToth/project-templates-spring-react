# Software Requirement Specification

## 1. Introduction

### 1.1 Purpose
     * The purpose of this document is to present a detailed description of the „Wellness Badges” project. 
     * It will explain the purpose and features of the system, what the system will do, and the constraints under which it must operate and how the system will react to external actions. 
     * This document is intended for both the stakeholders and the developers of the system.
### 1.2 Scope
     * This SRS applies to the entire project. „Wellness Badges” is an application where the wellness hotel’s guests can buy services easily without cash. 
     * It will be realized as a Web-Application. 
     * The overview of the features and subsystems are documented in the Use-Case model shown in Overall Description.
### 1.3 Definitions, Acronyms and Abbreviations
     * SRS: Software Requirements Specification
### 1.4 References
     * Github
     * [Use Case Diagram](https://github.com/momszx/project-templates-spring-react/blob/8b080c3ccbd09974b81b592df3b0843466b4ede2/docs_directory/Use%20case%20diagram.png)
### 1.5 Overview
     * The following of this document gives overview over the functionality of the product and provides a more detailed description of the requirements.
___
## 2. Overall Description

### 2.1. Description
     Our idea is to develop a customer interface with a website for a wellness hotel. The guests can buy services easily cashless.
     The guests get a watch which identifies them, also multiple customers can belong to one bill (for example: parents and their children).
     When the guests leave, they give back the watches that will be assign to new guests.
     With the watches guest can easily pay with only touching the terminal(similar to PayPass).
     If it is needed we could give a detailed invoice to the guests. Not all services will be available for certain guests. (For example: underage kids are not supposed to buy alcohol with their watches/underage kids are not supposed to enter the sauna)
     In order to use the application the guest give their personal information. Personal data: name, address, credit card details.
     If  two or more guests want to pay with one credit card,then they only give the data about the card they want to pay with.
     So the watch identifies the customer but multiple customers can belong to a bill.
### 2.2.   Constraints
     * Access to the web/system is required. 
### 2.3.   Assumptions and Dependencies
     * It is assumed that the watches and readers are already installed, and they communicate with the system via Internet.
     * Since the application is a web based application there is a need for the internet browser. 
     * It will be assumed that the watches will possess decent internet connectivity.
     * It is also assumed,that the receptionist can use the platform correctly.
___
## 3. Specific Requirements

### 3.1 Functionality
  #### 3.1.1 Check-in
      * The guest give their personal information, then they receive the watch. They can pay with it for services.
      * [Use Case Diagram](https://github.com/momszx/project-templates-spring-react/blob/8b080c3ccbd09974b81b592df3b0843466b4ede2/docs_directory/Use%20case%20diagram.png)
  #### 3.1.2 Cashless Pay and Restrictions
     * They can pay with the watches for services. Underage children are not allowed to buy alcoholic drinks and aren't allowed to use sauna.
     *  In these cases the watches will give error messages and  notifies the bartender,that the customer is under 18.
     * The watches and readers communicate with the system via Internet.
  #### 3.1.3 Check-Out
     * The guests give back the watches, then the watches will be assign to new guests. 
     * Also, the guests can receive a detailed invoice, if  they need it.

 ### 3.2 Usability
   #### 3.2.1 Language
      * The language of the Webapp/system will be english, so it will be easily understandable for everyone.
   #### 3.2.2 Connection
      * Usable only when the watch are connected to the server via Internet.

 ### 3.3 Reliability
   #### 3.3.1 Availability
     * The application should be available around 95% of the time. Availability beneath 95% is acceptable during development. 
   #### 3.3.2 Mean Time Between Failures
     * Should be as high as possible. No estimation possible at this point.
   #### 3.3.3 Mean Time To Repair
     * Should be as low as possible. No estimation possible at this point.

 ### 3.4 Performance
   #### 3.4.1 Response time
     * Paying with the watches have negligible short response time.
     * Registration of a guest can have larger response times with about 2 or 3 seconds on average.
   #### 3.4.2 Capacity
      * The system must be operational even if all the watches are in use.

 ### 3.5 Supportability
   #### 3.5.1 Conventions
     * The code in the backend and in the frontend should follow the standard conventions for Spring Boot or Angular.
     * Both should be using speaking variable and function names.

 ### 3.6 Design Constraints
   #### 3.6.1 Git
     * Git is used for version control. You can find our repos on GitHub.
   #### 3.6.2 Web 
     * For developing we will  be using Webstorm (Node, npm).
   #### 3.6.3 Programming environment
     * IntelliJ IDEA (Java)
 
 ### 3.7 Purchased Components
     * n/a

 ###3.8 Interfaces
   #### 3.8.1 User Interfaces
     * The guests could not see the interface of the server. Functionality is described in Functionality.
   #### 3.8.2 Hardware Interfaces
     * Watches,readers
   #### 3.8.3 Software Interfaces 
     * Web application, online interfaces
 ####Datebase Plan
    Guest
        * Name
        * Identity Number
        * Date of Birth
        * Address
        * Arrival Date
        * Departure Date
        * Services
        * Admin / Employee
 