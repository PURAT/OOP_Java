package com.example;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println("Площадь равна: " + rectangle.calcRectArea());

        rectangle.setWidth(-20);
        System.out.println("Площадь равна: " + rectangle.calcRectArea());
    }
}
