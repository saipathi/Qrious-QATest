# Qrious-QATest - Read Me file

### Pre-Requisites
- Chrome browser (ver 98.0.4758.82 )
- Java JDK
- Java JRE
- Eclipse IDE

This project is done using Selenium automation tool and Java language. To execute the test cases, please follow the below steps.

### Basic Instuctions
- Import Project from Git Hub to Eclipse IDE
- Test_Automation_Proj should appear under Package Explorer tab in Eclipes IDE
- Configure project to run in local system
  - Right click on the project and select Build Path -> Configure Build Path
  - Select "selenium-server-standalone-2.53.1.jar" file and click Remove button
  - Download "selenium-server-standalone-2.53.1.jar" file from "Previous Releases" section found in https://www.selenium.dev/downloads/
  - Back to Eclipse Configure Build Path window select "Modulepath" and click on "Add External JARs" button
  - Select the newly downloaded "selenium-server-standalone-2.53.1.jar" file from its folder
  - Make sure its JRE System Library 1.8.0 version. If not then select the existing JRE file and click Edit button
  - In the JRE System Library window, select "Alternate JRE:" and select "jre1.8.0_151" from the dropdown list.Click Finish
  - Click on "Apply and Close" button
- Execute the test cases
- End    
    
### Detailed Instuctions
- Import Project from Git Hub to Eclipse IDE
  - Open Eclipss IDE
  - Click on File -> Import 
  - Open Git folder in the list and select "Projects from Git (with smart import)" and click Next button
  - Select Clone URI and click Next button
  - Copy paste GIT URI (https://github.com/saipathi/Qrious-QATest.git) in the URI field and other fields (Host, Repository path and Protocol) will auto populated. Click Next button
  - Branch "main" should be checked. Click Next button
  - Choose a local directory by clicking the browse button, and leave other field values as they are already populated. Click Next button.
  - Click Finish
  - Test_Automation_Proj should appear under Package Explorer tab in Eclipes IDE
 - Configure project to run in local system
   - Right click on the project and select Build Path -> Configure Build Path
   - Select "selenium-server-standalone-2.53.1.jar" file and click Remove button
   - Download "selenium-server-standalone-2.53.1.jar" file from "Previous Releases" section found in https://www.selenium.dev/downloads/
   - Back to Eclipse Configure Build Path window select "Modulepath" and click on "Add External JARs" button
   - Select the newly downloaded "selenium-server-standalone-2.53.1.jar" file from its folder
   - Make sure its JRE System Library 1.8.0 version. If not then select the existing JRE file and click Edit button
   - In the JRE System Library window, select "Alternate JRE:" and select "jre1.8.0_151" from the dropdown list.Click Finish
   - Click on "Apply and Close" button
   - In the JRE System Library window, select "Alternate JRE:" and select "jre1.8.0_151" from the dropdown list.Click Finish
   - Click on "Apply and Close" button
- Executing the test cases
  - Under the Package Explorer tab, select "Test_Automation_Proj" and expand the project until "Test_Script.java" file is reached.
  - Right click on the "Test_Script.java" file andd select Run As -> 1 Java Application
  - New Chrome browser will open and test cases will get executed. You can find the test results in the Console window in Eclipse IDE.
- End     




