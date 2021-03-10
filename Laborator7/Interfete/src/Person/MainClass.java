package Person;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Person("Janny", "Smith", 23);
        people[1] = new Person("Mark", "Twain", 89);
        people[2] = new Person("Peter", "Melley", 51);
        people[3] = new Person("Emily", "Anderson", 4);

        System.out.println("Unsorted: " + Arrays.asList(people));
        Arrays.sort(people);
        System.out.println("Sorted: " + Arrays.asList(people));

    }
}
