package com.company;
import java.lang.Math;
import java.util.Formatter;
import java.text.NumberFormat;

public class Triangle extends Shape {
    private double rightSide;
    private double leftSide;
    private double base;

    public Triangle(String objectType, double base, double leftSide, double rightSide) {
        super(objectType);
        this.rightSide = rightSide;
        this.leftSide = leftSide;
        this.base = base;
        this.area = area();
        this.perimeter = perimeter();
    }
    @Override
    protected double area() {
        double s = perimeter()/2;
        double h = (Math.sqrt(s*(s-base)*(s-rightSide)*(s-leftSide))/(base/2));
        double area = Math.round(base*h/2 * 10000.0)/10000.0;
        return area;
    }
    @Override
    protected double perimeter() {
        double perimeter = Math.round((base + rightSide + leftSide) * 10000.0)/10000.0;
        return perimeter;
    }
}
