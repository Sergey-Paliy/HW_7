package HW_7;

import src.CalculatorFacade;
import src.Complex;
import src.ComplexCalculator;
import src.IComplexCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        IComplexCalculator calculator = new ComplexCalculator();
        CalculatorFacade calculatorFacade = new CalculatorFacade(calculator);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое комплексное число");
        System.out.println("Действительная часть: ");
        double real1 = scanner.nextDouble();
        System.out.println("Мнимая часть: ");
        double imaginary1 = scanner.nextDouble();
        Complex c1 = new Complex(real1, imaginary1);

        System.out.println("Введите второе комплексное число");
        System.out.println("Действительная часть: ");
        double real2 = scanner.nextDouble();
        System.out.println("Мнимая часть: ");
        double imaginary2 = scanner.nextDouble();
        Complex c2 = new Complex(real2, imaginary2);

        Complex resultadd = calculatorFacade.add(c1, c2);
        Complex resultdivide = calculatorFacade.divide(c1, c2);
        Complex resultMultiply = calculatorFacade.multiply(c1, c2);

        System.out.println("Addition Result "+resultadd);
        System.out.println("Division Result "+resultdivide);
        System.out.println("Multiplication Result "+resultMultiply);

        scanner.close();

    }
}