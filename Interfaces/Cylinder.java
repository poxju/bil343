package com.edu.bil343.Interfaces;

public class Cylinder extends ThreeDShape{
    private double height;
    private double radius;

    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    public String getName(){
        return "Cylinder";
    }
    public double getArea(){
        return 2 * PI * radius * (radius + height);
    }
    public double circumference(){
        return 2 * PI * radius;
    }
    public double getVolume(){
        return PI * radius * radius * height;
    }
    public String toString(){
        return "Name: " + getName() + "\n" +
                "Area: " + getArea() + "\n" +
                "Circumference: " + circumference() + "\n" +
                "Volume: " + getVolume() + "\n";
    }
}
