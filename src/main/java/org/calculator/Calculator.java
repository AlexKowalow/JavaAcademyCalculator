package org.calculator;

import org.apache.logging.log4j.Logger;

public class Calculator {
    private final Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public Logger getLogger() {
        return logger;
    }

    public double add(double a, double b) {
        double result = a + b;
        logger.debug(a + " + " + b + " = " + result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        logger.debug(a + " - " + b + " = " + result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        logger.debug(a + " * " + b + " = " + result);
        return result;
    }

    public double divide(double a, double b) {
        double result = a / b;
        logger.debug(a + " / " + b + " = " + result);
        return result;
    }
}