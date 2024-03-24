package techno_kryon.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/employee")
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
}
