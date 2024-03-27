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
- There are a lot of errors TODO write other error above
- The next error is for some reason I cannot load the input file path for the data.xlsx file by any methods below.
    - Using the relative paths "/src/main/resources/data/xlsx", I tried all the permutations of paths avialable! but still the exception occurs and says "No Such File Or Directory"
    - Trying to use ResourceUtils, this is the methods showed in the reference [setting data.xlsx using ResourceUtils]. In that If I plugged the path directly "classpath:data.xlsx" to ResourceUtils It Works. But If I tried to get this string from application property it fails and gives same exception
    - All of this means that spring lifecycle destroyed the file paths when it tries to load the @Value Annotations.
- The reference [setting data.xlsx using ResourceUtils] has the answer but there also other references that helped me.
    - [official spring docs on ResourceUtils](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/util/ResourceUtils.html)
- But this still does not solves the fact that we need to hardcode the path of excel file in the serivce file itself.

## 3. Practice SQL queries and save the file inside resource folder.
- Created `queries.sql` file in resources directory.
- Queries can be saved there.

## 4. Understanding dto classes. Create some dto classes inside dto folder.
- Created Dto directory and created some dto's
- The main purpose of dto is easy to pass data from one service layer to other.
- And also we can omit unwanted fields and have only necessary fields.

## 5. presentations choose your own topic on technical or non technical. presentations must be 8-10 slides. prepare the ppt with formal slides.
- Created a presentation on chernobyl neuclear reactor meltdown.




### References:
- [how to use apache poi to read excel files](https://www.geeksforgeeks.org/reading-writing-data-excel-file-using-apache-poi/)
- [stackoverflow recommended tutorial to read excel](https://www.codejava.net/coding/how-to-read-excel-files-in-java-using-apache-poi)
- [apache docs on XSSF](https://poi.apache.org/apidocs/dev/org/apache/poi/xssf/usermodel/XSSFWorkbook.html)
- [setting data.xlsx using ResourceUtils](https://stackoverflow.com/questions/44399422/read-file-from-resources-folder-in-spring-boot)
