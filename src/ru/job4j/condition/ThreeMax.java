package ru.job4j.condition;

public class ThreeMax {
    public static int max(int x1, int x2, int x3) {
        int result = x1;
        if (x2 >= x1 && x2 >= x3) {
            result = x2;
        }
        if (x3 >= x1 && x3 >= x2) {
            result = x3;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(4, 2, 3));
        System.out.println(max(1, 4, 3));
        System.out.println(max(1, 2, 4));
    }
}
