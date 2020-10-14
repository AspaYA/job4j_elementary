package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
//        char cell = ' ';
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                char cell = ((i + j) % 2 == 0) ? 'X' : ' ';
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("board: 5x4");
        paint(5, 4);
        System.out.println("board: 3x3");
        paint(3, 3);
        System.out.println("board: 4x4");
        paint(4, 4);
    }
}
