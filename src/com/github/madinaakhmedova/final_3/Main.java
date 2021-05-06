package com.github.madinaakhmedova.final_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество строк:");
        String v = scanner.nextLine();
        int lineCount = Integer.parseInt(v);

        String[] values = new String[lineCount];
        for (int i = 0; i < lineCount; i++) {
            System.out.printf("Строка %d:", i);
            values[i] = scanner.nextLine();
        }


        System.out.printf("Ответ: %s", solution(values));
    }

    public static String solution(String[] values) {
        int maxUniqs = 0;
        int maxIdx = 0;
        for (int i = 0; i < values.length; i++) {
            int uniq = uniqueCharCount(values[i]);
            if (maxUniqs < uniq) {
                maxUniqs = uniq;
                maxIdx = i;
            }
        }

        return values[maxIdx];
    }

    public static int uniqueCharCount(String value) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < value.length(); i++){
            char current = value.charAt(i);
            if (temp.toString().indexOf(current) < 0){
                temp.append(current);
            }
        }
        return temp.length();
    }
}
