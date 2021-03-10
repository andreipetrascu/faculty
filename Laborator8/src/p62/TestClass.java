package p62;

public class TestClass extends Exception {
    public static void main(String[] args) {
        Animal animal;
        animal = null;

        try {
            animal.ride();
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer ");
        }
    }
}