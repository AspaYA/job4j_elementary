package ru.job4j.sort;

import ru.job4j.array.Turn;

import java.util.Arrays;

public class Machine {

    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int ch = (money - price);
        while (ch > 0) {
            for (int coin: coins) {
                if (ch - coin >= 0) {
                    rsl[size] = coin;
                    ch = ch - coin;
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
