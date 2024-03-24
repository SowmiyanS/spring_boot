package techno_kryon.spring_boot;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Component
@Entity
@Table(name = "Department")
public class Department {
    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer departmentId;

    @Column(name = "name")
    private String departmentName;

    @Column(name = "location")
    private String location;

    public Department() {}

    public Department(String departmentName, String location) {
        super();
        //this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.location = location;
    }

    // Getters and Setters
    
    public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


}
