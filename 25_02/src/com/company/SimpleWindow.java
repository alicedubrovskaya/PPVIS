package com.company;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class SimpleWindow extends JFrame{

    JComboBox combo = new JComboBox();

    JTextField field = new JTextField(50);
    JButton button1 = new JButton("Кнопка 1");

    public SimpleWindow(){
        super("Окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200,600);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));//сверху вниз
        setContentPane(mainPanel);

        JPanel panelOne = new JPanel();
        panelOne.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel panelTwo = new JPanel();
        panelTwo.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel panelThree = new JPanel();
        panelThree.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel panelFour = new JPanel();
        panelFour.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel panelFive = new JPanel();
        panelFive.setBorder(BorderFactory.createLineBorder(Color.black));


        mainPanel.add(panelOne);
        mainPanel.add(panelTwo);
        mainPanel.add(panelThree);
        mainPanel.add(panelFour);
        mainPanel.add(panelFive);

        panelOne.setLayout(new BoxLayout(panelOne, BoxLayout.Y_AXIS));//сверху вниз
        panelOne.add(field);
        panelOne.add(combo);
        panelOne.add(button1);


    }


}
