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
    private JCheckBox checkBox;

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
        checkBox = new JCheckBox();

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

        checkBox.setText("Использовать вещественный счётчик");

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
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(buttonCalculate)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(fieldC, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(fieldB, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(fieldX1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(66, 66, 66)
                                                        .addComponent(labelResult, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(fieldX2, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(checkBox))
                                .addContainerGap(19, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rbFor, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbWhile, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbDoWhile, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129))
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
                                        .addComponent(fieldC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkBox))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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

        Fnc fnc = new FncParabolic(a, b, c);

        outputValues(a, b, c, x1, x2, fnc);

        if (checkBox.isSelected()) {
            result = Integrals.integralLeftReal(x1, x2, fnc);
            labelResult.setText("Результат: " + result);
            return;
        }

        if (rbFor.isSelected())
            result = Integrals.integralFor(x1, x2, fnc);
        if (rbWhile.isSelected())
            result = Integrals.integralWhile(x1, x2, fnc);
        if (rbDoWhile.isSelected())
            result = Integrals.integralDoWhile(x1, x2, fnc);

        labelResult.setText("Результат: " + result);
    }

    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.setVisible(true);
        app.setResizable(false);

        System.out.printf("Значения a: %1$3s Значения b: %1$3s Значения с: %1$3s Значения x1: %1$3s Значения x2: %1$3s Результат (левые):  Результат (средние): \n", " ");
    }

    private void outputValues(double a, double b, double c, double x1, double x2, Fnc fnc) {
        double resultLeft = Integrals.integralLeftReal(x1, x2, fnc);
        double resultMiddle = Integrals.integralMiddleReal(x1, x2, fnc);

        System.out.printf("%-15.10f %-15.10f %-15.10f %-16.10f %-16.10f %-19.10f %.10f \n", a, b, c, x1, x2, resultLeft, resultMiddle);
    }
}
