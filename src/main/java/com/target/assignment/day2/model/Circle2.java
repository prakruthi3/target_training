package com.target.assignment.day2.model;

public class Circle2 extends Shape {
    private double radius = 1.0D;

    public Circle2(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle2() {
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14D * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 6.28D * this.radius;
    }

    public String toString() {
        String var10000 = super.toString();
        return "Circle{" + var10000 + "radius=" + this.radius + "Area: " + this.getArea() + ",Perimeter: " + this.getPerimeter() + ",}";
    }
}
