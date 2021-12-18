package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rs1 = value * 70;
        return rs1;
    }

    public static float dollarToRuble(float value) {
        float rs1 = value * 60;
        return rs1;
    }

    public static double dollarToEuro(double value) {
        double rs1 = value * 1.15;
        return rs1;
    }

    public static double euroToDollar(double value) {
        double rs1 = value / 1.15;
        return rs1;
    }

    public static void main(String[] args) {
        float euroRuble = Converter.rubleToEuro(140);
        float dollarRuble = Converter.rubleToDollar(350);
        float rubleEuro = Converter.euroToRuble(240);
        float rubleDollar = Converter.dollarToRuble(450);
        double dollarEuro = Converter.euroToDollar(500);
        double euroDollar = Converter.dollarToEuro(600);
        System.out.println("140 rubles are " + euroRuble + " euro.");
        System.out.println("350 rubles are " + dollarRuble + " dollars");
        System.out.println("240 euro are " + rubleEuro + " rubles");
        System.out.println("450 dollars are " + rubleDollar + " rubles");
        System.out.println("500 euro are " + dollarEuro + " dollars");
        System.out.println("600 dollars are " + euroDollar + " euro");

    }
}
