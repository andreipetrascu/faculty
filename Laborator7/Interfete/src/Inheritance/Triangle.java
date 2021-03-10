package Inheritance;

public class Triangle extends Shape implements FourthInterface {
    private int x;

    public void thirdMethod() {
        System.out.println("thirdMethod ");
    }

    public void tthirdMethod() {
        System.out.println("tthirdMethod ");
    }

    public void fourthMethod() {
        System.out.println("fourthMethod ");
    }

    public void method1(FirstInterface f) {
        System.out.println("Method 1 ");
    }

    public void method2(SecondInterface f) {
        System.out.println("Method 2 ");
    }

    public void method3(ThirdInterface f) {
        System.out.println("Method 3 ");
    }

    public void method4(FourthInterface f) {
        System.out.println("Method 4 ");
    }
}
