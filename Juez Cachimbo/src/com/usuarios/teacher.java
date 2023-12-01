package com.usuarios;

import java.io.Serializable;

public class teacher extends User implements Serializable{
    private String career;

    public teacher() {
        super();
        career=null;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    
    public Group createGroup(String id, String name, int numEstudiantes){
        Group group = new Group();
        group.setId(id);
        group.setId(name);
        group.setNumestudiantes(numEstudiantes);
        return group;
    }    
}
