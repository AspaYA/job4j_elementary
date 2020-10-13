package ru.job4j.converter;

public class Converter {
public static void main(String[] args) {
    int sumToConvertEuro = 100;
    int euro = Converter.rubleToEuro(sumToConvertEuro);
    System.out.println(sumToConvertEuro + " rubles are " + euro + " euro.");

    int sumToConvertDoolar = 600;
    int dollar = Converter.rubleToDollar(sumToConvertDoolar);
    System.out.println(sumToConvertDoolar + " rubles are " + dollar + " dollar.");

    //test
    int expectedEuro = 1;
    int expectedDollar = 10;
    boolean passedEuro = expectedEuro == euro;
    boolean passedDollar = expectedDollar == dollar;
    System.out.println(sumToConvertEuro + " rubles are " + euro + " euro." + "; Test result: " + passedEuro);
    System.out.println(sumToConvertDoolar + " rubles are " + dollar + " dollar." + "; Test result: " + passedDollar);
}

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

}
