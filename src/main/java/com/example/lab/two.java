package com.example.lab;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        twoConsecutive();
    }

    public static void twoConsecutive() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if(Math.abs( y-x)==1 ||Math.abs( z-y)==1 ||Math.abs( z-x)==1){
            System.out.print("consecutive");
        }else System.out.print("not consecutive");
    }
}




