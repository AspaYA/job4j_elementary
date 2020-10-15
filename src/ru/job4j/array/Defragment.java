package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length  <= (i + cnt)) {
                break;
            }
            if (arr[i] == null) {
                cnt++;
                for (int j = (i + 1); j < arr.length; j++) {
                    if (arr[j] == null) {
                        continue;
                    }
                    SwitchArray.swap(arr, i, j);
                    break;
                }
            }
        }
        return arr;
    }

}
