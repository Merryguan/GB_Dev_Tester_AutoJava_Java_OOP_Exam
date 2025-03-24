package exam.gb.oop.calculator;

import exam.gb.oop.calculator.model.service.CalculatorService;
import exam.gb.oop.calculator.controller.Controller;
import exam.gb.oop.calculator.view.ConsoleUI;
import exam.gb.oop.calculator.view.View;

public class App {

    private View view;
    private Controller controller;
    private CalculatorService model;

    public App() {

        model = new CalculatorService();
        controller = new Controller<>(model);
        view = new ConsoleUI(controller);

    }

    public View getView() {
        return view;
    }
}
