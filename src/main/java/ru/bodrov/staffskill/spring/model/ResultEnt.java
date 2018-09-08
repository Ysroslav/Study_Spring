package ru.bodrov.staffskill.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "tbl_result")
public class ResultEnt extends AbstractEntity{

    @ManyToOne
    private StaffEnt staff;

    @ManyToOne
    private TestStaffEnt test;

    @Column(name = "ball_result", nullable = false)
    private int ballResult;

    @Column(name = "time_result", nullable = false)
    private int timeResult;

    @Column(name = "date_test", nullable = false)
    private Date dateTest;

    @Column(name = "result_text", nullable = false)
    private String result;

    public StaffEnt getStaff() {
        return staff;
    }

    public void setStaff(StaffEnt staff) {
        this.staff = staff;
    }

    public TestStaffEnt getTest() {
        return test;
    }

    public void setTest(TestStaffEnt test) {
        this.test = test;
    }

    public int getBallResult() {
        return ballResult;
    }

    public void setBallResult(int ballResult) {
        this.ballResult = ballResult;
    }

    public int getTimeResult() {
        return timeResult;
    }

    public void setTimeResult(int timeResult) {
        this.timeResult = timeResult;
    }

    public Date getDateTest() {
        return dateTest;
    }

    public void setDateTest(Date dateTest) {
        this.dateTest = dateTest;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
