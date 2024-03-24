package techno_kryon.spring_boot;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Component
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    @Column(name = "name")
    private String employeeName;

    @Column(name = "email")
    private String employeeEmail;

    @Column(name = "password")
    private String employeePassword;

    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;

    // Default Constructor
    public Employee() {}
    // Parameterized Constructor [dependency injection]
    public Employee(String employeeName, String employeeEmail, String employeePassword, Department department) {
        super();
        //this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeePassword = employeePassword;
        this.department = department;
    }

    // Getters and Setters

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
