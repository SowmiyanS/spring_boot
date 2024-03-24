package techno_kryon.spring_boot;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
    //public Department getByDepartmentById(Integer departmentId);
}
