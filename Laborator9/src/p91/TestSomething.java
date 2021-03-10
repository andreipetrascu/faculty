package p91;

import java.util.*;


public class TestSomething implements RandomAccess {
    public static void main(String[] args) {
        AbstractCollection<Object> abs = new ArrayList<Object>();

        abs.add("Hello");
        abs.add("everyone!");

        System.out.println(abs.isEmpty());
        System.out.println(abs);

        Map m = new HashMap(12, 0.75f);
        m.put(2, 4);
        m.put(235, 414);
        System.out.println(m.remove(2));
    }
}
