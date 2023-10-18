package src;

public class CalculatorFacade {
    private IComplexCalculator calculator;

    public CalculatorFacade(IComplexCalculator calculator) {
        this.calculator = calculator;
    }

    public Complex add(Complex c1, Complex c2) {
        Complex result =calculator.add(c1, c2);
        LoggerUtil.log("Added: " + c1 + " + " + c2 + " = " + result);
        return result;

    }
    public Complex multiply(Complex c1, Complex c2) {
        Complex result = calculator.multiply(c1, c2);
        LoggerUtil.log("Multiplied: " + c1 + " * " + c2 + " = " + result);
        return result;
    }
    public Complex divide(Complex c1, Complex c2) {
        Complex result = calculator.divide(c1, c2);
        LoggerUtil.log("Divided: " + c1 + " / " + c2 + " = " + result);
        return result;
    }
}
