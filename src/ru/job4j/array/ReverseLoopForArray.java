package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("---");
        // в задании ни сказано что обходить надо с последнего элемента. но тема звучит: Обход массива с последнего элемента
        // на всякий случай реализцю
        for (int i = 0; i < arr.length; i++) {
            int fakeI = arr.length - 1 - i;
            if (fakeI % 2 == 0) {
                System.out.println(arr[fakeI]);
            }
        }
    }
}
