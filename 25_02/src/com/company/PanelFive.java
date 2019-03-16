package com.company;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;


public class PanelFive {
    JPanel panelFifth = new JPanel();
    JTextField field = new JTextField();
    String buttonOneName ="Кнопка 1";
    String buttonTwoName ="Кнопка 2";
    String buttonThreeName ="Кнопка 3";
    JButton button1= new JButton(buttonOneName);
    JButton button2 = new JButton(buttonTwoName);
    JButton button3 = new JButton(buttonThreeName);
    DefaultTableModel model = new DefaultTableModel(2,2);
    JTable table = new JTable(model);



    PanelFive() {
        panelFifth.setBorder(BorderFactory.createLineBorder(Color.black));
        panelFifth.setLayout(new BoxLayout(panelFifth, BoxLayout.Y_AXIS));

        panelFifth.add(field);
        panelFifth.add(button1);
        panelFifth.add(button2);
        panelFifth.add(button3);
        panelFifth.add(table);

        button1.addActionListener(new ButtonFirstActionListener());
        button2.addActionListener(new ButtonSecondActionListener());
        button3.addActionListener(new ButtonThirdActionListener());

    }



    class ButtonFirstActionListener implements ActionListener {
        public void actionPerformed(ActionEvent first) {
            table.setValueAt(field.getText(),table.getSelectedRow(),0);
        }
    }

    class ButtonSecondActionListener implements ActionListener {
        public void actionPerformed(ActionEvent second) {
            int tableRow=table.getSelectedRow();
            Object string = table.getValueAt(tableRow,0);
            table.getSelectedRow();
            if (!"".equals(string)) {
                table.setValueAt(string,tableRow,1);
                table.setValueAt("",tableRow,0);
            }
        }
    }

    class ButtonThirdActionListener implements ActionListener {
        public void actionPerformed(ActionEvent third) {
            int tableRow=table.getSelectedRow();
            Object string = table.getValueAt(tableRow,0);
            string=table.getValueAt(tableRow,1);
            if (!string.equals(new String(""))){
                table.setValueAt(string,tableRow,0);
                table.setValueAt("",tableRow,1);
            }
        }
    }


}
