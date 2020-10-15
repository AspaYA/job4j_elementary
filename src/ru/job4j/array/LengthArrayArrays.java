package ru.job4j.array;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {1, 2, 3},
                {1, 2},
                {1},
                {}
        };

        for (int[] arr1: arr) {
            System.out.println(arr1.length);
        }
    }
}
