package ru.stqa.pft.sandbox;

public class Task2 {
    public static void main(String[] args) {
// Создание объектов Point
        Point p = new Point(2,3,4, 6);

       System.out.println("Расстояние между точками R (" + p.x + ";" + p.y + ") и Т (" + p.ax + ";" + p.ay + ") равно " + (p.distance()));

    }

}

