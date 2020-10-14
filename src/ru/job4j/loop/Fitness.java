package ru.job4j.loop;

public class Fitness {
    public static int calc(int user1, int user2) {
        int user1Factor = 3;
        int user2Factor = 2;
        int count = 0;
        while (user1 <= user2) {
            count++;
            user1 *= user1Factor;
            user2 *= user2Factor;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(calc(90, 95));
        System.out.println(calc(90, 90));
    }
}
