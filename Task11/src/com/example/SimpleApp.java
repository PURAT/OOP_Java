package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;


public class SimpleApp extends JFrame {
    private JRadioButton buttonByte;
    private JRadioButton buttonChar;
    private JButton buttonConvert;
    private ButtonGroup buttonGroup1;
    private JRadioButton buttonInt;
    private JRadioButton buttonLong;
    private JRadioButton buttonShort;
    private JTextField textField;

    private byte varByte;
    private short varShort;
    private char varChar;
    private int varInt;
    private long varLong;
    private Random random;

    public SimpleApp() {
        initComponents();
        random = new Random();
    }
    
    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        buttonConvert = new JButton();
        textField = new JTextField();
        buttonByte = new JRadioButton();
        buttonShort = new JRadioButton();
        buttonChar = new JRadioButton();
        buttonInt = new JRadioButton();
        buttonLong = new JRadioButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        buttonConvert.setText("Преобразовать в число");
        buttonConvert.addActionListener(event -> buttonConvertActionPerformed(event));

        buttonGroup1.add(buttonByte);
        buttonByte.setText("Byte");
        buttonByte.addActionListener(event -> buttonByteActionPerformed(event));

        buttonGroup1.add(buttonShort);
        buttonShort.setText("Short");
        buttonShort.addActionListener(event -> buttonShortActionPerformed(event));

        buttonGroup1.add(buttonChar);
        buttonChar.setText("Character");
        buttonChar.addActionListener(event -> buttonCharActionPerformed(event));

        buttonGroup1.add(buttonInt);
        buttonInt.setText("Integer");
        buttonInt.addActionListener(event -> buttonIntActionPerformed(event));

        buttonGroup1.add(buttonLong);
        buttonLong.setText("Long");
        buttonLong.addActionListener(event -> buttonLongActionPerformed(event));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(buttonByte)
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(buttonShort)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(buttonChar)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(buttonInt)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(buttonLong))
                                                        .addComponent(buttonConvert, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
                                                .addGap(67, 67, 67)))
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonByte)
                                        .addComponent(buttonShort)
                                        .addComponent(buttonChar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonInt)
                                        .addComponent(buttonLong))
                                .addGap(18, 18, 18)
                                .addComponent(buttonConvert, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void buttonConvertActionPerformed(ActionEvent event) {
        long result = Long.parseLong(textField.getText());
        if (buttonByte.isSelected())
            JOptionPane.showMessageDialog(this, "Тип Byte: " + (byte) result);
        if (buttonChar.isSelected())
            JOptionPane.showMessageDialog(this, "Тип Character: " + (int) ((char) result));
        if (buttonShort.isSelected())
            JOptionPane.showMessageDialog(this, "Тип Short: " + (short) result);
        if (buttonInt.isSelected())
            JOptionPane.showMessageDialog(this, "Тип Integer: " + (int) result);
        if (buttonLong.isSelected())
            JOptionPane.showMessageDialog(this,"Тип Long: " + result);
    }

    private void buttonByteActionPerformed(ActionEvent event) {
        varByte = (byte) random.nextInt();
        textField.setText(varByte + "");
    }

    private void buttonShortActionPerformed(ActionEvent event) {
        varShort = (short) random.nextInt();
        textField.setText(varShort + "");
    }

    private void buttonCharActionPerformed(ActionEvent event) {
        varChar = (char) random.nextInt();
        textField.setText((int) varChar + "");
    }

    private void buttonIntActionPerformed(ActionEvent event) {
        varInt = random.nextInt();
        textField.setText(varInt + "");
    }

    private void buttonLongActionPerformed(ActionEvent event) {
        varLong = random.nextLong();
        textField.setText(varLong + "");
    }

    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.setResizable(false);
        app.setVisible(true);
    }
}