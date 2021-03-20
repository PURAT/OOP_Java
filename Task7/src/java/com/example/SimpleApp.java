package com.example;

import javax.swing.*;
import java.awt.*;

/**
 * The type Simple app.
 */
public class SimpleApp extends JFrame {

    /**
     * The X.
     */
    public int x = 10;
    /**
     * The Y.
     */
    public int y;

    /**
     * Instantiates a new Simple app.
     */
    public SimpleApp() {
        initComponents();
    }
    
    private void initComponents() {

        JButton buttonForGlobalValues = new JButton();
        JButton buttonForLocalValues = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple App");
        setResizable(false);

        buttonForGlobalValues.setFont(new Font("Calibri", 1, 12));
        buttonForGlobalValues.setText("<html><p align=\"center\">Показать значения<br>\nглобальных переменных</p></html>");
        buttonForGlobalValues.addActionListener((event) -> buttonForGlobalValuesActionPerformed(event));

        buttonForLocalValues.setFont(new Font("Calibri", 1, 12));
        buttonForLocalValues.setText("<html><p align=\"center\">Показать значения локальных переменных</p></html>");
        buttonForLocalValues.addActionListener((event) -> buttonForLocalValuesActionPerformed(event));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonForLocalValues, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(buttonForGlobalValues))
                                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addComponent(buttonForGlobalValues, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(buttonForLocalValues, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
        );

        pack();
    }

    private void buttonForLocalValuesActionPerformed(java.awt.event.ActionEvent event) {
        int x = 10;
        int y = -1;
        JOptionPane.showMessageDialog(SimpleApp.this, "x = " + x + "\n y = " + y,
                "Local variables", JOptionPane.INFORMATION_MESSAGE );
    }

    private void buttonForGlobalValuesActionPerformed(java.awt.event.ActionEvent event) {
        JOptionPane.showMessageDialog(SimpleApp.this, "x = " + x + "\n y = " + y,
                "Global variables", JOptionPane.INFORMATION_MESSAGE );
    }


    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.setResizable(false);
        app.setVisible(true);
    }
}
