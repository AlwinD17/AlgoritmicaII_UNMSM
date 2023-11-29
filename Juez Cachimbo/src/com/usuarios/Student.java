package com.usuarios;

import com.ejercicios.AvailableTexts;
import java.io.Serializable;
import java.util.ArrayList;


public class Student extends User implements Serializable{
    private String groupId;
    private ArrayList<AvailableTexts> availableTexts;
    private int readTexts;
    private int correctQuestions;
    private int incorrectQuestions;

    public Student() {
        super();
        groupId = null;
        availableTexts = new ArrayList<>();
        readTexts = 0;
        correctQuestions = 0;
        incorrectQuestions = 0;
    }
    


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ArrayList<AvailableTexts> getAvailableTexts() {
        return availableTexts;
    }

    public void setAvailableTexts(ArrayList<AvailableTexts> availableTexts) {
        this.availableTexts = availableTexts;
    }

    public int getReadTexts() {
        return readTexts;
    }

    public void setReadTexts(int readTexts) {
        this.readTexts = readTexts;
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
