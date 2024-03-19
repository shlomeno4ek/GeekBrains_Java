package util;

import model.Complex;

public interface Calculable {
    void sum(Complex a, Complex b);
    void multiply(Complex a, Complex b);
    void divide(Complex a, Complex b);
    Complex result();
    void clear();
}
