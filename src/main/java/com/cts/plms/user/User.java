package com.cts.plms.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String pwd;
    private String active;
    private String usergroup;

    public User() {
    }

    public User(Integer id, String username, String pwd, String active, String usergroup) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
        this.active = active;
        this.usergroup = usergroup;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(String usergroup) {
        this.usergroup = usergroup;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", active='" + active + '\'' +
                ", userGroup='" + usergroup + '\'' +
                '}';
    }
}
