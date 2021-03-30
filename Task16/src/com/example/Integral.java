package com.example;

public final class Integral {

    public static double integralFor(double x1, double x2, int n, Fnc fnc) {
        double sum = 0;
        double h = (x2-x1) / n;
        for (int i = 0; i < n; i++) {
            sum = sum + fnc.f(x1+i*h);
        }
        return sum * h;
    }

    public static double integralWhile(double x1, double x2, int n, Fnc fnc) {
        double sum = 0;
        double h = (x2-x1) / n;
        int i = 0;
        while (i < n) {
            sum = sum + fnc.f(x1+i*h);
            i++;
        }
        return sum * h;
    }

    public static double integralDoWhile(double x1, double x2, int n, Fnc fnc) {
        double sum = 0;
        double h = (x2-x1) / n;
        int i = 0;
        do {
            sum = sum + fnc.f(x1+i*h);
            i++;
        } while (i < n);
        return sum * h;
    }
}
