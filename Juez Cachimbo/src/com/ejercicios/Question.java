package com.ejercicios;

import java.util.ArrayList;


public class Question {
     private String content;
    private ArrayList<String> alternatives;
    private String rightAlternative;
    private boolean answered;

    public Question(String content, ArrayList<String> alternatives, String rightAlternative) {
        this.content = content;
        alternatives = new ArrayList<>();
        this.rightAlternative = rightAlternative;
        answered = false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<String> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(ArrayList<String> alternatives) {
        this.alternatives = alternatives;
    }

    public String getRightAlternative() {
        return rightAlternative;
    }

    public void setRightAlternative(String rightAlternative) {
        this.rightAlternative = rightAlternative;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }
    
}
