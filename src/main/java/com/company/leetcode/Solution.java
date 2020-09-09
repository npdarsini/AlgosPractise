package com.company.leetcode;

import java.util.Scanner;

class Shape {
    public void drawShape() {
        System.out.println("Drawing a Shape");
    }
}


/*
 * Create the Circle, Square, Rectangle and ShapeFactory class.
 */

class Circle extends Shape {
    public void drawShape() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    public void drawShape() {
        System.out.println("Drawing a Square");
    }
}

class Rectangle extends Shape {
    public void drawShape() {
        System.out.println("Drawing a Rectangle");
    }
}

class ShapeFactory {
    public void drawShape(String shape) {
        if (shape.equals("Circle")) {
            new Circle().drawShape();
        } else if (shape.equals("Square")) {
            new Square().drawShape();
        } else if (shape.equals("Rectangle")) {
            new Rectangle().drawShape();
        } else {
            System.out.println("Drawing " + shape + " is not supported");
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        ((Shape) circle).drawShape();
        ((Shape) square).drawShape();
        ((Shape) rectangle).drawShape();

        System.out.println();

        ShapeFactory factory = new ShapeFactory();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String type = in.next();
            factory.drawShape(type);
        }
    }
}

