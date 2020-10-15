package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rst = true;
        for (char el: board[row]) {
            if (el != 'X') {
                rst = false;
                break;
            }
        }
        return rst;
    }
}
