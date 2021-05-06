package com.github.madinaakhmedova.exercise_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число (можно с точкой)");
        String sVal = scanner.nextLine();
        System.out.println("Введите второе число (целое");
        int iVal = scanner.nextInt();

        Double val1 = (double) iVal;
        double val2 = Double.parseDouble(sVal);
        boolean equals = val1.equals(val2);
        System.out.println(equals);
        if (!equals) {
            double v = Math.min(val2, iVal);
            System.out.println(v);
        } else {
            System.out.println("Числа равны");
        }
    }
}
