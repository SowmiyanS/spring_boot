package techno_kryon.spring_boot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class DBInsertService {
    
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    //@PostConstruct
    //public void InitialDBValue() {
    //    Department department = departmentRepository.save(new Department("React", "Chennai"));
    //    employeeRepository.save(new Employee("JayaSurya", "jayasurya@gmail.com", "verystrongpassword", department));
    //}

}
