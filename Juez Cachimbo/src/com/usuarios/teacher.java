package com.usuarios;

import java.io.Serializable;
import java.util.Date;

public class Teacher extends User implements Serializable{
    private String career;

    public Teacher() {
        super();
        career="";
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    
    public Group createGroup(String id, String name, int numEstudiantes){
        Group group = new Group(id,name,numEstudiantes);
        return group;
    }    
}
