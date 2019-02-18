<b>Project Title</b>

Automation script of http://www.mapsynq.com site 

<b>Getting Started:</b>

<b>Prerequisites</b>
Before starting we need to install:
* Selenium WebDriver
* Eclipse
* Maven
* Testng
* webdrivermanager
* commons-io

<b>Installing</b>

After installing Eclipse, open it and create a Maven Project with name "MapSynq". Under <b>pom.xml</b> file, 
add all dependencies related with this project.

For eg.

<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.14.0</version>
</dependency>
  <!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>6.14.3</version>
    <scope>test</scope>
</dependency>

This project follow the POM structure. under src/main/java section I add all pages, where define all objects with their methods.
And under src/test/java, add all testmethods of these pages.

<b>Running the tests</b>

To run this project I use TestNG. I have added takenscreenshot method to take a screenshot of Failed testcases

