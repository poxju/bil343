package com.edu.bil343.ExceptionHandling;

import javax.swing.JOptionPane;
import javax.swing.JSpinner.NumberEditor;

public class Exception1 {
    public static void main(String args[]){
        double num = 0.0;
        try{
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number? "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number? "));
            num = num1/num2;
        }
        catch(ArithmeticException ae){
            JOptionPane.showMessageDialog(null, ae.getMessage());
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Enter a number!", null, 0);
        }

        JOptionPane.showMessageDialog(null,"Result = "+num);
        System.out.println("end main...");
    }
}
