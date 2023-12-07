package com.edu.bil343.Interfaces;

public interface Shape {
    public final double PI = 3.14159;
    public String getName(); // govde yok sadece prototip var, abstract method ayni zamanda
    // public abstract String getName(); olarak da yazilabilir, okunabilirlik artar...
    public abstract double getArea();
    public double circumference();
}
