package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class SimpleApp extends JFrame {

    private JButton buttonResult;
    private JTextField fieldHeight;
    private JTextField fieldResult;
    private JTextField fieldWidth;
    private JLabel labelHeight;
    private JLabel labelResult;
    private JLabel labelWidth;
    private double height;
    private double width;

    public SimpleApp() {
        initComponents();
    }
     
    private void initComponents() {

        labelHeight = new JLabel();
        labelWidth = new JLabel();
        labelResult = new JLabel();
        fieldHeight = new JTextField();
        fieldWidth = new JTextField();
        fieldResult = new JTextField();
        buttonResult = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        labelHeight.setText("Введите высоту прямоугольника: ");

        labelWidth.setText("Введите ширину прямоугольника:");

        labelResult.setText("Площадь прямоугольника:");

        buttonResult.setText("Вычислить площадь!");
        buttonResult.addActionListener(event -> buttonResultActionPerformed(event));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonResult)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(labelHeight, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelWidth, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelResult, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(fieldHeight, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                                        .addComponent(fieldWidth)
                                                        .addComponent(fieldResult))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelHeight)
                                                        .addComponent(fieldHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(68, 68, 68))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelWidth)
                                                        .addComponent(fieldWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelResult)
                                        .addComponent(fieldResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(buttonResult)
                                .addContainerGap())
        );

        pack();
    }                      

    private void buttonResultActionPerformed(ActionEvent evt) {
        try {
            height = Double.parseDouble(fieldHeight.getText());
            width = Double.parseDouble(fieldWidth.getText());
            double result = calcRectArea(width, height);
            fieldResult.setText("" + result);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ошибка преобразования из строки в число." ,"Ошибка!" ,JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Введены отрицальные высота или ширина." ,"Ошибка!" ,JOptionPane.ERROR_MESSAGE);
        }

    }

    double calcRectArea(double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException();
        return width * height;
    }

    public static void main(String args[]) {
        SimpleApp app = new SimpleApp();
        app.setLocationRelativeTo(null);
        app.setResizable(false);
        app.setVisible(true);
    }
}
