package com.example;

public class DemoThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 10) {
            Printer.getPrinter().print10(i);
        }
    }
}
