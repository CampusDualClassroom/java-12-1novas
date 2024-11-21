package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.isTachometerEqualToZero());
        car.start();
        System.out.println(car.isTachometerEqualToZero());
        car.stop();
        car.isTachometerEqualToZero();
        car.start();
        car.accelerate();
        car.stop();
        car.start();
        car.speedometer = 119;
        car.accelerate();
        System.out.println(car.speedometer);
        car.speedometer = 0;
        car.brake();
        System.out.println(car.speedometer);
        car.turnAngleOfWheels(20);
        car.turnAngleOfWheels(-46);
        car.stop();
        car.speedometer = 0;
        car.stop();
        car.setReverse(true);
        car.start();
        car.accelerate();
        car.setReverse(true);
    }

}