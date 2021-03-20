package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SimpleApp extends JFrame {
    private JButton buttonCreate;
    private JButton buttonStart;
    private DemoThread demo1;
    private DemoThread demo2;
    private DemoThread demo3;

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
       demo1 = new DemoThread();
       demo2 = new DemoThread();
       demo3 = new DemoThread();
    }

    private void buttonStartActionPerformed(ActionEvent event) {
        demo1.start();
        demo2.start();
        demo3.start();
    }
    
    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.setResizable(false);
        app.setVisible(true);
    }
}
