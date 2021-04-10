package com.github.madinaakhmedova.exercise_6;

import java.util.Scanner;

public class Main {

    static float mileRatio = 0.0006F;
    static float yardRatio = 1.094F;
    static float footRatio = 3.281F;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        byte t = scanner.nextByte();

        switch (t) {
            case 1:
                weight(scanner);
                break;
            case 2:
                length(scanner);
                break;
            default:
                System.out.println("Вы ввели неизвестный оператор");
        }
    }

    public static void weight(Scanner scanner) {
        System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - стоун");
        byte currentType = scanner.nextByte();
        if (currentType < 1 || currentType > 3) {
            System.out.println("Вы ввели неизвестный оператор");
            return;
        }
        System.out.println("Введите число");
        float val = scanner.nextFloat();
        if (val == 0.0) {
            System.out.println("Число должно отличаться от 0,0");
            return;
        }

        switch (currentType) {
            case 1:
                System.out.printf("Килограммы: %f\n", val);
                System.out.printf("Фунт: %f\n", val * 0.4536);
                System.out.printf("Стоун: %f\n", val * 6.350);
                break;
            case 2:
                System.out.printf("Килограммы: %f\n", val / 0.4536);
                System.out.printf("Фунт: %f\n", val);
                System.out.printf("Стоун: %f\n", val * 6.350 / 0.4536);
                break;
            case 3:
                System.out.printf("Килограммы: %f\n", val / 6.350);
                System.out.printf("Фунт: %f\n", val * 0.4536 / 6.350);
                System.out.printf("Стоун: %f\n", val);
                break;
        }

    }

    public static void length(Scanner scanner) {
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        byte currentType = scanner.nextByte();
        if (currentType < 1 || currentType > 4) {
            System.out.println("Вы ввели неизвестный оператор");
            return;
        }
        System.out.println("Введите число");
        float val = scanner.nextFloat();
        if (val == 0.0) {
            System.out.println("Число должно отличаться от 0,0");
            return;
        }


        float[] result = new float[4];
        //Приведем к метру
        float base = val;
        if (currentType != 1) {
            switch (currentType) {
                case 2:
                    base = val / mileRatio;
                    result[1] = val;
                    break;
                case 3:
                    base = val / yardRatio;
                    result[2] = val;
                    break;
                case 4:
                    base = val / footRatio;
                    result[3] = val;
                    break;
            }
        }
        result[0] = base;
        if (result[1] == 0.0) {
            result[1] = base * mileRatio;
        }
        if (result[2] == 0.0) {
            result[2] = base * yardRatio;
        }
        if (result[3] == 0.0) {
            result[3] = base * footRatio;
        }

        System.out.printf("Метры: %f\n", result[0]);
        System.out.printf("Мили: %f\n", result[1]);
        System.out.printf("Ярды: %f\n", result[2]);
        System.out.printf("Футы: %f\n", result[3]);
    }
}
