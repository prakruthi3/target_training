package com.target.assignment.day2.model;

public class Cylinder extends Circle {
    private double height = 1.0D;

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.setHeight(height);
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.setHeight(height);
    }

    public double getVolume() {
        double radius = super.getRadius();
        return 3.14D * radius * radius * this.height;
    }
}
