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
