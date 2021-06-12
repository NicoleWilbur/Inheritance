package com.company;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String objectType, double length, double width) {
        super(objectType);
        this.length = length;
        this.width = width;
        this.area = area();
        this.perimeter = perimeter();
    }
    @Override
    double area() {
        double area = length * width;
        return area;
    }
    @Override
   double perimeter() {
        double perimeter = 2*(length + width);
        return perimeter;
    }
}
