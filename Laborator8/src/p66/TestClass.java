/*6.6.Creaţi o clasă cu două metode, f() şi g(). În g(), aruncaţi o excepţie de un tip nou, definit de voi.
        În f(), apelaţi g(), interceptaţi excepţia sa şi, în clauza catch, aruncaţi o excepţie diferită (de un al
        doilea tip, definit de voi). Testaţi-vă codul în main().*/
package p66;

public class TestClass {

    public void f() throws SecondException {

        try {
            TestClass tst = new TestClass();
            tst.g(0);
        } catch (FirstException e) {
            throw new SecondException("Bad f");
        }
    }

    public void g(int x) throws FirstException {
        if (x != 0) {
            System.out.println("Good g");
        } else {
            throw new FirstException("Exception from g");
        }
    }

    public static void main(String[] args) {

        TestClass t = new TestClass();
        try {
            t.g(0);
        } catch (FirstException e) {
            e.printMessage();
        }

        try {
            t.f();
        } catch (SecondException e) {
            e.printIt();
        }
    }
}
