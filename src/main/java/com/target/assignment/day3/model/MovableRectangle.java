package com.target.assignment.day3.model;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public void moveUp() {
    }

    public void moveDown() {
    }

    public void moveRight() {
    }

    public void moveLeft() {
    }

    public String toString() {
        return "MovableRectangle{topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + "}";
    }

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
}
