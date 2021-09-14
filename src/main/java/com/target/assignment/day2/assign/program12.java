package com.target.assignment.day2.assign;

import com.target.assignment.day2.model.Circle;
import com.target.assignment.day2.model.Cylinder;

public class program12 {
    public program12() {
    }

    public static void main(String[] args) {
        Circle[] circles = new Circle[]{new Cylinder(12.34D), new Cylinder(12.34D, 10.0D), new Cylinder(12.34D, 10.0D, "blue")};
        Circle[] var2 = circles;
        int var3 = circles.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Circle circle = var2[var4];
            System.out.println(circle);
            System.out.println(circle.getArea());
        }

    }
}
