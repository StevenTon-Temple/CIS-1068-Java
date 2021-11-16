package com.example.lab;


public class CarMain {
    public static void main(String[] args) {

        Car[] Cars = new Car[4];
        Cars[0] = new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8);
        Cars[1] = new Car("Nissan", "Accord", 2003, 14.0, 200000, 10, 4);
        Cars[2] = new Car("Toyota", "86", 2020, 15.0, 60000, 14, 10);
        Cars[3] = new Car("Nissan", "GTR", 2015, 16.0, 112480, 12, 7);
        Cars[1].drive(17);
        Cars[1].fillTank(1);
        System.out.println("Remaining fuel is "+Cars[1].getFuelRemaining()+" gallons");
        System.out.println(Cars[1]);
    }
}
