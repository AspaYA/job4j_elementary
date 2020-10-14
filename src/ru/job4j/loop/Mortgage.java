package ru.job4j.loop;

public class Mortgage {
    //  amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту.
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double actualSum = amount;
        while (true) {
            actualSum = actualSum + (actualSum * percent / 100);
            actualSum = actualSum - salary;
            if (actualSum <= 0) {
                break;
            }
            year++;
        }
        return year;
    }

//    public static void main(String[] args) {
//        System.out.println(year(1000, 1200, 1));
//        System.out.println(year(100, 120, 50));
//    }
}
