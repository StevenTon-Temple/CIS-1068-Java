package com.example.lab;


import java.util.Arrays;

public class Arraysmidterm2 {
    public static void main(String[] args) {
        int passing = 73;
        ///System.out.println(passingscores(passing));
        int[] A = {11, 20, 10};
        int[] B = {11, 20, 10};
        int[][] g = {{1, 0, 12, 13},
                {7, -3, 2, 5},
                {-5, -2, 29, 20}
        };
        //System.out.println(samereverse(A));
        ///System.out.println(same(A,B));
        ///System.out.println(copy(A));
        ///System.out.println(copyN(A,0));
        ///System.out.println(slice(A,1,3));
        ///System.out.println(num(A, 20));
        ///System.out.println(largest2darray(g));
        ///System.out.println(array2d(g,10));
        System.out.println(generateTrianglenumber(1));

    }


    ///Write a method which is passed A[], which is an array of int, and an int passingScore.
//The method returns the number of items in A[] which are greater than or equal to passingScore.
    public static int passingscores(int passing) {
        int[] A = {10, 20, 30, 40, 50, 60, 70, 80, 85, 88, 89, 90, 95};
        int passingscorecount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= passing) {
                passingscorecount++;

            }
        }
        return passingscorecount;
    }

    ///Write a method which is passed an array of int A[].
    // The method returns true if A[] is the same backwards and forwards.
    public static boolean samereverse(int A[]) {
        int b[] = new int[A.length];
        int count = 0;
        boolean a = true;
        for (int i = 0; i < A.length; i++) {
            int reverse = A[i];
            b[i] = A[A.length - 1 - i];
            b[A.length - 1 - i] = reverse;
        }
        for (int i = 0; i < A.length; i++) {
            if (b[i] == A[i]) {
                count++;

            }
            if (count == A.length) {
                a = true;
            } else {
                a = false;
            }

        }

        return a;
    }

    ///Write a method same( ), which is passed two arrays of int.
    // The method returns true if the two arrays contain exactly the same contents.
    public static boolean same(int A[], int[] B) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) {
                ;

            } else if ((A[i] != B[i])) {
                return false;
            }
        }
        return true;
    }

    ///Write a method called copy, which is passed A[], which is an array of int.
    // The method returns a new array consisting of exactly the same items in A[].
    public static int[] copy(int A[]) {
        int b[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            b[i] = A[i];
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(b));
        return b;
    }

    ///Write a method called copy, which is passed A[], which is an array of int, and an integer n.
    // The method returns a new array consisting of the first n items in A[].
    public static int[] copyN(int A[], int n) {
        int t = n - A.length;
        if (n <= 0) {
            return null;
        }
        int[] B = new int[n];
        if (n < A.length) {
            for (int i = 0; i < n; i++) {
                B[i] = A[i];
            }
        }
        if (n > A.length) {
            for (int j = 0; j < A.length; j++) {
                B[j] = A[j];


            }
        }
        System.out.println(Arrays.toString(B));
        return B;
    }

    ///Write a method called slice, which is passed A[], which is an array of int, an integer i and an integer j.
    // The method returns a new array consisting of all of the items in A from A[i] to A[j] inclusive.
    public static int[] slice(int[] A, int i, int j) {
        if (i < 0 || j <= 0 || j > A.length) {
            return null;
        }
        int b[] = new int[j - i];
        for (int a = i; a < j; a++) {
            b[a] = A[a];
        }
        System.out.println(Arrays.toString(b));
        return b;
    }

    ///Write a method called copy, which is passed A[], which is an array of int, and an integer n.
    // The method returns a new array consisting of all of the items in A[] which are greater or equal to n.
    public static int[] num(int[] A, int n) {

        int length = A.length;
        for (int i = 0; i < length; i++) {
            if (A[i] >= n) {
                A[i] = A[i];


            }

        }
        int b[] = new int[length];
        for (int i = 0; i < length; i++) {
            b[i] = A[i];


        }
        System.out.println(Arrays.toString(b));

        return b;
    }
    ////* sets every value in A[][] to initVal */
    //public static void initialize(int A[][], int initVal)
    public static int[][] array2d(int A[][],int initVal){
        for (int i = 0; i < A.length;i++) {
            for(int j=0;j<A[i].length;j++){
                A[i][j] = initVal;
            }
        }System.out.println(Arrays.deepToString(A));
        return A;

    }

    ////* returns the largest element in A */
    //public static int largestItem(int A[][])
    //print this out!!!!!!
    public static int largest2darray(int A[][]) {
        int largest;
        int largestnum =0;
        for (int i = 0; i < A.length;i++) {
            largest = A[i][0];
            for (int j=0;j < A[i].length;j++){
                if(largest<A[i][j]){
                    largest=A[i][j];
                    largestnum = largest;
                }

            }

        }

        return largestnum;
    }
    ///Write a method called generateTriangleNumbers().
    // This method will take in an integer x and will return an array of integers containing the first x triangle numbers.
    // The nth triangle number is the sum of 1 + 2 + 3 + 4...(n − 1) + n.
    public static int[] generateTrianglenumber(int x){
        int A[] = new int[x];
        for(int i = 0; i< A.length; i++){
            A[i] = gettrianglenumber(i);
        } System.out.println(Arrays.toString(A));
        return A;
    }
    public static int gettrianglenumber(int x){
        int sum = 1;
        for(int i = 0; i<x; i++){
            sum += i+1+1;
        }
        return sum;
    }
}

