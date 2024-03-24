package techno_kryon.spring_boot;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    public Department createDepartment(Department department);

    public Optional<Department> getDepartment(Integer departmentId);

    public List<Department> getDepartments();

    // save operation
    //Department saveDepartment(Department department);

    //// read operation
    //List<Department> fetchDepartmentList();

    //// update operation
    //Department updateDepartment(Department department, Integer departmentId);

    //// delete operation
    //void deleteDepartmentById(Integer departmentId);
}
