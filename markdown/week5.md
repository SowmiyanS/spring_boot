# Week 5
1. database connection should be moved to seperate config file.
2. Keep a CSV/ xlsx file inside resources and load data from Excel using @PostConstruct method.
3. Practice SQL queries and save the file inside resource folder.
4. Understanding dto classes. Create some dto classes inside dto folder.
5. presentations choose your own topic on technical or non technical. presentations must be 8-10 slides. prepare the ppt with formal slides.

## 1. database connection should be moved to seperate config file.
- Created application-prod.properties file to set database configuration values

## 2. Keep a CSV/ xlsx file inside resources and load data from Excel using @PostConstruct method.
- Need CSV parsing library to parse the input file
- We can set the path to input file using application.properties file.
- Then load the values and store it in database.

## 3. Practice SQL queries and save the file inside resource folder.
- Created `queries.sql` file in resources directory.
- Queries can be saved there.

## 4. Understanding dto classes. Create some dto classes inside dto folder.
- Created Dto directory and created some dto's
- The main purpose of dto is easy to pass data from one service layer to other.
- And also we can omit unwanted fields and have only necessary fields.

## 5. presentations choose your own topic on technical or non technical. presentations must be 8-10 slides. prepare the ppt with formal slides.
- Created a presentation on chernobyl neuclear reactor meltdown.
