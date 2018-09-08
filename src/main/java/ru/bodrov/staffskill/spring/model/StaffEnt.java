package ru.bodrov.staffskill.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "tbl_staff")
public class StaffEnt extends AbstractEntity {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "date_add_staff", nullable = false)
    private Date dateAddStaff;

    @ManyToOne
    private DepartmentEnt department;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateAddStaff() {
        return dateAddStaff;
    }

    public void setDateAddStaff(Date dateAddStaff) {
        this.dateAddStaff = dateAddStaff;
    }

    public DepartmentEnt getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentEnt department) {
        this.department = department;
    }
}
