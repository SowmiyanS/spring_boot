package techno_kryon.spring_boot;

public class DepartmentDto {
    private String name;
    private String location;

    // No args Constructor
    public DepartmentDto() {
        super();
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
