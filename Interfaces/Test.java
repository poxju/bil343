package com.edu.bil343.Interfaces;
import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(10, 3);
        Circle cr = new Circle(2);

        Shape[] shapes = new Shape[2];
        shapes[0] = cy;
        shapes[1] = cr;

        String otp = "";
        for(int i = 0; i < shapes.length; i++){
            otp += shapes[i].getName() + "'s circumference: " + shapes[i].circumference() + "\n"+
            shapes[i].getName() + "'s area: " + shapes[i].getArea() + "\n";
        }
        // String output = "Cylinder's circumference: " + cy.circumference() + "\n" + 
           // "Circle's circumference: " + cr.circumference() + "\n" + 
            //"Circle's area: " + cr.getArea();

        JOptionPane.showMessageDialog(null, otp);
    }
}
