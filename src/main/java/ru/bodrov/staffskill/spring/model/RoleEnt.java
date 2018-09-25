package ru.bodrov.staffskill.spring.model;

import ru.bodrov.staffskill.spring.enums.RoleType;

import javax.persistence.*;

@Entity
@Table(name = "tbl_role")
public class RoleEnt extends AbstractEntity {

    @ManyToOne
    private UserEnt userEnt;

    @Column
    @Enumerated(EnumType.STRING)
    private RoleType roleType = RoleType.USER;

    public RoleEnt(UserEnt user,  RoleType roleType){
        this.userEnt = user;
        this.roleType = roleType;
    }

    @Override
    public String toString(){return roleType.name();}

    public UserEnt getUserEnt() {
        return userEnt;
    }

    public void setUserEnt(UserEnt userEnt) {
        this.userEnt = userEnt;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}
