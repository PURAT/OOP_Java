package com.example;

public class Main {

    public static void main(String[] args) {
        int[] array = {0, 1, 5, 10, 20, 50, 100};
        System.out.println("Тип:   n   n!");
        for (int value : array) {
            System.out.printf("%-5s %-3d " + MathUtil.factorial(value) + "\n", "double", value);
            System.out.printf("%-6s %-3d " + MathUtil.factorial_long(value) + "\n", "long", value);
            System.out.printf("%-6s %-3d " + MathUtil.factorial_int(value)+ "\n\n", "int", value);
        }
    }
}
