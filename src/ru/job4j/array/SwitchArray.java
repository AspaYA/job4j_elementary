package ru.job4j.array;

public class SwitchArray {
    public static int[] swapBorder(int[] array) {
        int tmp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = tmp;
        return array;
    }

    public static int[] swap(int[] array, int source, int dest) {
        int tmp = array[source];
        array[source] = array[dest];
        array[dest] = tmp;
        return array;
    }

    public static String[] swap(String[] array, int source, int dest) {
        String tmp = array[source];
        array[source] = array[dest];
        array[dest] = tmp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = swapBorder(new int[]{1, 2, 3, 4, 5, 6});
        for (int num: nums) {
            System.out.println(num);
        }
    }
}
