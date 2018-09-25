package ru.bodrov.staffskill.spring.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_user")
public class UserEnt extends AbstractEntity {

    @Column(name = "login", unique = true, nullable = false)
    private String login;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name="password")
    private String password;

    @Column
    private Boolean disabled;

    @OneToMany(mappedBy = "userEnt", cascade = CascadeType.ALL)
    private List<RoleEnt> roleEnts = new ArrayList<>();

    public UserEnt(String login, String email){
        this.login = login;
        this.email = email;
    }

    public UserEnt(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public List<RoleEnt> getRoleEnts() {
        return roleEnts;
    }

    public void setRoleEnts(List<RoleEnt> roleEnts) {
        this.roleEnts = roleEnts;
    }
}
