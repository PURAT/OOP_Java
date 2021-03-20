package com.example;

import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    private JButton buttonAdd;
    private JButton buttonDivide;
    private JButton buttonMultiply;
    private JButton buttonSin;
    private JTextField inputField1;
    private JTextField inputField2;
    private JLabel label;
    private JLabel labelResult;

    private double x;
    private double y;

    public Calculator() {
        initComponents();
    }
     
    private void initComponents() {
        inputField2 = new JTextField();
        inputField1 = new JTextField();
        labelResult = new JLabel();
        label = new JLabel();
        buttonAdd = new JButton();
        buttonDivide = new JButton();
        buttonMultiply = new JButton();
        buttonSin = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        inputField2.setHorizontalAlignment(JTextField.LEFT);
        inputField2.setToolTipText("Числовое поле данных 2");

        inputField1.setToolTipText("Числовое поле данных 1");

        labelResult.setBackground(new java.awt.Color(255, 255, 255));

        label.setText("Результат:");

        buttonAdd.setText("Сложить");
        buttonAdd.addActionListener(event -> buttonAddActionPerformed(event));

        buttonDivide.setText("Разделить");
        buttonDivide.addActionListener(event -> buttonDivideActionPerformed(event));

        buttonMultiply.setText("Умножить");
        buttonMultiply.addActionListener(event -> buttonMultiplyActionPerformed(event));

        buttonSin.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        buttonSin.setText("sin");
        buttonSin.addActionListener(event -> buttonSinActionPerformed(event));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(inputField2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(label)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelResult, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33))))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(buttonDivide, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonAdd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonSin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonMultiply, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                                .addGap(79, 79, 79))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(inputField1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(196, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(inputField2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                        .addComponent(labelResult, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonAdd, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonMultiply, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonDivide, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                        .addComponent(buttonSin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(20, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(inputField1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(207, Short.MAX_VALUE)))
        );

        pack();
    }                       

    private void buttonAddActionPerformed(ActionEvent event) {
        initializeAndCheckValues();
        labelResult.setText("" + (x + y));
    }

    private void buttonMultiplyActionPerformed(ActionEvent event) {
        initializeAndCheckValues();
        labelResult.setText("" + x * y);
    }

    private void buttonDivideActionPerformed(ActionEvent event) {
        initializeAndCheckValues();
        labelResult.setText("" + x / y);
    }

    private void buttonSinActionPerformed(ActionEvent event) {
        double value = Double.parseDouble(labelResult.getText());
        labelResult.setText("" + Math.sin(value));
    }

    private void initializeAndCheckValues() {
        try {
            x = Double.parseDouble(inputField1.getText());
            y = Double.parseDouble(inputField2.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Введены неверные данные","Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setTitle("Calculator");
        calculator.setResizable(false);
        calculator.setVisible(true);
    }
}
