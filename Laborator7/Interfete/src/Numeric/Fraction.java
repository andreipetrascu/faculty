package Numeric;

public class Fraction implements Numeric {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Numeric multiply(Numeric n) {
        Numeric m = new Fraction();
        ((Fraction) m).numerator = this.numerator * ((Fraction) n).numerator;
        ((Fraction) m).denominator = this.denominator * ((Fraction) n).denominator;
        return m;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}
