package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Strat - super mario");
        } else if (name.equals("tanks")) {
            System.out.println("Start - tanks");
        } else if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
