package ru.bodrov.staffskill.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dict_test")
public class DictTestEnt extends AbstractEntity {

    @Column(name = "type_name", unique = true, nullable = false)
    private String nameType;

    public String getNameType(){
        return  nameType;
    }

    public void setNameType(String nameType){
        this.nameType = nameType;
    }
}
