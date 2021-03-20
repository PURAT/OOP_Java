package com.example;

public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double calcRectArea() {
        if (width < 0 || height < 0)
            throw new RectangleArgumentException("Ошибка: введены отрицательные высота или ширина.");
        return width * height;
    }
}
