package src;

public class ComplexCalculator implements IComplexCalculator {
    @Override
    public Complex add(Complex c1, Complex c2) {
        return new Complex(c1.getReal() + c2.getReal(), c1.getImaginary() + c2.getImaginary());


    }

    @Override
    public Complex multiply(Complex c1, Complex c2) {
        double real = c1.getReal() * c2.getReal() - c1.getImaginary() * c2.getImaginary();
        double imaginary = c1.getReal() * c2.getImaginary() + c1.getImaginary() * c2.getReal();
        return new Complex(real, imaginary);


    }

    @Override
    public Complex divide(Complex c1, Complex c2) {
        double denominator = c2.getReal() * c2.getReal() + c2.getImaginary() * c2.getImaginary();
        double real = (c1.getReal() * c2.getReal() + c1.getImaginary() * c2.getImaginary()) / denominator;
        double imaginary = (c1.getImaginary() * c2.getReal() - c1.getReal() * c2.getImaginary()) / denominator;
        return new Complex(real, imaginary);
    }
}
