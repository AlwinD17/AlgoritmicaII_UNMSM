package com.ejercicios;

import java.util.ArrayList;


public class AvailableTexts {
    private ArrayList<Text> texts;

    public AvailableTexts() {
        texts = new ArrayList<>();
    }

    public void agregarTexto(Text text) {
        texts.add(text);
    }

    public ArrayList<Text> getTexts() {
        return texts;
    }

    public void setTexts(ArrayList<Text> texts) {
        this.texts = texts;
    }
    
    public void deleteText(String textId){
        for(Text text : texts){
            if(text.getId().equals(textId)){
                texts.remove(text);
                break;
            }
        }
    }
}
