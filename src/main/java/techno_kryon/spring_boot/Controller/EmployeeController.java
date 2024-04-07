package techno_kryon.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/{employeeId}")
    public Optional<Employee> getEmployee(@PathVariable Integer employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @GetMapping("/all")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PutMapping("/{employeeId}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Integer employeeId) {
        return employeeService.updateEmployee(employee, employeeId);
    }

    @DeleteMapping("/{employeeId}")
    public void deleteEmployee(@PathVariable Integer employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}
