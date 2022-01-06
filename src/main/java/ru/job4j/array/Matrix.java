package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] m = new int[size][size];
        for (int row = 0; row < m.length; row++) {
            for (int cell = 0; cell < m[row].length; cell++) {
                m[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return m;
    }
}