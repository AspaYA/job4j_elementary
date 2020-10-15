package ru.job4j.array;

public class MatrixSum {
    
    public static int sum(int[][] arr) {
        int rst = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                rst = rst + arr[i][j];
            }
        }
        return rst;
    }
}
