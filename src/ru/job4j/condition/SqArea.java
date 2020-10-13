package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        int l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        int p = 6;
        int k = 2;
        System.out.println("p = " + p + ", k = " + k + "; result: " + SqArea.square(p, k));

        p = 8;
        k = 3;
        System.out.println("p = " + p + ", k = " + k + "; result: " + SqArea.square(p, k));

        p = 9;
        k = 4;
        System.out.println("p = " + p + ", k = " + k + "; result: " + SqArea.square(p, k));

        p = 10;
        k = 5;
        System.out.println("p = " + p + ", k = " + k + "; result: " + SqArea.square(p, k));
    }
}
