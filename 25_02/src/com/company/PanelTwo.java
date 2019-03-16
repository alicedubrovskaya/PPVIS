package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelTwo {
    JPanel panelSecond = new JPanel();
    JTextField field = new JTextField(50);
    String buttonOneName ="Кнопка 1";
    String buttonTwoName ="Кнопка 2";
    JButton button1 = new JButton(buttonOneName);
    JButton button2 = new JButton(buttonTwoName);



    PanelTwo() {
        panelSecond.setBorder(BorderFactory.createLineBorder(Color.black));
        panelSecond.setLayout(new BoxLayout(panelSecond, BoxLayout.Y_AXIS));
        panelSecond.add(field);
        panelSecond.add(button1);
        panelSecond.add(button2);

        button1.addActionListener(new ButtonSecondActionListener());
        button2.addActionListener(new ButtonThirdActionListener());

    }



    class ButtonSecondActionListener implements ActionListener {
        public void actionPerformed(ActionEvent second) {
            button2.setText(field.getText());
        }
    }


    class ButtonThirdActionListener implements ActionListener {
        public void actionPerformed(ActionEvent third) {
            String text="";
            text=button1.getText();
            button1.setText(button2.getText());
            button2.setText(text);
        }

    }
}
