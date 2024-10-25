package models;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> elements = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element e : elements) {
            e.print();
        }
    }
}
