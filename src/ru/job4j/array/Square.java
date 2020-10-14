package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] datas = new int[bound];
        for (int i = 0; i < datas.length; i++) {
            datas[i] = (int) Math.pow(i, 2);
        }
        return datas;
    }

    public static void main(String[] args) {
        int[] datas = calculate(4);
        for (int data: datas) {
            System.out.println(data);
        }

    }
}
