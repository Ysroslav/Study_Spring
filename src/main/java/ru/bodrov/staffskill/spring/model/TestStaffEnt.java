package ru.bodrov.staffskill.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "tbl_test")
public class TestStaffEnt extends AbstractEntity {

    @Column(name = "test_name", unique = true, nullable = false)
    private String testName;

    @Column(name = "date_test", nullable = false)
    private Date dateCreateTest;

    @Column(name = "min_value_ball", nullable = false)
    private int minValueBall;

    @Column(name = "time_test", nullable = false)
    private int timeTest;

    @ManyToOne
    private DictTestEnt type;

    public String getTestName(){
        return testName;
    }

    public Date getDateCreateTest(){
        return dateCreateTest;
    }

    public int getMinValueBall(){
        return minValueBall;
    }

    public int getTimeTest(){
        return timeTest;
    }

    public DictTestEnt getType(){
        return type;
    }

    public void setTestName(String testName){
        this.testName = testName;
    }

    public void setDateCreateTest(Date dateCreateTest){
        this.dateCreateTest = dateCreateTest;
    }

    public void setMinValueBall(int minValueBall){
        this.minValueBall = minValueBall;
    }

    public void setTimeTest(int timeTest){
        this.timeTest = timeTest;
    }

    public void setType(DictTestEnt type){
        this.type = type;
    }
}
