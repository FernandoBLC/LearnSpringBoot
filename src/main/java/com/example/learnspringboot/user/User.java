package com.example.learnspringboot.user;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private Date dob;

    public User(int id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob(){
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return String.format("Use [id=%d, name=%s, ]", id, name );
    }
}
