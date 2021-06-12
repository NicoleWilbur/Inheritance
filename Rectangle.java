/***
 Name: Nicole Wilbur

 Project Name: CSC372-CTA04

 Project Purpose: to save an arrayList of related list shape objects and print it out.

 Algorithm Used: abstract classes and inheritence to create objects of different shapes.

 Program Inputs: all doubles: length, width, base, rightSide, leftSide, radius, userMenuChoices

 Program Outputs: A list of all objects stored in the arrayList

 Program Limitations: none that I know of

 Program Errors: none that I know of

 ==================
 ***/
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