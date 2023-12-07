package com.edu.bil343.Interfaces;

public class Circle extends TwoDShape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public String getName(){
        return "Circle";
    }

    public double getArea(){
        return PI * radius * radius;
    }

    public double circumference(){
        return 2 * PI * radius;
    }
    public String toString(){
        return "Name: " + getName() + "\n" +
                "Area: " + getArea() + "\n" +
                "Circumference: " + circumference() + "\n";
    }
}
