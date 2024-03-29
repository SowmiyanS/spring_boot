SHOW DATABASES;     -- Shows the available databases

USE db_example;     -- Change the active database, using "db_example" database

SHOW TABLES;        -- Lists available tables or entities in the currently active database

-- DDL commands
-- create
-- drop
-- alter
-- truncate
-- comment
-- rename

CREATE TABLE employee (     -- Used to create a new table with the column names and their datatypes
    name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(50),
    employee_id PRIMARY KEY AUTO INCREMENT INT,
    department_id FOREIGN KEY
);

CREATE TABLE department (
    name TEXT,
    location TEXT,
    department_id PRIMARY KEY AUTO INCREMENT INT
);

DROP TABLE employee;        -- will delete the entire employee table schema, including all the records stored in that table!

ALTER TABLE employee 
ADD salary INT;

ALTER TABLE employee 
DROP COLUMN salary;

ALTER TABLE employee 
ALTER COLUMN salary BIGINT;


-- DML commands
-- insert
-- update 
-- delete

INSERT INTO department 
VALUES (
    "Java",
    "Chennai"
);

INSERT INTO employee 
VALUES (
    "SowmiyanS",
    "sowmiyan9491@gmail.com",
    "verystrongpassword1",
    1
);

INSERT INTO department 
VALUES (
    "React",
    "Chennai"
);

INSERT INTO employee
VALUES (
    "JayaSurys",
    "jayasurya@gmail.com",
    "verystrongpassword",
    1
);

UPDATE TABLE employee 
SET ( 
    name = "Sowmiyan",
    email = "sowmiyan9491@gmail.com",
    password = "verystrongpassword1",
    department_id = 1
)
WHERE name = "SowmiyanS";

DELETE FROM employee WHERE email = "sowmiyan9491@gmail.com";

-- DQL commands

SELECT * FROM employee;     -- Gets all the fields from the employee table

-- Aggregate functions

SELECT COUNT(*) AS number_of_employees FROM employee;

SELECT SUM(salary) AS total_salary FROM employee;

SELECT AVG(salary) AS average_salary FROM employee;

SELECT MAX(salary) AS maximum_salary FROM employee;

SELECT MIN(salary) AS minimum_salary FROM employee;

-- distinct and orderby clause

SELECT DISTINCT name, salary FROM employee
WHERE salary > 15,000
ORDER BY salary ASC;

SELECT DISTINCT name, salary FROM employee 
WHERE salary > 15,000 
ORDER BY salary DESC;

-- And and Like clause

SELECT name, salary FROM employee
WHERE salary < 20,000 AND name LIKE 's%';

-- Or and Not clause

SELECT name, salary, department_id FROM employee
WHERE ( name LIKE 's%' OR name LIKE 'j%' ) AND ( department_id = 1 );

-- In and Between

SELECT name FROM employee
WHERE salary BETWEEN 15,000 AND 20,000;

SELECT name, department_id FROM employee
WHERE department_id IN (1, 2, 3);

-- Joins

SELECT * FROM employee e
INNER JOIN department d
ON e.department_id = d.department_id;

-- There are also left and right join
-- left join selects all the matching records + the non matching records in the left table
-- right join selects all the matching records + the non matching records in the right table

SELECT * FROM employee e
RIGHT JOIN department d
ON e.department_id = d.department_id;

-- mysql> select * from employee right join department on employee.department_id = department.department_id;
-- +---------------+-------------+------------------------+------------+---------------------+---------------+----------+--------+
-- | department_id | employee_id | email                  | name       | password            | department_id | location | name   |
-- +---------------+-------------+------------------------+------------+---------------------+---------------+----------+--------+
-- |             1 |           5 | gokul@gmail.com        | Gokul N    | drowssap            |             1 | Chennai  | Java   |
-- |             1 |           4 | jayasurya@gmail.com    | Jayasurya  | verystrongpassword2 |             1 | Chennai  | Java   |
-- |             1 |           3 | aswin@gmail.com        | Aswin S    | password            |             1 | Chennai  | Java   |
-- |             1 |           2 | sowmiyan9491@gmail.com | Sowmiyan S | verystrongpassword1 |             1 | Chennai  | Java   |
-- |             1 |           1 | admin@email.com        | Admin      | admin               |             1 | Chennai  | Java   |
-- |          NULL |        NULL | NULL                   | NULL       | NULL                |             2 | Chennai  | React  |
-- |          NULL |        NULL | NULL                   | NULL       | NULL                |             3 | Chennai  | Python |
-- +---------------+-------------+------------------------+------------+---------------------+---------------+----------+--------+
-- 7 rows in set (0.05 sec)

SELECT * FROM employee e
LEFT JOIN department d
ON e.department_id = d.department_id;

-- DCL commnds
-- grant
-- revoke

GRANT SELECT, UPDATE ON employee
TO root, sowmiyan, spring;

REVOKE SELECT, UPDATE, DELETE ON employee
TO sowmiyan, spring;

-- TCL commands
-- commit
-- rollback

COMMIT;

ROLLBACK;
