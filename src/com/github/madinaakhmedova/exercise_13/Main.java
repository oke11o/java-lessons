package com.github.madinaakhmedova.exercise_13;

import java.util.Scanner;

// Не учитываю знаки припинания. Цифры тоже не учитываю. По заданию сказано, только латинские буквы
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, например, I  love   java 8 Я люблю java 14 core1. А я найду все слова латиницей и скажу сколько их");
        String vStr = scanner.nextLine();

        String[] words = vStr.split(" ");
        int count = 0;
        for (String word : words) {
            if (isLatin(word)) {
                System.out.println(word);
                count++;
            }
        }
        System.out.printf("Кол-во слов только на латинице: %d\n", count);
    }

    private static boolean isLatin(String word) {
        if (word.length() == 0) {
            return false;
        }
        for (char ch : word.toCharArray()) {
            ch = Character.toLowerCase(ch);
            int ascii = ch;
            if (ascii < 97 || ascii > 122) {
                return false;
            }
        }
        return true;
    }
}
