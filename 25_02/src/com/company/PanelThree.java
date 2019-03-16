package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelThree {
    JPanel panelThird = new JPanel();
    JTextField field = new JTextField(50);
    String buttonName ="Кнопка 1";
    static final String R_BUTTON_ONE_NAME ="Переключатель 1";
    static final String R_BUTTON_TWO_NAME ="Переключатель 2";
    static final String R_BUTTON_THREE_NAME ="Переключатель 3";
    JButton button1 = new JButton(buttonName);
    JRadioButton rButton1 = new JRadioButton(R_BUTTON_ONE_NAME);
    JRadioButton rButton2 = new JRadioButton(R_BUTTON_TWO_NAME);
    JRadioButton rButton3 = new JRadioButton(R_BUTTON_THREE_NAME);
    ButtonGroup group = new ButtonGroup();


    PanelThree(){
        panelThird.setBorder(BorderFactory.createLineBorder(Color.black));
        panelThird.setLayout(new BoxLayout(panelThird, BoxLayout.Y_AXIS));
        panelThird.add(field);
        panelThird.add(button1);
        panelThird.add(rButton1);
        panelThird.add(rButton2);
        panelThird.add(rButton3);

        group.add(rButton1);
        group.add(rButton2);
        group.add(rButton3);


        button1.addActionListener(new ButtonFourthActionListener());
    }


    class ButtonFourthActionListener implements ActionListener {
        public void actionPerformed(ActionEvent fourth) {
            switch (field.getText()){
                case R_BUTTON_ONE_NAME: {
                    rButton1.setSelected(true);
                    break;
                }
                case R_BUTTON_TWO_NAME:{
                    rButton2.setSelected(true);
                    break;
                }
                case R_BUTTON_THREE_NAME:{
                    rButton3.setSelected(true);
                    break;
                }
                default:{
                    String output="Ошибка!";
                    String title="Окно";
                    JOptionPane.showMessageDialog(null, output, title, JOptionPane.PLAIN_MESSAGE);

                }
            }

        }
    }

}
