package com.example.lab;

import java.util.Scanner;


public class input {
    public static void main(String args[]) {
        Scanner input1 =new Scanner(System.in);
        double x = input1.nextDouble();
        Scanner input2 =new Scanner(System.in);
        double y = input2.nextDouble();
        double result = Math.pow(x,y);
        System.out.println(result);

    }
    }
