package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        p = p * (p - 1) * (p - b) * (p - c);
        p = Math.sqrt(p);
        return p;
    }

    public static void main(String[] args) {
        double a = 6;
        double b = 2;
        double c = 2;
        System.out.println("a=" + a + ", b=" + b + ", с=" + c + "; result: " + TrgArea.area(a, b, c));
    }
}
