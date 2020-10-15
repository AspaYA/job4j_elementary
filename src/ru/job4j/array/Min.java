package ru.job4j.array;

public class Min {

    public static int findMin(int[] arr) {
        int rst = arr[0];
        for (int el: arr) {
            rst = Math.min(rst, el);
        }
        return rst;
    }
}
