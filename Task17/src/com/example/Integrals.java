package com.example;

public final class Integrals {
    private static final int N = 10;

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


    public static double integralLeftReal(double x1, double x2, Fnc fnc) {
        double sum = 0;
        double h = (x2-x1) / N;

        for (double x = x1; x < x2; x = x + h) {
            sum = sum + fnc.f(x);
        }

        return sum * h;
    }

    public static double integralMiddleReal(double x1, double x2, Fnc fnc) {
        double sum = 0;
        double h = (x2-x1) / N;

        for (double x = x1 + h/2; x < x2; x = x + h) {
            sum = sum + fnc.f(x);
        }

        return sum * h;
    }
}
