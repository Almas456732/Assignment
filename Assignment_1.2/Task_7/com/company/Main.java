package com.company;
import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
public class Main {
    public static void main(String[] args){
        Driver driver = new Driver("John Doe", 10);
        Engine motor = new Engine(200, "Ford");
        Car obj1=new Car("Mustang" , "S class",1200,driver,motor);
        obj1.start();
        obj1.stop();
        obj1.turnLeft();
        obj1.turnRight();
        System.out.println(obj1.toString());
    }

}

