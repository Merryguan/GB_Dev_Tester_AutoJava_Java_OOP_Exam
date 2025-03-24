package exam.gb.oop.calculator.model.calculator;

import exam.gb.oop.calculator.model.digit.ComplexDigit;

import java.util.List;

public class Calculator {

    public Calculator() {}

    public ComplexDigit addition(ComplexDigit digit1, ComplexDigit digit2) {

        int real = digit1.getReal() + digit2.getReal();
        int imagine = digit1.getImagine() + digit2.getImagine();
        return new ComplexDigit(real, imagine);

    }

    public ComplexDigit subtraction(ComplexDigit digit1, ComplexDigit digit2) {

        int real = digit1.getReal() - digit2.getReal();
        int imagine = digit1.getImagine() - digit2.getImagine();
        return new ComplexDigit(real, imagine);

    }

    public ComplexDigit multiplication(ComplexDigit digit1, ComplexDigit digit2) {

        int real = digit1.getReal() * digit2.getReal() - digit1.getImagine() * digit2.getImagine();
        int imagine = digit1.getReal() * digit2.getImagine() + digit1.getImagine() * digit2.getReal();
        return new ComplexDigit(real, imagine);

    }

    public ComplexDigit division(ComplexDigit digit1, ComplexDigit digit2) {

        int denominator = digit2.getReal() * digit2.getReal() + digit2.getImagine() * digit2.getImagine();
        int real = (digit1.getReal() * digit2.getReal() + digit1.getImagine() * digit2.getImagine()) / denominator;
        int imagine = (digit2.getReal() * digit1.getImagine() - digit1.getReal() * digit2.getImagine()) / denominator;
        return new ComplexDigit(real, imagine);

    }

}
