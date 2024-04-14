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

    @Column(name = "age")
    private Integer employeeAge;

    @Column(name = "phone")
    private Long employeePhone;

    @Column(name = "created on", nullable = false)
    private String employeeCreatedOn;

    @Column(name = "created by", nullable = false)
    private String employeeCreatedBy;

    @Column(name = "modified on")
    private String employeeModifiedOn;

    @Column(name = "modified by")
    private String employeeModifiedBy;

    @Column(name = "password")
    private String employeePassword;

    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;

    // Default Constructor
    public Employee() {}
    // Parameterized Constructor [dependency injection]
    public Employee(String employeeName, String employeeEmail, Integer employeeAge, Long employeePhone, String employeeCreatedOn, String employeeCreatedBy, String employeeModifiedOn, String employeeModifiedBy, String employeePassword, Department department) {
        super();
        //this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeAge = employeeAge;
        this.employeePhone = employeePhone;
        this.employeeCreatedOn = employeeCreatedOn;
        this.employeeCreatedBy = employeeCreatedBy;
        this.employeeModifiedOn = employeeModifiedOn;
        this.employeeModifiedBy = employeeModifiedBy;
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

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(Long employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeCreatedOn() {
        return this.employeeCreatedOn;
    }

    public void setEmployeeCreatedOn(String employeeCreatedOn) {
        this.employeeCreatedOn = employeeCreatedOn;
    }

    public String getEmployeeCreatedBy() {
        return this.employeeCreatedBy;
    }

    public void setEmployeeCreatedBy(String employeeCreatedBy) {
        this.employeeCreatedBy = employeeCreatedBy;
    }

    public String getEmployeeModifiedOn() {
        return this.employeeModifiedOn;
    }

    public void setEmployeeModifiedOn(String employeeModifiedOn) {
        this.employeeModifiedOn = employeeModifiedOn;
    }

    public String getEmployeeModifiedBy() {
        return this.employeeModifiedBy;
    }

    public void setEmployeeModifiedBy(String employeeModifiedBy) {
        this.employeeModifiedBy = employeeModifiedBy;
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
