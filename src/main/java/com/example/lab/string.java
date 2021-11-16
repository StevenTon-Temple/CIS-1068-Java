package com.example.lab;

public class string {
    public static void main(String[] args) {
        System.out.println(isPunct('!'));
        System.out.println(numPunct("hi! or car !!!"));
        System.out.println(numPunct("hi! or car !!!", 5));
        System.out.println(indexOfFirstPunct("hi! or car !!!", 5));
        System.out.println(indexOfFirstPunct("hi or car !!!!"));
        System.out.println(indexOfLastPunct("hi! or car !!!!"));
    }

    public static boolean isPunct(char c) {
        char[] puncuation = {'\'', ',', '.', ';', ':', '!', '?'};
        for (int i = 0; i < puncuation.length; i++) {
            if (c == puncuation[i]) {
                return true;
            }
        }
        return false;
    }

    public static int numPunct(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isPunct(s.charAt(i)) == true) {
                count++;
            }
        }
        return count;
    }

    public static int numPunct(String s, int startIndex) {
        int count = 0;
        for (int i = startIndex; i < s.length(); i++) {
            if (isPunct(s.charAt(i)) == true) {
                count++;
            }
        }
        return count;
    }
    public static int indexOfFirstPunct(String s, int startPosition) {
        int count = 0;
        for (int i = startPosition; i < s.length(); i++) {
            if (isPunct(s.charAt(i)) == true) {
                count += i;
                return count;
            }
        }
        return -1;
    }

    public static int indexOfFirstPunct(String s) {

        return indexOfFirstPunct(s,0);
    }
    /*
     * returns the index of the last occurrence of a punctuation
     * mark in s or -1 if s contains no punctuation
     *
     * When implementing this function, call your isPunct( ) method.
     * Do not simply copy and paste the body of isPunct( ) into this method.
     */
    public static int indexOfLastPunct(String s) {
        int count = 0;
        for (int i = s.length(); i > 0; i--) {
            if (isPunct(s.charAt(i)) == true) {
                count += i;
                return count;
            }
        }
        return -1;
    }
    }