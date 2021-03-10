package CarPackage;

import java.awt.*;

public class Vehicle {

   private String brand;
   private Color color;
   private double currentSpeed;
   private int currentGear;
   private double maxSpeed;
   final int nrOfWheels = 4;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void accelerate(double speed){
        this.currentSpeed += speed;
    }

    public void decelerate(double speed){
        this.currentSpeed -= speed;
    }

    public void changeGears(int gear){
        this.currentGear = gear;
    }

    public void stopCar(){
        this.currentGear = 0;
        this.currentSpeed = 0.0;
    }

    //we overload method stopCar:
    public void stopCar(int setGear){
        this.currentGear = setGear;
        this.currentSpeed = 0.0;
    }


    public Vehicle(){
        this.brand = "Land Rover";
        this.color = Color.blue;
        this.currentSpeed = 56.8;
        this.currentGear = 2;
        this.maxSpeed = 197.4;
    }

    public Vehicle(String brand, Color color, double speed, int gear, double maxspeed){
        this.brand = brand;
        this.color = color;
        this.currentSpeed = speed;
        this.currentGear = gear;
        this.maxSpeed = maxspeed;
    }

    public void displayVehicle(){
        System.out.println(this.brand);
        System.out.println(this.color);
        System.out.println(this.currentSpeed);
        System.out.println(this.currentGear);
        System.out.println(this.maxSpeed);
    }
}
