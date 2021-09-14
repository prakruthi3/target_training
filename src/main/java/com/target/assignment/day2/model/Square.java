package com.target.assignment.day2.model;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public String toString() {
        String var10000 = super.toString();
        return "Square{" + var10000 + "width" + super.getLength() + ",length" + super.getWidth() + ",Area: " + super.getArea() + "Perimeter: " + super.getPerimeter() + "}";
    }
}

