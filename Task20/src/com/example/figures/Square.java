package com.example.figures;

/**
 * The type Square.
 */
public class Square extends ScalableFigure {

    /**
     * Instantiates a new Square.
     *
     * @param x    the x
     * @param y    the y
     * @param side the side
     */
    public Square(int x, int y, int side) {
        super(x, y, side);
    }

    @Override
    public void show() {
        System.out.println("Квадрат показался с координатами: " + getX() + "," + getY() + " и размером:" + getSize());
    }

    @Override
    public void hide() {
        System.out.println("Квадрат спрятался с координатами: " + getX() + "," + getY() + " и размером:" + getSize());
    }
}
