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

    public static boolean monoVertical(char[][] board, int column) {
        boolean rst = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                rst = false;
                break;
            }
        }
        return rst;
    }
}