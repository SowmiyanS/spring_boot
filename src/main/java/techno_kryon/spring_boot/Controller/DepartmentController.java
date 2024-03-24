package techno_kryon.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/{departmentId}")
    public Optional<Department> getDepartment(@PathVariable Integer departmentId) {
        return departmentService.getDepartment(departmentId);
    }

    @GetMapping("/all")
    public List<Department> getDepartments() {
        return departmentService.getDepartments();
    }
}
