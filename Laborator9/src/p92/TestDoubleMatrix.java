package p92;

public class TestDoubleMatrix {

    public static void main(String[] args) {

        Double[][] m1 = new Double[][]{{1.0, 2.1, 3.6}, {4.7, 5.1, 6.3}, {1.1, 1.5, 1.7}};
        Double[][] m2 = new Double[][]{{1.7, 1.68, 1.444}, {2.456, 2.02, 2.8}, {3.678, 3.4, 3.7}};

        DoubleMatrix doubleMatrix = new DoubleMatrix();

        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, doubleMatrix.addMatrix(m1, m2), '+');

        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m1, m2, doubleMatrix.multiplyMatrix(m1, m2), '*');
    }
}

