package com.example.figures;

/**
 * The type Rectangle.
 */
public class Rectangle extends StretchableFigure {

    /**
     * Instantiates a new Rectangle.
     *
     * @param x1     the x 1
     * @param y1     the y 1
     * @param width  the width
     * @param height the height
     */
    public Rectangle(int x1, int y1, int width, int height) {
        super(x1, y1, width, height);
    }

    @Override
    public void show() {
        System.out.println("Прямоугольник показался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }

    @Override
    public void hide() {
        System.out.println("Прямоугольник спрятался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }
}