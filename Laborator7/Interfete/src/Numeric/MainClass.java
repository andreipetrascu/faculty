package Numeric;

public class MainClass {
    public static void main(String[] args) {
        Numeric a = new Fraction();
        Numeric b = new Fraction();

        ((Fraction) a).setNumerator(6);
        ((Fraction) a).setDenominator(4);

        ((Fraction) b).setNumerator(5);
        ((Fraction) b).setDenominator(5);

        Numeric result = ((Fraction) a).multiply((Fraction) b);
        System.out.println(((Fraction) result).toString());
    }
}