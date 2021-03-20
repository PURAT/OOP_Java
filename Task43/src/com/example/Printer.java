package com.example;

public class Printer implements Runnable {
    private int i;

    @Override
    public void run() {
        for (i = 1; i <= 100; i += 10) {
            print10();
        }
    }

    public void print10() {
        System.out.print(Thread.currentThread().getName() + ": ");
        for (int j = i; j <= i + 9; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

//     метод для доп. задания
//    private void print10() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(Thread.currentThread().getName()).append(": ");
//        for (int j = i; j <= i + 9; j++) {
//            stringBuilder.append(j).append(" ");
//        }
//        System.out.println(stringBuilder);
//    }
}
