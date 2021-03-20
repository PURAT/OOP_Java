package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SimpleApp extends JFrame {
    private JButton buttonCreate;
    private JButton buttonStart;
    private Thread thread1;
    private Thread thread2;
    private Thread thread3;
    private Thread thread4;
    private Thread thread5;

    public SimpleApp() {
        initComponents();
    }
    
    private void initComponents() {
        buttonCreate = new JButton();
        buttonStart = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        buttonCreate.setText("Create Threads");
        buttonCreate.addActionListener(event -> buttonCreateActionPerformed(event));

        buttonStart.setText("Start Threads");
        buttonStart.addActionListener(event -> buttonStartActionPerformed(event));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(83, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(buttonStart, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonCreate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(buttonCreate, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonStart, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void buttonCreateActionPerformed(ActionEvent event) {
        thread1 = new Thread(new Printer());
        thread2 = new Thread(new Printer());
        thread3 = new Thread(new Printer());
        thread4 = new Thread(new Printer());
        thread5 = new Thread(new Printer());
    }

    private void buttonStartActionPerformed(ActionEvent event) {
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
    
    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.setResizable(false);
        app.setVisible(true);
    }
}
