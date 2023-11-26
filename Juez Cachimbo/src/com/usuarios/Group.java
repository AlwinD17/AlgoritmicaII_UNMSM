package com.usuarios;

import java.util.ArrayList;


public class Group {
    private String id;
    private String name;
    private int numestudiantes;
   
    
    public Group(String id, String name, int numestudiantes) {
        this.id = id;
        this.name = name;
        this.numestudiantes= numestudiantes;
        students = new ArrayList<>();
    }
    
    public int getNumestudiantes() {
        return numestudiantes;
    }

    public void setNumestudiantes(int numestudiantes) {
        this.numestudiantes = numestudiantes;
    }
    private ArrayList<Student> students;



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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    
    public void addStudent(Student student){
        students.add(student);
    }
}
