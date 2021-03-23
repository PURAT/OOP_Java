package com.example.figures;

/**
 * The type Dot.
 */
public class Dot extends Figure {

    /**
     * Instantiates a new Dot.
     *
     * @param x the x
     * @param y the y
     */
    public Dot(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("Точка показалась с координатами: " + getX() + "," + getY());
    }

    @Override
    public void hide() {
        System.out.println("Точка спряталась с координатами: " + getX() + "," + getY());
    }
}
