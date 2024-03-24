package techno_kryon.spring_boot;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class DepartmentServiceImplementation implements DepartmentService {
    
    @Autowired
    DepartmentRepository departmentRepository;

    //@Override
    public Department createDepartment(Department department) {
        Department departmentSaved = departmentRepository.save(department);
        return departmentSaved;
    }

    //@Override
    public Optional<Department> getDepartment(Integer departmentId) {
        //Department department = departmentRepository.getByDepartmentId(departmentId);
        return departmentRepository.findById(departmentId);
        //return department;
    }

    //@Override
    public List<Department> getDepartments() {
        Iterable<Department> iterable = departmentRepository.findAll();
        List<Department> departments = new ArrayList<>();
        iterable.forEach(departments::add);
        return departments;
    }
}
