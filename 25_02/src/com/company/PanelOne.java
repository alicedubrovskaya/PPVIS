package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelOne  {
    JPanel panelFirst = new JPanel();
    JComboBox combo = new JComboBox();
    JTextField field = new JTextField(50);
    String buttonName ="Кнопка 1";
    JButton button1 = new JButton(buttonName);

    PanelOne() {
        panelFirst.setBorder(BorderFactory.createLineBorder(Color.black));
        panelFirst.setLayout(new BoxLayout(panelFirst, BoxLayout.Y_AXIS));
        panelFirst.add(field);
        panelFirst.add(combo);
        panelFirst.add(button1);

        button1.addActionListener(new ButtonFirstActionListener());
    }




    class ButtonFirstActionListener implements ActionListener {
        public void actionPerformed(ActionEvent first) {
            Object item;
            String output="Невозможно";
            String title="Окно";
            boolean areEqual=true;
            for (int currentElement = 0; currentElement < combo.getItemCount(); currentElement++){
                item = combo.getItemAt(currentElement);
                if (item.equals(field.getText())) {
                    JOptionPane.showMessageDialog(null, output, title, JOptionPane.PLAIN_MESSAGE);
                    areEqual = false;
                    break;
                }
            }
            if (areEqual) combo.addItem(field.getText());
        }
    }
}
