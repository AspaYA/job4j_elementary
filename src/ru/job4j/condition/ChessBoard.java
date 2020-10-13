package ru.job4j.condition;

public class ChessBoard {
    public static byte way(byte x1, byte y1, byte x2, byte y2) {
        byte stepX = (byte) Math.abs(x1 - x2);
        byte stepY = (byte) Math.abs(y1 - y2);
        return (stepX == stepY) ? stepX : 0;

    }

    public static void main(String[] args) {
        System.out.println(way((byte) 3, (byte) 2, (byte) 4, (byte) 6));
        System.out.println(way((byte) 1, (byte) 1, (byte) 2, (byte) 2));
    }
}
