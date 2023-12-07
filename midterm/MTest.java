package com.edu.bil343.midterm;

import javax.swing.*;
import java.awt.*;
import java.awt.Container.*;
public class MTest {
    private static JButton[] numberButtons;
    private static JButton button1;
    private static JFrame newframe;
    private static JPanel buttonPanel;
    public static void main(String args[]){
        newframe = new JFrame("Calculator");
        newframe.setVisible(true);
        newframe.setSize(600,600);
        newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newframe.setLayout(null);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,4,10,10));


        button1 = new JButton();
        button1.setBounds(10,10,50,50);
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
        }
        for(int i=0;i<10;i++){
            buttonPanel.add(numberButtons[i]);
        }
        newframe.add(buttonPanel);
        buttonPanel.setVisible(true);
    }
}
