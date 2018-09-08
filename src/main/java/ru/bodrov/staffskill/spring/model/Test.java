package ru.bodrov.staffskill.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

//@Entity
public class Test extends AbstractEntity {

    @Column
    private String staff;

    public String getStaff(){return staff;}

    public void setStaff(String staff){this.staff=staff;}

}
