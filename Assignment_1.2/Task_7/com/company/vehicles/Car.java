package com.company.vehicles;
import com.company.professions.Driver;
import com.company.details.Engine;
public class Car {
    String car_brand,car_class;
    int weight;
    Driver driver ;
    Engine motor;
    //constructor
    public Car(String car_brand, String car_class, int weight, Driver driver, Engine motor) {
        this.car_brand = car_brand;
        this.car_class = car_class;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }

    public Car() {

    }

    public void start(){
        System.out.println("Let's go");
    }
    public void stop(){
        System.out.println("Let's stop");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }
    public void turnLeft(){
        System.out.println("Turn left");
    }
    @Override
    public String toString() {
        return
                "car_brand='" + car_brand + '\'' +
                ", car_class='" + car_class + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", motor=" + motor
                ;
    }

    class Lorry extends Car{
        int carrying;

        public Lorry(String car_brand, String car_class, int weight, Driver driver, Engine motor, int carrying) {
            super(car_brand, car_class, weight, driver, motor);
            this.carrying = carrying;
        }

        public Lorry() {
        }
    }
    class SportCar extends Car{
        int top_speed;

        public SportCar(String car_brand, String car_class, int weight, Driver driver, Engine motor, int top_speed) {
            super(car_brand, car_class, weight, driver, motor);
            this.top_speed = top_speed;
        }

        public SportCar() {
        }
    }
    public class Main{
        public static void main(String[] args){
            Driver driver = new Driver("Almas", 10);
            Engine motor = new Engine(200, "Ford");
            Car obj1=new Car("Mustang" , "S class",1200,driver,motor);
            obj1.start();
            obj1.stop();
            obj1.turnLeft();
            obj1.turnRight();
            System.out.println(obj1.toString());
        }

    }

}
