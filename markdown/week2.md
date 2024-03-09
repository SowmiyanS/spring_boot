# Week 2 tasks

1. How to make our application into WAR file using maven.
2. Use of properties file.
3. Declare some custom values inside properties file and use it in .java file.
4. Download and install dbeaver, create a MySQL database and connect with spring boot application.

## 1) How to make our application into WAR file using maven.

- Our project can be converted into WAR file.
- Run `mvn clean install`.

## 2) Use of properties file.

- This project uses the `applications.properties` file for many purposes.
1. To change the default port number of the tomcat server. `server.port=5000`
2. To create our own custom properties. `myStringProperty="This is my string from application.properties file!."`

## 3) Declare some custom values in application.properties file and use it in java file.

- The field is retrieved from application.properties file to printed to the console.

## 4) Download and install dbeaver, create a Mysql database and connect with spring boot application.

- For this application to test locally we need a database server to be running locally.
- DBeaver Community is a free, multi-platform database tool for developers.
- To download DBeaver visit : [https://dbeaver.io/download/](https://dbeaver.io/download/)

### References:

- `Application Properties` : [spring boot - application properties](https://www.geeksforgeeks.org/spring-boot-application-properties/) 
- `Custom properties` : [javatechonline](https://javatechonline.com/spring-boot-application-properties/)
- `Spring Common Application Properties` : [docs.spring.io](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#appendix.application-properties.testing)
