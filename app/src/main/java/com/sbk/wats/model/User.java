package com.sbk.wats.model;

/**
 * Created by KimAx on 29/09/2017.
 */

public class User {
    private int id;
    private String phone;
    private String password;

    public User() {}

    public User(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
