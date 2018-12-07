package ru.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;


    public Point (double x,double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt((x * x - this.x * this.x) + ( y * y - this.y * this.y));
    }
 }
