package com.edu.bil343.TestGUI;
import javax.swing.*;
import java.awt.Container;
public class CircleGUI extends JFrame {

    private JLabel ral,rel;
    private JButton exitB,areaB,circumB;
    private JTextField raTf,reTf;

    public CircleGUI(){
        Container c = getContentPane();
        exitB = new JButton("EXIT");
        c.add(exitB);
    }
    public static void main(String[] args){
        CircleGUI myGUI = new CircleGUI();
        myGUI.setTitle("Circle App");
        myGUI.setSize(400,500);

        myGUI.setVisible(true);
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

