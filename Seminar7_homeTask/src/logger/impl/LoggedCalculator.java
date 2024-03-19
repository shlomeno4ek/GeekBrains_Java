package logger.impl;

import model.Complex;
import util.Calculable;
import logger.Loggable;

public class LoggedCalculator implements Calculable{
    private final Calculable calculable;
    private final Loggable logger;

    public LoggedCalculator(Calculable calculable, Loggable logger) {
        this.calculable = calculable;
        this.logger = logger;
    }

    @Override
    public void sum(Complex a, Complex b) {
        logger.logging(String.format("Sum up %s and %s", a, b));
        calculable.sum(a, b);
    }

    @Override
    public void multiply(Complex a, Complex b) {
        logger.logging(String.format("Multiply %s and %s", a, b));
        calculable.multiply(a, b);
    }

    @Override
    public void divide(Complex a, Complex b) {
        logger.logging(String.format("Divide %s and %s", a, b));
        calculable.divide(a, b);
    }

    @Override
    public Complex result() {
        Complex result = calculable.result();
        logger.logging(String.format("Result: %s", result));
        return result;
    }

    @Override
    public void clear() {
        calculable.clear();
    }
}
