package com.example.figures;

/**
 * The type Scalable figure.
 */
public abstract class ScalableFigure extends Figure {
    private int size;

    /**
     * Instantiates a new Scalable figure.
     *
     * @param x    the x
     * @param y    the y
     * @param size the size
     */
    public ScalableFigure(int x, int y, int size) {
        super(x, y);
        this. size = size;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(int size) {
        this.size = size;
    }
}
