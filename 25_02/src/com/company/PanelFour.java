package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PanelFour {
    JPanel panelFourth = new JPanel();

    String buttonName ="Кнопка 1";
    static final String CHECKONENAME ="Флажок 1";
    static final String CHECKTWONAME ="Флажок 2";
    static final String CHECKTHREENAME ="Флажок 3";
    JTextField field = new JTextField(50);
    JButton button1 = new JButton(buttonName);
    JCheckBox check1 = new JCheckBox(CHECKONENAME);
    JCheckBox check2 = new JCheckBox(CHECKTWONAME);
    JCheckBox check3 = new JCheckBox(CHECKTHREENAME);


    PanelFour(){
        panelFourth.setBorder(BorderFactory.createLineBorder(Color.black));
        panelFourth.setLayout(new BoxLayout(panelFourth, BoxLayout.Y_AXIS));
        panelFourth.add(field);
        panelFourth.add(button1);
        panelFourth.add(check1);
        panelFourth.add(check2);
        panelFourth.add(check3);




        button1.addActionListener(new ButtonFifthActionListener());

    }

    class ButtonFifthActionListener implements ActionListener {
        public void actionPerformed(ActionEvent fifth) {
            switch (field.getText()){
                case CHECKONENAME: {
                    if (check1.isSelected()) check1.setSelected(false);
                    else check1.setSelected(true);
                    break;
                }
                case CHECKTWONAME:{
                    if (check2.isSelected()) check2.setSelected(false);
                    else check2.setSelected(true);
                    break;
                }
                case CHECKTHREENAME:{
                    if (check3.isSelected()) check3.setSelected(false);
                    else check3.setSelected(true);
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
