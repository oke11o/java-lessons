package com.github.madinaakhmedova.exercise_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        String vStr = scanner.nextLine();
        System.out.println("Введите второе число");
        Integer v2 = scanner.nextInt();

        int v1 = Integer.parseInt(vStr);
        boolean equals = v2.equals(v1);
        System.out.println(equals);
        if (!equals) {
            int v = Math.min(v1, v2);
            System.out.println((float) v);
        } else {
            System.out.println("Числа равны");
        }
    }
}
