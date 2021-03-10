package Inheritance;

public class MainClass {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        FourthInterface f4 = triangle;
        triangle.method4(f4);

        ThirdInterface f3 = triangle;
        triangle.method3(f3);

        triangle.thirdMethod();
        triangle.tthirdMethod();
        triangle.fourthMethod();
    }
}
