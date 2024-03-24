# Week 4
 
1. Create employee and employee address tables from spring  application using entity class. And connect those two tables using forign key.
2. How to declare a column and object name in a entity class.
3. Load data to employee table from spring application.
4. Understanding of Controller, service, entity, dto classes.
5. Continue the SQL queries and try working on primary key, foreign key, unique, not null.

## 1. Create employee and employee address tables from spring  application using entity class. And connect those two tables using foreign key.
- We have the Employee entity class to create a employee table.
- And to store the address we use Department entity class.

## 2. How to declare a column and object name in a entity class.
- First create a class for the table called entity class. [The entity class uses `@Entity` annotation]
- Then create private members for that class like:
    - employeeId
    - employeeName
    - employeeEmail
- Then It must have the getters and setters for each private member variables
- Finally add the `@Id` annotation at top of all member variables defenition
- We can add more annotation to get more features like `@GeneratedValue` annotation makes the field `AutoIncrement` value in sql table
- There is `@Column` and `@JoinColumn` annotations.

## 3. Load data to employee table from spring application.
- Loaded values for spring application and viewed in mysql.


    2024-03-24T12:23:09.944+05:30  INFO 5329 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
    2024-03-24T12:23:09.983+05:30  INFO 5329 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
    2024-03-24T12:23:10.749+05:30  INFO 5329 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@314b7945
    2024-03-24T12:23:10.751+05:30  INFO 5329 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
    2024-03-24T12:23:12.191+05:30  INFO 5329 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
    2024-03-24T12:23:20.242+05:30  INFO 5329 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
    2024-03-24T12:23:21.163+05:30  WARN 5329 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
    2024-03-24T12:23:21.812+05:30  INFO 5329 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
    2024-03-24T12:23:21.831+05:30  INFO 5329 --- [           main] techno_kryon.spring_boot.Application     : Started Application in 15.369 seconds (process running for 16.003)

            This is my commandline runner!


            WELCOME TO SPRING BOOT APPLICATION

    {
            username: "root",
            password: "root",
            db: "db_example"
    }

            Successfully Connected to Database!

    Inserting value into database!

    Successfully saved values!

- Used mysql Cli to view inserted values:
    mysql> select * from employee;
    +------------+-------------+------------------------+-----------+
    | department | employee_id | email                  | name      |
    +------------+-------------+------------------------+-----------+
    |          1 |           1 | sowmiyan9491@gmail.com | SowmiyanS |
    |          2 |           2 | jayasurya@gmail.com    | JayaSurya |
    +------------+-------------+------------------------+-----------+
    2 rows in set (0.00 sec)
    mysql> select * from department;
    +---------------+----------+-------+
    | department_id | location | name  |
    +---------------+----------+-------+
    |             1 | Chennai  | Java  |
    |             2 | Chennai  | React |
    +---------------+----------+-------+
    2 rows in set (0.01 sec)

## 4. Understanding of Controller, service, entity, dto classes
- Alreaded had Controllers now created Service, Entity and dto Directories.

    Controller/
    Dto/
    Entity/
    Repository/
    Service/

- There is service directory that has all the services and the dto directory contains all the useful dto's.

## 5. Continue the SQL queries and try working on primary key, foreign key, unique, not null.
- Created `queries.sql` file inside resources directory.
- Lists some commands used to create this database.


### References:
- [Remove files in git without deleting local copy of that file](https://www.baeldung.com/ops/git-remove-file-without-deleting-it)
- [ManyToOne and JoinColumn](https://www.geeksforgeeks.org/when-to-use-joincolumn-annotation-in-hibernate/)
- [CrudRepository](https://www.geeksforgeeks.org/spring-boot-crudrepository-with-example/?ref=lbp)
- [PostConstruct](https://tutoai.com/java-article/mastering-the-correct-usage-of-postconstruct-in-spring-boot)
- [GeneratedValue Annotation](https://www.javaguides.net/2023/07/jpa-id-and-generatedvalue-annotations.html)
- [Jakarta Generation Type](https://jakarta.ee/specifications/persistence/3.1/apidocs/jakarta.persistence/jakarta/persistence/generationtype)
- [Jakarta Generated Value](https://jakarta.ee/specifications/persistence/3.1/apidocs/jakarta.persistence/jakarta/persistence/generatedvalue)
- [Use a field as primary key and autoincrement](https://thorben-janssen.com/hibernate-tips-use-auto-incremented-column-primary-key/#question)
- [Dto Example geeksforgeeks](https://www.geeksforgeeks.org/spring-boot-map-entity-to-dto-using-modelmapper/)
- [how to convert iterabe to list](https://frontbackend.com/java/how-to-convert-iterable-to-collection-in-java)
