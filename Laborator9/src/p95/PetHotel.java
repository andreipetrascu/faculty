package p95;

import java.util.ArrayList;
import java.util.HashMap;


public class PetHotel {

    public static void main(String[] args) {

        Pet p1 = new Pet("Rocco", 9.45, 3);
        Pet p2 = new Pet("Brody", 23.6, 12);
        Pet p3 = new Pet("Loki", 2.7, 1);
        Pet p4 = new Pet("Hank", 3.9, 2);

        //First time I did with ArrayList
        /*ArrayList<Pet> hotel = new ArrayList<Pet>(4);

        hotel.add(p1);
        hotel.add(p2);
        hotel.add(p3);
        hotel.add(p4);

        for (Pet p : hotel) {
            System.out.println(p.toString());
        }

        System.out.println("\nIs empty ? " + hotel.isEmpty());

        System.out.println("\nRemove pet nr. 1\n");
        hotel.remove(1);

        for (Pet p : hotel) {
            System.out.println(p.toString());
        }

        hotel.clear();

        if (hotel.isEmpty() == true)
            System.out.println("\nNo pets in hotel");*/

        //Second time I tried a HashMap. It is something different.
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        h.put(p1.getName(), p1.getAge());
        h.put(p2.getName(), p2.getAge());
        h.put(p3.getName(), p3.getAge());
        h.put(p4.getName(), p4.getAge());

        System.out.println(h);

        System.out.println("Brody is " + h.get("Brody") + " years old");

        h.remove("Brody");
        System.out.println("Remove Brody " + h);

        System.out.println("Is empty? " + h.isEmpty());

        System.out.println(h.replace("Hank", 5));
        System.out.println(h);

        System.out.println(h.keySet());

        System.out.println(h.values());
    }
}
