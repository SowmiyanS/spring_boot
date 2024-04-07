package techno_kryon.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    //@Override
    public Employee createEmployee(Employee employee) {
        Employee employeeSaved = employeeRepository.save(employee);
        return employeeSaved;
    }

    public Optional<Employee> getEmployee(Integer employeeId) {
        //Employee employee = employeeRepository.getByEmployeeId(employeeId);
        return employeeRepository.findById(employeeId);
        //return employee;
    }

    public List<Employee> getEmployees() {
        Iterable<Employee> iterable = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();
        iterable.forEach(employees::add);
        return employees;
    }

    public Employee updateEmployee(Employee employee, Integer employeeId) {
        Employee employeeUpdated = employeeRepository.save(employee);
        return employeeUpdated;
    }

    public void deleteEmployee(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
