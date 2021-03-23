package com.example.figures;

/**
 * The type Ellipse.
 */
public class Ellipse extends StretchableFigure {

    /**
     * Instantiates a new Ellipse.
     *
     * @param x      the x
     * @param y      the y
     * @param width  the width
     * @param height the height
     */
    public Ellipse(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void show() {
        System.out.println("Эллипс показался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }

    @Override
    public void hide() {
        System.out.println("Эллипс спрятался с координатами: " + getX() + "," + getY() + " и размерами:" + getWidth() + "," + getHeight());
    }
}
