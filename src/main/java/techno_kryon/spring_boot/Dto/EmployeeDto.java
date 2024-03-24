package techno_kryon.spring_boot;


public class EmployeeDto {
    private String name;
    private String email;

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
}
