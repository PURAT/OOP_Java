package com.example;

public class MathUtil {
    public static double factorial(int n) {
        double result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }

    public static long factorial_long(int n) {
        long result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }

    public static int factorial_int(int n) {
        int result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }
}
