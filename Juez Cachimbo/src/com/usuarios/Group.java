package com.usuarios;

import java.io.Serializable;
import java.util.ArrayList;


public class Group implements Serializable{
    private String id;
    private String name;
    private int numestudiantes;
    private ArrayList<Student> students;

    
    public Group() {
        
    }
    
    public int getNumestudiantes() {
        return numestudiantes;
    }

    public void setNumestudiantes(int numestudiantes) {
        this.numestudiantes = numestudiantes;
    }

    public ArrayList<Student> getEstudiantes() {
        return students;
    }

    public void setEstudiantes(ArrayList<Student> estudiantes) {
        this.students = estudiantes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public void addStudent(Student student){
        students.add(student);
    }
}
