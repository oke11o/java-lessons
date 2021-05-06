package com.github.madinaakhmedova.final_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение из 5 символов:");
        String input = scanner.nextLine();
        if (input.length() != 5) {
            System.out.println("Я работаю только со строкой из 5 символов");
            return;
        }

        char sign = input.charAt(1);
        if (sign != '+' && sign != '-') {
            System.out.println("Я могу решать только простые уравнения со знаками + или -");
            return ;
        }
        int idx = input.indexOf('x');

        int[] values = new int[3];
        for (int i = 0; i < input.length(); i = i + 2) {
            if (i != idx) {
                values[i / 2] = Integer.parseInt(input.substring(i, i + 1));
            }
        }

        int result = solution(sign, idx, values);
        System.out.printf("Ответ: %d", result);
    }

    private static int solution(char sign, int idx, int[] values) {
        if (idx == 4) {
            return calc(values[0], values[1], sign);
        }

        int y = values[0];
        int right = values[2];
        if (idx == 0) {
            y = values[1];
        }

        if (sign == '+') {
            sign = '-';
        } else {
            sign = '+';
        }

        return calc(right, y, sign);
    }

    public static int calc(int x, int y, char sign) {
        switch (sign) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            default:
                System.out.println("Вы ввели неизвестный оператор");
        }
        return 0;
    }
}
