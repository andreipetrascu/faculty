
/*6.5.Creaţi propria voastră clasă excepţie folosind cuvântul cheie extends. Scrieţi un constructor
        pentru clasă care ia ca argument un String şi îl stochează în obiect într-o referință la String.
        Scrieţi o metodă care afişează şirul stocat. Creaţi o clauză try-catch pentru a exersa noua
        excepţie.*/
package p65;

public class TestClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        try {
            myDog.doIt(0);
        } catch (ExceptionTest e) {
            e.printMessage();
        }
    }
}
