package com.example.figures;

/**
 * The type Figure.
 */
public abstract class Figure {
    private int x;
    private int y;

    /**
     * Instantiates a new Figure.
     *
     * @param x the x
     * @param y the y
     */
    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Show figure.
     */
    public abstract void show();

    /**
     * Hide figure.
     */
    public abstract void hide();

    /**
     * Move figure to (x, y) position.
     *
     * @param x the x
     * @param y the y
     */
    public void moveTo(int x, int y) {
        hide();
        this.x = x;
        this.y = y;
        show();
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * Sets x.
     *
     * @param x the x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * Sets y.
     *
     * @param y the y
     */
    public void setY(int y) {
        this.y = y;
    }
}
