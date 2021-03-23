package com.example.figures;

/**
 * The type Stretchable figure.
 */
public abstract class StretchableFigure extends Figure {
    private int width;
    private int height;

    /**
     * Instantiates a new Stretchable figure.
     *
     * @param x      the x
     * @param y      the y
     * @param width  the width
     * @param height the height
     */
    public StretchableFigure(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(int height) {
        this.height = height;
    }
}
