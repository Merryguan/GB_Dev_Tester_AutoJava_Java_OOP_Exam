package exam.gb.oop.calculator.controller;

import exam.gb.oop.calculator.model.logger.Logger;
import exam.gb.oop.calculator.model.service.CalculatorOperations;
import exam.gb.oop.calculator.view.View;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalculatorController<T extends CalculatorOperations> {

    private View view;
    private T service;

    private List<String> history;

    private Logger logger;

    public CalculatorController(T model) {

        this.service = model;
        this.history = new ArrayList<>();
        this.logger = new Logger("log.txt");

    }

    private String prepareResult(int real1, int imagine1, int real2, int imagine2, String result, char operation) {

        StringBuilder sb = new StringBuilder();
        sb.append(real1).append(imagine1 > 0 ? "+i" : "-i").append(imagine1 > 0 ? imagine1 : -imagine1)
                .append(' ').append(operation).append(' ')
                .append(real2).append(imagine2 > 0 ? "+i" : "-i").append(imagine2 > 0 ? imagine2 : -imagine2).append(" = ")
                .append(result);
        return sb.toString();

    }

    public List<String> addition(int real1, int imagine1, int real2, int imagine2) {

        String result = service.addition(real1, imagine1, real2, imagine2);
        history.add(prepareResult(real1, imagine1, real2, imagine2, result, '+'));
        logger.writeResult(prepareResult(real1, imagine1, real2, imagine2, result, '+'));
        return history;

    }

    public List<String> subtraction(int real1, int imagine1, int real2, int imagine2) {

        String result = service.subtraction(real1, imagine1, real2, imagine2);
        history.add(prepareResult(real1, imagine1, real2, imagine2, result, '-'));
        logger.writeResult(prepareResult(real1, imagine1, real2, imagine2, result, '-'));
        return history;

    }

    public List<String> multiplication(int real1, int imagine1, int real2, int imagine2) {

        String result = service.multiplication(real1, imagine1, real2, imagine2);
        history.add(prepareResult(real1, imagine1, real2, imagine2, result, '*'));
        logger.writeResult(prepareResult(real1, imagine1, real2, imagine2, result, '*'));
        return history;

    }

    public List<String> division(int real1, int imagine1, int real2, int imagine2) {

        String result = service.division(real1, imagine1, real2, imagine2);
        history.add(prepareResult(real1, imagine1, real2, imagine2, result, ':'));
        logger.writeResult(prepareResult(real1, imagine1, real2, imagine2, result, ':'));
        return history;

    }

    public List<String> revert() {

        service.revert();
        history.removeLast();
        return history;

    }

}
