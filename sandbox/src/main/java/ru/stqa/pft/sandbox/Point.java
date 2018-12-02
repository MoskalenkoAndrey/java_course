package ru.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;
    public double ax;
    public double ay;

    public Point (double x,double y,double ax,double ay) {
        this.x = x;
        this.y = y;
        this.ax = ax;
        this.ay = ay;

    }
    public double distance() {
        return Math.sqrt((this.ax * this.ax - this.x * this.x) + (this.ay * this.ay - this.y * this.ay));
    }
 }
