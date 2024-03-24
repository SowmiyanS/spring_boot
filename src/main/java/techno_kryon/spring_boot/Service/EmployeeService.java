package techno_kryon.spring_boot;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    
    public Employee createEmployee(Employee employee);

    public Optional<Employee> getEmployee(Integer employeeId);

    public List<Employee> getEmployees();

    // save operation
    //Employee saveEmployee(Employee employee);

    //// read operation
    //List<Employee> fetchEmployeeList();

    //// update operation
    //Employee updateEmployee(Employee employee, Integer employeeId);

    //// delete operation
    //void deleteEmployeeById(Integer employeeId);
}
