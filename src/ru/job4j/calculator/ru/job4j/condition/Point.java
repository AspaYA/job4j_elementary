package ru.job4j.calculator.ru.job4j.condition;

public class Point {
    public static void main(String[] args) {
        System.out.println("result:" + Point.distance(180, 0, 2, 0));
        System.out.println("result:" + Point.distance(7, 330, 2, 0));
        System.out.println("result:" + Point.distance(11, 6, 120, 0));
        System.out.println("result:" + Point.distance(13, 99, 2, 0));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        int step1 = x2 - x1;
        int step2 = y2 - y1;
        double step3 = Math.pow(step1, 2);
        double step4 = Math.pow(step2, 2);
        double step5 = step3 + step4;
        double step6 = Math.sqrt(step5);
        return  step6;
    }
}
