package com.edu.bil343.Interfaces;

public abstract class ThreeDShape implements Shape{
    public String getName(){
        return "3D Shape";
    }
    public abstract double getVolume(); // abs. method
}