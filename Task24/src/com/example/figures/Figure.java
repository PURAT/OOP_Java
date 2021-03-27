package com.example.figures;

public abstract class Figure {
    private int x;
    private int y;

    public Figure(int x, int y) {
    }

    public abstract void hide();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveTo(int x, int y) {
    }

    public abstract void show();
}
