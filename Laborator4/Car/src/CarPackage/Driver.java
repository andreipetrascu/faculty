package CarPackage;

import java.awt.*;

import static java.awt.Color.white;

public class Driver {

    private String firstName;
    private String lastName;
    private int age;
    private int drivingLicenseNumber;
    private Vehicle myCar;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setDrivingLicenseNumber(int drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public Driver(){
        this.firstName = "John";
        this.lastName = "Newton";
        this.age = 56;
        this.drivingLicenseNumber = 35901;
    }

    public Driver(String firstName, String lastName, int age, int drivingLicenseNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public void displayDriver(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(drivingLicenseNumber);
        this.myCar.displayVehicle();
    }

    public void buyCar(){
        this.myCar = new Vehicle("Toyota", white, 30.5, 4, 250.7);
    }
}
