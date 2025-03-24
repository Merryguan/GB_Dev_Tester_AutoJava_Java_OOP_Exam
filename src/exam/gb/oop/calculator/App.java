package exam.gb.oop.calculator;

import exam.gb.oop.calculator.model.service.CalculatorService;
import exam.gb.oop.calculator.controller.CalculatorController;
import exam.gb.oop.calculator.view.ConsoleUI;
import exam.gb.oop.calculator.view.View;

public class App {

    private View view;
    private CalculatorController calculatorController;
    private CalculatorService model;

    public App() {

        model = new CalculatorService();
        calculatorController = new CalculatorController<>(model);
        view = new ConsoleUI(calculatorController);

    }

    public View getView() {
        return view;
    }
}
