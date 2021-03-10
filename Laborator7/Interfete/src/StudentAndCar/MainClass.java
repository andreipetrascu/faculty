package StudentAndCar;

import java.awt.*;

public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Toyota", Color.yellow);
        Student student = new Student("Charles", "Wesley", car);

        System.out.println(student.toString());
        System.out.println(car.toString());

        //shallow copy
       /* Student student1 = (Student) student.clone();
        car.setColor(Color.red);
        System.out.println(student1.toString());*/

       //deep copy
        Student cloned = (Student) student.clone();
        car.setColor(Color.black);
        System.out.println(cloned.toString());

         /*System.out.println(student != student1);
        System.out.println(student.getClass() == student1.getClass());
        System.out.println(student.equals(student1));*/
    }
}
