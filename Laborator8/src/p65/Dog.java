package p65;

public class Dog {
    public void doIt(int x) throws ExceptionTest {
        if (x != 0) {
            System.out.println("Good job!");
        } else {
            throw new ExceptionTest("You did wrong...");
        }
    }
}