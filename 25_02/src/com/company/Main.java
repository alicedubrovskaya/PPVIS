package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        PanelOne panelOne= new PanelOne();
        PanelTwo panelTwo = new PanelTwo();
        PanelThree panelThree= new PanelThree();
        PanelFour panelFour= new PanelFour();
        PanelFive panelFive = new PanelFive();

        MainPanel mainPanel= new MainPanel(panelOne, panelTwo, panelThree, panelFour, panelFive);
        mainPanel.setVisible(true);
       /* String s= "";
        String s1=new String("");
        System.out.println("ghgf" +s==s1);
        System.out.println(s.equals(s1));
        */
    }
}