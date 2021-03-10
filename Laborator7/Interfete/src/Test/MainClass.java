package Test;

import java.lang.*;

public class MainClass {
    public static void main(String[] args) {
        Andrew firstObject = new Andrew();
        firstObject.doSomething();

        BiggerInterface f1 = new Andrew();
        System.out.println(f1.x);
        f1.doMore(26);

    }
}
