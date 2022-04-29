# :oncoming_taxi: Taxi-Service :oncoming_taxi:
### Project description:
```
A simple web-application that supports authentication, registration and other CRUD operations.
```
## Features:
- registration like a driver;
- authentication like a driver;
- create/update/remove a manufacturer;
- create/update/remove a car;
- create/update/remove a driver;
- display list of all manufacturers;
- display list of all cars;
- display list of all drivers;
- display list of all cars by current driver;
- add driver to car.
## Project structure (3-layer architecture):
- DAO - Data access layer
- Service - Application logic layer
- Controllers - Presentation layer
## Used technologies and libraries:
- Java 11
- Git
- Apache Maven
- Apache Tomcat
- Apache Log4j 2
- MySQL
- JDBC
- Javax Servlet
- JSP
- JSTL
- HTML/CSS
- Checkstyle plugin
- Project Lombok
## Steps to run the program on your computer:
- Clone the repo: [https://github.com/sviat-h/taxi-service.git](https://github.com/sviat-h/taxi-service.git);
- Install MySQL;
- Configure Apache Tomcat version (**IMPORTANT**): 9.0.xx;
- Copy and run SQL script [/src/main/resources/init_db.sql](/src/main/resources/init_db.sql) to creating a schema and tables for the project;
- Configure [/src/main/java/taxi/util/ConnectionUtil.java](/src/main/java/taxi/util/ConnectionUtil.java) with your URL, USERNAME, PASSWORD, JDBC_DRIVER;
- Configure [/src/main/resources/log4j2.xml](/src/main/resources/log4j2.xml) at line 7 with your ABSOLUTE_PATH to this project;
- Done. Now just try to use it.:tada:
