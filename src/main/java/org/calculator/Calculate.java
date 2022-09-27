package org.calculator;

import org.apache.logging.log4j.LogManager;

public class Calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(LogManager.getLogger(Calculator.class));

        double a = 1.5;
        double b = 2.1;

        calculator.add(a, b);
        calculator.subtract(a, b);
        calculator.multiply(a, b);
        calculator.divide(a, b);
    }
}
