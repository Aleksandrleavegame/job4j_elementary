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

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
        in = 240;
        expected = 16800;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("240 euro are 16800. Test result : " + passed);
        in = 450;
        expected = 27000;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("450 dollars are 27000. Test result : " + passed);

        float euroRuble = Converter.rubleToEuro(140);
        float dollarRuble = Converter.rubleToDollar(120);
        float rubleEuro = Converter.euroToRuble(240);
        float rubleDollar = Converter.dollarToRuble(450);
        System.out.println("140 rubles are " + euroRuble + " euro.");
        System.out.println("120 rubles are " + dollarRuble + " dollars");
        System.out.println("240 euro are " + rubleEuro + " rubles");
        System.out.println("450 dollars are " + rubleDollar + " rubles");

    }
}
