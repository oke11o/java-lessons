package com.github.madinaakhmedova.final_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Курс доллара (например 67,55):");
        Double rate = scanner.nextDouble();

        System.out.print("Количество рублей (можно не целое):");
        Double count = scanner.nextDouble();

        System.out.printf("Итого: %.2f", rate * count);
    }
}
