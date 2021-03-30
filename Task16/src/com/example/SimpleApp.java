package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SimpleApp extends JFrame {

    private JButton buttonCalculate;
    private ButtonGroup buttonGroup1;
    private JTextField fieldA;
    private JTextField fieldB;
    private JTextField fieldC;
    private JTextField fieldX1;
    private JTextField fieldX2;
    private JLabel labelResult;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JRadioButton rbDoWhile;
    private JRadioButton rbFor;
    private JRadioButton rbWhile;

    public SimpleApp() {
        initComponents();
    }
    
    private void initComponents() {
        buttonGroup1 = new ButtonGroup();
        rbFor = new JRadioButton();
        rbWhile = new JRadioButton();
        rbDoWhile = new JRadioButton();
        buttonCalculate = new JButton();
        labelResult = new JLabel();
        fieldA = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        fieldB = new JTextField();
        jLabel4 = new JLabel();
        fieldC = new JTextField();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        fieldX1 = new JTextField();
        fieldX2 = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(rbFor);
        rbFor.setText("Использовать цикл for");

        buttonGroup1.add(rbWhile);
        rbWhile.setText("Использовать цикл while");

        buttonGroup1.add(rbDoWhile);
        rbDoWhile.setText("Использовать цикл do...while");

        buttonCalculate.setText("Вычислить интеграл");
        buttonCalculate.addActionListener(event -> buttonCalculateActionPerformed(event));

        labelResult.setText("Результат: ");

        jLabel2.setText("а=");

        jLabel3.setText("b=");

        jLabel4.setText("c=");

        jLabel5.setText("x1=");

        jLabel6.setText("x2=");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fieldA, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(buttonCalculate)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(fieldC)
                                                                .addComponent(fieldB)))))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fieldX1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelResult)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fieldX2)))
                                .addContainerGap(39, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rbDoWhile)
                                        .addComponent(rbWhile)
                                        .addComponent(rbFor))
                                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(rbFor)
                                .addGap(18, 18, 18)
                                .addComponent(rbWhile)
                                .addGap(18, 18, 18)
                                .addComponent(rbDoWhile)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(fieldA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5)
                                        .addComponent(fieldX1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(fieldB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(fieldX2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(fieldC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonCalculate, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelResult))
                                .addGap(21, 21, 21))
        );

        pack();
    }

    private void buttonCalculateActionPerformed(ActionEvent event) {
        double a = Double.parseDouble(fieldA.getText());
        double b = Double.parseDouble(fieldB.getText());
        double c = Double.parseDouble(fieldC.getText());
        double x1 = Double.parseDouble(fieldX1.getText());
        double x2 = Double.parseDouble(fieldX2.getText());
        double result = 0;
        int n = 10000;
        Fnc fnc = new FncParabolic(a, b, c);
        if (rbFor.isSelected()) {
            result = Integral.integralFor(x1, x2, n, fnc);
            outputValues(a, b, c, x1, x2, result, "for");
        }
        if (rbWhile.isSelected()) {
            result = Integral.integralWhile(x1, x2, n, fnc);
            outputValues(a, b, c, x1, x2, result, "while");
        }
        if (rbDoWhile.isSelected()) {
            result = Integral.integralDoWhile(x1, x2, n, fnc);
            outputValues(a, b, c, x1, x2, result, "do...while");
        }
        labelResult.setText("Результат: " + result);
    }

    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.setVisible(true);
        app.setResizable(false);

        System.out.printf("Значения a: %1$3s Значения b: %1$3s Значения с: %1$3s Значения x1: %1$3s Значения x2: %1$3s Результат: %1$3s  Используемый цикл: \n", " ");
    }

    private void outputValues(double a, double b, double c, double x1, double x2, double result, String scope) {

        System.out.printf("%-15.10f %-15.10f %-15.10f %-16.10f %-16.10f %-15.10f %s \n", a, b, c, x1, x2, result, scope);
    }
}
