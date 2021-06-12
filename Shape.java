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

import java.lang.String;

abstract class Shape {
    protected String objectType;
    protected double area;
    protected double perimeter;

    abstract double area();
    abstract double perimeter();

    @Override
    public String toString() {
        return "The area of this " + objectType + " is " + area() + ", and the perimeter is " + perimeter() + ".";
    }
    Shape(String objectType){
        this.objectType = objectType;
    }
}
