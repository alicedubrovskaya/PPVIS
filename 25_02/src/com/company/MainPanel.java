package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPanel extends JFrame{
    JButton button1= new JButton("Старт");
    JButton button2= new JButton("Стоп");

    int number;

    public void setText(JButton button) {
        String buttonName=button.getText();
        String string;
        int length;
        char symbol;

        length=buttonName.length();
        StringBuffer buffer = new StringBuffer(buttonName);

        symbol= buffer.charAt(length-1);
        buffer.insert(0,symbol);
        buffer.deleteCharAt(length);

        string=buffer.toString();
        button.setText(string);

    }

    public MainPanel(PanelOne panelOne, PanelTwo panelTwo, PanelThree panelThree,PanelFour panelFour, PanelFive panelFive){
        super("Окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200,600);
        setPanelNumber(0);

        JPanel mainPanel = new JPanel();




        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));//сверху вниз
        setContentPane(mainPanel);

        mainPanel.add(panelOne.panelFirst);
        mainPanel.add(panelTwo.panelSecond);
        mainPanel.add(panelThree.panelThird);
        mainPanel.add(panelFour.panelFourth);
        mainPanel.add(panelFive.panelFifth);
        mainPanel.add(button1);
        mainPanel.add(button2);


        Timer timer = new Timer(100,new ActionListener(){
            int numberOfPanel=getPanelNumber();
            @Override
            public void actionPerformed(ActionEvent e)
            {
                switch (numberOfPanel){
                    case 0:{
                        setText(panelOne.button1);
                        break;
                    }
                    case 1:{
                        setText(panelTwo.button1);
                        break;
                    }
                    case 2:{
                        setText(panelTwo.button2);
                        break;
                    }
                    case 3:{
                        setText(panelThree.button1);
                        break;
                    }
                    case 4:{
                        setText(panelFour.button1);
                        break;
                    }
                    case 5:{
                        setText(panelFive.button1);
                        break;
                    }
                    case 6:{
                        setText(panelFive.button2);
                        break;
                    }
                    case 7:{
                        setText(panelFive.button3);
                        break;
                    }
                }
                if (numberOfPanel==7) numberOfPanel=0; else numberOfPanel++;
                setPanelNumber(numberOfPanel);
            }
        });


        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent first) {
                timer.start();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               timer.stop();
            }
        });

    }


    public void setPanelNumber(int currentNumber) {
         number= currentNumber;
    }

    public int getPanelNumber(){
        return number;
    }
}
