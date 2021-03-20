package com.example;

public class Printer extends Thread {
    private String name;
    private static Printer printer;

    private Printer() {
        name = Thread.currentThread().getName();
    }

    public synchronized void print10(int i) {
        System.out.print(name + ": ");
        for (int j = i; j <= i + 9; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static Printer getPrinter() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }
}
