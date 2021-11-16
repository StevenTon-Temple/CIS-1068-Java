package com.example.lab;

public class Car {
    String make;
    String model;
    int year;
    Double mpg;
    private int milesDriven;
    double fuelCapacity;
    double fuelRemaining;
    double getFuelRemaining;




    public Car(String initMake, String initModel, int initYear, Double initMpg, int initMilesDriven, int initFuelCapacity, int initFuelRemaining) {
        make = initMake;
        model = initModel;
        year = initYear;
        mpg = initMpg;
        milesDriven = initMilesDriven;
        fuelCapacity = initFuelCapacity;
        fuelRemaining = initFuelRemaining;
    }

    public double fillTank(double g) {

        if (g <= fuelCapacity && g>=0) {
            fuelRemaining += g;
        }else if (g >= fuelCapacity){
            double r = fuelCapacity-fuelRemaining;
            g = r;
            return fuelRemaining += g;
        }
        return fuelRemaining;
    }
        public double drive ( double m){
            milesDriven += m;
            if (m > mpg) {
                double r = m / mpg;
                fuelRemaining -= 1 * r;
            }else  if (m<0) {
                System.out.println("cannot put negative number into drive");
            }else{
                double r = m/mpg;
               fuelRemaining -= r;

            }

            fuelRemaining = Math.round(fuelRemaining*100.0)/100.0;
            return fuelRemaining;

        }
        public double getFuelRemaining () {
            return getFuelRemaining = fuelRemaining;
        }
        public String toString () {
            return make + ", " + model + ", " + year + ", " + mpg + ", " + milesDriven + ", " + fuelCapacity + ", " + fuelRemaining;
        }
    }


