package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            setReverse(false);
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0 && isTachometerGreaterThanZero()) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate() {
        this.speedometer = this.speedometer + 20;
        if (this.speedometer >= MAX_SPEED) {
            this.speedometer = 120;
            System.out.println("Non se pode acelerar máis");
        }
    }

    public void brake() {
        this.speedometer = this.speedometer - 20;
        if (this.speedometer <= 0) {
            this.speedometer = 0;
            System.out.println("Non se pode frenar máis");
        }
    }

    public void turnAngleOfWheels(int angle) {

        this.wheelsAngle = angle;
        if (this.wheelsAngle >= 45) {
            this.wheelsAngle = 45;
            System.out.println("Non se pode xirar tanto o volante");
        }
        else if (this.wheelsAngle <= -45) {
            this.wheelsAngle = -45;
            System.out.println("Non se pode xirar tanto o volante");
        }
    }

    public int showSteeringWheelDetail() {
        return this.wheelsAngle;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (speedometer > 0) {
            System.out.println("Non se pode poñer marcha atrás");
        }
        this.gear = "R";
        this.reverse = reverse;
    }
    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }
    public boolean isTachometerGreaterThanZero(){
        return this.tachometer > 0;
    }
}
