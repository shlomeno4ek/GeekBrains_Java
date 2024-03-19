package util.impl;


import model.Complex;
import util.Calculable;

public class Calculator implements Calculable {
    private Complex result;

    @Override
    public void sum(Complex a, Complex b) {
        result = new Complex(a.getRealPart() + b.getRealPart(), a.getImaginaryPart() + b.getImaginaryPart());
    }

    @Override
    public void multiply(Complex a, Complex b) {
        double real = a.getRealPart() *b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart();
        double imag = a.getImaginaryPart() * b.getRealPart() + a.getRealPart() * b.getImaginaryPart();
        result = new Complex(real, imag);
    }

    @Override
    public void divide(Complex a, Complex b) {
        double real = (a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart())
                / (b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart());
        double imag = (a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart())
                / (b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart());
        result = new Complex(real, imag);
    }

    @Override
    public Complex result() {
        System.out.printf("Result: %s%n", result);
        return result;
    }

    @Override
    public void clear() {
        this.result = new Complex(0, 0);
    }
}
