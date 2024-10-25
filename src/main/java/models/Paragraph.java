package models;

import services.Strategy;

public class Paragraph implements Element, Strategy {
    private String text;
    private Strategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText(){
            return text;
    }
    public void setStrategy(Strategy strategy) {
        this.textAlignment = strategy;
    }

    public void render(int width) {
        if (textAlignment != null) {
            textAlignment.render(this, width);
        } else {
            System.out.println(text);
        }
    }
    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }
}
