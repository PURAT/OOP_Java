package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SimpleApp extends JFrame {

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JTextField textFieldX;
    private JTextField textFieldY;

    public SimpleApp() {
        initComponents();
    }

    private void initComponents() {
        textFieldX = new JTextField();
        textFieldY = new JTextField();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        textFieldX.addActionListener(event -> textFieldXActionPerformed(event));

        textFieldY.addActionListener(event -> textFieldYActionPerformed(event));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textFieldX)
                                                .addComponent(textFieldY, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                                        .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(textFieldX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addContainerGap(48, Short.MAX_VALUE))
        );
        pack();
    }

    private void textFieldXActionPerformed(ActionEvent event) {
        float x = Float.parseFloat(textFieldX.getText());
        float f = 1 + x;
        jLabel1.setText("f-1 = " + (f - 1));
        System.out.print(x + "    " + (f-1) + "       ");
    }

    private void textFieldYActionPerformed(ActionEvent event) {
        double y = Double.parseDouble(textFieldY.getText());
        double d = 1 + y;
        jLabel2.setText("d-1 = " + (d - 1));
        System.out.println(y + "   " + (d-1));
    }

    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.setResizable(false);
        app.setVisible(true);
        System.out.println("f        f-1         d        d-1 ");
    }
}
