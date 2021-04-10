package com.github.madinaakhmedova.exercise_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x:");
        float x = scanner.nextFloat();
        System.out.println("Введите число y:");
        float y = scanner.nextFloat();
        System.out.println("Введите оператор (+, -, *, /");
        String operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.printf("Ответ: %f\n", x + y);
                break;
            case "-":
                System.out.printf("Ответ: %f\n", x - y);
                break;
            case "*":
                System.out.printf("Ответ: %f\n", x * y);
                break;
            case "/":
                System.out.printf("Ответ: %f\n", x / y);
                break;
            default:
                System.out.println("Вы ввели неизвестный оператор");
        }
    }
}
