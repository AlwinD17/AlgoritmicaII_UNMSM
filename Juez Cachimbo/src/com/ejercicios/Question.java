package com.ejercicios;

import java.io.Serializable;
import java.util.ArrayList;


public class Question implements Serializable {
    private String content;
    private ArrayList<String> alternatives;
    private String rightAlternative;
    private String reasoning;
    private boolean answered;

    public Question() {
        this.content = null;
        this.alternatives = new ArrayList<>();
        this.rightAlternative = null;
        this.answered = false;
        this.reasoning = null;
    }

    public String getReasoning() {
        return reasoning;
    }

    public void setReasoning(String reasoning) {
        this.reasoning = reasoning;
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
