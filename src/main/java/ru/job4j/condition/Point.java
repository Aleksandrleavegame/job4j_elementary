package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 2, 3, 4);
        double result3 = Point.distance(31, 24, 56, 99);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (1, 2) to (3, 4) " + result2);
        System.out.println("result (31, 24) to (56, 99) " + result3);
        result1 = Point.distance(11, 22, 33, 44);
        System.out.println("result (11, 22) to (33, 99) " + result1);
        result1 = Point.distance(789, 456, 123, 0);
        System.out.println("result (789, 456) to (123, 0) " + result1);
    }
}
