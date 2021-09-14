package com.target.assignment.day2.model;

public class Rectangle extends Shape {
    private double width = 1.0D;
    private double length = 1.0D;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2.0D * (this.length + this.width);
    }

    public String toString() {
        String var10000 = super.toString();
        return "Rectangle{" + var10000 + "width=" + this.width + ", length=" + this.length + "Area: " + this.getArea() + "Perimeter: " + this.getPerimeter() + "}";
    }
}

