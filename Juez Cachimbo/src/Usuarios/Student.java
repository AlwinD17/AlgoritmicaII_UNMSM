package Usuarios;

import Ejercicios.AvailableTexts;
import java.util.ArrayList;
import java.util.Date;

public class Student extends User {
    private String groupId;
    private ArrayList<AvailableTexts> availableTexts;
    private int readTexts;
    private int correctQuestions;
    private int incorrectQuestions;

    public Student(String userName, String password, String firstName, String lastName, Date birthdate, String groupId) {
        super(userName, password, firstName, lastName, birthdate);
        this.groupId = groupId;
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
