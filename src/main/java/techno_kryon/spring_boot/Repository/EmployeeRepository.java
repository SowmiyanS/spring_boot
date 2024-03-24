package techno_kryon.spring_boot;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    //public Employee getByEmployeeById(Integer employeeId);
}
