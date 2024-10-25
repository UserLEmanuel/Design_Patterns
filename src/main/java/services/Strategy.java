package services;

import models.Paragraph;

public interface Strategy {
    public default void render(Paragraph paragraph, int width){}
}
