package ru.bodrov.staffskill.spring.entity;

import ru.bodrov.staffskill.spring.model.TestStaffEnt;

import java.util.Date;

public class StatisticalTest {

    private TestStaffEnt testStaff;
    private int amountStaff;
    private int amountStaffSuccess;
    private int avgBall;
    private int minBall;
    private int maxBall;
    private Date lastTest;

    public StatisticalTest(TestStaffEnt testStaff){
        this.testStaff = testStaff;
    }

    public TestStaffEnt getTestStaff() {
        return testStaff;
    }

    public void setTestStaff(TestStaffEnt testStaff) {
        this.testStaff = testStaff;
    }

    public int getAmountStaff() {
        return amountStaff;
    }

    public void setAmountStaff(int amountStaff) {
        this.amountStaff = amountStaff;
    }

    public int getAmountStaffSuccess() {
        return amountStaffSuccess;
    }

    public void setAmountStaffSuccess(int amountStaffSuccess) {
        this.amountStaffSuccess = amountStaffSuccess;
    }

    public int getAvgBall() {
        return avgBall;
    }

    public void setAvgBall(int avgBall) {
        this.avgBall = avgBall;
    }

    public int getMinBall() {
        return minBall;
    }

    public void setMinBall(int minBall) {
        this.minBall = minBall;
    }

    public int getMaxBall() {
        return maxBall;
    }

    public void setMaxBall(int maxBall) {
        this.maxBall = maxBall;
    }

    public Date getLastTest() {
        return lastTest;
    }

    public void setLastTest(Date lastTest) {
        this.lastTest = lastTest;
    }
}
