package ComplexP;

import java.util.concurrent.Callable;

public class Complex {

    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex addition(Complex z1, Complex z2) {
        Complex sum = new Complex(0,0);
        sum.real = z1.real + z2.real;
        sum.imaginary = z1.imaginary + z2.imaginary;
        return sum;
    }

    public Complex subtraction(Complex z1, Complex z2) {
        Complex sub = new Complex(0,0);
        sub.real = z1.real - z2.real;
        sub.imaginary = z1.imaginary + z2.imaginary;
        return sub;
    }


    public Complex mul(Complex z1, Complex z2) {
        Complex p = new Complex(0,0);
        p.real = (z1.real * z2.real - z1.imaginary * z2.imaginary);
        p.imaginary = (z1.real * z2.imaginary + z1.imaginary * z2.real);
        return p;
    }

    public void displayComplex(){
        System.out.print(this.getReal() + "+" + this.getImaginary() + "*i ");
    }

}