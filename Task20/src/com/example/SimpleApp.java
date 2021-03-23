package com.example;

import com.example.figures.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *  Simple application demonstrates the use of different figures.
 */
public class SimpleApp extends JFrame {

    private JButton buttonCreate;
    private ButtonGroup buttonGroup1;
    private JLabel labelType;
    private JRadioButton rbCircle;
    private JRadioButton rbDot;
    private JRadioButton rbEllipse;
    private JRadioButton rbRectangle;
    private JRadioButton rbSquare;
    private JRadioButton rbTriangle;

    /**
     * Instantiates a new Simple app.
     */
    public SimpleApp() {
        initComponents();
    }
    
    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        rbDot = new JRadioButton();
        rbCircle = new JRadioButton();
        rbSquare = new JRadioButton();
        rbEllipse = new JRadioButton();
        rbTriangle = new JRadioButton();
        rbRectangle = new JRadioButton();
        buttonCreate = new JButton();
        labelType = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(rbDot);
        rbDot.setText("Точка");

        buttonGroup1.add(rbCircle);
        rbCircle.setText("Окружность");

        buttonGroup1.add(rbSquare);
        rbSquare.setText("Квадрат");

        buttonGroup1.add(rbEllipse);
        rbEllipse.setText("Эллипс");

        buttonGroup1.add(rbTriangle);
        rbTriangle.setText("Треугольник");

        buttonGroup1.add(rbRectangle);
        rbRectangle.setText("Прямоугольник");

        buttonCreate.setText("Создать фигуру");
        buttonCreate.addActionListener(event -> buttonCreateActionPerformed(event));

        labelType.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelType.setText("Тип фигуры:");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(rbDot)
                                        .addComponent(rbEllipse))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonCreate, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(rbTriangle)
                                                        .addComponent(rbCircle))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(rbSquare)
                                                        .addComponent(rbRectangle))))
                                .addContainerGap(33, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelType, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelType, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbDot)
                                        .addComponent(rbCircle)
                                        .addComponent(rbSquare))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbEllipse)
                                        .addComponent(rbTriangle)
                                        .addComponent(rbRectangle))
                                .addGap(18, 18, 18)
                                .addComponent(buttonCreate, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }                    

    private void buttonCreateActionPerformed(ActionEvent event) {
        Figure figure = null;

        if (rbDot.isSelected())
            figure = new Dot(10, 10);
        if (rbCircle.isSelected())
            figure = new Circle(10, 10, 5);
        if (rbSquare.isSelected())
            figure = new Square(20, 20, 10);
        if (rbEllipse.isSelected())
            figure = new Ellipse(15, 15, 10, 5);
        if (rbTriangle.isSelected())
            figure = new Triangle(20, 10, 10, 7);
        if (rbRectangle.isSelected())
            figure = new Rectangle(30, 20, 10, 15);

        if (figure != null)
            figure.show();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SimpleApp app = new SimpleApp();
        app.setVisible(true);
        app.setResizable(false);
    }     
}