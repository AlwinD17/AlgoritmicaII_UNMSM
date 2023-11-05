package com.usuarios;

import java.util.Date;

public class User {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private Date birthdate;

    public User(String userName, String password, String firstName, String lastName, Date birthdate) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
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
