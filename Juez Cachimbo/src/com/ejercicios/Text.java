package com.ejercicios;

import java.util.ArrayList;


public class Text {
    private String content;
    private String id;
    private ArrayList<Question> questions;

    public Text(String content, ArrayList<Question> questions, String id) {
        this.content = content;
        this.id = id;
        questions = new ArrayList<>();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    
}
