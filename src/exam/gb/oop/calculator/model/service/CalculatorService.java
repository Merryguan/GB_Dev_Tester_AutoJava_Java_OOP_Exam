package exam.gb.oop.calculator.model.service;

import exam.gb.oop.calculator.model.calculator.Calculator;
import exam.gb.oop.calculator.model.digit.ComplexDigit;

import java.util.ArrayList;
import java.util.List;

public class CalculatorService implements CalculatorOperations {

    private List<ComplexDigit> history;
    private Calculator calculator;

    public CalculatorService() {
        this.history = new ArrayList<>();
        this.calculator = new Calculator();
    }

    public String addition(int real1, int imagine1, int real2, int imagine2) {

        ComplexDigit digit1 = new ComplexDigit(real1, imagine1);
        ComplexDigit digit2 = new ComplexDigit(real2, imagine2);
        ComplexDigit result = calculator.addition(digit1, digit2);
        history.add(result);
        return result.toString();

    }

    public String subtraction(int real1, int imagine1, int real2, int imagine2) {

        ComplexDigit digit1 = new ComplexDigit(real1, imagine1);
        ComplexDigit digit2 = new ComplexDigit(real2, imagine2);
        ComplexDigit result = calculator.subtraction(digit1, digit2);
        history.add(result);
        return result.toString();

    }

    public String multiplication(int real1, int imagine1, int real2, int imagine2) {

        ComplexDigit digit1 = new ComplexDigit(real1, imagine1);
        ComplexDigit digit2 = new ComplexDigit(real2, imagine2);
        ComplexDigit result = calculator.multiplication(digit1, digit2);
        history.add(result);
        return result.toString();

    }

    public String division(int real1, int imagine1, int real2, int imagine2) {

        ComplexDigit digit1 = new ComplexDigit(real1, imagine1);
        ComplexDigit digit2 = new ComplexDigit(real2, imagine2);
        ComplexDigit result = calculator.division(digit1, digit2);
        history.add(result);
        return result.toString();

    }

    public void revert() {

        history.removeLast();

    }

}
