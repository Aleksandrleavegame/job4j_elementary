package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int result = Max.max(10, 20);
        System.out.println(result);
        result = Max.max(50, 3);
        System.out.println(result);
        result = Max.max(11, 11);
        System.out.println(result);
    }
}