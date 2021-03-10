package CurrencyConverter;

import java.math.BigInteger;

public class ConvModel {

    static final String INITIAL_VALUE = "1";
    private double total;


    ConvModel() {
        reset();
    }

    public void reset() {
        total = Double.parseDouble(INITIAL_VALUE);
    }

    public String getValue() {
        return toString(total);
    }

    private String toString(double total) {
        return total + "";
    }

    public void setValue(String value) {
        total = Double.parseDouble(value);
    }

    public void multiplyBy(String operand) {
        total = total * Double.parseDouble(operand);
    }

    public void divideBy(String operand) {
        total = total / Double.parseDouble(operand);
    }

}
