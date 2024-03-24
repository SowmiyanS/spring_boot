SHOW DATABASES;

USE db_example;

SHOW TABLES;

CREATE TABLE employee (
    name TEXT,
    email TEXt,
    password TEXT,
    employee_id PRIMARY KEY AUTO INCREMENT INT,
    department_id FOREIGN KEY
);

CREATE TABLE department (
    name TEXT,
    location TEXT,
    department_id PRIMARY KEY AUTO INCREMENT INT
);

INSERT INTO department VALUES("Java", "Chennai");
INSERT INTO employee VALUES ("SowmiyanS", "sowmiyan9491@gmail.com", "verystrongpassword1", 1);

INSERT INTO department VALUES("React", "Chennai");
INSERT INTO employee VALUES ("JayaSurys", "jayasurya@gmail.com", "verystrongpassword");

DELETE FROM employee WHERE email = "sowmiyan9491@gmail.com";
