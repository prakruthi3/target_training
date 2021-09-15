package com.target.assignment.day3.model;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString() {
        return "MovableCircle{radius=" + this.radius + ", point=" + this.center + "}";
    }

    public void moveUp() {
        MovablePoint var10000 = this.center;
        var10000.y -= this.center.ySpeed;
    }

    public void moveDown() {
    }

    public void moveRight() {
    }

    public void moveLeft() {
    }
}
