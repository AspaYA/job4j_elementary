package ru.job4j.condition;

public class MiltiMaxTest {
    public static int max(int x1, int x2, int x3) {
        int max = x1 > x2 ? x1 : x2;
        return max > x3 ? max : x3;
    }

    public static void main(String[] args) {
        System.out.println(max(5, 2, 3));
        System.out.println(max(1, 4, 3));
        System.out.println(max(1, 2, 3));
        System.out.println(max(2, 2, 2));
    }
}
