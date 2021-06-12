package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class ShapeArray {

    public static int mainLoop(Scanner scnr) {
        int userMenuChoice;
        do {
            try {
                System.out.println("Enter 1 to add a triangle, enter 2 to add a circle, enter 3 to add a rectangle, "
                        + "enter 4 to print the array, enter 5 to exit.");
                userMenuChoice = scnr.nextInt();
                if (userMenuChoice >= 1 && userMenuChoice <= 5) break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid option.");
            } finally {
                scnr.nextLine();
            }
            System.out.println("Invalid entry. Please enter a number between 1 and 5.");
        }
        while (true);
        return userMenuChoice;
    }

    public static void newRectangle(Scanner scnr, ArrayList<Shape> shapeArray) {
        try {
            System.out.println("Enter the length of the rectangle: ");
            double length = scnr.nextDouble();
            while (length <= 0) {
                System.out.println("Please enter value greater than zero.");
                length = scnr.nextDouble();
            }
            System.out.println("Enter the width of the rectangle");
            double width = scnr.nextDouble();
            while (width <= 0) {
                System.out.println("Please enter value greater than zero.");
                width = scnr.nextDouble();
            }
            Rectangle rectangle1 = new Rectangle("rectangle", length, width);
            shapeArray.add(rectangle1);
            System.out.println("Rectangle added.");
        } catch (Exception e) {
            System.out.println("Something went wrong; please try again.");
            scnr.nextLine();
        }
    }
    public static void newTriangle(Scanner scnr, ArrayList<Shape> shapeArray) {
        try {
            System.out.println("Enter the base: ");
            double base = scnr.nextDouble();
            while (base <= 0) {
                System.out.println("Please enter value greater than zero.");
                base = scnr.nextDouble();
            }
            System.out.println("Enter the left side: ");
            double left = scnr.nextDouble();
            while (left <= 0) {
                System.out.println("Please enter value greater than zero.");
                left = scnr.nextDouble();
            }
            System.out.println("Enter the right side: ");
            double right = scnr.nextDouble();
            while (right <= 0) {
                System.out.println("Please enter value greater than zero.");
                right = scnr.nextDouble();
            }
            Triangle triangle1 = new Triangle("triangle", base, left, right);
            shapeArray.add(triangle1);
            System.out.println("Triangle added.");

        }
        catch (Exception e) {
            System.out.println("Something went wrong; please try again.");
            scnr.nextLine();
        }
    }
    public static void newCircle(Scanner scnr, ArrayList<Shape> shapeArray) {
        try {
            System.out.println("Enter the radius of the circle: ");
            double radius = scnr.nextDouble();
            while (radius <= 0) {
                System.out.println("Please enter value greater than zero.");
                radius = scnr.nextDouble();
            }
            Circle circle1 = new Circle("circle", radius);
            shapeArray.add(circle1);
            System.out.println("Circle added.");
        }
        catch (Exception e) {
            System.out.println("Something went wrong; please try again.");
            scnr.nextLine();
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Shape> shapeArray = new ArrayList<Shape>();
        int userMenuChoice = mainLoop(scnr);
        while (userMenuChoice != 5) {
            if (userMenuChoice == 1) {
                newTriangle(scnr, shapeArray);
            }
            else if (userMenuChoice == 2) {
                newCircle(scnr, shapeArray);
            }
            else if (userMenuChoice == 3) {
                newRectangle(scnr, shapeArray);
            }
            else if (userMenuChoice == 4) {
                for (int i = 0; i < shapeArray.size(); ++i) {
                    System.out.println(shapeArray.get(i).toString());
                }
            }
            userMenuChoice = mainLoop(scnr);
        }
        System.out.println("Goodbye!");
    }
}
