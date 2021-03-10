package p63;

public class TestClass extends Exception {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        int index = 7;
        try {
            a[index] = 6;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Out of bounds ");
        }
    }
}