package com.target.assignment.day2.model;

public class Circle {
    private double radius = 1.0D;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        double var10000 = this.radius;
        return "Circle{radius=" + var10000 + ", color='" + this.color + "'Area: " + this.getArea() + "}";
    }

    public double getArea() {
        return 3.14D * this.radius * this.radius;
    }
}
