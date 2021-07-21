package ru.geekbrains.lesson1.task3;

import ru.geekbrains.lesson1.task1.classbook.Task1ClassBook;

import java.util.logging.Logger;

/**
 * 3. Написать пример кода, который реализует принцип полиморфизма, на примере фигур — круг,
 * квадрат, треугольник.
 */
public class Task3 {
    private static final Logger log = Logger.getLogger(Task1ClassBook.class.getName());

    public static void main(String[] args) {
        Circle circle = new Circle(15.0);
        Square square = new Square(9.4);
        Triangle triangle = new Triangle(20.0, 12.0);

        log.info("Areas of circle= " + circle.area() + ", square= " + square.area() + ", triangle= " + triangle.area());
        //Areas of circle= 353.0, square= 88.36000000000001, triangle= 120.0
    }
}
