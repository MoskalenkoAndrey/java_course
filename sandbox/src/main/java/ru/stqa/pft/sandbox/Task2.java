package ru.stqa.pft.sandbox;

public class Task2 {
    public static void main(String[] args) {
// Создание объектов Point
        Point p1 = new Point();
        p1.x = 2;
        p1.y = 3;

        Point p2 = new Point();
        p2.x = 4;
        p2.y = 5;
        System.out.println("Расстояние между точками равно (первая часть задания) = " + (distance(p1, p2)));

    }
    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x * p2.x - p1.x * p1.x) + (p2.y * p2.y - p1.y * p1.y));
            }
}

