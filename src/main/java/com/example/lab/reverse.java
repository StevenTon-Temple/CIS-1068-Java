package com.example.lab;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] A = { 10, 20, 30, 40, 50 };
        reverse(A);
    }
        public static String reverse(int A[]) {

        for(int i=A.length-1;i>=0;i--) {


            System.out.println(A[A.length - i - 1] = A[i]);
        }String T = Arrays.toString(A);
            System.out.println(T);

        return T;
    }
}
