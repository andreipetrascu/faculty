package ComplexP;

import javax.swing.*;

public class MatrixComplex {

    private int rows;
    private int cols;
    private Complex[][] matrix;

    public MatrixComplex(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new Complex[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.matrix[i][j] = new Complex(0.0, 0.0);
            }
        }
    }

    public void createMatrix(){
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {

                String input1;
                input1 = JOptionPane.showInputDialog(null, "a" + i + j);
                String input2;
                input2 = JOptionPane.showInputDialog(null, "b" + i + j);

                double d1 = Double.parseDouble(input1);
                double d2 = Double.parseDouble(input2);

                this.matrix[i][j] = new Complex(d1, d2);

            }
        }
    }

    public void displayMatrix(){
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.matrix[i][j].displayComplex();
            }
            System.out.println();
        }
    }

    public MatrixComplex addition(MatrixComplex m1, MatrixComplex m2){
        if(m1.rows == m2.rows && m1.cols == m2.cols) {

            MatrixComplex addMatrix = new MatrixComplex(m1.rows, m1.cols);

            for (int i = 0; i < m1.rows; i++) {
                for (int j = 0; j < m1.cols; j++) {

                    Complex c = new Complex(0, 0);
                    c = c.addition(m1.matrix[i][j], m2.matrix[i][j]);
                    addMatrix.matrix[i][j] =  c;
                }
            }
            return addMatrix;
        }
        else{
            System.out.println("Invalid matrix");
            return null;
        }
    }

    public MatrixComplex subtraction(MatrixComplex m1, MatrixComplex m2){
        if(m1.rows == m2.rows && m1.cols == m2.cols) {

            MatrixComplex subMatrix = new MatrixComplex(m1.rows, m1.cols);

            for (int i = 0; i < m1.rows; i++) {
                for (int j = 0; j < m1.cols; j++) {

                    Complex c = new Complex(0, 0);
                    c = c.subtraction(m1.matrix[i][j], m2.matrix[i][j]);
                    subMatrix.matrix[i][j] =  c;
                }
            }
            return subMatrix;
        }
        else{
            System.out.println("Invalid matrix");
            return null;
        }
    }

    public MatrixComplex scalar(MatrixComplex m1, Double s){

        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.cols; j++) {
                m1.matrix[i][j].setReal(s*m1.matrix[i][j].getReal());
                m1.matrix[i][j].setImaginary(s*m1.matrix[i][j].getImaginary());
            }
        }
        return m1;
    }

    public MatrixComplex multiplication (MatrixComplex m1, MatrixComplex m2){
        if(m1.rows == m2.cols && m1.cols == m2.rows){

            int min;
            if(m1.cols < m1.rows)
                min = m1.cols;
            else
                min = m1.rows;

            MatrixComplex mulMatrix = new MatrixComplex(min, min);

            for (int i = 0; i < m1.rows; i++) {
                for (int j = 0; j < m2.cols; j++) {
                    for(int k = 0; k < m2.rows; k++){

                        Complex s2= new Complex(0, 0);
                        s2 = s2.mul(m1.matrix[i][k], m2.matrix[k][j]);
                        mulMatrix.matrix[i][j] = mulMatrix.matrix[i][j].addition(mulMatrix.matrix[i][j], s2);

                    }
                }
            }
            return mulMatrix;
        }
        else {
            System.out.println("Invalid matrix");
            return null;
        }
    }
}
