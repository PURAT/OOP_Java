package com.example;

public final class Integrals {
    private static final int N = 10000;

    public static double integralFor(double x1, double x2, Fnc fnc) {
        double sum = 0;
        double h = (x2-x1) / N;

        for (int i = 0; i < N; i++) {
            sum = sum + fnc.f(x1+i*h);
        }

        return sum * h;
    }

    public static double integralWhile(double x1, double x2, Fnc fnc) {
        double sum = 0;
        double h = (x2-x1) / N;
        int i = 0;

        while (i < N) {
            sum = sum + fnc.f(x1+i*h);
            i++;
        }

        return sum * h;
    }

    public static double integralDoWhile(double x1, double x2, Fnc fnc) {
        double sum = 0;
        double h = (x2-x1) / N;
        int i = 0;

        do {
            sum = sum + fnc.f(x1+i*h);
            i++;
        } while (i < N);

        return sum * h;
    }
}
