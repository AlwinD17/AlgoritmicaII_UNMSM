package com.usuarios;

import java.util.Date;

public class User {
    private String userName;
    private String password;
    private String name;
    private String birthdate;

    public User() {
        userName="";
        password="";
        name="";
        birthdate="";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
    /*    public boolean signUp(){
    return true;
    }
    
    public boolean login(){
    return true;
    }
    
    public boolean logout(){
    return true;
    }*/
}
