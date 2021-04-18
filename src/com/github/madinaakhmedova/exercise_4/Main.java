package com.github.madinaakhmedova.exercise_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x:");
        float x = scanner.nextFloat();
        System.out.println("Введите число y:");
        float y = scanner.nextFloat();
        System.out.println("Введите число z:");
        float z = scanner.nextFloat();

        float avg = (x + y + z) / 3;
        System.out.printf("Среднее арифметическое: %f\n", avg);

        int a = (int) (avg / 2);
        if (a > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
