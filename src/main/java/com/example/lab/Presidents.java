package com.example.lab;

public class Presidents {
    public static void main(String args[]) {
        int x = 10, y = 20, z = 30;
        if (x < y) {
            System.out.println("Washington");
        }
        if ((x + y) % 2 == 0) {
            System.out.println("Adams");
        } else if (z - 2 < y + 1) {
            System.out.println("Jefferson");
        } else {
            if (x == 10) {
                System.out.println("Madison");
            }
        }
    }
}
