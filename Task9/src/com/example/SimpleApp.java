package com.example;

import javax.swing.*;

public class SimpleApp extends JFrame {

    private JButton buttonByte;
    private JButton buttonDouble;
    private JButton buttonFloat;
    private JButton buttonInteger;
    private JButton buttonLong;
    private JButton buttonShort;
    private JButton buttonCharacter;
    private JLabel label1;
    private JLabel label2;

    public byte varByte = 105;
    public short varShort = 3423;
    public int varInt = 545203;
    public long varLong = 120056807;
    public float varFloat = 126.525f;
    public double varDouble = 126.525;
    public char varChar = 78;

    public SimpleApp() {
        initComponents();
    }
     
    private void initComponents() {
        buttonShort = new JButton();
        buttonLong = new JButton();
        buttonDouble = new JButton();
        buttonByte = new JButton();
        buttonFloat = new JButton();
        buttonInteger = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        buttonCharacter = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        buttonShort.setText("Тип Short");
        buttonShort.addActionListener(event -> buttonShortActionPerformed(event));

        buttonLong.setText("Тип Long");
        buttonLong.addActionListener(event -> buttonLongActionPerformed(event));

        buttonDouble.setText("Тип Double");
        buttonDouble.addActionListener(event -> buttonDoubleActionPerformed(event));

        buttonByte.setText("Тип Byte");
        buttonByte.addActionListener(event -> buttonByteActionPerformed(event));

        buttonFloat.setText("Тип Float");
        buttonFloat.addActionListener(event -> buttonFloatActionPerformed(event));

        buttonInteger.setText("Тип Intreger");
        buttonInteger.addActionListener(event -> buttonIntegerActionPerformed(event));

        label1.setFont(new java.awt.Font("Tahoma", 0, 12));
        label1.setText("Вещественные типы:");

        label2.setFont(new java.awt.Font("Tahoma", 0, 12));
        label2.setText("Целочисленные типы:");

        buttonCharacter.setText("Тип Character");
        buttonCharacter.addActionListener(event -> buttonCharacterActionPerformed(event));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(buttonByte, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                                .addComponent(buttonShort, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(buttonFloat, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buttonDouble, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(buttonInteger, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buttonLong, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(label2)
                                                .addGap(105, 105, 105))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(buttonCharacter, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                                .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonShort, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonByte, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonLong, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonInteger, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(buttonCharacter, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addGap(11, 11, 11)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonDouble, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonFloat, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
        );

        pack();
    }

    private void buttonIntegerActionPerformed(java.awt.event.ActionEvent event) {
        JOptionPane.showMessageDialog(SimpleApp.this, "Тип: Integer"
                + "\nЗначение: " + varInt);
    }

    private void buttonDoubleActionPerformed(java.awt.event.ActionEvent event) {
        JOptionPane.showMessageDialog(SimpleApp.this, "Тип: Double"
                + " \nЗначение: " + varDouble);
    }

    private void buttonByteActionPerformed(java.awt.event.ActionEvent event) {
        JOptionPane.showMessageDialog(SimpleApp.this, "Тип: Byte"
                + "\nЗначение: " + varByte);
    }

    private void buttonShortActionPerformed(java.awt.event.ActionEvent event) {
        JOptionPane.showMessageDialog(SimpleApp.this, "Тип: Short"
                + "\nЗначение: " + varShort);
    }

    private void buttonLongActionPerformed(java.awt.event.ActionEvent event) {
        JOptionPane.showMessageDialog(SimpleApp.this, "Тип: Long"
                + "\nЗначение: " + varLong);
    }

    private void buttonFloatActionPerformed(java.awt.event.ActionEvent event) {
        JOptionPane.showMessageDialog(SimpleApp.this, "Тип: Float"
                + "\nЗначение: " + varFloat);
    }

    private void buttonCharacterActionPerformed(java.awt.event.ActionEvent event) {
        JOptionPane.showMessageDialog(SimpleApp.this, "Тип: Character"
                + "\nЗначение: " + (int) varChar);
    }

    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.setTitle("Simple Application");
        app.setResizable(false);
        app.setVisible(true);
    }
}

