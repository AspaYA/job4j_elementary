package ru.job4j.converter;

public class Converter {
public static void main(String[] args){
    int sumToConvert = 100;
    int euro = Converter.rubleToEuro(sumToConvert);
    System.out.println(sumToConvert+ " rubles are " + euro + " euro.");
    sumToConvert = 600;
    int dollar = Converter.rubleToDollar(sumToConvert);
    System.out.println( sumToConvert + " rubles are " + dollar + " dollar.");
}

    public static int rubleToEuro(int value){
        return value / 70;
    }

    public static int rubleToDollar(int value){
        return value / 60;
    }

}
