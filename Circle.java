package com.company;
import static java.lang.Math.*;

public class Circle extends Shape{
    private double PI = 3.14159;
    private double radius;

    //constructor
    public Circle(String objectType, double radius) {
        super(objectType);
        this.radius = radius;
        this.area = area();
        this.perimeter = perimeter();
    }

    @Override
    public double area() {
        double area = Math.round(PI * pow(radius,2) *10000.0)/10000.00 ;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = Math.round(2*PI*radius * 10000.0)/10000.0;
        return perimeter;
    }

    @Override
    public String toString() {
        return "The area of this " + objectType + " is " + area() + ", and the circumference is " + perimeter() + ".";
    }
}
