package ru.job4j;

public class Echo {
    public static boolean ecj(int a, int b, int c) {
        boolean rsl = b > c;
        if (a > b) { rsl = a > c;
        }
        if (a > c) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        if (b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

        return true;
    }

    public static void main(String[] args) {
        Echo.ecj( 1, 2, 3);
    }
}

