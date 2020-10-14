package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int n) {
        boolean res = (n > 1); // ? true : false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
    public static int calc(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (!check(i)) {
                continue;
            }
            res++;
        }
        return res;
    }
}
