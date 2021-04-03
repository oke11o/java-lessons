package com.github.madinaakhmedova.hello_world;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        System.out.println("Hello world!!!");

        // Exercise 2
        double var1 = 337.32;
        byte var2 = -128;

        // Exercise 3
        int[] ar = {1, 2, 3, 4, 5};
        int v = ar[0];
        ar[0] = ar[4];
        ar[4] = v;
        System.out.println(ar[0] + ar[4]);
    }
}
