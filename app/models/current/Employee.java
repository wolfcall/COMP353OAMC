package models.current;

import play.db.ebean.Model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Employee")
public class Employee extends Model {
    @Id
    @Column(name = "Employee_ID")
    @GeneratedValue
    public Integer employeeId;

    @Column(name = "Last_Name")
    public String lastName;

    @Column(name = "First_Name")
    public String firstName;

    @Column(name = "Salary_Type")
    public String salaryType;

    @Column(name = "Specialization")
    public String specialization;

    @Column(name = "Hire_Date")
    public Date hireDate;

    @Column(name = "Years_Experience")
    public Integer yearsExperience;

    @Column(name = "user_name")
    public String username;

    @Column(name = "password")
    public String password;

    //TODO: check the foreign keys for "unit" and "employeeType"
    @ManyToOne
    @JoinColumn(name = "unit_id")
    public Unit unit;

    @ManyToOne
    @JoinColumn(name = "employee_type_id")
    public EmployeeType employeeType;
}