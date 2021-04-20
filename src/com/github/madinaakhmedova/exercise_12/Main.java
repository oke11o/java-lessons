package com.github.madinaakhmedova.exercise_12;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку (например, I like Java!!!)");
        String vStr = scanner.nextLine();

        boolean contains = vStr.contains("Java");
        boolean startsWith = vStr.startsWith("I like");
        boolean endsWith = vStr.endsWith("!!!");
        System.out.printf("Содержит ли строка подстроку \"Java\": %b\n", contains);
        System.out.printf("Строка начинается с \"I like\": %b\n", startsWith);
        System.out.printf("Строка кончается на \"!!!\": %b\n", endsWith);

        if (contains && startsWith && endsWith) {
            System.out.printf("Строка в верхнем регистре: %s\n", vStr.toUpperCase());
        }

        System.out.println(vStr.replaceAll("a", "o"));
    }
}
