package com.example.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

///print out!!!
public class midterm2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner txtlocation = new Scanner(System.in);
        String c = txtlocation.nextLine();
        File a = new File("C:\\Users\\steve\\Downloads\\" + c);
        Scanner input = new Scanner(a);
        //System.out.println(numsting(input, a));
        System.out.println(word(input, a));


    }

    ///Write a method which is passed the name of a text file.
    // The method returns the number of characters found in the file.
    // You are not required to handle FileNotFoundException.
    public static int numsting(Scanner input, File a) {
        int total = 0;
        while (input.hasNextLine()) {
            String b = input.nextLine();
            if (b.matches(".*[a-z].*")) {
                total += b.length();


            }
        }

        return total;
    }

    ///Write a method which is passed the name of a text file. The method returns the number of words found in the file.
    public static int word(Scanner input, File a) {
        int total = 0;
        String[] s =null;
        while (input.hasNextLine()) {
            String b = input.nextLine();
            if (b.matches(".*[a-z].*")) {
                 s = b.split(" ");
                 total+=s.length;
            }

        }
        return total;
    }
}