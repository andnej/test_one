package com.ptbc.test;

public class TestOne {
    private static String SPACE = "  ";
    private static String STAR = " #";

    public static void main(String[] args) {
        triangle(6);
    }

    private static void triangle(int n) throws IllegalArgumentException {
       if (n <= 0 || n > 100) throw new IllegalArgumentException("N should satisfy 0 < n <= 100");

       for (int i = 0; i <= n; i ++) {
           for(int space = 0; space < (n - i); space++) {
               System.out.print(SPACE);
           }
           for(int star = 0; star < i; star ++) {
               System.out.print(STAR);
           }
           System.out.println();
       }
    }
}
