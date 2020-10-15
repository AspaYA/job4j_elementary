package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] arr, int start, int finish) {
        int rst = arr[start];
        finish = Math.min(arr.length, (finish + 1));
        for (int i = start; i < finish; i++) {
            rst = Math.min(rst, arr[i]);
        }
        return rst;
    }
}
