package CarPackage;

import java.awt.*;
import java.util.Date;

import static java.awt.Color.green;

public class MainClass {

    public static void main(String[] args){

        Vehicle v1 = new Vehicle();

        v1.accelerate(4.4);
        v1.changeGears(3);
        v1.stopCar();

        System.out.println(v1.getCurrentGear());

        Vehicle v2 = new Vehicle("Audi", green, 103.6, 3, 203.5 );
        v2.stopCar(3);

        System.out.println(v2.getCurrentGear());

        Driver d1 = new Driver();
        Driver d2 = new Driver("Matthew", "Petrascu", 23, 34102);

        d2.buyCar();
        d2.displayDriver();

        CarInfo a = new CarInfo();
        a.showCarInfo();

       // Date date = new Date();
        //System.out.println(date.toString());
    }
}
