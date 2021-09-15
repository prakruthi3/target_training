package com.target.assignment.day3.programs;

import com.target.assignment.day3.model.MovableCircle;
import com.target.assignment.day3.model.MovablePoint;
import com.target.assignment.day3.model.MovableRectangle;
import com.target.assignment.day3.model.Movable;


public class program15 {
    public program15() {
    }

    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        Movable m3 = new MovableRectangle(1, 2, 3, 4, 25, 35);
        System.out.println(m3);
        m3.moveUp();
        System.out.println(m3);
    }
}