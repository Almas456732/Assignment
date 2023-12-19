package com.company.details;

public class Engine {

    int Power;
    String Manufacturer;

    public Engine(int power, String manufacturer) {
        Power = power;
        Manufacturer = manufacturer;
    }
    @Override
    public String toString() {
        return  Power+ " "+ Manufacturer ;
    }
}
