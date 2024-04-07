package techno_kryon.spring_boot;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    
    // Create
    public Employee createEmployee(Employee employee);

    // Read
    public Optional<Employee> getEmployee(Integer employeeId);

    public List<Employee> getEmployees();

    // Update
    public Employee updateEmployee(Employee employee, Integer employeeId);

    // Delete
    public void deleteEmployee(Integer employeeId);
}
