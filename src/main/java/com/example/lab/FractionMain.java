package com.example.lab;

public class FractionMain {
    public static void main(String[] args) {
        Fraction number = new Fraction(2,4);
        number.setNum(2);
        number.setDenom(10);
        System.out.println(number.add(new Fraction(1,3)));
        System.out.println(number.equals(new Fraction(1,1)));
        System.out.println(number);


    }

}
