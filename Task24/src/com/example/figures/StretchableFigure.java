package com.example.figures;

public abstract class StretchableFigure extends Figure {
    private int width;
    private int height;

    public StretchableFigure(int x, int y, int width, int height) {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
