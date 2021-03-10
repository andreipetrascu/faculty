package ComplexP;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args){

        Complex a = new Complex(0, 2);
        Complex b = new Complex(1, 4);
        Complex sum = new Complex(0, 0);

        a.setReal(2);
        a.setImaginary(3);
        b.setReal(4);
        b.setImaginary(5);

        MatrixComplex m1 = new MatrixComplex(2, 2);
        MatrixComplex m2 = new MatrixComplex(2, 2);
        MatrixComplex m3 = new MatrixComplex(2, 2);

        m1.createMatrix();
        m2.createMatrix();

        m3 = m3.addition(m1, m2);
        m3.displayMatrix();

        m3 = m3.subtraction(m1, m2);
        m3.displayMatrix();

        //inmultire cu scalar
        m1.displayMatrix();
        m1.scalar(m1, 2.0);
        m1.displayMatrix();

        //inmultire a doua matrici
        m3 = m3.multiplication(m1, m2);
        m3.displayMatrix();

    }
}