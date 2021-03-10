package StudentAndCar;

import java.lang.Cloneable;

public class Student implements Cloneable {
    private String firstName;
    private String lastName;
    private Car myCar;

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

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }

    public Student(String firstName, String lastName, Car myCar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myCar = myCar;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.myCar;
    }

//    Shallow Copy
    /*protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    //    Deep copy
    protected Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.setMyCar((Car) cloned.getMyCar().clone());
        return cloned;
    }
}
