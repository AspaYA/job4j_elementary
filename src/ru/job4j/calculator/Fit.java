package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        //Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        //Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {

        short height = 187;
        double pipleWeight = Fit.manWeight(height);
        System.out.println("Man " + height + " is " + String.format("%.2f", pipleWeight) + " kg");

        height = 170;
        pipleWeight = Fit.manWeight(height);
        System.out.println("Man " + height + " is " + String.format("%.2f", pipleWeight) + " kg");

        height = 165;
        pipleWeight = Fit.womanWeight(height);
        System.out.println("woman " + height + " is " + String.format("%.2f", pipleWeight) + " kg");
    }
}
