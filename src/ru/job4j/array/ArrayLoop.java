package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int n = 0; n < numbers.length; n++) {
            numbers[n] = n * 2 + 3;
        }
        for (int n = 0; n < numbers.length; n++) {
            System.out.println(numbers[n]);
        }

    }
}
