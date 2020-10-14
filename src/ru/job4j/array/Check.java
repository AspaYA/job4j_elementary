package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] arr) {
        boolean rst = true;
        boolean base = arr[0];
        for (boolean el: arr) {
            if (el != base) {
                rst = false;
                break;
            }
        }
        return rst;
    }
}
