# Test automation project - google.com automation
The project demonstrates how to automate two simple tests web tests using Maven, Java, TestNG, and Selenium. This project uses the Page Object Model (POM) design pattern to make the code more maintainable and readable.
## Project Structure
The project has the following structure:
* src/main/ directory contains the production code, including the pages package
* src/test/ directory contains all of the test classes and resources.
* src/test/../resources/ directory contains any resources used by the tests.
* pom.xml file contains the project configuration and dependencies: 
* * selenium v4.8.2
* * testNG v7.4.0
* * webdrivermanager v5.1.1
* README.md file contains the project documentation.
## Requirements
  The following software is required to run this project:

* Java 8 or later (to run tests using the command line: set the JAVA_HOME environment variable to the location of the JDK installation directory.
Add the bin directory of the JDK installation to the PATH)
* Maven 3.6.0 or later (to run tests using the command line: Set the MAVEN_HOME environment variable to the location of the Maven installation directory.
Add the bin directory of the Maven installation to the PATH environment variable.)

## How to Run the Tests
1. Clone the repository to your local machine.
2. a Run the tests using command line:
* Open a terminal window and navigate to the project directory.
Run the following command to run all of the tests:
`mvn clean test`
This will compile the code and run all of the tests.

* Alternatively, you can run individual test classes by specifying the class name:
* * `mvn -Dtest=GoogleAuthenticationTest test`
* * `mvn -Dtest=GoogleSearchTest test`

2. b. Run the tests locally using testng.xml file. Currently, the XML file specifies two TestNG tests, one for the GoogleSearchTest class and one for the GoogleAuthenticationTest class.

## Notes
* The project uses WebDriverManager to automatically download and manage the WebDriver binaries, so there's no need to download them manually.
* The BasePage and BaseTest classes provide a basic framework for writing tests using Selenium WebDriver, so you can extend them and use them as a starting point for your own projects.
* Edit config.properties file in src/test/../resources/ directory to add valid gmail account for tests
