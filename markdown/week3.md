# Week 3

1. How to make our application into WAR file using maven.
2. Use of properties file and Declare some custom values inside properties  file and use it in .java file.
3. Use Database configuration details in application.properties file and connect DB.
4. Undestanding SQL and Hands on SQL Queries.
5. In Your Local SQL DB, Create Tables and work on Queries. Save all the SQL Queries in sql-queries.txt file inside resource folder of your project and Commit.

## 1) How to make our application into WAR file using maven

- run the command `mvn clean install` in the root of the project.
- The WAR file will be generated inside the `target/` directory.

## 2) Use of properties file and Declare some custom values inside properties  file and use it in .java file.

- Created a mySting1 and myString2 custom property and get it in java file using two ways
    - @Value
    - @ConfigurationProperties

## 3) Use Database configuration details in application.properties file and connect DB.

- Created `applicaton-dev.property` file and populated 
    spring.datasource.url=jdbc:mysql://localhost:3306/db_example
    spring.datasource.username=root
    spring.datasource.password=root
    spring.datasource.Driver=com.mysql.cj.jdbc.Driver

## 4) Understand SQL and Hands on SQL Queries

- Created a new user in mysql `CREATE USER spring IDENTIFIED AS spring;`
- Show to databases owned by spring user `SHOW databases;`
- Select the database that we need `USE db_example;`
- List the tables in that database `SHOW tables;`

## 5) In Your Local SQL DB, Create Tables and work on Queries. Save all the SQL Queries in sql-queries.txt file inside resource folder of your project and Commit.

- 
