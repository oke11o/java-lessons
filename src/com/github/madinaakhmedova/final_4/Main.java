package com.github.madinaakhmedova.final_4;

import java.util.Scanner;

public class Main {

    static String ANSWER = "заархивированный вирус";
    static String HELP = "подсказка";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте загадку. Вы имеете 3 попытки, а так же на первом шаге 1 подсказку (введите `подсказка`).");
        System.out.println("Загадка:");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает?");

        inCycle(scanner);
//        simple(scanner);
    }

    private static void inCycle(Scanner scanner) {
        for (int i = 0; i < 3; i++) {
            String v = scanner.nextLine();
            if (compare(v, ANSWER)) {
                System.out.println("Правильно!");
                return;
            }
            if (i == 0 && compare(v, HELP)) {
                // Подсказка
                System.out.println("Это что-то из компьютерных программ");
                v = scanner.nextLine();
                if (compare(v, ANSWER)) {
                    System.out.println("Правильно!");
                    return;
                }
            }
            if (i < 2) {
                System.out.println("Подумай еще!");
            }
        }

        System.out.println("Обидно, приходи в другой раз!");
    }

    private static void simple(Scanner scanner) {

        // Попытка 1
        String v = scanner.nextLine();
        if (compare(v, ANSWER)) {
            System.out.println("Правильно!");
            return;
        }
        if (compare(v, HELP)) {
            // Подсказка
            System.out.println("Это что-то из компьютерных программ");
            v = scanner.nextLine();
            if (compare(v, ANSWER)) {
                System.out.println("Правильно!");
                return;
            }
        }
        System.out.println("Подумай еще!");

        // Попытка 2
        v = scanner.nextLine();
        if (compare(v, ANSWER)) {
            System.out.println("Правильно!");
            return;
        }
        System.out.println("Подумай еще!");

        // Попытка 3
        v = scanner.nextLine();
        if (compare(v, ANSWER)) {
            System.out.println("Правильно!");
            return;
        }
        System.out.println("Обидно, приходи в другой раз!");
    }

    public static boolean compare(String value, String base) {
        value = value.trim().toLowerCase();
        base = base.trim().toLowerCase();
        return value.equals(base);
    }
}
