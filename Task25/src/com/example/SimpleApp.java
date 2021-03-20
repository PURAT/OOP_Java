package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SimpleApp extends JFrame {

    private Spring m2;
    private Spring m1 = Spring.APRIL;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;

    public SimpleApp() {
        initComponents();
    }

    private void initComponents() {

        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("m2=m1");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setText("Вывести значение m2");
        jButton2.addActionListener(evt -> jButton2ActionPerformed(evt));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(40, 40, 40))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent event) {
        m2 = m1;
    }

    private void jButton2ActionPerformed(ActionEvent event) {
        jLabel1.setText(m2.name());
    }

    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.setResizable(false);
        app.setVisible(true);
    }
}
