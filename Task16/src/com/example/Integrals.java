package com.example;

public final class Integrals {
    private static final int N = 10000;

    public static double integralFor(double a, double b, double c, double x1, double x2) {
        double sum = 0;
        double h = (x2-x1) / N;

        for (int i = 0; i < N; i++) {
            sum = sum + funParabolic(a, b, c, a+i*h);
        }

        return sum * h;
    }

    public static double integralWhile(double a, double b, double c, double x1, double x2) {
        double sum = 0;
        double h = (x2-x1) / N;
        int i = 0;

        while (i < N) {
            sum = sum + funParabolic(a, b, c, a+i*h);
            i++;
        }

        return sum * h;
    }

    public static double integralDoWhile(double a, double b, double c, double x1, double x2) {
        double sum = 0;
        double h = (x2-x1) / N;
        int i = 0;

        do {
            sum = sum + funParabolic(a, b, c, a+i*h);
            i++;
        } while (i < N);

        return sum * h;
    }

    private static double funParabolic(double a, double b, double c, double x) {
        return a*x*x + b*x + c;
    }
}
