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
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.List;

import java.sql.Timestamp;
import java.time.Instant;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @PostMapping
    public Employee createEmployee(@RequestBody EmployeeCreateDto employeeCreateDto) {

        String name = employeeCreateDto.getName();
        String email = employeeCreateDto.getEmail();
        Integer age = employeeCreateDto.getAge();
        Long phone = employeeCreateDto.getPhone();
        String password = employeeCreateDto.getPassword();
        Integer departmentId = employeeCreateDto.getDepartmentId();

        Timestamp timestamp = Timestamp.from(Instant.now());

        String CreatedOn = timestamp+"";
        String CreatedBy = "API user";

        Employee employee = new Employee(name, email, age, phone, createdOn, createdBy, null, null, password, departmentId);

        return employeeService.createEmployee(employee);
    }

    @GetMapping("/{employeeId}")
    public Optional<Employee> getEmployee(@PathVariable Integer employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @GetMapping("/all")
    public List<Employee> getEmployees(@RequestParam(value = "count") Integer count) {
        if(!count) {
            return employeeService.getEmployees();
        }
        return employeeService.getEmployees(count);
    }

    @PutMapping("/{employeeId}")
    public Employee updateEmployee(@RequestBody EmployeeUpdateDto employeeUpdateDto, @PathVariable Integer employeeId) {
        
        Integer id = employeeUpdateDto.getId();
        String name = employeeUpdateDto.getName();
        String email = employeeUpdateDto.getEmail();
        Integer age = employeeUpdateDto.getAge();
        Long phone = employeeUpdateDto.getPhone();
        String password = employeeUpdateDto.getPassword();
        Integer departmentId = employeeUpdateDto.getDepartmentId();

        Timestamp timestamp = Timestamp.from(Instant.now());

        String modifiedOn = timestamp+"";
        String modifiedBy = "API user";
        
        Employee previousEmployee = employeeService.getEmployee(id).orElseThrow(() -> new RuntimeException("Employee Trying to Update does not exits!"));

        String createdOn = previousEmployee.getEmployeeCreatedOn();
        String createdBy = previousEmployee.getEmployeeCreatedBy();
        
        Employee employee = new Employee(name, email, age, phone, createdOn, createdBy, modifiedOn, modifiedBy, password, departmentId);


        return employeeService.updateEmployee(employee, employeeId);
    }

    @DeleteMapping("/{employeeId}")
    public void deleteEmployee(@PathVariable Integer employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}
