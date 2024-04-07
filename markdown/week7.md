# Week 7
1. Create Employee Table from entity class.
2. Write Below API's 

## 1. Create Employee Table from entity class.
- created employee table using the entity class.
- `employee` table consists of these fields.
    - employee Id
    - employee name
    - employee email
    - employee age
    - employee phone

## 2. Write Api's
- created api for `employee` entity
    - create - `localhost:8080/api/employee/` with employee in the response `body`.
    - read - `localhost:8080/api/v1/employee/all` gives all the available employees.
    - read - `localhost:8080/api/v1/employee/{id}` gives the employee with the matching ID.

# Create
-       `http://localhost:8080/api/v1/employee/`
![create in postman](https://drive.google.com/file/d/116vUET_BQg05-5I38V3-wOIjS1o7i89r/view?usp=sharing image of postman displaying POST operation)

# Read
-       `http://localhost:8080/api/v1/employee/{id}`
- read by Id:
![read in postman](https://drive.google.com/file/d/15spNqFb1FUdwk7tUJxLipebzkpspHPZA/view?usp=sharing image of postman displaying GET operation)
-       `http://localhost:8080/api/v1/employee/all`
- read all:
![read in postman](https://drive.google.com/file/d/1vdW2NiEAAiy6vfGQVqlCZUdyoqqniFl5/view?usp=sharing image of postman displaying GET operation)

# Update
-       `http://localhost:8080/api/v1/employee/{id}`
![update in postman](https://drive.google.com/file/d/1wjxIdjwZMeSewuGbHcbyu0M8-7pUgd6J/view?usp=sharing image of postman displaying PUT operation)

# Delete
-       `http://localhost:8080/api/v1/employee/{id}`
![delete in postman](https://drive.google.com/file/d/1aqSdEjuNMBvnYbF4LR2lr2v5toOUOarj/view?usp=sharing image of postman displaying DELETE operation)

## References:
- [javatpoint CRUD operations](https://www.javatpoint.com/spring-boot-crud-operations)
