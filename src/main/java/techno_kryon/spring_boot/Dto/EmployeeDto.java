package techno_kryon.spring_boot;


public class EmployeeDto {
    private String name;
    private String email;
    private Integer age;
    private Long phone;
    private Integer departmentId;

    // No args constructor
    public EmployeeDto() {
        super();
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return this.Age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPhone() {
        return this.phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Integer getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
