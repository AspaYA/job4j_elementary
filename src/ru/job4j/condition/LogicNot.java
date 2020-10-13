package ru.job4j.condition;

public class LogicNot {
    // четное
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    // положительное
    public boolean isPositive(int num) {
        return num > 0;
    }

    // нечетное
    public boolean notEven(int num) {
        return !isEven(num);
    }

    // не положительное
    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    // нечетное и положительное
    public boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    // четное или не положительное
    public boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }
}
