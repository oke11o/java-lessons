package com.github.madinaakhmedova.exercise_3;

public class Main {
    public static void main(String[] args) {
        // Exercise 3
        int[] ar = {1, 2, 3, 4, 5};
        int v = ar[0];
        ar[0] = ar[4];
        ar[4] = v;
        System.out.println(ar[0] + ar[4]);
    }
}
