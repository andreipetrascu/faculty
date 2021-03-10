package p64;

public class TestClass {

    public void throwSomething(int x) throws ExceptionClass {
        if (x != 0) {
            System.out.println("Perfect");
        } else {
            throw new ExceptionClass("Zero value");
        }
    }


    public static void main(String[] args) {
        TestClass test = new TestClass();

        try {
            test.throwSomething(0);
        } catch (ExceptionClass e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("'finally' tested");
        }
    }
}
