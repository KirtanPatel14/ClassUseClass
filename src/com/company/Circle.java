package com.company;

public class Circle {
    private double radius;
    public Circle(double rad){
        radius = rad;
    }
    public Circle(){
       double r = radius;
       radius = 1;
    }
    public double area(){
        double a = Math.PI * Math.pow(radius, 2);
        return a;
    }
    public double circumference(){
        double b = 2 * Math.PI* radius;
        return b;
    }
}
