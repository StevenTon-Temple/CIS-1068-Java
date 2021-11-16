package com.example.lab;

public class Stringmidterm2 {
    public static void main(String[] args) {
        String A = "Boomba";
        System.out.println(D(A));
        ///System.out.println(novouels(A));

    }

    ///Write a method which is passed a String which returns true if the String contains a double letter or false otherwise.
    public static boolean Double(String A) {
        String s = "";
        for (int i = 0; i < A.length(); i++) {
            if (A.matches(".*[aa-zz].*")) {
                return true;
            } else return false;
        }
        return true;
    }

    ///Write a method which is passed a String s and returns a String that's exactly the same as s, but with no vowels.
    public static String novouels(String A) {
        String c[] = {"a", "e", "i", "o", "u"};
        String B = A;
        for (int i=0; i < c.length; i++){
            B = B.toLowerCase().replace(c[i],"");
        }
        return B;
    }
    public static int D(String A) {
        int numdouble= 0;
        for (int i = 1; i < A.length(); i++) {
            if(A.charAt(i)==A.charAt(i-1)){
                numdouble++;
            }
        }
        return numdouble;
    }
}
