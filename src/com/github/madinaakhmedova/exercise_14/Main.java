package com.github.madinaakhmedova.exercise_14;

import java.util.Random;

public class Main {
    static double MAX = 20;
    static double MIN = -20;

    public static void main(String[] args) {
        double min = MAX;
        double max = MIN;

        double[] list = new double[15];
        for (int i = 0; i < list.length; i++) {
            list[i] = random(MIN, MAX);

            if (list[i] < min) {
                min = list[i];
            }
            if (list[i] > max) {
                max = list[i];
            }
        }

        System.out.printf("Максимальный элемент массива: %f\n", max);
        System.out.printf("Минимальные элемент массива: %f\n", min);
        System.out.printf("А если по модулю: то больше: %f\n", maxModulo(min, max));
    }

    public static double random(double min, double max) {
        return (new Random().nextDouble() * (max - min)) + min;
    }

    public static double maxModulo(double min, double max) {
        if (min > 0) {
            return max; //Если минимальное больше 0, то и максимальное больше 0
        }
        min *= -1;
        if (max < 0) {
            max *= -1;
        }

        return Math.max(min, max);
    }
}
