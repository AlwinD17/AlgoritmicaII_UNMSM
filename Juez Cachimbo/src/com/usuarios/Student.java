package com.usuarios;

import java.io.Serializable;
import java.util.ArrayList;


public class Student extends User implements Serializable{
    public String groupId;
    public ArrayList<String> readTexts;
    public int numReadTexts;
    public int correctQuestions;
    public int incorrectQuestions;

    public Student() {

    }
    


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ArrayList<String> getReadTexts() {
        return readTexts;
    }

    public void setReadTexts(ArrayList<String> readTexts) {
        this.readTexts = readTexts;
    }

    public int getNumReadTexts() {
        return numReadTexts;
    }

    public void setNumReadTexts(int numReadTexts) {
        this.numReadTexts = numReadTexts;
    }

    public int getCorrectQuestions() {
        return correctQuestions;
    }

    public void setCorrectQuestions(int correctQuestions) {
        this.correctQuestions = correctQuestions;
    }

    public int getIncorrectQuestions() {
        return incorrectQuestions;
    }

    public void setIncorrectQuestions(int incorrectQuestions) {
        this.incorrectQuestions = incorrectQuestions;
    }
    public String imprimir() {
        return "Student{" +
                "userName=" + userName + "/" +
                ", password=" + password + "/" +
                ", name=" + name + "/" +
                ", birthdate=" + birthdate + "/" +
                ", groupId='" + groupId + "/" +
                ", readTexts=" + readTexts +
                ", numReadTexts=" + numReadTexts +
                ", correctQuestions=" + correctQuestions +
                ", incorrectQuestions=" + incorrectQuestions +
                '}';
    }
    
}
