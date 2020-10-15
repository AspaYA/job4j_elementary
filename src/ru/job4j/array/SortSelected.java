package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] arr) {
        // -1 потому что последнее сравнение делать не нужно
        for (int i = 0; i < (arr.length - 1); i++) {
            int min = MinDiapason.findMin(arr, i, arr.length);
            int index = FindLoop.indexOf(arr, min, 0, arr.length);
            SwitchArray.swap(arr, i, index);
        }
        return arr;
    }
}
