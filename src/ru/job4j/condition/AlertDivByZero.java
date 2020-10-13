package ru.job4j.condition;

public class AlertDivByZero {

    @SuppressWarnings("checkstyle:RightCurly")
    public static void possibleDev(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        } else if (number == 0) {
            System.out.println("Could not div by 0.");
        } else {
            System.out.println("It's good");
        }
    }

    public static void main(String[] args) {
        int number = 4;
        possibleDev(number);

        number = 10;
        possibleDev(number);

        number = 0;
        possibleDev(number);

        number = -12;
        possibleDev(number);
    }
}
