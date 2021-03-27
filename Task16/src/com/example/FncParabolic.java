package com.example;

public class FncParabolic extends Fnc {
    private double a;
    private double b;
    private double c;

    public FncParabolic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double f(double x) {
        return a * x * x + b * x + c;
    }
}
