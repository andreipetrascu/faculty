package Person;

import java.lang.Comparable;

public class Person implements Comparable {
    private String firstName;
    private String lastName;
    private int age;

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

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return firstName + " " + lastName + " " + age;
    }

//    Sort by firstName
    /*public int compareTo(Object other) {
        Person p = (Person)other;
        return firstName.compareTo(p.firstName);
    }*/

//    Sort by lastName
    /*public int compareTo(Object other) {
        Person p = (Person) other;
        return lastName.compareTo(p.lastName);
    }*/

//    Sort by age
    public int compareTo(Object other) {
        Person p = (Person) other;
        if (age > p.getAge())
            return 1;
        if (age < p.getAge())
            return -1;
        else return 0;
    }
}
