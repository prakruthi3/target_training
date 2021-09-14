package com.target.assignment.day2.assign;

import com.target.assignment.day2.model.Circle2;
import com.target.assignment.day2.model.Rectangle;
import com.target.assignment.day2.model.Shape;
import com.target.assignment.day2.model.Square;

public class program14 {
    public program14() {
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Circle2("blue", true, 10.0D), new Circle2(10.0D), new Circle2(), new Rectangle(2.0D, 2.0D, "green", false), new Rectangle(4.0D, 5.0D), new Rectangle(), new Square(5.0D, "green", false), new Square(10.0D), new Rectangle(), new Shape()};
        Shape[] var2 = shapes;
        int var3 = shapes.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Shape shape = var2[var4];
            System.out.println(shape);
        }

    }
}
