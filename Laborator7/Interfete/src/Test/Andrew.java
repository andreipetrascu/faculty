package Test;

import java.lang.*;

public class Andrew implements BiggerInterface, Comparable {
    public void doSomething() {
        System.out.println("How are you sir??");
    }

    public void doMore(int x) {
        System.out.println("BiggerInterface extends MyInterface = " + x);
    }

    public int compareTo(Object a) {
        return 1;
    }

}
