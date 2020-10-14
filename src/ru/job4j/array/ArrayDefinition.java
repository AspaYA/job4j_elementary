package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("size array: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("size array: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("size array: " + prices.length);

        String[] names = new String[5];
        names[0] = "zero";
        names[1] = "one";
        names[2] = "two";
        names[3] = "three";
        names[4] = "four";

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
    }
}
