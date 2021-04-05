package com.github.madinaakhmedova.exercise_3;

public class Main {
    public static void main(String[] args) {
        // Exercise 3
        int[] ar = {1, 2, 3, 4, 5};

        int firstVal = ar[0];
        int lastIdx = ar.length - 1;
        ar[0] = ar[lastIdx];
        ar[lastIdx] = firstVal;

        int middleIdx = lastIdx/2;
        System.out.println(ar[0] + ar[middleIdx]);
    }
}
