package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args){
        int one= 1;
        int two= 2;
        int six= 6;
        int four= 4;
        int five= 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        int age = 18; /* создаем переменную. */
        System.out.println(age);
        age = 19; /* присваиваем новое значение. */
        System.out.println(age);

        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println(size);

        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);

        String name = "Petr Arsentev";
        Calculator.hello(name);
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }



}
