package StudentAndCar;

import java.awt.Color;
import java.lang.Cloneable;

public class Car implements Cloneable {
    private String brand;
    private Color color;

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

    public Car(String brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    public String toString() {
        return this.brand + " " + this.color;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
