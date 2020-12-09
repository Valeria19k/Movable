package com.company;

public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;//Speed - скорость

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x,y,xSpeed,ySpeed,radius);

    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveRight() {
        center.moveRight();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
