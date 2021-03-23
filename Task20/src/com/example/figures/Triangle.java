package com.example.figures;

/**
 * The type Triangle.
 */
public class Triangle extends StretchableFigure {

    /**
     * Instantiates a new Triangle.
     *
     * @param x      the x
     * @param y      the y
     * @param width  the width
     * @param height the height
     */
    public Triangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void show() {
        System.out.println("Треугольник показался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }

    @Override
    public void hide() {
        System.out.println("Треугольник спрятался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }
}
