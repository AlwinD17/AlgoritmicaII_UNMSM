package com.usuarios;

import java.io.Serializable;
import java.util.ArrayList;


public class Student extends User implements Serializable{
    private String groupId;
    public ArrayList<String> readTexts;
    public int numReadTexts;
    private int correctQuestions;
    private int incorrectQuestions;

    public Student() {
        super();
        groupId = null;
        readTexts = new ArrayList<>();
        numReadTexts = 0;
        correctQuestions = 0;
        incorrectQuestions = 0;
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
    
    
}
