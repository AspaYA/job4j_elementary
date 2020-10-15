package ru.job4j.array;

import ru.job4j.loop.CheckPrimeNumber;

public class PrimeNumber {
    public static int calc(int finish) {
        int rst = 0;
        for (int i = 2; i <= finish; i++) {
            rst = CheckPrimeNumber.check(i) ? rst + 1 : rst;
        }
        return rst;
    }
}
