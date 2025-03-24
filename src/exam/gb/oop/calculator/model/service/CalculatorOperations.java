package exam.gb.oop.calculator.model.service;

public interface CalculatorOperations {

    String addition(int real1, int imagine1, int real2, int imagine2);
    String subtraction(int real1, int imagine1, int real2, int imagine2);
    String multiplication(int real1, int imagine1, int real2, int imagine2);
    String division(int real1, int imagine1, int real2, int imagine2);
    void revert();

}
