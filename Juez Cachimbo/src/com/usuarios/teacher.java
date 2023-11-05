package com.usuarios;

import java.util.Date;

public class teacher extends User{
    private String career;

    public teacher(String userName, String password, String firstName, String lastName, Date birthdate, String career) {
        super(userName, password, firstName, lastName, birthdate);
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    
    public Group createGroup(String id, String name){
        Group group = new Group(id,name);
        return group;
    }
    
    
}
