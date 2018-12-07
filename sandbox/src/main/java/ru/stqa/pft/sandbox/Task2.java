package ru.stqa.pft.sandbox;

public class Task2 {
    public static void main(String[] args) {
// Создание объектов Point
        Point p1 = new Point(2,3);

        Point p2 = new Point (4,5);

       System.out.println("Расстояние между точками R (" + p1.x + ";" + p1.y + ") и Т (" + p2.x + ";" + p2.y + ") равно " + p1.distance(4, 5));

    }

}

